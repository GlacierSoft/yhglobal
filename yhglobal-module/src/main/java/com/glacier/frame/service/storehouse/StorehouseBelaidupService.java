/**
 * @Title: StorehouseBelaidupService.java 
 * @Package com.glacier.global.service.StorehouseBelaidup
 * @author wuting   
 * @email 920339213@qq.com
 * @date 2014-10-14
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.00          
 * @Review (审核人) ：wuting
 * 
 */
package com.glacier.frame.service.storehouse; 
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.storehouse.StorehouseBelaidupMapper;
import com.glacier.frame.dao.storehouse.StorehouseDamageMapper;
import com.glacier.frame.dao.storehouse.StorehousePackCodeMapper;
import com.glacier.frame.dao.storehouse.StorehouseStorageGoodsrunMapper;
import com.glacier.frame.dao.storehouse.StorehouseStorageMapper;
import com.glacier.frame.dto.query.storehouse.StorehouseBelaidupQueryDTO;
import com.glacier.frame.entity.storehouse.StorehouseBelaidupExample;
import com.glacier.frame.entity.storehouse.StorehouseBelaidup;
import com.glacier.frame.entity.storehouse.StorehousePackCode;
import com.glacier.frame.entity.storehouse.StorehouseBelaidupExample.Criteria;
import com.glacier.frame.entity.storehouse.StorehouseDamageExample;
import com.glacier.frame.entity.storehouse.StorehouseStorage;
import com.glacier.frame.entity.storehouse.StorehouseStorageGoodsrun;
import com.glacier.frame.entity.storehouse.StorehouseStorageGoodsrunExample;
import com.glacier.frame.entity.system.User;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
/*** 
 * @ClassName:  StorehouseBelaidupService
 * @Description: TODO(货物表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-15
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class StorehouseBelaidupService {

	@Autowired
	private StorehouseBelaidupMapper belaidupMapper;
	
	@Autowired
	private StorehouseDamageMapper damageMapper;
	
	@Autowired
	private StorehousePackCodeMapper packcodeMapper;
	
	@Autowired
	private StorehouseStorageGoodsrunMapper GoodsrunMapper;
	
	@Autowired
	private StorehouseStorageMapper storageMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有货物信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, StorehouseBelaidupQueryDTO belaidupSetQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        StorehouseBelaidupExample belaidupSetExample = new StorehouseBelaidupExample(); 
        Criteria queryCriteria = belaidupSetExample.createCriteria();
        belaidupSetQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	belaidupSetExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	belaidupSetExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	belaidupSetExample.setOrderByClause(jqPager.getOrderBy("temp_storehouse_belaidup_"));
        }
        List<StorehouseBelaidup> belaidupSetTypeList = belaidupMapper.selectByExample(belaidupSetExample); // 查询所有会员列表
        int total = belaidupMapper.countByExample(belaidupSetExample); // 查询总页数
        returnResult.setRows(belaidupSetTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getBelaidup 
	 * @Description: TODO(根据货物Id获取货物信息) 
	 * @param @param belaidupId
	 * @param @return    设定文件 
	 * @return Object    返回 
	 * @throws
	 */
    public Object getBelaidup(String belaidupId) {
    	StorehouseBelaidup carrierCarType = belaidupMapper.selectByPrimaryKey(belaidupId);
        return carrierCarType;
    }
    
    /**
     * @Title: addBelaidup 
     * @Description: TODO(新增货物) 
     * @param @param belaidup
     * @param @return    设定文件 
     * @return Object    返回 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addBelaidup(StorehouseBelaidup belaidup,String packageId) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        StorehouseBelaidupExample belaidupSetExample = new StorehouseBelaidupExample(); 
        int count = 0;
        // 防止货物名称重复
        belaidupSetExample.createCriteria().andBelaidupProdNameEqualTo(belaidup.getBelaidupProdName());
        count = belaidupMapper.countByExample(belaidupSetExample);
        //获取库房
        StorehouseStorage storage = storageMapper.selectByPrimaryKey(belaidup.getStorehouseId());
        if (count > 0) {
            returnResult.setMsg("货物名称重复");
            return returnResult;
        }
        if(belaidup.getBelaidupWeight() > storage.getUsableWeight()){
        	returnResult.setMsg("库房的容量存储容纳不下！");
            return returnResult;
        }
        if(belaidup.getBelaidupBulk() > storage.getUsableBulk()){
        	returnResult.setMsg("库房的容量存储容纳不下！");
            return returnResult;
        }
        belaidup.setBelaidupId(RandomGUID.getRandomGUID());
        belaidup.setBelaidupStatus("receiving");
        belaidup.setSortingStauts("waitsorting");
        belaidup.setCreater(pricipalUser.getUserId());
        belaidup.setCreateTime(new Date());
        belaidup.setUpdater(pricipalUser.getUserId());
        belaidup.setUpdateTime(new Date());
        count = belaidupMapper.insert(belaidup);
        if (count == 1) {
        	//构建包装中间表
        	StorehousePackCode packCode = new StorehousePackCode();
        	packCode.setPackCodeId(RandomGUID.getRandomGUID());
        	packCode.setBelaidupId(belaidup.getBelaidupId());//货物ID
        	packCode.setPackagetypeId(packageId);//包装类型ID
        	packCode.setCreater(pricipalUser.getUserId());
        	packCode.setCreateTime(new Date());
        	packCode.setUpdater(pricipalUser.getUserId());
        	packCode.setUpdateTime(new Date());
        	//执行添加
        	packcodeMapper.insert(packCode);
        	
        	//构建货物流动
        	StorehouseStorageGoodsrun goodsrun = new StorehouseStorageGoodsrun();
        	goodsrun.setGoodsrunId(RandomGUID.getRandomGUID());
        	goodsrun.setBelaidupId(belaidup.getBelaidupId());
        	goodsrun.setGoodsrunNum(0);
        	goodsrun.setGoodsrunStatus(belaidup.getBelaidupStatus());
        	goodsrun.setStatus("enable");
        	goodsrun.setGoodsrunDate(new Date());
        	goodsrun.setRemark("写点什么好呢！。。。");
        	goodsrun.setCreater(pricipalUser.getUserId());
        	goodsrun.setCreateTime(new Date());
        	goodsrun.setUpdater(pricipalUser.getUserId());
        	goodsrun.setUpdateTime(new Date());
        	//执行添加
        	GoodsrunMapper.insert(goodsrun);
        	//货物添加成功后减去相应的库房容量
        	storage.setUsableWeight(storage.getUsableWeight()-belaidup.getBelaidupWeight());
        	storage.setUsableBulk(storage.getUsableBulk()-belaidup.getBelaidupBulk());
        	storageMapper.updateByPrimaryKey(storage);
        	
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + belaidup.getBelaidupProdName() + "] 货物信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，货物信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editBelaidup 
     * @Description: TODO(修改货物信息) 
     * @param @param belaidup
     * @param @return    设定文件 
     * @return Object    返回 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editBelaidup(StorehouseBelaidup belaidup,String packageId) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        StorehouseBelaidupExample belaidupSetExample = new StorehouseBelaidupExample(); 
        int count = 0;
        // 防止货物名称重复
        belaidupSetExample.createCriteria().andBelaidupProdNameEqualTo(belaidup.getBelaidupProdName()).andBelaidupIdNotEqualTo(belaidup.getBelaidupId());
        count = belaidupMapper.countByExample(belaidupSetExample);
        //获取库房
        StorehouseStorage storageNew = storageMapper.selectByPrimaryKey(belaidup.getStorehouseId());
        if (count > 0) {
            returnResult.setMsg("货物名称重复");
            return returnResult;
        }
        if(belaidup.getBelaidupWeight() > storageNew.getUsableWeight()){
        	returnResult.setMsg("库房的容量存储容纳不下！");
            return returnResult;
        }
        if(belaidup.getBelaidupBulk() > storageNew.getUsableBulk()){
        	returnResult.setMsg("库房的容量存储容纳不下！");
            return returnResult;
        }
        //根据ID获取货物信息
        StorehouseBelaidup belaidupTime = (StorehouseBelaidup) getBelaidup(belaidup.getBelaidupId());
        belaidup.setBelaidupStatus(belaidupTime.getBelaidupStatus());
        belaidup.setSortingStauts(belaidupTime.getSortingStauts());
        belaidup.setCreater(belaidupTime.getCreater());
        belaidup.setCreateTime(belaidupTime.getCreateTime());
        belaidup.setUpdater(pricipalUser.getUserId());
        belaidup.setUpdateTime(new Date());
        count = belaidupMapper.updateByPrimaryKey(belaidup);
        
        if (count == 1) {
        	//修改中间表
            StorehousePackCode packCode = packcodeMapper.selectByBelaidup(belaidup.getBelaidupId());
            packCode.setPackagetypeId(packageId);
            packcodeMapper.updateByPrimaryKey(packCode);
            //原来的仓库
            StorehouseStorage storageOld = storageMapper.selectByPrimaryKey(belaidupTime.getStorehouseId());
            //判断仓库ID是否更改过
            if(storageOld.getStorageId() != storageNew.getStorageId()){
            	//修改过，新的库房减去相应的库房容量
            	storageNew.setUsableWeight(storageNew.getUsableWeight()-belaidup.getBelaidupWeight());
            	storageNew.setUsableBulk(storageNew.getUsableBulk()-belaidup.getBelaidupBulk());
            	storageMapper.updateByPrimaryKey(storageNew);
            	//修改过，旧的库房增加相应的库房容量
            	storageOld.setUsableWeight(storageOld.getUsableWeight()+belaidup.getBelaidupWeight());
            	storageOld.setUsableBulk(storageOld.getUsableBulk()+belaidup.getBelaidupBulk());
            	storageMapper.updateByPrimaryKey(storageOld);
            }
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + belaidup.getBelaidupProdName() + "] 货物信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，货物信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delBelaidup
     * @Description: TODO(删除货物) 
     * @param @param gradeIds
     * @param @return    设定文件 
     * @return Object    返回 
     * @throws
     */
   @Transactional(readOnly = false)
    public Object delBelaidup(List<String> belaidupIds, List<String> belaidupName) {
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
        // 定义删除成功数据行数量
        int rightNumber = 0;
        // 定义返回结果
        String result_str = ""; 
        // 定义是否显示提示
        boolean isFlag = true;
        //数据行长度判断
        if (belaidupIds.size() > 0) { 
           //匹配删除信息
           for (int i = 0; i < belaidupIds.size(); i++) {  
                 // 相关联充值记录
        		StorehouseDamageExample damageExample = new StorehouseDamageExample();
        		damageExample.createCriteria().andBelaidupIdEqualTo(belaidupIds.get(i));
        		int count = damageMapper.countByExample(damageExample);
                // 判断是否关联
        		if (count <= 0) { 
        			StorehouseBelaidup belaidup = belaidupMapper.selectByPrimaryKey(belaidupIds.get(i));
        			//判断
        			if(belaidup !=null && belaidup.getBelaidupStatus() != "receiving"){
        				//先删除packcode的外键信息
            			StorehousePackCode packCode = packcodeMapper.selectByBelaidup(belaidup.getBelaidupId());
            			//执行删除
            			packcodeMapper.deleteByPrimaryKey(packCode.getPackCodeId());
            			
            			//再删除货物流动表
            			StorehouseStorageGoodsrunExample goodsrunExample = new StorehouseStorageGoodsrunExample();
            			goodsrunExample.createCriteria().andBelaidupIdEqualTo(belaidup.getBelaidupId());
            			//执行删除
            			GoodsrunMapper.deleteByExample(goodsrunExample);
            			//执行删除货物的操作
    	    		    int number = belaidupMapper.deleteByPrimaryKey(belaidup.getBelaidupId());
    	    		    //货物删除成功后，进行仓库容量的业务
    	    		    StorehouseStorage storageOld = storageMapper.selectByPrimaryKey(belaidup.getStorehouseId());
            			storageOld.setUsableWeight(storageOld.getUsableWeight()+belaidup.getBelaidupWeight());
                    	storageOld.setUsableBulk(storageOld.getUsableBulk()+belaidup.getBelaidupBulk());
                    	storageMapper.updateByPrimaryKey(storageOld);
                    	// 删除成功数据行数量记录 
    	    	        rightNumber += number;
        			}
                 } else { 
                       if(isFlag){ 
        				if(count > 0){
        					result_str=" 数据行第<font style='color:red;font-weight: bold;'>【"+ (i+1) +"】</font>条货物记录" + "存在<font style='color:red;font-weight: bold;'>已出库运输等其它原因！删除无法成功！</font>";
        					isFlag = false;
        					} 
                        }  
                       }
        			}
        		// 删除成功数量大于0即为操作成功,且提示关联信息
        		if(rightNumber>0){
        			returnResult.setMsg("成功删除<font style='color:red;font-weight: bold;'>【"+ rightNumber +"】</font> 条数据," +result_str);
        			returnResult.setSuccess(true);
        		}else{
        			returnResult.setMsg(result_str.trim());
        			returnResult.setSuccess(false);
        		     }
        	   }
        return returnResult;
    }
}
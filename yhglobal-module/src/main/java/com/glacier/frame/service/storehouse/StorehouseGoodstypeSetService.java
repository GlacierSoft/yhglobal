/**
 * @Title: StorehouseGoodstypeSetService.java 
 * @Package com.glacier.global.service.StorehouseGoodstypeSet
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
import com.glacier.frame.dao.storehouse.StorehouseGoodstypeSetMapper;
import com.glacier.frame.dto.query.storehouse.StorehouseGoodstypeSetQueryDTO;
import com.glacier.frame.entity.storehouse.StorehouseBelaidupExample;
import com.glacier.frame.entity.storehouse.StorehouseGoodstypeSet;
import com.glacier.frame.entity.storehouse.StorehouseGoodstypeSetExample;
import com.glacier.frame.entity.storehouse.StorehouseGoodstypeSetExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
/*** 
 * @ClassName:  StorehouseGoodstypeSetService
 * @Description: TODO(货物类型表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-15
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class StorehouseGoodstypeSetService {

	@Autowired
	private StorehouseGoodstypeSetMapper storagetypeSetMapper;
	
	@Autowired
	private StorehouseBelaidupMapper belaidupMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有货物类型信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, StorehouseGoodstypeSetQueryDTO storagetypeSetQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        StorehouseGoodstypeSetExample storagetypeSetExample = new StorehouseGoodstypeSetExample(); 
        Criteria queryCriteria = storagetypeSetExample.createCriteria();
        storagetypeSetQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	storagetypeSetExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	storagetypeSetExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	storagetypeSetExample.setOrderByClause(jqPager.getOrderBy("temp_storehouse_goodstype_set_"));
        }
        List<StorehouseGoodstypeSet> storagetypeSetTypeList = storagetypeSetMapper.selectByExample(storagetypeSetExample); // 查询所有会员列表
        int total = storagetypeSetMapper.countByExample(storagetypeSetExample); // 查询总页数
        returnResult.setRows(storagetypeSetTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: goodstypeList 
	 * @Description: TODO(获取所有货物类型信息) 
	 * @param @param 
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object goodstypeList() {
    	List<StorehouseGoodstypeSet> carrierCarType = storagetypeSetMapper.selectByExample(new StorehouseGoodstypeSetExample());
        return carrierCarType;
    }
	/**
	 * @Title: getGoodstype 
	 * @Description: TODO(根据货物类型Id获取货物类型信息) 
	 * @param @param storagetypeId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getGoodstype(String storagetypeId) {
    	StorehouseGoodstypeSet carrierCarType = storagetypeSetMapper.selectByPrimaryKey(storagetypeId);
        return carrierCarType;
    }
    
    /**
     * @Title: addGoodstype 
     * @Description: TODO(新增货物类型) 
     * @param @param storagetype
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addGoodstype(StorehouseGoodstypeSet storagetype) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        StorehouseGoodstypeSetExample storagetypeSetExample = new StorehouseGoodstypeSetExample(); 
        int count = 0;
        // 防止货物类型名称重复
        storagetypeSetExample.createCriteria().andGoodstypeNameEqualTo(storagetype.getGoodstypeName());
        count = storagetypeSetMapper.countByExample(storagetypeSetExample);
        if (count > 0) {
            returnResult.setMsg("货物类型名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        storagetype.setGoodstypeId(RandomGUID.getRandomGUID());
        storagetype.setCreater(pricipalUser.getUserId());
        storagetype.setCreateTime(new Date());
        storagetype.setUpdater(pricipalUser.getUserId());
        storagetype.setUpdateTime(new Date());
        count = storagetypeSetMapper.insert(storagetype);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + storagetype.getGoodstypeName() + "] 货物类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，货物类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editGoodstype 
     * @Description: TODO(修改货物类型信息) 
     * @param @param storagetype
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editGoodstype(StorehouseGoodstypeSet storagetype) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        StorehouseGoodstypeSetExample storagetypeSetExample = new StorehouseGoodstypeSetExample(); 
        int count = 0;
        // 防止货物类型名称重复
        storagetypeSetExample.createCriteria().andGoodstypeNameEqualTo(storagetype.getGoodstypeName()).andGoodstypeIdNotEqualTo(storagetype.getGoodstypeId());
        count = storagetypeSetMapper.countByExample(storagetypeSetExample);
        if (count > 0) {
            returnResult.setMsg("货物类型名称重复");
            return returnResult;
        }
        //根据ID获取承运商信誉等级信息
        StorehouseGoodstypeSet storagetypeTime = (StorehouseGoodstypeSet) getGoodstype(storagetype.getGoodstypeId());
        storagetype.setCreater(storagetypeTime.getCreater());
        storagetype.setCreateTime(storagetypeTime.getCreateTime());
        storagetype.setUpdater(pricipalUser.getUserId());
        storagetype.setUpdateTime(new Date());
        count = storagetypeSetMapper.updateByPrimaryKey(storagetype);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + storagetype.getGoodstypeName() + "] 货物类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，货物类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delGoodstype
     * @Description: TODO(删除货物类型) 
     * @param @param gradeIds
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object delGoodstype(List<String> storagetypeIds, List<String> storagetypeName) {
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
        // 定义删除成功数据行数量
        int rightNumber = 0;
        // 定义返回结果
        String result_str = ""; 
        // 定义是否显示提示
        boolean isFlag = true;
        //数据行长度判断
        if (storagetypeIds.size() > 0) { 
           //匹配删除信息
           for (int i = 0; i < storagetypeIds.size(); i++) {  
                //相关联货源信息记录
        		StorehouseBelaidupExample storageExample = new StorehouseBelaidupExample();
        		storageExample.createCriteria().andGoodstypeIdEqualTo(storagetypeIds.get(i));
        		int count = belaidupMapper.countByExample(storageExample);
                //判断是否关联
        		if (count <= 0) { 
        			StorehouseGoodstypeSetExample storagetypeSetExample = new StorehouseGoodstypeSetExample();
        			storagetypeSetExample.createCriteria().andGoodstypeIdEqualTo(storagetypeIds.get(i));
        		      int number = storagetypeSetMapper.deleteByExample(storagetypeSetExample);
        	          rightNumber += number;// 删除成功数据行数量记录 
                 } else { 
                       if(isFlag){ 
        				  if(count > 0){
        					result_str=" 数据行第<font style='color:red;font-weight: bold;'>【"+ (i+1) +"】</font>条记录与" + "【货物类型】存在<font style='color:red;font-weight: bold;'>【"+ count + "】</font>条依赖关系," + "须删除【货物类型】中<font style='color:red;font-weight: bold;'>【"+ count + "】</font>条依赖数据    ";
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

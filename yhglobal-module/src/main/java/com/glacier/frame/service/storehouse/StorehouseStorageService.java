/**
 * @Title: StorehouseStorageService.java 
 * @Package com.glacier.global.service.StorehouseStorage
 * @author wuting   
 * @email 920339213@qq.com
 * @date 2014-10-16
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.00          
 * @Review (审核人) ：wuting
 * 
 */
package com.glacier.frame.service.storehouse; 
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
import com.glacier.frame.dao.storehouse.StorehouseStorageMapper;
import com.glacier.frame.dao.storehouse.StorehouseStorageRepairMapper;
import com.glacier.frame.dto.query.storehouse.StorehouseStorageQueryDTO;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.storehouse.StorehouseStorage;
import com.glacier.frame.entity.storehouse.StorehouseStorageExample;
import com.glacier.frame.entity.storehouse.StorehouseStorageRepairExample;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.storehouse.StorehouseStorageExample.Criteria;
/*** 
 * @ClassName:  StorehouseStorageService
 * @Description: TODO(仓库表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-15
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class StorehouseStorageService {

	@Autowired
	private StorehouseStorageMapper storageMapper;
	
	@Autowired
	private StorehouseStorageRepairMapper storageRepairMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有仓库信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, StorehouseStorageQueryDTO storageQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        StorehouseStorageExample storageExample = new StorehouseStorageExample(); 
        Criteria queryCriteria = storageExample.createCriteria();
        storageQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	storageExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	storageExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	storageExample.setOrderByClause(jqPager.getOrderBy("temp_storehouse_storage_"));
        }
        List<StorehouseStorage> storageSetTypeList = storageMapper.selectByExample(storageExample); // 查询所有会员列表
        int total = storageMapper.countByExample(storageExample); // 查询总页数
        returnResult.setRows(storageSetTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getStorage 
	 * @Description: TODO(根据仓库Id获取仓库信息) 
	 * @param @param storageId
	 * @param @return    设定文件 
	 * @return Object    返回 
	 * @throws
	 */
    public Object getStorage(String storageId) {
    	StorehouseStorage carrierCarType = storageMapper.selectByPrimaryKey(storageId);
        return carrierCarType;
    }
    
    /**
     * @Title: addStorage 
     * @Description: TODO(新增仓库) 
     * @param @param storage
     * @param @return    设定文件 
     * @return Object    返回 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addStorage(StorehouseStorage storage) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        StorehouseStorageExample storageExample = new StorehouseStorageExample(); 
        int count = 0;
        // 防止仓库名称重复
        storageExample.createCriteria().andStorageNameEqualTo(storage.getStorageName());
        count = storageMapper.countByExample(storageExample);
        if (count > 0) {
            returnResult.setMsg("仓库名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        storage.setStorageId(RandomGUID.getRandomGUID());
        //构建仓库编号ID
        int storageCount = storageMapper.countByExample(new StorehouseStorageExample());//取出仓库的数量
        //时间转换
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy_MM_dd");
        //构建用于检修时间系统Date
        Date overhaulDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(storage.getBuildDate());
        calendar.add(Calendar.MONTH, (12/storage.getMustOverhaulNum()));
        overhaulDate = calendar.getTime();
        storage.setNextOverhaulDate(overhaulDate);
        storage.setStorageCode("ST_STORAGE_"+formatDate.format(new Date())+"_"+(storageCount+1));
        storage.setAlreadyOverhaulNum(0);
        storage.setUsableWeight(storage.getWeightUpperBound());
        storage.setUsableBulk(storage.getBulkUpperBound());
        storage.setCreater(pricipalUser.getUserId());
        storage.setCreateTime(new Date());
        storage.setUpdater(pricipalUser.getUserId());
        storage.setUpdateTime(new Date());
        count = storageMapper.insert(storage);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + storage.getStorageName() + "] 仓库信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，仓库信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editStorage 
     * @Description: TODO(修改仓库信息) 
     * @param @param storage
     * @param @return    设定文件 
     * @return Object    返回 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editStorage(StorehouseStorage storage) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        StorehouseStorageExample storageExample = new StorehouseStorageExample(); 
        int count = 0;
        // 防止仓库名称重复
        storageExample.createCriteria().andStorageNameEqualTo(storage.getStorageName()).andStorageIdNotEqualTo(storage.getStorageId());
        count = storageMapper.countByExample(storageExample);
        if (count > 0) {
            returnResult.setMsg("仓库名称重复");
            return returnResult;
        }
        //根据ID获取仓库信息
        StorehouseStorage storageTime = (StorehouseStorage) getStorage(storage.getStorageId());
        storage.setNextOverhaulDate(storageTime.getNextOverhaulDate());
        storage.setUsableWeight(storageTime.getWeightUpperBound());
        storage.setUsableBulk(storage.getBulkUpperBound());
        storage.setAlreadyOverhaulNum(storage.getAlreadyOverhaulNum());
        storage.setStorageCode(storageTime.getStorageCode());
        storage.setCreater(storageTime.getCreater());
        storage.setCreateTime(storageTime.getCreateTime());
        storage.setUpdater(pricipalUser.getUserId());
        storage.setUpdateTime(new Date());
        count = storageMapper.updateByPrimaryKey(storage);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + storage.getStorageName() + "] 仓库信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，仓库信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delStorage
     * @Description: TODO(删除仓库) 
     * @param @param gradeIds
     * @param @return    设定文件 
     * @return Object    返回 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object delStorage(List<String> storageIds, List<String> storageName) {
        /*JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (storageIds.size() > 0) {
        	StorehouseStorageExample storageExample = new StorehouseStorageExample(); 
        	storageExample.createCriteria().andStorageIdIn(storageIds);
            count = storageMapper.deleteByExample(storageExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(storageName, ",") + " ]仓库信息");
            } else {
                returnResult.setMsg("发生未知错误，仓库信息删除失败");
            }
        }
        return returnResult;*/
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
        // 定义删除成功数据行数量
        int rightNumber = 0;
        // 定义返回结果
        String result_str = ""; 
        // 定义是否显示提示
        boolean isFlag = true;
        //数据行长度判断
        if (storageIds.size() > 0) { 
           //匹配删除信息
           for (int i = 0; i < storageIds.size(); i++) {  
                 // 相关联充值记录
        		StorehouseStorageRepairExample storageRepairExample = new StorehouseStorageRepairExample();
        		storageRepairExample.createCriteria().andStorageIdEqualTo(storageIds.get(i));
        		int count = storageRepairMapper.countByExample(storageRepairExample);
                // 判断是否关联
        		if (count <= 0) { 
        			StorehouseStorageExample storageExample = new StorehouseStorageExample();
        			storageExample.createCriteria().andStoragetypeIdEqualTo(storageIds.get(i));
        		      int number = storageMapper.deleteByExample(storageExample);
        	          rightNumber += number;// 删除成功数据行数量记录 
                 } else { 
                       if(isFlag){ 
        				if(count > 0){
        					result_str=" 数据行第<font style='color:red;font-weight: bold;'>【"+ (i+1) +"】</font>条记录与" + "【仓库】存在<font style='color:red;font-weight: bold;'>【"+ count + "】</font>条依赖关系," + "须删除【仓库维修】中<font style='color:red;font-weight: bold;'>【"+ count + "】</font>条依赖数据    ";
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

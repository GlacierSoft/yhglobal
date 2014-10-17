/**
 * @Title: StorehouseStoragetypeSetService.java 
 * @Package com.glacier.global.service.StorehouseStoragetypeSet
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
import com.glacier.frame.dao.storehouse.StorehouseStorageMapper;
import com.glacier.frame.dao.storehouse.StorehouseStoragetypeSetMapper;
import com.glacier.frame.dto.query.storehouse.StorehouseStoragetypeSetQueryDTO;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.storehouse.StorehouseStorageExample;
import com.glacier.frame.entity.storehouse.StorehouseStoragetypeSet;
import com.glacier.frame.entity.storehouse.StorehouseStoragetypeSetExample;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.storehouse.StorehouseStoragetypeSetExample.Criteria;
/*** 
 * @ClassName:  StorehouseStoragetypeSetService
 * @Description: TODO(仓库类型表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-15
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class StorehouseStoragetypeSetService {

	@Autowired
	private StorehouseStoragetypeSetMapper storagetypeSetMapper;
	
	@Autowired
	private StorehouseStorageMapper storageMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有仓库类型信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, StorehouseStoragetypeSetQueryDTO storagetypeSetQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        StorehouseStoragetypeSetExample storagetypeSetExample = new StorehouseStoragetypeSetExample(); 
        Criteria queryCriteria = storagetypeSetExample.createCriteria();
        storagetypeSetQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	storagetypeSetExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	storagetypeSetExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	storagetypeSetExample.setOrderByClause(jqPager.getOrderBy("temp_storehouse_storagetype_set_"));
        }
        List<StorehouseStoragetypeSet> storagetypeSetTypeList = storagetypeSetMapper.selectByExample(storagetypeSetExample); // 查询所有会员列表
        int total = storagetypeSetMapper.countByExample(storagetypeSetExample); // 查询总页数
        returnResult.setRows(storagetypeSetTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getStoragetype 
	 * @Description: TODO(根据仓库类型Id获取仓库类型信息) 
	 * @param @param storagetypeId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getStoragetype(String storagetypeId) {
    	StorehouseStoragetypeSet carrierCarType = storagetypeSetMapper.selectByPrimaryKey(storagetypeId);
        return carrierCarType;
    }
    
    /**
     * @Title: addStoragetype 
     * @Description: TODO(新增仓库类型) 
     * @param @param storagetype
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addStoragetype(StorehouseStoragetypeSet storagetype) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        StorehouseStoragetypeSetExample storagetypeSetExample = new StorehouseStoragetypeSetExample(); 
        int count = 0;
        // 防止仓库类型名称重复
        storagetypeSetExample.createCriteria().andStoragetypeNameEqualTo(storagetype.getStoragetypeName());
        count = storagetypeSetMapper.countByExample(storagetypeSetExample);
        if (count > 0) {
            returnResult.setMsg("仓库类型名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        storagetype.setStoragetypeId(RandomGUID.getRandomGUID());
        storagetype.setCreater(pricipalUser.getUserId());
        storagetype.setCreateTime(new Date());
        storagetype.setUpdater(pricipalUser.getUserId());
        storagetype.setUpdateTime(new Date());
        count = storagetypeSetMapper.insert(storagetype);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + storagetype.getStoragetypeName() + "] 仓库类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，仓库类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editStoragetype 
     * @Description: TODO(修改仓库类型信息) 
     * @param @param storagetype
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editStoragetype(StorehouseStoragetypeSet storagetype) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        StorehouseStoragetypeSetExample storagetypeSetExample = new StorehouseStoragetypeSetExample(); 
        int count = 0;
        // 防止仓库类型名称重复
        storagetypeSetExample.createCriteria().andStoragetypeNameEqualTo(storagetype.getStoragetypeName()).andStoragetypeIdNotEqualTo(storagetype.getStoragetypeId());
        count = storagetypeSetMapper.countByExample(storagetypeSetExample);
        if (count > 0) {
            returnResult.setMsg("仓库类型名称重复");
            return returnResult;
        }
        //根据ID获取承运商信誉等级信息
        StorehouseStoragetypeSet storagetypeTime = (StorehouseStoragetypeSet) getStoragetype(storagetype.getStoragetypeId());
        storagetype.setCreater(storagetypeTime.getCreater());
        storagetype.setCreateTime(storagetypeTime.getCreateTime());
        storagetype.setUpdater(pricipalUser.getUserId());
        storagetype.setUpdateTime(new Date());
        count = storagetypeSetMapper.updateByPrimaryKey(storagetype);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + storagetype.getStoragetypeName() + "] 仓库类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，仓库类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delStoragetype
     * @Description: TODO(删除仓库类型) 
     * @param @param gradeIds
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object delStoragetype(List<String> storagetypeIds, List<String> storagetypeName) {
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
                 // 相关联充值记录
        		StorehouseStorageExample storageExample = new StorehouseStorageExample();
        		storageExample.createCriteria().andStoragetypeIdEqualTo(storagetypeIds.get(i));
        		int count = storageMapper.countByExample(storageExample);
                // 判断是否关联
        		if (count <= 0) { 
        			StorehouseStoragetypeSetExample storagetypeSetExample = new StorehouseStoragetypeSetExample();
        			storagetypeSetExample.createCriteria().andStoragetypeIdEqualTo(storagetypeIds.get(i));
        		      int number = storagetypeSetMapper.deleteByExample(storagetypeSetExample);
        	          rightNumber += number;// 删除成功数据行数量记录 
                 } else { 
                       if(isFlag){ 
        				if(count > 0){
        					result_str=" 数据行第<font style='color:red;font-weight: bold;'>【"+ (i+1) +"】</font>条记录与" + "【仓库类型】存在<font style='color:red;font-weight: bold;'>【"+ count + "】</font>条依赖关系," + "须删除【仓库类型】中<font style='color:red;font-weight: bold;'>【"+ count + "】</font>条依赖数据    ";
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

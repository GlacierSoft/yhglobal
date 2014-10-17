/**
 * @Title: StorehouseStorageRepairRepairService.java 
 * @Package com.glacier.global.service.StorehouseStorageRepairRepair
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
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils; 
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional; 
import com.glacier.basic.util.CollectionsUtil;
import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.storehouse.StorehouseStorageRepairMapper;
import com.glacier.frame.dto.query.storehouse.StorehouseStorageRepairQueryDTO;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.storehouse.StorehouseStorageRepair;
import com.glacier.frame.entity.storehouse.StorehouseStorageRepairExample;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.storehouse.StorehouseStorageRepairExample.Criteria;
/*** 
 * @ClassName:  StorehouseStorageRepairRepairService
 * @Description: TODO(仓库维修表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-15
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class StorehouseStorageRepairService {

	@Autowired
	private StorehouseStorageRepairMapper storageRepairMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有仓库维修信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, StorehouseStorageRepairQueryDTO storageRepairQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        StorehouseStorageRepairExample storageRepairExample = new StorehouseStorageRepairExample(); 
        Criteria queryCriteria = storageRepairExample.createCriteria();
        storageRepairQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	storageRepairExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	storageRepairExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	storageRepairExample.setOrderByClause(jqPager.getOrderBy("temp_storehouse_storage_repair_"));
        }
        List<StorehouseStorageRepair> storageRepairSetTypeList = storageRepairMapper.selectByExample(storageRepairExample); // 查询所有会员列表
        int total = storageRepairMapper.countByExample(storageRepairExample); // 查询总页数
        returnResult.setRows(storageRepairSetTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getStorageRepair 
	 * @Description: TODO(根据仓库维修Id获取仓库维修信息) 
	 * @param @param storageRepairId
	 * @param @return    设定文件 
	 * @return Object    返回 
	 * @throws
	 */
    public Object getStorageRepair(String storageRepairId) {
    	StorehouseStorageRepair carrierCarType = storageRepairMapper.selectByPrimaryKey(storageRepairId);
        return carrierCarType;
    }
    
    /**
     * @Title: addStorageRepair 
     * @Description: TODO(新增仓库维修) 
     * @param @param storageRepair
     * @param @return    设定文件 
     * @return Object    返回 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addStorageRepair(StorehouseStorageRepair storageRepair) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        StorehouseStorageRepairExample storageRepairExample = new StorehouseStorageRepairExample(); 
        int count = 0;
        // 防止仓库维修名称重复
        storageRepairExample.createCriteria().andRepairTitleEqualTo(storageRepair.getRepairTitle());
        count = storageRepairMapper.countByExample(storageRepairExample);
        if (count > 0) {
            returnResult.setMsg("仓库维修名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        storageRepair.setRepairId(RandomGUID.getRandomGUID());
        //构建仓库维修编号ID
        storageRepair.setCreater(pricipalUser.getUserId());
        storageRepair.setCreateTime(new Date());
        storageRepair.setUpdater(pricipalUser.getUserId());
        storageRepair.setUpdateTime(new Date());
        count = storageRepairMapper.insert(storageRepair);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + storageRepair.getRepairTitle() + "] 仓库维修信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，仓库维修信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editStorageRepair 
     * @Description: TODO(修改仓库维修信息) 
     * @param @param storageRepair
     * @param @return    设定文件 
     * @return Object    返回 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editStorageRepair(StorehouseStorageRepair storageRepair) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        StorehouseStorageRepairExample storageRepairExample = new StorehouseStorageRepairExample(); 
        int count = 0;
        // 防止仓库维修名称重复
        storageRepairExample.createCriteria().andRepairTitleEqualTo(storageRepair.getRepairTitle()).andRepairIdNotEqualTo(storageRepair.getRepairId());
        count = storageRepairMapper.countByExample(storageRepairExample);
        if (count > 0) {
            returnResult.setMsg("仓库维修名称重复");
            return returnResult;
        }
        //根据ID获取仓库维修信息
        StorehouseStorageRepair storageRepairTime = (StorehouseStorageRepair) getStorageRepair(storageRepair.getRepairId());
        storageRepair.setCreater(storageRepairTime.getCreater());
        storageRepair.setCreateTime(storageRepairTime.getCreateTime());
        storageRepair.setUpdater(pricipalUser.getUserId());
        storageRepair.setUpdateTime(new Date());
        count = storageRepairMapper.updateByPrimaryKey(storageRepair);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + storageRepair.getRepairTitle() + "] 仓库维修信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，仓库维修信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delStorageRepair
     * @Description: TODO(删除仓库维修) 
     * @param @param gradeIds
     * @param @return    设定文件 
     * @return Object    返回 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object delStorageRepair(List<String> storageRepairIds, List<String> storageRepairName) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (storageRepairIds.size() > 0) {
        	StorehouseStorageRepairExample storageRepairExample = new StorehouseStorageRepairExample(); 
        	storageRepairExample.createCriteria().andRepairIdIn(storageRepairIds);
            count = storageRepairMapper.deleteByExample(storageRepairExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(storageRepairName, ",") + " ]仓库维修信息");
            } else {
                returnResult.setMsg("发生未知错误，仓库维修信息删除失败");
            }
        }
        return returnResult;
    }
}

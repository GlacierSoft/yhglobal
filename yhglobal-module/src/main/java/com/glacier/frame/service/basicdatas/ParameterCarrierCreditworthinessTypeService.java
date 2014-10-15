/**
 * @Title: ParameterCarrierCreditworthinessTypeService.java 
 * @Package com.glacier.global.service.ParameterCarrierCreditworthinessType
 * @author wuting   
 * @email 920339213@qq.com
 * @date 2014-10-14
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.00          
 * @Review (审核人) ：wuting
 * 
 */
package com.glacier.frame.service.basicdatas; 
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
import com.glacier.frame.dao.basicdatas.ParameterCarrierCreditworthinessTypeMapper;
import com.glacier.frame.dto.query.basicdatas.ParameterCarrierCreditworthinessTypeQueryDTO;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.basicdatas.ParameterCarrierCreditworthinessType;
import com.glacier.frame.entity.basicdatas.ParameterCarrierCreditworthinessTypeExample;
import com.glacier.frame.entity.basicdatas.ParameterCarrierCreditworthinessTypeExample.Criteria;
/*** 
 * @ClassName:  ParameterCarrierCreditworthinessTypeService
 * @Description: TODO(信誉度类型表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-11
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParameterCarrierCreditworthinessTypeService {

	@Autowired
	private ParameterCarrierCreditworthinessTypeMapper creditworthinessTypeMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有信誉度类型信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, ParameterCarrierCreditworthinessTypeQueryDTO CreditworthinessTypeQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParameterCarrierCreditworthinessTypeExample CreditworthinessTypeExample = new ParameterCarrierCreditworthinessTypeExample(); 
        Criteria queryCriteria = CreditworthinessTypeExample.createCriteria();
        CreditworthinessTypeQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	CreditworthinessTypeExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	CreditworthinessTypeExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	CreditworthinessTypeExample.setOrderByClause(jqPager.getOrderBy("temp_parameter_carrier_creditworthiness_type_"));
        }
        List<ParameterCarrierCreditworthinessType>  carrierCarTypeList = creditworthinessTypeMapper.selectByExample(CreditworthinessTypeExample); // 查询所有会员列表
        int total = creditworthinessTypeMapper.countByExample(CreditworthinessTypeExample); // 查询总页数
        returnResult.setRows(carrierCarTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getCarrierCarType 
	 * @Description: TODO(根据信誉度类型Id获取信誉度类型信息) 
	 * @param @param creditworthinessTypeId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getCarrierCarType(String creditworthinessTypeId) {
    	ParameterCarrierCreditworthinessType creditworthinessType = creditworthinessTypeMapper.selectByPrimaryKey(creditworthinessTypeId);
        return creditworthinessType;
    }
    
    /**
     * @Title: addCreditworthinessType 
     * @Description: TODO(新增信誉度类型) 
     * @param @param creditworthinessType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addCreditworthinessType(ParameterCarrierCreditworthinessType creditworthinessType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterCarrierCreditworthinessTypeExample CreditworthinessTypeExample = new ParameterCarrierCreditworthinessTypeExample(); 
        int count = 0;
        // 防止承运商信誉等级名称重复
        CreditworthinessTypeExample.createCriteria().andCreditworthinessTypeEqualTo(creditworthinessType.getCreditworthinessType());
        count = creditworthinessTypeMapper.countByExample(CreditworthinessTypeExample);
        if (count > 0) {
            returnResult.setMsg("信誉度类型名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        creditworthinessType.setCreditworthinessTypeId(RandomGUID.getRandomGUID());
        creditworthinessType.setCreater(pricipalUser.getUserId());
        creditworthinessType.setCreateTime(new Date());
        creditworthinessType.setUpdater(pricipalUser.getUserId());
        creditworthinessType.setUpdateTime(new Date());
        count = creditworthinessTypeMapper.insert(creditworthinessType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + creditworthinessType.getCreditworthinessType() + "] 信誉度类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，信誉度类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editCreditworthinessType
     * @Description: TODO(修改信誉度类型信息) 
     * @param @param carrierCarType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editCreditworthinessType(ParameterCarrierCreditworthinessType creditworthinessType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterCarrierCreditworthinessTypeExample CreditworthinessTypeExample = new ParameterCarrierCreditworthinessTypeExample(); 
        int count = 0;
        // 防止承运商信誉等级名称重复
        CreditworthinessTypeExample.createCriteria().andCreditworthinessTypeEqualTo(creditworthinessType.getCreditworthinessType()).andCreditworthinessTypeIdNotEqualTo(creditworthinessType.getCreditworthinessTypeId());
        count = creditworthinessTypeMapper.countByExample(CreditworthinessTypeExample);
        if (count > 0) {
            returnResult.setMsg("信誉度类型名称重复");
            return returnResult;
        }
        //根据ID获取承运商信誉等级信息
        ParameterCarrierCreditworthinessType creditworthinessTypeTime = (ParameterCarrierCreditworthinessType) getCarrierCarType(creditworthinessType.getCreditworthinessTypeId());
        creditworthinessType.setCreater(creditworthinessTypeTime.getCreater());
        creditworthinessType.setCreateTime(creditworthinessTypeTime.getCreateTime());
        creditworthinessType.setUpdater(pricipalUser.getUserId());
        creditworthinessType.setUpdateTime(new Date());
        count = creditworthinessTypeMapper.updateByPrimaryKey(creditworthinessType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + creditworthinessType.getCreditworthinessType() + "] 信誉度类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，信誉度类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delCreditworthinessType 
     * @Description: TODO(删除信誉度类型) 
     * @param @param creditworthinessTypeIds carTypeName
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object delCreditworthinessType(List<String> creditworthinessTypeIds, List<String> carTypeName) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (creditworthinessTypeIds.size() > 0) {
        	ParameterCarrierCreditworthinessTypeExample CreditworthinessTypeExample = new ParameterCarrierCreditworthinessTypeExample(); 
        	CreditworthinessTypeExample.createCriteria().andCreditworthinessTypeIdIn(creditworthinessTypeIds);
            count = creditworthinessTypeMapper.deleteByExample(CreditworthinessTypeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(carTypeName, ",") + " ]信誉度类型信息");
            } else {
                returnResult.setMsg("发生未知错误，信誉度类型信息删除失败");
            }
        }
        return returnResult;
    }
}

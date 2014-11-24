/**
 * @Title: ParameterCarrierCarTypeService.java 
 * @Package com.glacier.global.service.ParameterCarrierCarType
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
import com.glacier.frame.dao.basicdatas.ParameterCarrierCarTypeMapper;
import com.glacier.frame.dto.query.basicdatas.ParameterCarrierCarTypeQueryDTO;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.basicdatas.ParameterCarrierCarType;
import com.glacier.frame.entity.basicdatas.ParameterCarrierCarTypeExample;
import com.glacier.frame.entity.basicdatas.ParameterCarrierCarTypeExample.Criteria;
/*** 
 * @ClassName:  ParameterCarrierCarTypeService
 * @Description: TODO(车辆类型表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-11
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParameterCarrierCarTypeService {

	@Autowired
	private ParameterCarrierCarTypeMapper carrierCarTypeMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有车辆类型信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, ParameterCarrierCarTypeQueryDTO carTypeQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParameterCarrierCarTypeExample CarrierCarTypeExample = new ParameterCarrierCarTypeExample(); 
        Criteria queryCriteria = CarrierCarTypeExample.createCriteria();
        carTypeQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	CarrierCarTypeExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	CarrierCarTypeExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	CarrierCarTypeExample.setOrderByClause(jqPager.getOrderBy("temp_parameter_carrier_car_type_"));
        }
        List<ParameterCarrierCarType>  carrierCarTypeList = carrierCarTypeMapper.selectByExample(CarrierCarTypeExample); // 查询所有会员列表
        int total = carrierCarTypeMapper.countByExample(CarrierCarTypeExample); // 查询总页数
        returnResult.setRows(carrierCarTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: CarrierCarTypeList 
	 * @Description: TODO(获取所有车辆类型信息) 
	 * @param @param
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object CarrierCarTypeList() {
    	List<ParameterCarrierCarType> carrierCarType = carrierCarTypeMapper.selectByExample(new ParameterCarrierCarTypeExample());
        return carrierCarType;
    }
    
    /**
	 * @Title: getCarrierCarType 
	 * @Description: TODO(根据车辆类型Id获取车辆类型信息) 
	 * @param @param carTypeId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getCarrierCarType(String carTypeId) {
    	ParameterCarrierCarType carrierCarType = carrierCarTypeMapper.selectByPrimaryKey(carTypeId);
        return carrierCarType;
    }
    
    /**
     * @Title: addCarType 
     * @Description: TODO(新增车辆类型) 
     * @param @param carrierCarType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addCarType(ParameterCarrierCarType carrierCarType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterCarrierCarTypeExample CarrierCarTypeExample = new ParameterCarrierCarTypeExample();
        int count = 0;
        // 防止承运商信誉等级名称重复
        CarrierCarTypeExample.createCriteria().andCartypeNameEqualTo(carrierCarType.getCartypeName());
        count = carrierCarTypeMapper.countByExample(CarrierCarTypeExample);
        if (count > 0) {
            returnResult.setMsg("车辆类型名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        carrierCarType.setCartypeId(RandomGUID.getRandomGUID());
        carrierCarType.setCreater(pricipalUser.getUserId());
        carrierCarType.setCreateTime(new Date());
        carrierCarType.setUpdater(pricipalUser.getUserId());
        carrierCarType.setUpdateTime(new Date());
        count = carrierCarTypeMapper.insert(carrierCarType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + carrierCarType.getCartypeName() + "] 车辆类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，车辆类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editCarType 
     * @Description: TODO(修改车辆类型信息) 
     * @param @param carrierCarType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editCarType(ParameterCarrierCarType carrierCarType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterCarrierCarTypeExample CarrierCarTypeExample = new ParameterCarrierCarTypeExample();
        int count = 0;
        // 防止承运商信誉等级名称重复
        CarrierCarTypeExample.createCriteria().andCartypeNameEqualTo(carrierCarType.getCartypeName()).andCartypeIdNotEqualTo(carrierCarType.getCartypeId());
        count = carrierCarTypeMapper.countByExample(CarrierCarTypeExample);
        if (count > 0) {
            returnResult.setMsg("车辆类型名称重复");
            return returnResult;
        }
        //根据ID获取承运商信誉等级信息
        ParameterCarrierCarType carrierCarTypeTime = (ParameterCarrierCarType) getCarrierCarType(carrierCarType.getCartypeId());
        carrierCarType.setCreater(carrierCarTypeTime.getCreater());
        carrierCarType.setCreateTime(carrierCarTypeTime.getCreateTime());
        carrierCarType.setUpdater(pricipalUser.getUserId());
        carrierCarType.setUpdateTime(new Date());
        count = carrierCarTypeMapper.updateByPrimaryKey(carrierCarType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + carrierCarType.getCartypeName() + "] 车辆类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，车辆类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delCarType 
     * @Description: TODO(删除车辆类型) 
     * @param @param gradeIds
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object delCarType(List<String> carTypeIds, List<String> carTypeName) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (carTypeIds.size() > 0) {
        	ParameterCarrierCarTypeExample CarrierCarTypeExample = new ParameterCarrierCarTypeExample();
        	CarrierCarTypeExample.createCriteria().andCartypeIdIn(carTypeIds);
            count = carrierCarTypeMapper.deleteByExample(CarrierCarTypeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(carTypeName, ",") + " ]车辆类型信息");
            } else {
                returnResult.setMsg("发生未知错误，车辆类型信息删除失败");
            }
        }
        return returnResult;
    }
}

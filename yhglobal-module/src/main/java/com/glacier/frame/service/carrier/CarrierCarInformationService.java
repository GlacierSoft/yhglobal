/**
 * @Title: CarrierCarInformationService.java 
 * @Package com.glacier.global.service.carrierCarInfomation
 * @author wuting   
 * @email 920339213@qq.com
 * @date 2014-10-09
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.00          
 * @Review (审核人) ：wuting
 * 
 */
package com.glacier.frame.service.carrier; 
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
import com.glacier.frame.dao.carrier.CarrierCarInformationMapper;
import com.glacier.frame.dto.query.carrier.CarrierCarInformationQueryDTO;
import com.glacier.frame.entity.carrier.CarrierCarInformation;
import com.glacier.frame.entity.carrier.CarrierCarInformationExample;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.carrier.CarrierCarInformationExample.Criteria;
/*** 
 * @ClassName:  CarrierCarInformationService
 * @Description: TODO(承运商车辆表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-11
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class CarrierCarInformationService {

	@Autowired
	private CarrierCarInformationMapper carrierCarInformationMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有承运商车辆信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, CarrierCarInformationQueryDTO memberGradeQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        CarrierCarInformationExample memberGradeExample = new CarrierCarInformationExample(); 
        Criteria queryCriteria = memberGradeExample.createCriteria();
        memberGradeQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	memberGradeExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	memberGradeExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	memberGradeExample.setOrderByClause(jqPager.getOrderBy("temp_carrier_car_information_"));
        }
        List<CarrierCarInformation>  carrierCarInformations = carrierCarInformationMapper.selectByExample(memberGradeExample); // 查询所有会员列表
        int total = carrierCarInformationMapper.countByExample(memberGradeExample); // 查询总页数
        returnResult.setRows(carrierCarInformations);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getMember 
	 * @Description: TODO(根据承运商车辆Id获取承运商车辆信息) 
	 * @param @param gradeId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getCarInformation(String memberGradeId) {
    	CarrierCarInformation memberGrade = carrierCarInformationMapper.selectByPrimaryKey(memberGradeId);
        return memberGrade;
    }
    
    /**
     * @Title: addGrade 
     * @Description: TODO(新增承运商车辆) 
     * @param @param memberGrade
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addNews(CarrierCarInformation carInformation) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        CarrierCarInformationExample memberGradeExample = new CarrierCarInformationExample();
        int count = 0;
        // 防止承运商车辆牌号重复
        memberGradeExample.createCriteria().andPlateNumberEqualTo(carInformation.getPlateNumber());
        count = carrierCarInformationMapper.countByExample(memberGradeExample);
        if (count > 0) {
            returnResult.setMsg("承运商车辆牌号重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        carInformation.setAuditState("authstr");
        carInformation.setCarId(RandomGUID.getRandomGUID());
        carInformation.setCreater(pricipalUser.getUserId());
        carInformation.setCreateTime(new Date());
        carInformation.setUpdater(pricipalUser.getUserId());
        carInformation.setUpdateTime(new Date());
        count = carrierCarInformationMapper.insert(carInformation);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + carInformation.getPlateNumber() + "] 承运商车辆信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，承运商车辆信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: auditCarInformation 
     * @Description: TODO(审核车辆信息记录) 
     * @param @param carInformation
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object auditCarInformation(CarrierCarInformation carInformation) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
        if(carInformation.getAuditState().equals("authstr")){
        	 returnResult.setMsg("无效的操作，请选择是否通过！！"); 
             return returnResult; 
        } 
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        carInformation.setAudit(pricipalUser.getUserId());
        carInformation.setAuditTime(new Date());
        count = carrierCarInformationMapper.updateByPrimaryKeySelective(carInformation);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + carInformation.getPlateNumber() + "] 的车辆信息记录审核操作成功");
        } else {
            returnResult.setMsg("发生未知错误，车辆信息记录审核操作失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editGrade 
     * @Description: TODO(修改承运商车辆) 
     * @param @param memberGrade
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editNews(CarrierCarInformation carInformation) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        CarrierCarInformationExample memberGradeExample = new CarrierCarInformationExample();
        int count = 0;
        // 防止承运商车辆牌号重复
        memberGradeExample.createCriteria().andPlateNumberEqualTo(carInformation.getPlateNumber()).andCarIdNotEqualTo(carInformation.getCarId());
        count = carrierCarInformationMapper.countByExample(memberGradeExample);
        if (count > 0) {
            returnResult.setMsg("承运商车辆名称重复");
            return returnResult;
        }
        //根据ID获取承运商车辆信息
        CarrierCarInformation memberGradeTime = (CarrierCarInformation) getCarInformation(carInformation.getCarId());
        carInformation.setAudit(memberGradeTime.getAudit());
        carInformation.setAuditState("authstr");
        carInformation.setAuditTime(memberGradeTime.getAuditTime());
        carInformation.setCreater(memberGradeTime.getCreater());
        carInformation.setCreateTime(memberGradeTime.getCreateTime());
        carInformation.setUpdater(pricipalUser.getUserId());
        carInformation.setUpdateTime(new Date());
        count = carrierCarInformationMapper.updateByPrimaryKey(carInformation);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + carInformation.getPlateNumber() + "] 承运商车辆信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，承运商车辆信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delGrade 
     * @Description: TODO(删除承运商车辆) 
     * @param @param gradeIds
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object delNews(List<String> gradeIds, List<String> gradeName) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (gradeIds.size() > 0) {
        	CarrierCarInformationExample memberGradeExample = new CarrierCarInformationExample();
        	memberGradeExample.createCriteria().andCarIdIn(gradeIds);
            count = carrierCarInformationMapper.deleteByExample(memberGradeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(gradeName, ",") + " ]承运商车辆");
            } else {
                returnResult.setMsg("发生未知错误，承运商车辆信息删除失败");
            }
        }
        return returnResult;
    }
}

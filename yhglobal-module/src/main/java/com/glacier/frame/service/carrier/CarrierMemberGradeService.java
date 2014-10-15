/**
 * @Title: CarrierMemberGradeService.java 
 * @Package com.glacier.global.service.carriermemberGrade
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
import com.glacier.frame.dao.carrier.CarrierMemberGradeMapper;
import com.glacier.frame.dto.query.carrier.CarrierMemberGradeQueryDTO;
import com.glacier.frame.entity.carrier.CarrierMemberGrade;
import com.glacier.frame.entity.carrier.CarrierMemberGradeExample;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.carrier.CarrierMemberGradeExample.Criteria;
/*** 
 * @ClassName:  CarrierMemberGradeService
 * @Description: TODO(承运商信誉等级表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-11
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class CarrierMemberGradeService {

	@Autowired
	private CarrierMemberGradeMapper carrierMemberGradeMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有承运商信誉等级信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, CarrierMemberGradeQueryDTO memberGradeQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        CarrierMemberGradeExample memberGradeExample = new CarrierMemberGradeExample(); 
        Criteria queryCriteria = memberGradeExample.createCriteria();
        memberGradeQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	memberGradeExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	memberGradeExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	memberGradeExample.setOrderByClause(jqPager.getOrderBy("temp_carrier_member_grade_"));
        }
        List<CarrierMemberGrade>  carrierMemberGrades = carrierMemberGradeMapper.selectByExample(memberGradeExample); // 查询所有会员列表
        int total = carrierMemberGradeMapper.countByExample(memberGradeExample); // 查询总页数
        returnResult.setRows(carrierMemberGrades);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getMember 
	 * @Description: TODO(根据承运商信誉等级Id获取承运商信誉等级信息) 
	 * @param @param gradeId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getMemberGrade(String memberGradeId) {
    	CarrierMemberGrade memberGrade = carrierMemberGradeMapper.selectByPrimaryKey(memberGradeId);
        return memberGrade;
    }
    
    /**
     * @Title: addGrade 
     * @Description: TODO(新增承运商信誉等级) 
     * @param @param memberGrade
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addNews(CarrierMemberGrade memberGrade) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        CarrierMemberGradeExample memberGradeExample = new CarrierMemberGradeExample();
        int count = 0;
        // 防止承运商信誉等级名称重复
        memberGradeExample.createCriteria().andGradeNameEqualTo(memberGrade.getGradeName());
        count = carrierMemberGradeMapper.countByExample(memberGradeExample);
        if (count > 0) {
            returnResult.setMsg("承运商信誉等级名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        
        // 判断开始积分以及结束积分
        if(memberGrade.getScopeStart() >= memberGrade.getScopeStop()){
        	returnResult.setMsg("开始信誉开始值不能大于等于信誉结束值");
        	returnResult.setSuccess(false);
            return returnResult;
        }
        memberGrade.setGradeId(RandomGUID.getRandomGUID());
        memberGrade.setCreater(pricipalUser.getUserId());
        memberGrade.setCreateTime(new Date());
        memberGrade.setUpdater(pricipalUser.getUserId());
        memberGrade.setUpdateTime(new Date());
        count = carrierMemberGradeMapper.insert(memberGrade);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + memberGrade.getGradeName() + "] 承运商信誉等级信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，承运商信誉等级信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editGrade 
     * @Description: TODO(修改承运商信誉等级) 
     * @param @param memberGrade
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editNews(CarrierMemberGrade memberGrade) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        CarrierMemberGradeExample memberGradeExample = new CarrierMemberGradeExample();
        int count = 0;
        // 防止承运商信誉等级名称重复
        memberGradeExample.createCriteria().andGradeNameEqualTo(memberGrade.getGradeName()).andGradeIdNotEqualTo(memberGrade.getGradeId());
        count = carrierMemberGradeMapper.countByExample(memberGradeExample);
        if (count > 0) {
            returnResult.setMsg("承运商信誉等级名称重复");
            return returnResult;
        }
        
        // 判断开始积分以及结束积分
        if(memberGrade.getScopeStart() >= memberGrade.getScopeStop()){
        	returnResult.setMsg("开始信誉开始值不能大于等于信誉结束值");
            return returnResult;
        }
        //根据ID获取承运商信誉等级信息
        CarrierMemberGrade memberGradeTime = (CarrierMemberGrade) getMemberGrade(memberGrade.getGradeId());
        memberGrade.setCreater(memberGradeTime.getCreater());
        memberGrade.setCreateTime(memberGradeTime.getCreateTime());
        memberGrade.setUpdater(pricipalUser.getUserId());
        memberGrade.setUpdateTime(new Date());
        count = carrierMemberGradeMapper.updateByPrimaryKey(memberGrade);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + memberGrade.getGradeName() + "] 承运商信誉等级信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，承运商信誉等级信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delGrade 
     * @Description: TODO(删除承运商信誉等级) 
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
        	CarrierMemberGradeExample memberGradeExample = new CarrierMemberGradeExample();
        	memberGradeExample.createCriteria().andGradeIdIn(gradeIds);
            count = carrierMemberGradeMapper.deleteByExample(memberGradeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(gradeName, ",") + " ]承运商信誉等级");
            } else {
                returnResult.setMsg("发生未知错误，承运商信誉等级信息删除失败");
            }
        }
        return returnResult;
    }
}

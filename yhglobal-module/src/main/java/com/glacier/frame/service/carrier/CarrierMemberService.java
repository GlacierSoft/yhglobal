/**
 * @Title: CarrierMemberService.java 
 * @Package com.glacier.global.service.carrier
 * @author songjundong   
 * @email 985776597@qq.com
 * @date 2014-10-11 下午1:40:53
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.00          
 * @Review (审核人) ：songjundong
 * 
 */
package com.glacier.frame.service.carrier; 
import java.util.ArrayList; 
import java.util.Date;
import java.util.List; 
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional; 
import com.glacier.frame.dao.carrier.CarrierEnterpriserMemberMapper;
import com.glacier.frame.dao.carrier.CarrierIndividualityMemberMapper;
import com.glacier.frame.dao.carrier.CarrierMemberMapper; 
import com.glacier.frame.dao.carrier.CarrierMemberTokenMapper;
import com.glacier.frame.dto.query.carrier.CarrierMemberQueryDTO;
import com.glacier.frame.entity.carrier.CarrierEnterpriserMember;
import com.glacier.frame.entity.carrier.CarrierMember;
import com.glacier.frame.entity.carrier.CarrierMemberExample;  
import com.glacier.frame.entity.carrier.CarrierMemberExample.Criteria; 
import com.glacier.frame.entity.system.User;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson; 
/*** 
 * @ClassName:  CarrierMemberService
 * @Description: TODO(承运商会员表业务类)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-10-11 下午1:40:53
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class CarrierMemberService {

	@Autowired
	private CarrierMemberMapper carrierMemberMapper;
	
	@Autowired
	private CarrierEnterpriserMemberMapper carrierEnterpriserMemberMapper;
    
	@Autowired
	private CarrierIndividualityMemberMapper carrierIndividualityMemberMapper;

	@Autowired
    private CarrierMemberTokenMapper carrierMemberTokenMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
    public Object listAsGrid(JqPager jqPager, CarrierMemberQueryDTO memberQueryDTO, String q) {
        JqGridReturn returnResult = new JqGridReturn();
        CarrierMemberExample memberExample = new CarrierMemberExample(); 
        Criteria queryCriteria = memberExample.createCriteria();
        memberQueryDTO.setQueryCondition(queryCriteria, q); 
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	memberExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	memberExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	memberExample.setOrderByClause(jqPager.getOrderBy("temp_carrier_member_"));
        }
        List<CarrierMember>  shippermembers = carrierMemberMapper.selectByExample(memberExample); // 查询所有会员列表
        int total = carrierMemberMapper.countByExample(memberExample); // 查询总页数
        returnResult.setRows(shippermembers);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getMember 
	 * @Description: TODO(根据会员Id获取会员信息) 
	 * @param @param memberId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public List<Object> getMember(String memberId) {
    	List<Object> list=new ArrayList<Object>(); 
    	CarrierMember member = carrierMemberMapper.selectByPrimaryKey(memberId);
    	list.add(member);
    	 //根据会员类型，获取对应的数据，如果是个体会员，则查询个体的相关数据
    	if(member.getMemberType().equals("enterprise")){ //企业会员
    		list.add(carrierEnterpriserMemberMapper.selectByPrimaryKey(memberId));
    	}else{ //个体会员
    		list.add(carrierIndividualityMemberMapper.selectByPrimaryKey(memberId));
    	} 
        return list;
    } 
     
    /**
     * @Title: getMember 
     * @Description: TODO(根据会员Id获取会员信息) 
     * @param @param memberId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public CarrierMember getShipperMember(String memberId) {
    	CarrierMember carrierMember = carrierMemberMapper.selectByPrimaryKey(memberId);
        return carrierMember;
    }
    
    /*** 
     * @Title: upStatus  
     * @Description: TODO(启用和禁用会员)  
     * @param @param shipperMemberId
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */ 
    @Transactional(readOnly = false)
    public Object upStatus(String carrierMemberId){
    	 JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
    	 CarrierMember carrierMember= carrierMemberMapper.selectByPrimaryKey(carrierMemberId);
    	 if(carrierMember.getStatus().equals("enable")){
    		 carrierMember.setStatus("disable");
    	 }else{
    		 carrierMember.setStatus("enable");
    	 } 
    	 int count = carrierMemberMapper.updateByPrimaryKeySelective(carrierMember);
    	 if(count == 1){
    		 returnResult.setSuccess(true);
    		 returnResult.setMsg("更改状态成功!");
    	 }else{
    		 returnResult.setMsg("发生未知错误，状态修改失败");
    	 }
    	return returnResult; 
    } 

    /**
     * @Title: audit 
     * @Description: TODO(审核承运商信息) 
     * @param @param shipperEnterpriseMember
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false) 
    public Object audit(CarrierMember carrierMember) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        CarrierMember enterpriseMember = carrierMemberMapper.selectByPrimaryKey(carrierMember.getCarrierMemberId());
        if(enterpriseMember.getAuditState().equals("authstr")==false){
        	returnResult.setMsg("该会员已进行过审核，不可重复操作");
       	    return returnResult;
        }
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject(); 
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        carrierMember.setAudit(pricipalUser.getUserId());
        carrierMember.setAuditTime(new Date());
        carrierMember.setUpdater(pricipalUser.getUserId()); 
        carrierMember.setUpdateTime(new Date());
        count = carrierMemberMapper.updateByPrimaryKeySelective(carrierMember);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("会员【"+enterpriseMember.getMemberName()+"】审核操作成功");
        } else {
            returnResult.setMsg("发生未知错误，企业信息审核失败");
        }
        return returnResult;
    } 
    
    /**
     * @Title: enterpriserAudit 
     * @Description: TODO(认证承运商信息) 
     * @param @param carrierEnterpriserMember
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false) 
    public Object enterpriserAudit(CarrierEnterpriserMember carrierEnterpriserMember) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        CarrierEnterpriserMember enterpriserMember = carrierEnterpriserMemberMapper.selectByPrimaryKey(carrierEnterpriserMember.getCarrierMemberId());
        CarrierMember carrierMember=carrierMemberMapper.selectByPrimaryKey(carrierEnterpriserMember.getCarrierMemberId());
        if(carrierMember.getAuditState().equals("pass")==false){
        	returnResult.setMsg("该企业未审核，或者审核未通过，不可进行认证操作!");
       	    return returnResult;
        } 
        if(enterpriserMember.getAuthState().equals("authstr")==false){
        	returnResult.setMsg("该企业已进行过认证，不可重复操作");
       	    return returnResult;
        }
        int count = 0; 
        Subject pricipalSubject = SecurityUtils.getSubject(); 
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        carrierEnterpriserMember.setAuth(pricipalUser.getUserId());
        carrierEnterpriserMember.setAuthTime(new Date()); 
        count = carrierEnterpriserMemberMapper.updateByPrimaryKeySelective(carrierEnterpriserMember);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("企业【"+enterpriserMember.getEnterpriseName()+"】认证操作成功");
        } else {
            returnResult.setMsg("发生未知错误，企业信息认证失败");
        }
        return returnResult;
    } 
}

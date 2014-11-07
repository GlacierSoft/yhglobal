/**
 * @Title: ShipperIndividualityMemberService.java 
 * @Package com.glacier.global.service.carrier
 * @author wuting   
 * @email 920339213@qq.com
 * @date 2014-10-11 下午1:40:53
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.00          
 * @Review (审核人) ：WuTing
 * 
 */
package com.glacier.frame.service.carrier; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.frame.dao.member.ShipperEnterpriseMemberMapper;
import com.glacier.frame.dao.member.ShipperIndividualityMemberMapper;
import com.glacier.frame.dao.member.ShipperMemberMapper;
import com.glacier.frame.entity.member.ShipperEnterpriseMember;
import com.glacier.frame.entity.member.ShipperIndividualityMember;
import com.glacier.frame.entity.member.ShipperMember;
import com.glacier.jqueryui.util.JqReturnJson;
/*** 
 * @ClassName:  ShipperIndividualityMemberService
 * @Description: TODO(会员表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-11 下午1:40:53
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ShipperIndividualityMemberService {

	@Autowired
	private ShipperIndividualityMemberMapper individualityMemberMapper;
	
	@Autowired
	private ShipperMemberMapper shipperMemberMapper;
	
	@Autowired
	private ShipperEnterpriseMemberMapper enterpriseMemberMapper;
	
    /**
     * @Title: getMember 
     * @Description: TODO(根据会员Id获取个体户会员信息) 
     * @param @param memberId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public ShipperIndividualityMember getShipperMember(String memberId) {
    	ShipperIndividualityMember individuality = individualityMemberMapper.selectByPrimaryKey(memberId);
        return individuality;
    }
    
    /**
     * @Title: editIndividualityMember 
     * @Description: TODO(修改会员个体户的信息) 
     * @param @param individuality，email，memberId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editIndividualityMember(ShipperIndividualityMember individuality,String email,String memberId){
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
        int count = 0;
        //判断会员是否修改邮箱
        if(null != email&&email.length() > 0){
        	ShipperMember shipperMember = shipperMemberMapper.selectByPrimaryKey(memberId);
        	shipperMember.setEmail(email);
        	shipperMemberMapper.updateByPrimaryKey(shipperMember);
        }
        
        //会员表的修改
        count = individualityMemberMapper.updateByPrimaryKeySelective(individuality); 
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("保存成功");
        } else {
            returnResult.setMsg("发生未知错误，数据保存失败失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editEnterpriseMember 
     * @Description: TODO(修改会员企业的信息) 
     * @param @param enterprise，email，memberId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editEnterpriseMember(ShipperEnterpriseMember enterprise,String email,String memberId){
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
        int count = 0;
        //判断会员是否修改邮箱
        if(null != email&&email.length() > 0){
        	ShipperMember shipperMember = shipperMemberMapper.selectByPrimaryKey(memberId);
        	shipperMember.setEmail(email);
        	shipperMemberMapper.updateByPrimaryKey(shipperMember);
        }
        
        //会员表的修改
        count = enterpriseMemberMapper.updateByPrimaryKey(enterprise);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("保存成功");
        } else {
            returnResult.setMsg("发生未知错误，数据保存失败失败");
        }
        return returnResult;
    }
    
}

package com.glacier.frame.web.controller.member;
 
import java.util.List;

import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; 
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.frame.dto.query.member.ShipperMemberQueryDTO;
import com.glacier.frame.entity.member.ShipperEnterpriseMember;
import com.glacier.frame.entity.member.ShipperMember;
import com.glacier.frame.service.member.ShipperMemberService;

/*** 
 * @ClassName:  ShipperMemberController
 * @Description: TODO(货主会员controller)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-10-08  下午2:09:10
 */
@Controller
@RequestMapping(value = "/shippermember")
public class ShipperMemberController extends AbstractController{

	@Autowired
	private ShipperMemberService shippermemberService;
	
	// 进入会员列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("member_mgr/shipperMember_mgr/shipperMember");
        return mav;
    } 
      
    // 查询显示所有的货主会员信息
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ShipperMemberQueryDTO memberQueryDTO, String q) {
        return shippermemberService.listAsGrid(jqPager, memberQueryDTO, q);
    }
      
    // 进入会员Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberDetailPage(String memberId) { 
    	ModelAndView mav=null;  
    	if(StringUtils.isNotBlank(memberId)){
    		  List<Object> list=shippermemberService.getMember(memberId);
    	      //进行个体和企业会员信息页面切换
    	      ShipperMember shipperMember= (ShipperMember)list.get(0);
    	      if(shipperMember.getMemberType().equals("enterprise")){ //企业会员
        		  mav = new ModelAndView("member_mgr/shipperMember_mgr/shipperEnterpriseMember_detail");
        		  mav.addObject("enterpriseMemberData", list.get(1));
	           }else{  //个体会员
	        	  mav = new ModelAndView("member_mgr/shipperMember_mgr/shipperIndividualityMember_detail");
	      		  mav.addObject("individualityMemberData", list.get(1));
	           }
    	       mav.addObject("shipperMemberData", list.get(0));  
	     }
	     return mav;
    }
    
    // 启用、禁用会员
    @RequestMapping(value = "/status.json", method = RequestMethod.POST)
    @ResponseBody
    private Object updateStatus(String  memberId) {
    	return shippermemberService.upStatus(memberId); 
    } 
    
    
    // 企业会员audit表单页面
    @RequestMapping(value = "/intoAudit.htm")
    private Object intoAuditPlatform(String memberId) {
        ModelAndView mav = new ModelAndView("member_mgr/shipperMember_mgr/shipperEnterpriseMember_audit");
        if(StringUtils.isNotBlank(memberId)){
        	  List<Object> list=shippermemberService.getMember(memberId);
        	  mav.addObject("shipperMemberData", list.get(0));  
        	  mav.addObject("enterpriseMemberData", list.get(1)); 
          }
        return mav;
    }
    
    //企业会员认证
    @RequestMapping(value = "/audit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object auditPlatform(@Valid ShipperEnterpriseMember shipperEnterpriseMember, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return shippermemberService.audit(shipperEnterpriseMember);
    }
    
    
}

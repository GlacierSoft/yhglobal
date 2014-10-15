package com.glacier.frame.web.controller.carrier;
 
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
import com.glacier.frame.dto.query.carrier.CarrierMemberQueryDTO;
import com.glacier.frame.entity.carrier.CarrierEnterpriserMember;
import com.glacier.frame.entity.carrier.CarrierMember; 
import com.glacier.frame.service.carrier.CarrierMemberService;
import com.glacier.jqueryui.util.JqPager;  

/*** 
 * @ClassName:  CarrierMemberController
 * @Description: TODO(承运商会员controller)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-10-11  下午2:09:10
 */
@Controller
@RequestMapping(value = "/carrierMember")
public class CarrierMemberController extends AbstractController{

	@Autowired
	private CarrierMemberService carriermemberService;
	
	// 进入会员列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("carrier_mgr/carrierMember_mgr/carrierMember");
        return mav;
    } 
      
    // 查询显示所有的承运商会员信息
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, CarrierMemberQueryDTO memberQueryDTO, String q) {
        return carriermemberService.listAsGrid(jqPager, memberQueryDTO, q);
    }
      
    // 进入会员Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberDetailPage(String carrierMemberId) { 
    	ModelAndView mav=null;  
    	if(StringUtils.isNotBlank(carrierMemberId)){
    		  List<Object> list=carriermemberService.getMember(carrierMemberId);
    	      //进行个体和企业会员信息页面切换
    	      CarrierMember carrierMember= (CarrierMember)list.get(0);
    	      if(carrierMember.getMemberType().equals("individuality")){ //个人会员
    	    	  mav = new ModelAndView("carrier_mgr/carrierMember_mgr/carrierIndividualityMember_detail");
	      		  mav.addObject("individualityMemberData", list.get(1));
	      	  }else{  //企业、集团会员
	        	  mav = new ModelAndView("carrier_mgr/carrierMember_mgr/carrierEnterpriseMember_detail");
        		  mav.addObject("enterpriseMemberData", list.get(1)); 
        	  }
    	       mav.addObject("carrierMemberData", list.get(0));  
	     }
	     return mav;
    }
    
    // 启用、禁用会员
    @RequestMapping(value = "/status.json", method = RequestMethod.POST)
    @ResponseBody
    private Object updateStatus(String  memberId) {
    	return carriermemberService.upStatus(memberId); 
    }  

    // 会员audit表单页面
    @RequestMapping(value = "/intoAudit.htm")
    private Object intoAuditMember(String memberId) {
        ModelAndView mav = new ModelAndView("carrier_mgr/carrierMember_mgr/carrierMember_audit");
        if(StringUtils.isNotBlank(memberId)){
        	  List<Object> list=carriermemberService.getMember(memberId);
        	  mav.addObject("carrierMemberData", list.get(0));   
          }
        return mav;
    }
    
    //会员审核
    @RequestMapping(value = "/audit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object auditMember(@Valid CarrierMember carrierMember, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return carriermemberService.audit(carrierMember);
    }
    
    // 企业会员audit表单页面
    @RequestMapping(value = "/enterpriserAudit.htm")
    private Object intoAuditEnterMember(String memberId) {
        ModelAndView mav = new ModelAndView("carrier_mgr/carrierMember_mgr/carrierEnterpriseMember_audit");
        if(StringUtils.isNotBlank(memberId)){
        	  List<Object> list=carriermemberService.getMember(memberId);
        	  mav.addObject("enterpriseMemberData", list.get(1));   
          } 
        return mav;
    }
    
    //企业会员认证
    @RequestMapping(value = "/enterpriserAudit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object auditEnterMember(@Valid CarrierEnterpriserMember carrierEnterpriserMember, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return carriermemberService.enterpriserAudit(carrierEnterpriserMember);
    }
}

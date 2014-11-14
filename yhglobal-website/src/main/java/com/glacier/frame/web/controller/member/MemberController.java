package com.glacier.frame.web.controller.member;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.frame.entity.member.ShipperEnterpriseMember;
import com.glacier.frame.entity.member.ShipperIndividualityMember;
import com.glacier.frame.entity.member.ShipperMember;
import com.glacier.frame.entity.storehouse.StorehouseGoodstypeSet;
import com.glacier.frame.dto.query.storehouse.StorehouseGoodstypeSetQueryDTO;
import com.glacier.frame.service.carrier.ShipperEnterpriseMemberService;
import com.glacier.frame.service.carrier.ShipperIndividualityMemberService;
import com.glacier.frame.service.member.ShipperMemberService;
import com.glacier.frame.service.storehouse.StorehouseBelaidupService;
import com.glacier.frame.service.storehouse.StorehouseGoodstypeSetService;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;



@Controller
@RequestMapping(value = "member")
public class MemberController extends AbstractController{
    
    @Autowired
    private ShipperMemberService shipperMemberService;
    
    @Autowired
    private ShipperIndividualityMemberService individualityMemberService;
    
    @Autowired
    private ShipperEnterpriseMemberService enterpriseMemberService;
    
    
    @Autowired
    private StorehouseGoodstypeSetService StorehouseGoodstypeSetService;
    
    @Autowired
	private StorehouseBelaidupService belaidupService;

    // 进入会员个人主页展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexMember(HttpServletRequest request,HttpSession session) {
        ModelAndView mav = new ModelAndView("/member_mgr/member");
        Subject pricipalSubject = SecurityUtils.getSubject();//获取当前认证用户
        ShipperMember pricipalMember = (ShipperMember) pricipalSubject.getPrincipal();
        //重新获取当前登录用户信息，设置在session中
        ShipperMember member = (ShipperMember) shipperMemberService.getShipperMember(pricipalMember.getMemberId());
        ShipperIndividualityMember individuality = individualityMemberService.getShipperMember(pricipalMember.getMemberId());
        ShipperEnterpriseMember enterpriseMember = enterpriseMemberService.getShipperMember(pricipalMember.getMemberId());
        mav.addObject("individuality", individuality);
        mav.addObject("enterprise", enterpriseMember);
        session.removeAttribute("currentMember");
        session.setAttribute("currentMember", member);
        return mav;
    }
    
    //加入货源发送地展示页
    @RequestMapping(value="release.htm")
    private Object intorelease(JqPager jqPager, StorehouseGoodstypeSetQueryDTO storehouseGoodstypeSetQueryDTO){
    	ModelAndView mav=new ModelAndView("/member_mgr/MemberReleaseGoods");
    	storehouseGoodstypeSetQueryDTO.setStatus("enable");
    	JqGridReturn returnResult=(JqGridReturn) StorehouseGoodstypeSetService.listAsGrid(jqPager,storehouseGoodstypeSetQueryDTO);
    	@SuppressWarnings("unchecked")
		List<StorehouseGoodstypeSet> StorehouseGoodstypeSetList=(List<StorehouseGoodstypeSet>) returnResult.getRows();
    	mav.addObject("StorehouseGoodstypeSetList",StorehouseGoodstypeSetList);
    	return mav;
    }
    
    //转到头像上传页面。
  	@RequestMapping(value = "/memberPhotoInto.htm")
  	public Object memberPhotoInto(){
  		return "member_mgr/memberPhoto";
  	}
    
    //个体户的修改信息操作
    @RequestMapping(value = "/editIndividuality.htm")
	@ResponseBody
	public Object editIndividuality(@Valid ShipperIndividualityMember individuality,String email,BindingResult bindingResult,String memberId){
		if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
		return individualityMemberService.editIndividualityMember(individuality,email,memberId);
	}
    
    //企业用户的修改信息操作
    @RequestMapping(value = "/editEnterprise.htm")
	@ResponseBody
	public Object editEnterprise(@Valid ShipperEnterpriseMember enterprise,String email,BindingResult bindingResult,String memberId){
		if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
		return individualityMemberService.editEnterpriseMember(enterprise,email,memberId);
	}
    
    // 进入会员个人详细信息展示页面
    @RequestMapping(value = "/memberDetail.htm")
    private Object intoMemberDetail(HttpServletRequest request) {
    	Subject pricipalSubject = SecurityUtils.getSubject();//获取当前认证用户
        ShipperMember pricipalMember = (ShipperMember) pricipalSubject.getPrincipal();
        ModelAndView mav = null;
        if(pricipalMember.getMemberType().equals("individuality")){
        	mav = new ModelAndView("member_mgr/memberDetail");
        }else{
        	mav = new ModelAndView("member_mgr/enterpriseMemberDetail");
        }
        ShipperMember member = (ShipperMember) shipperMemberService.getShipperMember(pricipalMember.getMemberId());
        ShipperIndividualityMember individuality = individualityMemberService.getShipperMember(pricipalMember.getMemberId());
        ShipperEnterpriseMember enterpriseMember = enterpriseMemberService.getShipperMember(pricipalMember.getMemberId());
        mav.addObject("member", member);
        mav.addObject("enterprise", enterpriseMember);
        mav.addObject("individuality", individuality);
        return mav;
    }
    
}

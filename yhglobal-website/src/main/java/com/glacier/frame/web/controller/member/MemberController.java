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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.frame.entity.member.ShipperEnterpriseMember;
import com.glacier.frame.entity.member.ShipperIndividualityMember;
import com.glacier.frame.entity.member.ShipperMember;
import com.glacier.frame.entity.storehouse.StorehouseBelaidup;
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
    
    
    // 增加货物信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid StorehouseBelaidup belaidup, BindingResult bindingResult,String packageId) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return belaidupService.addBelaidup_website(belaidup,packageId);
    }
    
}

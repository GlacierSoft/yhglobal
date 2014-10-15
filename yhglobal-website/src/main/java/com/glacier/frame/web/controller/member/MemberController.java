package com.glacier.frame.web.controller.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.frame.entity.member.ShipperMember;
import com.glacier.frame.service.member.ShipperMemberService;

@Controller
@RequestMapping(value = "member")
public class MemberController extends AbstractController{
    
    @Autowired
    private ShipperMemberService shipperMemberService;

    // 进入会员个人主页展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexMember(HttpServletRequest request,HttpSession session) {
        ModelAndView mav = new ModelAndView("index");
        Subject pricipalSubject = SecurityUtils.getSubject();//获取当前认证用户
        System.out.println("sssssss=pricipalSubject="+pricipalSubject);
        ShipperMember pricipalMember = (ShipperMember) pricipalSubject.getPrincipal();
        System.out.println("pricipalMember="+pricipalMember);
        //重新获取当前登录用户信息，设置在session中
        ShipperMember member = (ShipperMember) shipperMemberService.getShipperMember(pricipalMember.getMemberId());
        session.removeAttribute("currentMember");
        session.setAttribute("currentMember", member);
        return mav;
    }
    
}

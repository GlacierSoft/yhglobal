/*
 * @(#)WebsiteFeedbackController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.web.controller.website;

import javax.validation.Valid;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.glacier.core.controller.AbstractController;
import com.glacier.frame.dao.member.ShipperEnterpriseMemberMapper;
import com.glacier.frame.dao.member.ShipperIndividualityMemberMapper;
import com.glacier.frame.dao.member.ShipperMemberMapper;
import com.glacier.frame.entity.member.ShipperMember;
import com.glacier.frame.entity.website.WebsiteFeedback;
import com.glacier.frame.service.website.WebsiteFeedbackService;

/** 
 * @ClassName: WebsiteFeedbackController 
 * @Description: TODO(公告的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/feedback")
public class WebsiteFeedbackController extends AbstractController{

    @Autowired
    private WebsiteFeedbackService feedbackService;// 注入意见业务Bean
    
    @Autowired
    private ShipperMemberMapper shipperMemberMapper;
    
    @Autowired
    private ShipperEnterpriseMemberMapper enterpriseMemberMapper;
    
    @Autowired
    private ShipperIndividualityMemberMapper individualityMemberMapper;
    
    //转到“增加意见反馈”页面
  	@RequestMapping(value = "/feedback.htm")
  	public Object feedback(){
  		Subject pricipalSubject = SecurityUtils.getSubject();
        ShipperMember pricipalUser = (ShipperMember) pricipalSubject.getPrincipal();
  		ModelAndView mav = new ModelAndView("about_mgr/websiteFeedback");
  		ShipperMember shipperMember = shipperMemberMapper.selectByPrimaryKey(pricipalUser.getMemberId());
  		if(shipperMember.getMemberType() == "enterprise"){
  			mav.addObject("memberPhone", enterpriseMemberMapper.selectByPrimaryKey(pricipalUser.getMemberId()).getEnterprisePhone());
  		}else{
  			mav.addObject("memberPhone", individualityMemberMapper.selectByPrimaryKey(pricipalUser.getMemberId()).getMobileNumber());
  		}
  		mav.addObject("memberData", shipperMember);
  		return mav;
  	}
  	
  	//增加意见反馈
  	@RequestMapping(value = "/addfeedback.json")
  	public Object addFeedback(@Valid WebsiteFeedback feedback){
  		return feedbackService.addFeedback(feedback);
  	}
}

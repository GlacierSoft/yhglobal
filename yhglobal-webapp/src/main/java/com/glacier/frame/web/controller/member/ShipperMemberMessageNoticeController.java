/**
 * @Title: ShipperMemberMessageNoticeCotroller.java 
 * @Package com.glacier.frame.web.controller.member 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-11-28 下午4:38:30 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-11-28
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.web.controller.member;

import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.frame.dto.query.member.ShipperMemberMessageNoticeQueryDTO;
import com.glacier.frame.entity.member.ShipperMemberMessageNotice;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.service.member.ShipperMemberMessageNoticeService;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: ShipperMemberMessageNoticeCotroller 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-11-28 下午4:38:30
 */
@Controller
@RequestMapping(value="memberMessageNotice")
public class ShipperMemberMessageNoticeController {

	   @Autowired
	   private ShipperMemberMessageNoticeService shipperMemberMessageNoticeService;
	   
	   //进入会员站内信息展示页面
	   @RequestMapping(value = "/index.htm")
	   private Object intoIndexPmember() {
	       ModelAndView mav = new ModelAndView("member_mgr/memberMessageNotice_mgr/memberMessageNotice");
	       return mav;
	   }
	   
	   // 查询显示所有的会员站内信息
	   @RequestMapping(value = "/list.json", method = RequestMethod.POST)
	   @ResponseBody
	   public Object listAsGrid(JqPager jqPager, ShipperMemberMessageNoticeQueryDTO shipperMemberMessageNoticeQueryDTO){
		     return shipperMemberMessageNoticeService.listAsGrid(shipperMemberMessageNoticeQueryDTO,jqPager);
	   }
	   
	   //会员站内信息详情页
	   @RequestMapping(value = "/intoDetail.htm")
	   private Object intoMessageNoticeDetailPage(String messageNoticeId) {
	     ModelAndView mav = new ModelAndView("member_mgr/memberMessageNotice_mgr/memberMessageNotice_detail");
	     if(StringUtils.isNotBlank(messageNoticeId)){
	        mav.addObject("memberMessageNoticeData", shipperMemberMessageNoticeService.getMemberShipperMessageNotice(messageNoticeId));
	     }
	     return mav;
	  }
	   
	   // 进入会员消息通知Form表单页面
	    @RequestMapping(value = "/intoForm.htm")
	    private Object intoMessageNoticeForm(String messageNoticeId) {
	    	Subject pricipalSubject = SecurityUtils.getSubject();
	        User pricipalUser = (User) pricipalSubject.getPrincipal();
	        ModelAndView mav = new ModelAndView("member_mgr/memberMessageNotice_mgr/memberMessageNotice_form");
	        mav.addObject("userCnName",pricipalUser.getUserCnName());
	        if(StringUtils.isNotBlank(messageNoticeId)){
	            mav.addObject("memberMessageNoticeData", shipperMemberMessageNoticeService.getMemberShipperMessageNotice(messageNoticeId));
	        }
	        return mav;
	    } 
	   
	   //会员站内信息添加
	    // 增加消息通知
	    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
	    @ResponseBody
	    private Object addMemberMessageNotice(@Valid ShipperMemberMessageNotice shipperMemberMessageNotice){
	         return shipperMemberMessageNoticeService.addMemberMessageNotice(shipperMemberMessageNotice);
	    } 
}

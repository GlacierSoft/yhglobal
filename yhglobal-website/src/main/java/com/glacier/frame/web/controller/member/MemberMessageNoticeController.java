/**
 * @Title: MemberMessageNotice.java 
 * @Package com.glacier.frame.web.controller.member 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-11-27 下午3:20:20 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-11-27
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.web.controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.frame.service.member.ShipperMemberMessageNoticeService;

/**
 * @ClassName: MemberMessageNotice 
 * @Description: TODO(会员站内信) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-11-27 下午3:20:20
 */
@Controller
@RequestMapping(value="memberMessageNotice")
public class MemberMessageNoticeController {

	@Autowired
	private ShipperMemberMessageNoticeService shipperMemberMessageNoticeService;
	
    //站内信息详情页
	@RequestMapping(value="intoDetail.htm")
	public Object intoMemberMessageNoticeDetail(String messageNoticeId){
		  ModelAndView mav=new ModelAndView("/member_mgr/memberMessageNoticeDetail");
		  mav.addObject("memberMessageNoticeDetailDate",shipperMemberMessageNoticeService.getMemberShipperMessageNotice(messageNoticeId));
		  return mav;
	}
}

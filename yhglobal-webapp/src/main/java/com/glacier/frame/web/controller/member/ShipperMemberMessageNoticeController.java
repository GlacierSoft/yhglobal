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

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.frame.dto.query.member.ShipperMemberMessageNoticeQueryDTO;
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
	   
	   // 进入会员列表展示页面
	   @RequestMapping(value = "/index.htm")
	   private Object intoIndexPmember() {
	       ModelAndView mav = new ModelAndView("member_mgr/memberMessageNotice_mgr/memberMessageNotice");
	       return mav;
	   }
	   
	   // 查询显示所有的货主会员信息
	   @RequestMapping(value = "/list.json", method = RequestMethod.POST)
	   @ResponseBody
	   public Object listAsGrid(JqPager jqPager, ShipperMemberMessageNoticeQueryDTO shipperMemberMessageNoticeQueryDTO){
		     return shipperMemberMessageNoticeService.listAsGrid(shipperMemberMessageNoticeQueryDTO,jqPager);
	   }
	   
	 //合同管理记录详情页
	 @RequestMapping(value = "/intoDetail.htm")
	 private Object intoMessageNoticeDetailPage(String messageNoticeId) {
	     ModelAndView mav = new ModelAndView("member_mgr/memberMessageNotice_mgr/memberMessageNotice_detail");
	     if(StringUtils.isNotBlank(messageNoticeId)){
	        mav.addObject("memberMessageNoticeData", shipperMemberMessageNoticeService.getMemberShipperMessageNotice(messageNoticeId));
	     }
	     return mav;
	  }
}

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.frame.entity.member.ShipperMemberMessageNotice;
import com.glacier.frame.service.member.ShipperMemberMessageNoticeService;
import com.glacier.jqueryui.util.JqReturnJson;

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
	
	//标记已读信息
	@RequestMapping(value="editAlready.json")
	@ResponseBody
	public Object changeAlreadtRead(String messageNoticeIds){
		String[] messageNoticeIdArrays = null;
		int count=0;
		int count_edit=0;
		JqReturnJson returnResult = new JqReturnJson();
		if(messageNoticeIds!=null&&!"".equals(messageNoticeIds)){
			messageNoticeIdArrays=messageNoticeIds.split(",");
		}
		for(String messageNoticeId :messageNoticeIdArrays){
			ShipperMemberMessageNotice shipperMemberMessageNotice=(ShipperMemberMessageNotice) shipperMemberMessageNoticeService.getMemberShipperMessageNotice(messageNoticeId);
			if(shipperMemberMessageNotice.getLetterstatus().equals("read")){
				count+=1; 
				continue;
			}else{
				shipperMemberMessageNotice.setLetterstatus("read");
				shipperMemberMessageNoticeService.editMessageNoticeWebsit(shipperMemberMessageNotice);
				count_edit+=1;
			}
		}
		if(count==messageNoticeIdArrays.length){
			returnResult.setSuccess(false);
			returnResult.setMsg("请选择至少一条未读信息进行操作！");
		}else{
			returnResult.setSuccess(true);
			returnResult.setMsg("你已成功将【"+count_edit+"】条信息设置为已读信息！");
		}
		return returnResult;
	}
	
	//标记为未读信息
	@RequestMapping(value="editWithout.json")
	@ResponseBody
	public Object changeWithoutRead(String messageNoticeIds){
		String[] messageNoticeIdArrays = null;
		int count=0;
		int count_edit=0;
		JqReturnJson returnResult = new JqReturnJson();
		if(messageNoticeIds!=null&&!"".equals(messageNoticeIds)){
			messageNoticeIdArrays=messageNoticeIds.split(",");
		}
		for(String messageNoticeId :messageNoticeIdArrays){
			ShipperMemberMessageNotice shipperMemberMessageNotice=(ShipperMemberMessageNotice) shipperMemberMessageNoticeService.getMemberShipperMessageNotice(messageNoticeId);
			if(shipperMemberMessageNotice.getLetterstatus().equals("unread")){
				count+=1; 
				continue;
			}else{
				shipperMemberMessageNotice.setLetterstatus("unread");
				shipperMemberMessageNoticeService.editMessageNoticeWebsit(shipperMemberMessageNotice);
				count_edit+=1;
			}
		}
		if(count==messageNoticeIdArrays.length){
			returnResult.setSuccess(false);
			returnResult.setMsg("请选择至少一条已读信息进行操作！");
		}else{
			returnResult.setSuccess(true);
			returnResult.setMsg("你已成功将【"+count_edit+"】条信息设置为未读信息！");
		}
		return returnResult;
	}
	
	//信息删除
	@RequestMapping(value="delRead.json")
	@ResponseBody
	public Object delRead(String messageNoticeIds){
		 int count=0;
		 JqReturnJson returnResult = new JqReturnJson();
		 String[] messageNoticeIdArrays=messageNoticeIds.split(",");
		 for(String messageNoticeId :messageNoticeIdArrays){
			 ShipperMemberMessageNotice shipperMemberMessageNotice=(ShipperMemberMessageNotice) shipperMemberMessageNoticeService.getMemberShipperMessageNotice(messageNoticeId);
			 shipperMemberMessageNotice.setLetterstatus("delete");
			 shipperMemberMessageNoticeService.editMessageNoticeWebsit(shipperMemberMessageNotice);
			 count+=1;
		 }
		 if(count>0){
			  returnResult.setSuccess(true);
			  returnResult.setMsg("你已经成功删除【"+count+"】站内消息！"); 
		 }else{
			  returnResult.setSuccess(false);
			  returnResult.setMsg("删除站内信息操作失败，请联系管理员!");
		 }
		 return returnResult;
	}
}
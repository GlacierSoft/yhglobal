/**
 * @Title: CarrierMemberMessageNoticeCotroller.java 
 * @Package com.glacier.frame.web.controller.carrier 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-12-1 下午1:40:00 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-12-1
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.web.controller.carrier;

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

import com.glacier.frame.dto.query.carrier.CarrierMemberMessageNoticeQueryDTO;
import com.glacier.frame.entity.carrier.CarrierMember;
import com.glacier.frame.entity.carrier.CarrierMemberMessageNotice;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.service.carrier.CarrierMemberMessageNoticeService;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: CarrierMemberMessageNoticeCotroller 
 * @Description: TODO(承运商站内信信息) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-12-1 下午1:40:00
 */

@Controller
@RequestMapping(value="carrierMemberMessageNotice")
public class CarrierMemberMessageNoticeCotroller {
   
	@Autowired
    private CarrierMemberMessageNoticeService  carrierMemberMessageNoticeService;
	 
    //进入承运商站内信息展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
       ModelAndView mav = new ModelAndView("carrier_mgr/carrierMessageNotice_mgr/carrierMessageNotice");
       return mav;
    }
    
    
    //查询显示所有的会员站内信息
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
	@ResponseBody
	public Object listAsGrid(JqPager jqPager, CarrierMemberMessageNoticeQueryDTO carrierMemberMessageNoticeQueryDTO){
       Subject pricipalSubject = SecurityUtils.getSubject();
       CarrierMember pricipalUser = (CarrierMember) pricipalSubject.getPrincipal();
       carrierMemberMessageNoticeQueryDTO.setReceiver(pricipalUser.getCarrierMemberId());
	   return carrierMemberMessageNoticeService.listAsGrid(carrierMemberMessageNoticeQueryDTO,jqPager);
    }
    
     //承运商站内信息详情页
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMessageNoticeDetailPage(String messageNoticeId) {
      ModelAndView mav = new ModelAndView("carrier_mgr/carrierMessageNotice_mgr/carrierMessageNotice_detail");
      if(StringUtils.isNotBlank(messageNoticeId)){
        mav.addObject("carrierrMessageNoticeData", carrierMemberMessageNoticeService.getCarrierMemberMessageNotice(messageNoticeId));
      }
      return mav;
    }
    
    // 进入会员消息通知Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoMessageNoticeForm(String messageNoticeId) {
    	Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        ModelAndView mav = new ModelAndView("carrier_mgr/carrierMessageNotice_mgr/carrierMessageNotice_form");
        mav.addObject("userCnName",pricipalUser.getUserCnName());
        if(StringUtils.isNotBlank(messageNoticeId)){
            mav.addObject("carrierMessageNoticeData", carrierMemberMessageNoticeService.getCarrierMemberMessageNotice(messageNoticeId));
        }
        return mav;
    } 
   
    // 增加消息通知
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addMemberMessageNotice(@Valid CarrierMemberMessageNotice carrierMemberMessageNotice){
         return carrierMemberMessageNoticeService.addCarrierMemberMessageNotice(carrierMemberMessageNotice);
    } 
    
}

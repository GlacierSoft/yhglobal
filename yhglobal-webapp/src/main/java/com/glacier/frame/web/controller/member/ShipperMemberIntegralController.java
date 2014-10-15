/**
 * @Title: ShipperMemberIntegralController.java 
 * @Package com.glacier.frame.web.controller.member 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2014-10-14 上午10:42:42 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-10-14
				修改人：song.jundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：song.jundong 
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

import com.glacier.core.controller.AbstractController;
import com.glacier.frame.dto.query.member.ShipperMemberIntegralQueryDTO;
import com.glacier.frame.service.member.ShipperMemberIntegralService;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName:  ShipperMemberIntegralController
 * @Description: TODO(会员积分记录控制器)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-10-14  上午10:42:42
 */
@Controller
@RequestMapping(value = "/memberIntegral")
public class ShipperMemberIntegralController extends AbstractController{
	  @Autowired
	    private ShipperMemberIntegralService integralService;// 注入会员积分记录业务Bean
	    
	    // 进入会员积分记录列表展示页面
	    @RequestMapping(value = "/index.htm")
	    private Object intoIndexPintegral() {
	        ModelAndView mav = new ModelAndView("member_mgr/integral_mgr/integral");
	        return mav;
	    }
	     
	    // 进入会员积分记录Detail信息页面
	    @RequestMapping(value = "/intoDetail.htm")
	    private Object intoIntegralDetailPage(String shipperMemberIntegralId) {
	        ModelAndView mav = new ModelAndView("member_mgr/integral_mgr/integral_detail");
	        if(StringUtils.isNotBlank(shipperMemberIntegralId)){
	            mav.addObject("integralData", integralService.getMemberIntegral(shipperMemberIntegralId));
	        } 
	        return mav;
	    }
	    
	    // 获取表格结构的所有会员积分记录数据
	    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
	    @ResponseBody
	    private Object listIntegralAsGridByMenuId(ShipperMemberIntegralQueryDTO  memberIntegralQueryDTO, JqPager pintegralr) {
	        return integralService.listAsGrid(pintegralr, memberIntegralQueryDTO);
	    }
}

/**
 * @Title: CarrierMemberCreditwortinessController.java 
 * @Package com.glacier.frame.web.controller.carrier
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2014-10-14 下午2:42:42 
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
package com.glacier.frame.web.controller.carrier; 
import org.apache.commons.lang3.StringUtils; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController; 
import com.glacier.frame.dto.query.carrier.CarrierMemberCreditwortinessQueryDTO;
import com.glacier.frame.service.carrier.CarrierMemberCreditwortinessService;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName:  CarrierMemberCreditwortinessController
 * @Description: TODO(会员信誉记录控制器)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-10-14  下午2:42:42
 */
@Controller
@RequestMapping(value = "/memberCreditwortiness")
public class CarrierMemberCreditwortinessController extends AbstractController{
	  @Autowired
	    private CarrierMemberCreditwortinessService creditwortinessService;// 注入会员积分记录业务Bean
	    
	    // 进入会员信誉度列表展示页面
	    @RequestMapping(value = "/index.htm")
	    private Object intoIndexPintegral() {
	        ModelAndView mav = new ModelAndView("carrier_mgr/carrierMemberCreditwortiness_mgr/creditwortiness");
	        return mav;
	    }
	     
	    // 进入会员信誉记录Detail信息页面
	    @RequestMapping(value = "/intoDetail.htm")
	    private Object intoIntegralDetailPage(String carrierMemberCreditworthinessId) {
	        ModelAndView mav = new ModelAndView("carrier_mgr/carrierMemberCreditwortiness_mgr/creditwortiness_detail");
	        if(StringUtils.isNotBlank(carrierMemberCreditworthinessId)){
	            mav.addObject("creditwortinessData", creditwortinessService.getMemberCreditworthiness(carrierMemberCreditworthinessId));
	        } 
	        return mav;
	    }
	    
	    // 获取表格结构的所有会员信誉记录数据
	    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
	    @ResponseBody
	    private Object listIntegralAsGridByMenuId(CarrierMemberCreditwortinessQueryDTO  carrierMemberCreditwortinessQueryDTO, JqPager pintegralr) {
	        return creditwortinessService.listAsGrid(pintegralr, carrierMemberCreditwortinessQueryDTO);
	    }
}

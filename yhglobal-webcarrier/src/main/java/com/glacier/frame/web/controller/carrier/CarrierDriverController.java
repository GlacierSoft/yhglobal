/**
 * @Title: CarrierDriverController.java 
 * @Package com.glacier.frame.web.controller.carrier 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2014-10-28 上午10:42:50 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-10-28
				修改人：song.jundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：song.jundong 
 * 
 */
package com.glacier.frame.web.controller.carrier;

import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
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
import com.glacier.frame.dto.query.carrier.CarrierDriverQueryDTO; 
import com.glacier.frame.entity.carrier.CarrierDriver;
import com.glacier.frame.entity.carrier.CarrierMember;  
import com.glacier.frame.service.carrier.CarrierDriverService; 
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName:  CarrierDriverController
 * @Description: TODO(驾驶员controller)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-10-28  上午10:42:50
 */
@Controller
@RequestMapping(value = "/carrierDriver")
public class CarrierDriverController extends AbstractController{
	
	@Autowired
	private CarrierDriverService carrierDriverService; 

	// 进入承运商驾驶员展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("carrier_mgr/carrierDriver_mgr/carrierDriver");
        return mav;
    } 
      
    // 查询显示所有驾驶员信息
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager,CarrierDriverQueryDTO carrierDriverQueryDTO,String q) {
    	Subject pricipalSubject = SecurityUtils.getSubject(); 
        CarrierMember pricipalUser = (CarrierMember) pricipalSubject.getPrincipal();
    	carrierDriverQueryDTO.setCarrierMemberId(pricipalUser.getCarrierMemberId());
    	return carrierDriverService.listAsGrid(jqPager, carrierDriverQueryDTO, q);
    } 
    
    // 进入驾驶员Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoDriverDetailPage(String driverId) { 
    	ModelAndView mav = new ModelAndView("carrier_mgr/carrierDriver_mgr/carrierDriver_detail");
    	 if(StringUtils.isNotBlank(driverId)){ 
	        mav.addObject("carrierDriverData",carrierDriverService.getDriver(driverId)); 
    	}
	     return mav;
    }
       
    // 驾驶员add表单页面 
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String driverId) {
        ModelAndView mav = new ModelAndView("carrier_mgr/carrierDriver_mgr/carrierDriver_form");
        if(StringUtils.isNotBlank(driverId)){
            mav.addObject("carrierDriverData", carrierDriverService.getDriver(driverId));
        }
        return mav;
    }
    
      
    //新增班线
    @RequestMapping(value = "/addDriver.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addRoute(@Valid CarrierDriver carrierDriver, BindingResult bindingResult) { 
    	 if (bindingResult.hasErrors()) {// 后台校验的错误信息
             return returnErrorBindingResult(bindingResult);
         }  
    	 return carrierDriverService.addDriver(carrierDriver);
    }
 
}

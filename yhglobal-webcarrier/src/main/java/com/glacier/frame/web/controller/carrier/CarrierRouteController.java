/**
 * @Title: CarrierRouteController.java 
 * @Package com.glacier.frame.web.controller.carrier 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2014-10-16 上午11:09:45 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-10-16
				修改人：song.jundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：song.jundong 
 * 
 */
package com.glacier.frame.web.controller.carrier; 
import java.util.List;

import javax.validation.Valid; 
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody; 
import org.springframework.web.servlet.ModelAndView; 
import com.glacier.core.controller.AbstractController; 
import com.glacier.frame.dto.query.carrier.CarrierRouteQueryDTO;  
import com.glacier.frame.entity.carrier.CarrierMember;
import com.glacier.frame.entity.carrier.CarrierRoute;
import com.glacier.frame.service.carrier.CarrierRouterService;
import com.glacier.jqueryui.util.JqPager; 

/**
 * @ClassName:  CarrierRouteController
 * @Description: TODO(班线Controller)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-10-16  上午11:09:45
 */

@Controller
@RequestMapping(value = "/carrierRoute")
public class CarrierRouteController extends AbstractController {
	
	@Autowired
	private CarrierRouterService carrierRouterService; 

	// 进入承运商班线展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("carrier_mgr/carrierRoute_mgr/carrierRoute");
        return mav;
    } 
      
    // 查询显示所有班线信息
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager,CarrierRouteQueryDTO routeQueryDTO) {
    	Subject pricipalSubject = SecurityUtils.getSubject(); 
        CarrierMember pricipalUser = (CarrierMember) pricipalSubject.getPrincipal();
        routeQueryDTO.setCarrierDisplay(pricipalUser.getMemberName());
     	return carrierRouterService.listAsGrid(jqPager,routeQueryDTO);
    }
       
    // 进入班线Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoRouteDetailPage(String routerId) { 
    	ModelAndView mav = new ModelAndView("carrier_mgr/carrierRoute_mgr/carrierRoute_detail");
    	 if(StringUtils.isNotBlank(routerId)){ 
	        mav.addObject("carrierRouteData",carrierRouterService.getRoute(routerId)); 
    	}
	     return mav;
    }
       
    // 班线add表单页面
    @RequestMapping(value = "/addForm.htm")
    private Object intoAddRoute() {
        ModelAndView mav = new ModelAndView("carrier_mgr/carrierRoute_mgr/carrierAddRoute_form");
        Subject pricipalSubject = SecurityUtils.getSubject();
	    CarrierMember pricipalUser = (CarrierMember) pricipalSubject.getPrincipal();
        mav.addObject("routeNub", carrierRouterService.GenerationRouteNumber());   
        mav.addObject("carrierMember", pricipalUser.getMemberName());   
        return mav;
    }
      
    //新增班线
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addRoute(@Valid CarrierRoute carrierRoute, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }  
         return carrierRouterService.addRoute(carrierRoute);
    } 
    
    //查询收货发货区域
    @RequestMapping(value = "/area.json", method = RequestMethod.POST)
    @ResponseBody
    private Object selectArea(String routeid) {  
         return carrierRouterService.selectArea(routeid);
      }
     
    // 进入班线Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoRouteFormPnews(String routerId) {
        ModelAndView mav = new ModelAndView("carrier_mgr/carrierRoute_mgr/carrierRoute_form");
        if(StringUtils.isNotBlank(routerId)){  
            mav.addObject("carrierRouteData", carrierRouterService.getRoute(routerId));
        } 
        return mav;
    } 
    
    //修改班线
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editRoute(@Valid CarrierRoute carrierRoute, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return carrierRouterService.editRoute(carrierRoute);
    }
    
    //批量删除班线
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> carrierRouteIds,@RequestParam List<String> carrierRouteNames) {
    	return carrierRouterService.delRoute(carrierRouteIds, carrierRouteNames);
    }
}

/**
 * @Title: RouteController.java 
 * @Package com.glacier.frame.web.controller.route 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2014-11-5 上午10:16:13 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-11-5
				修改人：song.jundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：song.jundong 
 * 
 */
package com.glacier.frame.web.controller.carrier;

import javax.servlet.http.HttpServletRequest; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView; 
import com.glacier.core.controller.AbstractController; 
import com.glacier.frame.dto.query.carrier.CarrierRouteQueryDTO; 
import com.glacier.frame.service.carrier.CarrierRouterService; 
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName:  RouteController
 * @Description: TODO(班线查询控制器)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-11-5  上午10:16:13
 */
@Controller
@RequestMapping(value = "/route")
public class RouteController extends AbstractController{
	
	    @Autowired
	    private CarrierRouterService carrierRouterService; 
	    
	    @Autowired  
	    private  HttpServletRequest request;  
	    
	    //转到“班线信息显示”页面
	  	@RequestMapping(value = "/route.htm")
	  	public Object routeList(JqPager pager, @RequestParam int p,String routeType,CarrierRouteQueryDTO routeQueryDTO){ 
	  		ModelAndView mav = new ModelAndView("route_mgr/route");
	  		mav.addObject("routerDatas", carrierRouterService.listAsWebsite(pager,p,routeType,routeQueryDTO));
	  		request.setAttribute("type", routeType); 
	  		return mav;
	  	}
	  	
	  	//班线条件查询
	  	@RequestMapping(value="/selectRoute.htm")
	  	public Object selectRoute(JqPager pager,CarrierRouteQueryDTO carrierRouteQueryDTO,@RequestParam int p){ 
	  		String routeType=request.getParameter("routeType");  
	  		ModelAndView mav = new ModelAndView("route_mgr/route");
	  		mav.addObject("routerDatas", carrierRouterService.listAsWebsite(pager, p,routeType,carrierRouteQueryDTO));
	  		request.setAttribute("type", routeType); 
	  		return mav; 
	  	}
	  	
	    //转到班线详细页面
	  	@RequestMapping(value = "/routeDetail.htm")
	  	public Object routeDetail(String routerId,String type){
	  		ModelAndView mav = new ModelAndView("route_mgr/routeDetail");
	  		mav.addObject("routerData", carrierRouterService.getRoute(routerId));
	  		request.setAttribute("type", type); 
	  		return mav;
	  	}
	  	
	  	//转到班线线路图页面
	  	@RequestMapping(value="/routeMap.htm")
	  	public Object routeMap(String routeId){
	  		ModelAndView mav = new ModelAndView("route_mgr/routeMap");
	  		mav.addObject("routerMap", carrierRouterService.getRouteMap(routeId));
	  		return mav;
	  	}
	  	 
}

/**
 * @Title: StorehouseBelaidupController.java 
 * @Package com.glacier.frame.web.controller.carrier 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2014-11-10 下午5:33:16 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-11-10
				修改人：song.jundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：song.jundong 
 * 
 */
package com.glacier.frame.web.controller.carrier;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController; 
import com.glacier.frame.service.carrier.CarrierRouterService;
import com.glacier.frame.service.storehouse.StorehousePackagetypeSetService; 
/**
 * @ClassName:  StorehouseBelaidupController
 * @Description: TODO(班线进入发货页面控制器)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-11-10  下午5:33:16
 */
@Controller
@RequestMapping(value = "/delivery")
public class StorehouseBelaidupController extends AbstractController{
   
	@Autowired  
	private CarrierRouterService routeService;
	
	@Autowired  
	private StorehousePackagetypeSetService storehousePackagetypeSetService;
	
	//进入发货页面 
	@RequestMapping(value = "/delivery.htm")
	public Object  bekaudup(String routeId){ 
		ModelAndView mav = new ModelAndView("route_mgr/delivery");
		mav.addObject("router", routeService.getRoute(routeId)); 
		mav.addObject("storehousePackagetype",storehousePackagetypeSetService.selectAll());
	     
		return mav;
	}
}

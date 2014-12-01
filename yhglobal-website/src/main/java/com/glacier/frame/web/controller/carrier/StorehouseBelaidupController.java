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
  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController; 
import com.glacier.frame.dto.query.storehouse.StorehouseBelaidupQueryDTO;
import com.glacier.frame.dto.query.storehouse.StorehouseGoodstypeSetQueryDTO;
import com.glacier.frame.entity.storehouse.StorehouseGoodstypeSet;
import com.glacier.frame.service.carrier.CarrierDeliverGoodsAreaService;
import com.glacier.frame.service.carrier.CarrierPickUpGoodsAreaService;
import com.glacier.frame.service.carrier.CarrierRouterService;
import com.glacier.frame.service.storehouse.StorehouseBelaidupService;
import com.glacier.frame.service.storehouse.StorehouseGoodstypeSetService; 
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
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
	private StorehouseGoodstypeSetService StorehouseGoodstypeSetService;
	
	@Autowired
	private CarrierDeliverGoodsAreaService deliverGoodsAreaService;
	
	@Autowired
	private CarrierPickUpGoodsAreaService pickUpGoodosAreaService;
	
	@Autowired
	private StorehouseBelaidupService  storehouseBelaidupService;
	 
	//进入发货页面 
	@RequestMapping(value = "/delivery.htm")
	public Object  bekaudup(String routeId,JqPager pager,StorehouseGoodstypeSetQueryDTO storehouseGoodstypeSetQueryDTO){ 
		ModelAndView mav = new ModelAndView("route_mgr/delivery");
		mav.addObject("router", routeService.getRoute(routeId)); 
		JqGridReturn returnResult=(JqGridReturn) StorehouseGoodstypeSetService.listAsGrid(pager,storehouseGoodstypeSetQueryDTO);
     	@SuppressWarnings("unchecked")
        List<StorehouseGoodstypeSet> StorehouseGoodstypeSetList=(List<StorehouseGoodstypeSet>) returnResult.getRows();
     	mav.addObject("storehousePackagetype",StorehouseGoodstypeSetList);
	    return mav;
	} 
	
	//进入地图区域显示页面 
	@RequestMapping(value = "/address.htm")
	public Object  address(String type,String id){  
		ModelAndView mav = new ModelAndView("route_mgr/address");
		if(type.equals("deliver")){
			mav.addObject("goodsArea", deliverGoodsAreaService.selectOne(id));
		}else{
			mav.addObject("goodsArea", pickUpGoodosAreaService.selectOne(id));
		} 
		return mav;
	}
	
	//进入订单提交成功的页面
	@RequestMapping(value="/referDelivery.htm")
	public Object referDelivery(String routeId){
		ModelAndView mav = new ModelAndView("route_mgr/referDelivery");
		mav.addObject("router", routeService.getRoute(routeId)); 
		mav.addObject("referDelivery", storehouseBelaidupService.selectTop());
		return mav;
	}
	
	//找货
	@RequestMapping(value="/findGoods.htm")
	private Object intoDeliveryPage(int  p,JqPager jqPager,StorehouseBelaidupQueryDTO storehouseBelaidupQueryDTO) {
		ModelAndView mav = new ModelAndView("/findGoods/findGoods");
		mav.addObject("belaidupList", storehouseBelaidupService.listAsGridWeb(p,jqPager, storehouseBelaidupQueryDTO));
		return mav;
	}
	
	//找货详情
	@RequestMapping(value="/findGoodsDeailt.htm")
	private Object findGoodsDeailt(String belaidupId) {
		ModelAndView mav = new ModelAndView("/findGoods/findGoodsDeailt");
		mav.addObject("belaidup", storehouseBelaidupService.getBelaidup(belaidupId));
		return mav;
	}
}

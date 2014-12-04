/**
 * @Title: DeliveryController.java 
 * @Package com.glacier.frame.web.controller.common 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-11-11 上午11:31:20 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-11-11
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.web.controller.deliveryGoods;

import java.util.List; 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
import com.glacier.frame.dto.query.carrier.CarrierRouteQueryDTO;
import com.glacier.frame.dto.query.storehouse.StorehouseGoodstypeSetQueryDTO;
import com.glacier.frame.entity.member.ShipperMember;
import com.glacier.frame.entity.storehouse.StorehouseAddedService;
import com.glacier.frame.entity.storehouse.StorehouseBelaidup;
import com.glacier.frame.entity.storehouse.StorehouseGoodstypeSet;
import com.glacier.frame.service.carrier.CarrierRouterService;
import com.glacier.frame.service.storehouse.StorehouseBelaidupService;
import com.glacier.frame.service.storehouse.StorehouseGoodstypeSetService;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName: DeliveryController 
 * @Description: TODO(我要发货模块控制层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-11-11 上午11:31:20
 */

@Controller
@RequestMapping(value="delivery")
public class DeliveryController { 
	
	@Autowired  
	private CarrierRouterService routeService;
	
	@Autowired
	private StorehouseGoodstypeSetService StorehouseGoodstypeSetService;
	
	@Autowired
    private CarrierRouterService carrierRouterService; 
	
	@Autowired  
	private  HttpServletRequest request; 

	@Autowired
	private StorehouseBelaidupService belaidupService;

	// 我要发货展示页
	@RequestMapping(value = "index.htm")
	private Object intoDeliveryPage(JqPager pager,StorehouseGoodstypeSetQueryDTO storehouseGoodstypeSetQueryDTO) {
		ModelAndView mav = new ModelAndView("deliveryGoods/deliveryGoods");
		storehouseGoodstypeSetQueryDTO.setStatus("enable");
		JqGridReturn returnResult = (JqGridReturn) StorehouseGoodstypeSetService.listAsGrid(pager, storehouseGoodstypeSetQueryDTO);
		@SuppressWarnings("unchecked")
		List<StorehouseGoodstypeSet> StorehouseGoodstypeSetList = (List<StorehouseGoodstypeSet>) returnResult.getRows();
		mav.addObject("StorehouseGoodstypeSetList", StorehouseGoodstypeSetList);
		return mav;
	}

	//班线发货
	@RequestMapping(value = "/addBelaidup.json", method = RequestMethod.POST)
	@ResponseBody
	private Object addBelaidup(@Valid StorehouseBelaidup belaidup,@Valid StorehouseAddedService storehouseAddedService,BindingResult bindingResult, String type) {
		return belaidupService.addBelaidup_website(belaidup,storehouseAddedService, type);
	}

	// 货源信息撤销发布操作
	@RequestMapping(value = "/updateBelaidup.json", method = RequestMethod.POST)
	@ResponseBody
	private Object updateBelaidup(@Valid StorehouseBelaidup belaidup,BindingResult bindingResult) {
		return belaidupService.updateBelaidup(belaidup);
	}

	// 货源信息详细展示页
	@RequestMapping(value = "/intoDetail.htm")
	private Object intoMemberGradeDetailPage(String belaidupId) {
		ModelAndView mav = new ModelAndView("member_mgr/memberReleaseManagerDetail");
		if (StringUtils.isNotBlank(belaidupId)) {
			mav.addObject("belaidupDate",
			belaidupService.getBelaidup(belaidupId));
		}
		return mav; 
	}
	
    // 发布货源信息,我要发货添加，先存储数据，选择班线后再一并提交到数据库
	@RequestMapping(value = "/belaidup.json", method = RequestMethod.POST)
	@ResponseBody
	private Object belaidup(@Valid StorehouseBelaidup belaidup,HttpSession httpSession) {
	    Subject pricipalSubject = SecurityUtils.getSubject();
        ShipperMember pricipalUser = (ShipperMember) pricipalSubject.getPrincipal(); 
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        if( pricipalUser==null){
        	returnResult.setMsg("请先登录，再操作！");
        	return returnResult;
        } else{
        	returnResult.setSuccess(true);
        	//暂时存在session
        	httpSession.setAttribute("belaidup", belaidup); 
        }
		return returnResult;
	}  
	 
	//转到“班线信息显示”页面
  	@RequestMapping(value = "/routeInfo.htm")
  	public Object routeList(JqPager pager, @RequestParam int p,CarrierRouteQueryDTO routeQueryDTO,HttpSession httpSession){ 
  		ModelAndView mav = new ModelAndView("deliveryGoods/routeInfo"); 
  		StorehouseBelaidup belaidup=(StorehouseBelaidup) httpSession.getAttribute("belaidup");
  		routeQueryDTO.setRouteOrigin(belaidup.getBelaidupInitiatin());
  		routeQueryDTO.setRouteStop(belaidup.getBelaidupTerminu());
  		mav.addObject("routerDatas", carrierRouterService.listAsWebsite(pager,p,"",routeQueryDTO));
  		return mav;
  	}  
  	
	//条件查询（轻重货价格等）
  	@RequestMapping(value = "/routeInfoList.htm")
  	public Object routeInfoList(JqPager pager, @RequestParam int p,String txt,String str,String sta,CarrierRouteQueryDTO routeQueryDTO,HttpSession httpSession){ 
  		ModelAndView mav = new ModelAndView("deliveryGoods/routeInfo"); 
  		StorehouseBelaidup belaidup=(StorehouseBelaidup) httpSession.getAttribute("belaidup");
  		routeQueryDTO.setRouteOrigin(belaidup.getBelaidupInitiatin());
  		routeQueryDTO.setRouteStop(belaidup.getBelaidupTerminu());
  		mav.addObject("routerDatas", carrierRouterService.listWebsite(pager,p,str,sta,routeQueryDTO));
  		mav.addObject("txt", txt);
  		return mav;
  	} 
  	 
    // 查询单条班线信息
 	@RequestMapping(value = "/getRoute.json", method = RequestMethod.POST)
 	@ResponseBody
 	private Object getRoute(String routeId) { 
	    JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
	    returnResult.setSuccess(true);
	    if (StringUtils.isNotBlank(routeId)) { 
		    returnResult.setObj(carrierRouterService.getRoute(routeId));
		}
	    return returnResult;
 	}
 	
	//运单提交转到运单提交成功页面
  	@RequestMapping(value = "/add.htm")
  	public Object add(@Valid StorehouseBelaidup storehouseBelaidup, @Valid StorehouseAddedService storehouseAddedService,String type,HttpSession httpSession){ 
  		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
  		ModelAndView mav =null;
  		//取出暂存的数据信息 
  		StorehouseBelaidup belaidup=(StorehouseBelaidup) httpSession.getAttribute("belaidup");
  		belaidup.setBelaidupWeight(storehouseBelaidup.getBelaidupWeight()); //重量
  		belaidup.setBelaidupBulk(storehouseBelaidup.getBelaidupBulk()); //体积
  		belaidup.setSendSite(storehouseBelaidup.getSendSite());//发货地
  		belaidup.setOrderSite(storehouseBelaidup.getOrderSite());//收货地
  		belaidup.setYesOrNo(storehouseAddedService.getUrgentDelivery()); //是否加急配送
  		belaidup.setRouterId(storehouseBelaidup.getRouterId());//班线id
  		returnResult= (JqReturnJson) belaidupService.addBelaidup_website(belaidup,storehouseAddedService, type);
  	 	if(returnResult.isSuccess()){
        	//进入下单成功的页面
        	mav= new ModelAndView("route_mgr/referDelivery"); 
    		mav.addObject("router", routeService.getRoute(storehouseBelaidup.getRouterId())); 
    		mav.addObject("referDelivery", belaidupService.selectTop()); 
    		//用来区分是先选的班线还是先写的订单信息，页面头部的流程图不一样
    		mav.addObject("sta", "sta");
    		//清空临时session
    		httpSession.removeAttribute("belaidup");
        }else{
        	//转发到发货页面
        	mav= new ModelAndView("deliveryGoods/deliveryGoods");
        } 
  		return mav;
  	}
 }

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



import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.frame.entity.storehouse.StorehouseTemplate;
import com.glacier.frame.service.basicdatas.ParameterCarrierCarTypeService;
import com.glacier.frame.service.storehouse.StorehouseBelaidupService;
import com.glacier.frame.service.storehouse.StorehouseGoodstypeSetService;
import com.glacier.frame.service.storehouse.StorehouseStorageTemplateService;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: DeliveryController 
 * @Description: TODO(发货模板模块控制层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-11-11 上午11:31:20
 */

@Controller
@RequestMapping(value="template")
public class StorehouseStorageTemplateController {

	@Autowired
	private StorehouseStorageTemplateService StorehouseStorageTemplateService;

	@Autowired
	private StorehouseBelaidupService belaidupService;
	
	@Autowired
	private StorehouseGoodstypeSetService goodstypeSetService;
	
	@Autowired
	private ParameterCarrierCarTypeService carrierCarTypeService;
	

	// 发货模板展示页
	@RequestMapping(value = "index.htm")
	private Object intoDeliveryPage(JqPager pager,int p) {
		ModelAndView mav = new ModelAndView("deliveryGoods/templateGoods");
		mav.addObject("templateList", StorehouseStorageTemplateService.listAsGrid(pager, p));
		return mav;
	}

	//点击发货模板添加，去到添加与修改共用页面
	@RequestMapping(value = "/addTemplateGoods.htm")
	@ResponseBody
	private Object intoTemplateGoods(String templateId) {
		ModelAndView mav = new ModelAndView("deliveryGoods/addTemplateGoods");
		mav.addObject("goodstypeList", goodstypeSetService.goodstypeList());
		mav.addObject("CarrierCarTypeList", carrierCarTypeService.CarrierCarTypeList());
		if (StringUtils.isNotBlank(templateId)) {
			mav.addObject("templateDate",StorehouseStorageTemplateService.getStorehouseTemplate(templateId));
		}
		return mav;
	}
	
	// 发货模板添加
	@RequestMapping(value = "/addTemplateGoods.json", method = RequestMethod.POST)
	@ResponseBody
	private Object addTemplateGoods(@Valid StorehouseTemplate template) {
		return StorehouseStorageTemplateService.addTemplate(template);
	}
	
	// 发货模板修改
	@RequestMapping(value = "/editTemplateGoods.json", method = RequestMethod.POST)
	@ResponseBody
	private Object editTemplateGoods(@Valid StorehouseTemplate template) {
		return StorehouseStorageTemplateService.editTemplate(template);
	}
	
	// 详情
	@RequestMapping(value = "/templateGoodsDealit.htm")
	@ResponseBody
	private Object templateGoodsDealit(String templateId) {
		ModelAndView mav = new ModelAndView("deliveryGoods/templateGoods_dealit");
		mav.addObject("goodstypeList", goodstypeSetService.goodstypeList());
		mav.addObject("CarrierCarTypeList", carrierCarTypeService.CarrierCarTypeList());
		if (StringUtils.isNotBlank(templateId)) {
			mav.addObject("templateDate",StorehouseStorageTemplateService.getStorehouseTemplate(templateId));
		}
		return mav;
	}
	
	// 删除
	@RequestMapping(value = "/delTemplateGoods.json")
	@ResponseBody
	private Object delTemplateGoods(String templateId) {
		return StorehouseStorageTemplateService.delTemplate(templateId);
	}
}
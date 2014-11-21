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



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.glacier.frame.service.storehouse.StorehouseBelaidupService;
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

	// 发货模板展示页
	@RequestMapping(value = "index.htm")
	private Object intoDeliveryPage(JqPager pager,int p) {
		ModelAndView mav = new ModelAndView("deliveryGoods/templateGoods");
		mav.addObject("templateList", StorehouseStorageTemplateService.listAsGrid(pager, p));
		return mav;
	}

	/*// 发布货源信息,发货模板添加
	@RequestMapping(value = "/addBelaidup.json", method = RequestMethod.POST)
	@ResponseBody
	private Object addBelaidup(@Valid StorehouseBelaidup belaidup,BindingResult bindingResult, String packageId) {
		return belaidupService.addBelaidup_website(belaidup, packageId);
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
	}*/
}

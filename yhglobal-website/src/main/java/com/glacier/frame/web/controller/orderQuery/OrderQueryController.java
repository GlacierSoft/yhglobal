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
package com.glacier.frame.web.controller.orderQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.glacier.core.controller.AbstractController;
import com.glacier.frame.service.storehouse.StorehouseBelaidupService;

/**
 * @ClassName: DeliveryController 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-11-11 上午11:31:20
 */

@Controller
@RequestMapping(value="orderQuery")
public class OrderQueryController extends AbstractController{

	@Autowired
	private StorehouseBelaidupService belaidupService;
	
	//未登陆查询订单
	@RequestMapping(value="/notLgoinQuery.htm")
	@ResponseBody
	private Object intoDeliveryPage(String codeNumber) {
		return belaidupService.notLogin(codeNumber);
	}
	
	//根据条形码查询出货物信息
	@RequestMapping(value="/getBelaidup.htm")
	@ResponseBody
	private Object getBelaidupStauts(String codeNumber) {
		return belaidupService.getCodeBelaidup(codeNumber);
	}
}

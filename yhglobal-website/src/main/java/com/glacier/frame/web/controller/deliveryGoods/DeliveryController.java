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

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: DeliveryController 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-11-11 上午11:31:20
 */

@Controller
@RequestMapping(value="delivery")
public class DeliveryController {

      @RequestMapping(value="index.htm")
      private Object intoDeliveryPage(JqPager pager) {
          ModelAndView mav = new ModelAndView("deliveryGoods/deliveryGoods");
          // 进入首页初始化导航信息
          return mav;
      }
	
	
	
	
	
}

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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.frame.dto.query.storehouse.StorehouseGoodstypeSetQueryDTO;
import com.glacier.frame.entity.storehouse.StorehouseGoodstypeSet;
import com.glacier.frame.service.storehouse.StorehouseGoodstypeSetService;
import com.glacier.jqueryui.util.JqGridReturn;
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

	   @Autowired
	   private StorehouseGoodstypeSetService StorehouseGoodstypeSetService;
	
	   @RequestMapping(value="index.htm")
      private Object intoDeliveryPage(JqPager pager,StorehouseGoodstypeSetQueryDTO storehouseGoodstypeSetQueryDTO) {
          ModelAndView mav = new ModelAndView("deliveryGoods/deliveryGoods");
          storehouseGoodstypeSetQueryDTO.setStatus("enable");
      	  JqGridReturn returnResult=(JqGridReturn) StorehouseGoodstypeSetService.listAsGrid(pager,storehouseGoodstypeSetQueryDTO);
      	  @SuppressWarnings("unchecked")
          List<StorehouseGoodstypeSet> StorehouseGoodstypeSetList=(List<StorehouseGoodstypeSet>) returnResult.getRows();
      	  mav.addObject("StorehouseGoodstypeSetList",StorehouseGoodstypeSetList);
          return mav;
      }
	
	
	
	
	
}

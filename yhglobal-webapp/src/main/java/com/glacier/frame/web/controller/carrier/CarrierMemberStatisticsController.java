package com.glacier.frame.web.controller.carrier;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.glacier.frame.service.carrier.CarrierMemberStatisticsService;

/*** 
 * @ClassName:  CarrierMemberStatisticsController
 * @Description: TODO(承运商统计信息控制层)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-12-17  下午2:09:10
 */
@Controller
@RequestMapping(value="/carrierMemberStatistics")
public class CarrierMemberStatisticsController {
    
	@Autowired
	private CarrierMemberStatisticsService CarrierMemberStatisticsService;
	
	//进入承运商信息列表页
	@RequestMapping(value="index.htm")
	private Object intoIndexPmember() {
      ModelAndView mav = new ModelAndView("carrier_mgr/statistics_mgr/statistics");
      return mav;
    }
	
	//获取表格结构的所有承运商统计数据
   	@RequestMapping(value = "/list.json", method = RequestMethod.POST)
   	@ResponseBody
   	private Object listActionAsGridByMenuId(String memberName) {
   	    return CarrierMemberStatisticsService.listAsGrid(memberName);
   	}
  	
    //获取承运商统计数据详情页
 	@RequestMapping(value = "/intoDetail.htm")
 	private Object intoStatisticsDetailPage(String memberId) {
	    ModelAndView mav = new ModelAndView("carrier_mgr/statistics_mgr/statistics_detail");
	    if(StringUtils.isNotBlank(memberId)){
	          mav.addObject("carrierMemberStatisticsData", CarrierMemberStatisticsService.getStatistics(memberId));
	    }
	    return mav;
 	 }
 	
 	
	
}

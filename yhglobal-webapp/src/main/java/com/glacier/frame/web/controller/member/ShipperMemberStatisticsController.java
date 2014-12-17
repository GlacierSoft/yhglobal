package com.glacier.frame.web.controller.member;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.glacier.frame.service.member.ShipperMemberStatisticsService;
import com.glacier.jqueryui.util.JqPager;

/*** 
 * @ClassName:  ShipperMemberStatisticsController
 * @Description: TODO(会员统计信息控制层)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-12-17  下午2:09:10
 */
@Controller
@RequestMapping(value="/memberStatistics")
public class ShipperMemberStatisticsController {
    
	@Autowired
	private ShipperMemberStatisticsService shipperMemberStatisticsService;
	
	//进入货主会员卡信息列表页
	@RequestMapping(value="index.htm")
	private Object intoIndexPmember() {
      ModelAndView mav = new ModelAndView("member_mgr/statistics_mgr/statistics");
      return mav;
    }
	
	//获取表格结构的所有会员统计数据
   	@RequestMapping(value = "/list.json", method = RequestMethod.POST)
   	@ResponseBody
   	private Object listActionAsGridByMenuId(JqPager jqPager, String memberName) {
   		System.out.println("++++++++++++++++++++:"+memberName);
   	    return shipperMemberStatisticsService.listAsGrid(jqPager,memberName);
   	}
  	
    //获取会员统计数据详情页
 	@RequestMapping(value = "/intoDetail.htm")
 	private Object intoStatisticsDetailPage(String memberId) {
	    ModelAndView mav = new ModelAndView("member_mgr/statistics_mgr/statistics_detail");
	    if(StringUtils.isNotBlank(memberId)){
	          mav.addObject("shipperMemberStatisticsData", shipperMemberStatisticsService.getStatistics(memberId));
	    }
	    return mav;
 	 }
 	
 	
	
}

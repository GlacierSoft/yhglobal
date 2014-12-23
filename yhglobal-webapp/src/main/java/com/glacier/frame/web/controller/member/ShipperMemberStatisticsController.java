package com.glacier.frame.web.controller.member;

import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.frame.entity.member.ShipperMemberStatistics;
import com.glacier.frame.service.member.ShipperMemberStatisticsService;
import com.glacier.jqueryui.util.JqGridReturn;
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
   	private Object listActionAsGridByMenuId(JqPager jqPager, String memberName,HttpSession session) {
   		JqGridReturn returnResult=(JqGridReturn)shipperMemberStatisticsService.listAsGrid(jqPager,memberName);
   		if(returnResult!=null){
        	@SuppressWarnings("unchecked")
			List<ShipperMemberStatistics> MemberStatisticsDatalist=(List<ShipperMemberStatistics>)returnResult.getRows();
        	session.setAttribute("MemberStatisticsDatalist", MemberStatisticsDatalist);
       }
   		return returnResult;
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
 	
 	//投资统计查询信息导出
    @RequestMapping(value="/exp.json")
    private void expCheckStatistics(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException{
        @SuppressWarnings("unchecked")
		List<ShipperMemberStatistics> memberStatisticsDataList=( List<ShipperMemberStatistics>)session.getAttribute("MemberStatisticsDatalist");
        HSSFWorkbook wb=null;
        if(memberStatisticsDataList.size()>0&&memberStatisticsDataList!=null){ 
        	wb = shipperMemberStatisticsService.export(memberStatisticsDataList);
        }
        response.setContentType("application/vnd.ms-excel"); 
        SimpleDateFormat sf=new SimpleDateFormat("yyyyMMddHHmmss");//yyyy-MM-dd HH:mm:ss
        String str_one ="MemberStatistics_"+sf.format(new Date());//命名名称
        response.setHeader("Content-disposition", "attachment;filename="+str_one+".xls");    
        OutputStream ouputStream = response.getOutputStream();    
        wb.write(ouputStream);    
        ouputStream.flush();    
        ouputStream.close();  
    }
}

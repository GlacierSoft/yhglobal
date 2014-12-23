package com.glacier.frame.web.controller.carrier;

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

import com.glacier.frame.entity.carrier.CarrierMemberStatistics;
import com.glacier.frame.service.carrier.CarrierMemberStatisticsService;
import com.glacier.jqueryui.util.JqGridReturn;

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
   	private Object listActionAsGridByMenuId(String memberName,HttpSession session) {
   		JqGridReturn returnResult=(JqGridReturn)CarrierMemberStatisticsService.listAsGrid(memberName);
   		if(returnResult!=null){
        	@SuppressWarnings("unchecked")
			List<CarrierMemberStatistics> carrierStatisticsDatalist=(List<CarrierMemberStatistics>)returnResult.getRows();
        	session.setAttribute("carrierStatisticsDatalist", carrierStatisticsDatalist);
       }
   	    return returnResult;
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
 	
 	//投资统计查询信息导出
    @RequestMapping(value="/exp.json")
    private void expCheckStatistics(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException{
        @SuppressWarnings("unchecked")
		List<CarrierMemberStatistics> carrierStatisticsDatalist=( List<CarrierMemberStatistics>)session.getAttribute("carrierStatisticsDatalist");
        HSSFWorkbook wb=null;
        if(carrierStatisticsDatalist.size()>0&&carrierStatisticsDatalist!=null){ 
        	wb = CarrierMemberStatisticsService.export(carrierStatisticsDatalist);
        }
        response.setContentType("application/vnd.ms-excel"); 
        SimpleDateFormat sf=new SimpleDateFormat("yyyyMMddHHmmss");//yyyy-MM-dd HH:mm:ss
        String str_one ="CarrierStatistics_"+sf.format(new Date());//命名名称
        response.setHeader("Content-disposition", "attachment;filename="+str_one+".xls");    
        OutputStream ouputStream = response.getOutputStream();    
        wb.write(ouputStream);    
        ouputStream.flush();    
        ouputStream.close();  
    }
	
}

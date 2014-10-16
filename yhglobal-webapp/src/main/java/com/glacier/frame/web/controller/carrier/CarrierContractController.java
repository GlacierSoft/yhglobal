/**
 * @Title: CarrierContractController.java 
 * @Package com.glacier.frame.web.controller.carrier 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-10-11 上午9:58:30 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-10-11
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：郑俊杰
 * 
 */
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

import com.glacier.frame.dto.query.carrier.CarrierContractRecordQueryDTO;
import com.glacier.frame.entity.carrier.CarrierContractRecord;
import com.glacier.frame.service.carrier.CarrierContractRecordService;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: CarrierContractController 
 * @Description: TODO(承运商合同记录信息) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-10-11 上午9:58:30
 */
@Controller
@RequestMapping(value="/carrierContract")
public class CarrierContractController {
     
	@Autowired
	private CarrierContractRecordService carrierContractRecordService;
	
	//进入承运商合同记录展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPservice() {
        ModelAndView mav = new ModelAndView("carrier_mgr/carrierContract_mgr/carrierContract");
        return mav;
    }
    
    //获取表格结构的所有合同记录信息
   	@RequestMapping(value = "/list.json", method = RequestMethod.POST)
   	@ResponseBody
   	private Object listActionAsGridByMenuId(JqPager jqPager, CarrierContractRecordQueryDTO carrierContractRecordQueryDTO, String q,HttpSession session) {
   		JqGridReturn returnResult=(JqGridReturn)carrierContractRecordService.listAsGrid(jqPager, carrierContractRecordQueryDTO, q);
   	    if(returnResult!=null){
 	    	@SuppressWarnings("unchecked")
 	    	List<CarrierContractRecord> list=(List<CarrierContractRecord>) returnResult.getRows();
 	    	session.setAttribute("list", list);
 	    }	
   		return returnResult;
   	}
   	
    //承运商合同记录信息详情页
  	@RequestMapping(value = "/intoDetail.htm")
  	private Object intoContractManagerDetailPage(String contractRecordId) {
  	    ModelAndView mav = new ModelAndView("carrier_mgr/carrierContract_mgr/carrierContract_detail");
  	    if(StringUtils.isNotBlank(contractRecordId)){
  	          mav.addObject("carrierContractData", carrierContractRecordService.getCarrierContractPro(contractRecordId));
  	    }
  	    return mav;
  	}
  	
  	//承运商合同记录信息导出
  	@RequestMapping(value = "/exp.json")
  	private void expContractRecord(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException{
 	  	@SuppressWarnings("unchecked")
 	  	List<CarrierContractRecord> list=(List<CarrierContractRecord>)session.getAttribute("list");
 	  	HSSFWorkbook wb=null;
 	  	wb = carrierContractRecordService.export(list); 
 	  	response.setContentType("application/vnd.ms-excel");    
 	  	SimpleDateFormat sf=new SimpleDateFormat("yyyyMMddHHmmss");
 	  	String filename="CarrierContractRecord_"+sf.format(new Date());
 	  	response.setHeader("Content-disposition", "attachment;filename="+filename+".xls");    
 	  	OutputStream ouputStream = response.getOutputStream();    
 	  	wb.write(ouputStream);    
 	  	ouputStream.flush();    
 	  	ouputStream.close();   
   }
  	
  	 //承运商合同信息导出
	 @RequestMapping(value="print.htm")
	 private Object intoContractPrintPage(String contractRecordId,String str) {
		    ModelAndView mav = new ModelAndView("mcarrier_mgr/carrierContract_mgr/carrierContract_print");
		    mav.addObject("str",str);
		    if(StringUtils.isNotBlank(contractRecordId)){
		    	  CarrierContractRecord carrierContractRecord=(CarrierContractRecord) carrierContractRecordService.getCarrierContractPro(contractRecordId);
		          SimpleDateFormat sf=new SimpleDateFormat("yyyy年MM月dd日");
		          String open_time=sf.format(carrierContractRecord.getEnableTime());
		          String close_time=sf.format(carrierContractRecord.getDisableTime());
		          mav.addObject("open_time",open_time);
		          mav.addObject("close_time",close_time);
		    	  mav.addObject("carrierContractData", carrierContractRecord);
		    }
		    return mav;
		}
  	
  	
  	
}

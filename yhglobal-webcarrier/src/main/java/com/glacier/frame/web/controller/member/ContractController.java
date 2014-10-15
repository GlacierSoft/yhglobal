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

import com.glacier.frame.dto.query.member.ShipperMemberContractRecordQueryDTO;
import com.glacier.frame.entity.member.ShipperMemberContractRecord;
import com.glacier.frame.service.member.ContractService;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;


/*** 
 * @ClassName:  ContractController
 * @Description: TODO(合同记录控制层)
 * @author zhengjunjie
 * @email 1203807137@QQ.com
 * @date 2014-10-08  下午2:09:10
 */
@Controller
@RequestMapping(value="/contract")
public class ContractController {
	
	@Autowired
	private ContractService contractService;
	
    //进入合同记录展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPservice() {
        ModelAndView mav = new ModelAndView("member_mgr/contract_mgr/contract");
        return mav;
    }
    
    //获取表格结构的所有合同记录信息
   	@RequestMapping(value = "/list.json", method = RequestMethod.POST)
   	@ResponseBody
   	private Object listActionAsGridByMenuId(JqPager jqPager, ShipperMemberContractRecordQueryDTO contractRecordQueryDTO, String q,HttpSession session) {
   		JqGridReturn returnResult=(JqGridReturn)contractService.listAsGrid(jqPager, contractRecordQueryDTO, q);
   	    if(returnResult!=null){
   	    	@SuppressWarnings("unchecked")
   	    	List<ShipperMemberContractRecord> list=(List<ShipperMemberContractRecord>) returnResult.getRows();
   	    	session.setAttribute("list", list);
   	    }	
   		return returnResult;
   	}
   	
    //合同记录信息详情页
	@RequestMapping(value = "/intoDetail.htm")
	private Object intoContractManagerDetailPage(String contractRecordId) {
	    ModelAndView mav = new ModelAndView("member_mgr/contract_mgr/contract_detail");
	    if(StringUtils.isNotBlank(contractRecordId)){
	          mav.addObject("contractData", contractService.getContractPro(contractRecordId));
	    }
	    return mav;
	}
	
	 //合同记录信息导出
	 @RequestMapping(value = "/exp.json")
	 private void expContractRecord(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException{
   	  	@SuppressWarnings("unchecked")
   	  	List<ShipperMemberContractRecord> list=(List<ShipperMemberContractRecord>)session.getAttribute("list");
   	  	HSSFWorkbook wb=null;
   	  	wb = contractService.export(list); 
   	  	response.setContentType("application/vnd.ms-excel");    
   	  	SimpleDateFormat sf=new SimpleDateFormat("yyyyMMddHHmmss");
   	  	String filename="MemberContractRecord_"+sf.format(new Date());
   	  	response.setHeader("Content-disposition", "attachment;filename="+filename+".xls");    
   	  	OutputStream ouputStream = response.getOutputStream();    
   	  	wb.write(ouputStream);    
   	  	ouputStream.flush();    
   	  	ouputStream.close();   
	   }
	
}

/**
 * @Title: FinaceRechargeMemberController.java 
 * @Package com.glacier.frame.web.controller.finace 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-10-28 上午9:53:57 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-10-28
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.web.controller.finace;

import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.frame.dto.query.finace.FinaceRechargeMemberQueryDTO;
import com.glacier.frame.entity.finace.FinaceRechargeMember;
import com.glacier.frame.service.finace.FinaceRechargeMemberService;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: FinaceRechargeMemberController 
 * @Description: TODO(会员充值控制层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-10-28 上午9:53:57
 */


@Controller
@RequestMapping(value="finaceRechargeMemberController")
public class FinaceRechargeMemberController {
  
	  @Autowired
	  private FinaceRechargeMemberService finaceRechargeMemberService;
	  
	//进入承运商合同记录展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPservice() {
        ModelAndView mav = new ModelAndView("finace_mgr/finaceRechargeMember_mgr/finaceRechargeMember");
        return mav;
    }
	  
    
    //获取表格结构的所有合同记录信息
   	@RequestMapping(value = "/list.json", method = RequestMethod.POST)
   	@ResponseBody
   	private Object listActionAsGridByMenuId(JqPager jqPager, FinaceRechargeMemberQueryDTO finaceRechargeMemberQueryDTO, String q,HttpSession session) {
   		JqGridReturn returnResult=(JqGridReturn)finaceRechargeMemberService.listAsGrid(jqPager, finaceRechargeMemberQueryDTO, q);
   	    if(returnResult!=null){
 	    	@SuppressWarnings("unchecked")
 	    	List<FinaceRechargeMember> list=(List<FinaceRechargeMember>) returnResult.getRows();
 	    	session.setAttribute("list", list);
 	    }	
   		return returnResult;
   	}
   	
  //仓库货品损坏记录信息详情页
   	@RequestMapping(value = "/intoDetail.htm")
   	private Object intoFinaceRechargeMemberDetailPage(String rechargeId) {
   	    ModelAndView mav = new ModelAndView("finace_mgr/finaceRechargeMember_mgr/finaceRechargeMember_detail");
   	    if(StringUtils.isNotBlank(rechargeId)){
   	          mav.addObject("finaceRechargeMemberData", finaceRechargeMemberService.getFinaceRechargeMemberPro(rechargeId));
   	    }
   	    return mav;
   	}
   	
    //合同记录信息导出
  	 @RequestMapping(value = "/exp.json")
  	 private void expContractRecord(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException{
     	  	@SuppressWarnings("unchecked")
     	  	List<FinaceRechargeMember> list=(List<FinaceRechargeMember>)session.getAttribute("list");
     	  	HSSFWorkbook wb=null;
     	  	wb = finaceRechargeMemberService.export(list); 
     	  	response.setContentType("application/vnd.ms-excel");    
     	  	SimpleDateFormat sf=new SimpleDateFormat("yyyyMMddHHmmss");
     	  	String filename="RechargeRecord_"+sf.format(new Date());
     	  	response.setHeader("Content-disposition", "attachment;filename="+filename+".xls");    
     	  	OutputStream ouputStream = response.getOutputStream();    
     	  	wb.write(ouputStream);    
     	  	ouputStream.flush();    
     	  	ouputStream.close();   
  	   }
  	 
  	 // 进入承运商充值记录audit表单页面
     @RequestMapping(value = "/intoAudit.htm")
     private Object intoAuditRechargeCarrier(String rechargeId) {
         ModelAndView mav = new ModelAndView("finace_mgr/finaceRechargeMember_mgr/finaceRechargeMember_audit");
         if(StringUtils.isNotBlank(rechargeId)){
         	mav.addObject("finaceRechargeMemberData", finaceRechargeMemberService.getFinaceRechargeMemberPro(rechargeId));
         }
         return mav;
     }
     
     // 审核充值记录
     @RequestMapping(value = "/audit.json", method = RequestMethod.POST)
     @ResponseBody
     private Object auditRecharge(@Valid FinaceRechargeMember finaceRechargeMember, BindingResult bindingResult) {
         return finaceRechargeMemberService.auditRechargeMember(finaceRechargeMember);
     }
   	
}

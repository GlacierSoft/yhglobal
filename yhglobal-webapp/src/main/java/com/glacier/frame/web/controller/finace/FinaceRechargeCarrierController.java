package com.glacier.frame.web.controller.finace;
 
import javax.validation.Valid;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; 
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.frame.dto.query.finace.FinaceRechargeCarrierQueryDTO;
import com.glacier.frame.entity.finace.FinaceRechargeCarrier;
import com.glacier.frame.service.finace.FinaceRechargeCarrierService;

/*** 
 * @ClassName:  FinaceRechargeCarrierController
 * @Description: TODO(承运商充值记录controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-09
 */
@Controller
@RequestMapping(value = "/finaceRechargeCarrier")
public class FinaceRechargeCarrierController extends AbstractController{

	@Autowired
	private FinaceRechargeCarrierService finaceRechargeCarrierService;
	
	// 进入承运商充值记录列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("finace_mgr/finaceRechargeCarrier_mgr/finaceRechargeCarrier");
        return mav;
    } 
     
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, FinaceRechargeCarrierQueryDTO memberGradeQueryDTO) {
        return finaceRechargeCarrierService.listAsGrid(jqPager, memberGradeQueryDTO);
    }
      
    // 进入承运商充值记录Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoRechargeCarrierDetailPage(String rechargeId) { 
    	ModelAndView mav = new ModelAndView("finace_mgr/finaceRechargeCarrier_mgr/finaceRechargeCarrier_detail");
        if(StringUtils.isNotBlank(rechargeId)){
            mav.addObject("rechargeCarrierData", finaceRechargeCarrierService.getRechargeCarrier(rechargeId));
        }
	    return mav;
    }
    
    // 进入承运商充值记录Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String rechargeId) {
        ModelAndView mav = new ModelAndView("finace_mgr/finaceRechargeCarrier_mgr/finaceRechargeCarrier_form");
        if(StringUtils.isNotBlank(rechargeId)){
            mav.addObject("rechargeCarrierData", finaceRechargeCarrierService.getRechargeCarrier(rechargeId));
        }
        return mav;
    }
    
    // 进入承运商充值记录audit表单页面
    @RequestMapping(value = "/intoAudit.htm")
    private Object intoAuditRechargeCarrier(String rechargeId) {
        ModelAndView mav = new ModelAndView("finace_mgr/finaceRechargeCarrier_mgr/finaceRechargeCarrier_audit");
        if(StringUtils.isNotBlank(rechargeId)){
        	mav.addObject("rechargeCarrierData", finaceRechargeCarrierService.getRechargeCarrier(rechargeId));
        }
        return mav;
    }
    
    // 增加承运商充值记录
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid FinaceRechargeCarrier carInformation, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return finaceRechargeCarrierService.addRechargeCarrier(carInformation);
    }
    
    // 审核充值记录
    @RequestMapping(value = "/audit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object auditRecharge(@Valid FinaceRechargeCarrier carInformation, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return finaceRechargeCarrierService.auditRechargeCarrier(carInformation);
    }
    
    //修改承运商充值记录
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid FinaceRechargeCarrier memberGrade, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return finaceRechargeCarrierService.editRechargeCarrier(memberGrade);
    }
    
}

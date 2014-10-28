package com.glacier.frame.web.controller.finace;
 
import java.util.List;
import javax.validation.Valid;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; 
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.frame.dto.query.finace.FinaceRechargeSetCarrierQueryDTO;
import com.glacier.frame.entity.finace.FinaceRechargeSetCarrier;
import com.glacier.frame.service.finace.FinaceRechargeSetCarrierService;

/*** 
 * @ClassName:  CarrierCarInfomationController
 * @Description: TODO(承运商充值类型controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-09
 */
@Controller
@RequestMapping(value = "/finaceRechargeSetCarrier")
public class FinaceRechargeSetCarrierController extends AbstractController{

	@Autowired
	private FinaceRechargeSetCarrierService finaceRechargeSetCarrierService;
	
	// 进入承运商充值类型列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("finace_mgr/finaceRechargeSetCarrier_mgr/finaceRechargeSetCarrier");
        return mav;
    } 
     
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, FinaceRechargeSetCarrierQueryDTO memberGradeQueryDTO) {
        return finaceRechargeSetCarrierService.listAsGrid(jqPager, memberGradeQueryDTO);
    }
      
    // 进入承运商充值类型Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoRechargeSetCarrierDetailPage(String rechargeSetId) { 
    	ModelAndView mav = new ModelAndView("finace_mgr/finaceRechargeSetCarrier_mgr/finaceRechargeSetCarrier_detail");
        if(StringUtils.isNotBlank(rechargeSetId)){
            mav.addObject("rechargeSetCarrierData", finaceRechargeSetCarrierService.getRechargeSetCarrier(rechargeSetId));
        }
	    return mav;
    }
    
    // 进入承运商充值类型Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String rechargeSetId) {
        ModelAndView mav = new ModelAndView("finace_mgr/finaceRechargeSetCarrier_mgr/finaceRechargeSetCarrier_form");
        if(StringUtils.isNotBlank(rechargeSetId)){
            mav.addObject("rechargeSetCarrierData", finaceRechargeSetCarrierService.getRechargeSetCarrier(rechargeSetId));
        }
        return mav;
    }
    
    // 进入承运商充值类型audit表单页面
    @RequestMapping(value = "/intoAudit.htm")
    private Object intoAuditRechargeSetCarrier(String rechargeSetId) {
        ModelAndView mav = new ModelAndView("finace_mgr/finaceRechargeSetCarrier_mgr/finaceRechargeSetCarrier_audit");
        if(StringUtils.isNotBlank(rechargeSetId)){
        	mav.addObject("rechargeSetCarrierData", finaceRechargeSetCarrierService.getRechargeSetCarrier(rechargeSetId));
        }
        return mav;
    }
    
    // 增加承运商充值类型
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid FinaceRechargeSetCarrier carInformation, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return finaceRechargeSetCarrierService.addRechargeSetCarrier(carInformation);
    }
    
    // 审核充值类型
    @RequestMapping(value = "/audit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object auditRechargeSet(@Valid FinaceRechargeSetCarrier carInformation, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return finaceRechargeSetCarrierService.auditRechargeSetCarrier(carInformation);
    }
    
    //修改承运商充值类型
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid FinaceRechargeSetCarrier memberGrade, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return finaceRechargeSetCarrierService.editRechargeSetCarrier(memberGrade);
    }
    
    //批量删除承运商充值类型
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> finaceRechargeSetCarrierIds,@RequestParam List<String> finaceRechargeSetCarrierNames) {
    	return finaceRechargeSetCarrierService.delRechargeSetCarrier(finaceRechargeSetCarrierIds, finaceRechargeSetCarrierNames);
    }
}

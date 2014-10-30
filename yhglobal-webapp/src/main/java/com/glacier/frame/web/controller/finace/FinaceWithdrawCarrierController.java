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
import com.glacier.frame.dto.query.finace.FinaceWithdrawCarrierQueryDTO;
import com.glacier.frame.entity.finace.FinaceWithdrawCarrier;
import com.glacier.frame.service.finace.FinaceWithdrawCarrierService;

/*** 
 * @ClassName:  FinaceWithdrawCarrierController
 * @Description: TODO(承运商提现记录controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-09
 */
@Controller
@RequestMapping(value = "/finaceWithdrawCarrier")
public class FinaceWithdrawCarrierController extends AbstractController{

	@Autowired
	private FinaceWithdrawCarrierService finaceWithdrawCarrierService;
	
	// 进入承运商提现记录列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("finace_mgr/finaceWithdrawCarrier_mgr/finaceWithdrawCarrier");
        return mav;
    } 
     
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, FinaceWithdrawCarrierQueryDTO memberGradeQueryDTO) {
        return finaceWithdrawCarrierService.listAsGrid(jqPager, memberGradeQueryDTO);
    }
      
    // 进入承运商提现记录Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoWithdrawCarrierDetailPage(String withdrawId) { 
    	ModelAndView mav = new ModelAndView("finace_mgr/finaceWithdrawCarrier_mgr/finaceWithdrawCarrier_detail");
        if(StringUtils.isNotBlank(withdrawId)){
            mav.addObject("withdrawCarrierData", finaceWithdrawCarrierService.getWithdrawCarrier(withdrawId));
        }
	    return mav;
    }
    
    // 进入承运商提现记录Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String withdrawId) {
        ModelAndView mav = new ModelAndView("finace_mgr/finaceWithdrawCarrier_mgr/finaceWithdrawCarrier_form");
        if(StringUtils.isNotBlank(withdrawId)){
            mav.addObject("withdrawCarrierData", finaceWithdrawCarrierService.getWithdrawCarrier(withdrawId));
        }
        return mav;
    }
    
    // 进入承运商提现记录audit表单页面
    @RequestMapping(value = "/intoAudit.htm")
    private Object intoAuditWithdrawCarrier(String withdrawId) {
        ModelAndView mav = new ModelAndView("finace_mgr/finaceWithdrawCarrier_mgr/finaceWithdrawCarrier_audit");
        if(StringUtils.isNotBlank(withdrawId)){
        	mav.addObject("withdrawCarrierData", finaceWithdrawCarrierService.getWithdrawCarrier(withdrawId));
        }
        return mav;
    }
    
    // 增加承运商提现记录
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid FinaceWithdrawCarrier carInformation, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return finaceWithdrawCarrierService.addWithdrawCarrier(carInformation);
    }
    
    // 审核提现记录
    @RequestMapping(value = "/audit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object auditWithdraw(@Valid FinaceWithdrawCarrier carInformation, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return finaceWithdrawCarrierService.auditWithdrawCarrier(carInformation);
    }
    
    //修改承运商提现记录
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid FinaceWithdrawCarrier memberGrade, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return finaceWithdrawCarrierService.editWithdrawCarrier(memberGrade);
    }
    
}

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
import com.glacier.frame.dto.query.finace.FinaceWithdrawSetCarrierQueryDTO;
import com.glacier.frame.entity.finace.FinaceWithdrawSetCarrier;
import com.glacier.frame.service.finace.FinaceWithdrawSetCarrierService;

/*** 
 * @ClassName:  FinaceWithdrawSetCarrierController
 * @Description: TODO(承运商提现类型controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-09
 */
@Controller
@RequestMapping(value = "/finaceWithdrawSetCarrier")
public class FinaceWithdrawSetCarrierController extends AbstractController{

	@Autowired
	private FinaceWithdrawSetCarrierService finaceWithdrawSetCarrierService;
	
	// 进入承运商提现类型列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("finace_mgr/finaceWithdrawSetCarrier_mgr/finaceWithdrawSetCarrier");
        return mav;
    } 
     
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, FinaceWithdrawSetCarrierQueryDTO memberGradeQueryDTO) {
        return finaceWithdrawSetCarrierService.listAsGrid(jqPager, memberGradeQueryDTO);
    }
      
    // 进入承运商提现类型Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoWithdrawSetCarrierDetailPage(String withdrawSetId) { 
    	ModelAndView mav = new ModelAndView("finace_mgr/finaceWithdrawSetCarrier_mgr/finaceWithdrawSetCarrier_detail");
        if(StringUtils.isNotBlank(withdrawSetId)){
            mav.addObject("withdrawSetCarrierData", finaceWithdrawSetCarrierService.getWithdrawSetCarrier(withdrawSetId));
        }
	    return mav;
    }
    
    // 进入承运商提现类型Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String withdrawSetId) {
        ModelAndView mav = new ModelAndView("finace_mgr/finaceWithdrawSetCarrier_mgr/finaceWithdrawSetCarrier_form");
        if(StringUtils.isNotBlank(withdrawSetId)){
            mav.addObject("withdrawSetCarrierData", finaceWithdrawSetCarrierService.getWithdrawSetCarrier(withdrawSetId));
        }
        return mav;
    }
    
    // 进入承运商提现类型audit表单页面
    @RequestMapping(value = "/intoAudit.htm")
    private Object intoAuditWithdrawSetCarrier(String withdrawSetId) {
        ModelAndView mav = new ModelAndView("finace_mgr/finaceWithdrawSetCarrier_mgr/finaceWithdrawSetCarrier_audit");
        if(StringUtils.isNotBlank(withdrawSetId)){
        	mav.addObject("withdrawSetCarrierData", finaceWithdrawSetCarrierService.getWithdrawSetCarrier(withdrawSetId));
        }
        return mav;
    }
    
    // 增加承运商提现类型
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid FinaceWithdrawSetCarrier carInformation, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return finaceWithdrawSetCarrierService.addWithdrawSetCarrier(carInformation);
    }
    
    // 审核提现类型
    @RequestMapping(value = "/audit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object auditWithdrawSet(@Valid FinaceWithdrawSetCarrier carInformation, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return finaceWithdrawSetCarrierService.auditWithdrawSetCarrier(carInformation);
    }
    
    //修改承运商提现类型
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid FinaceWithdrawSetCarrier memberGrade, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return finaceWithdrawSetCarrierService.editWithdrawSetCarrier(memberGrade);
    }
    
    //批量删除承运商提现类型
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> finaceWithdrawSetCarrierIds,@RequestParam List<String> finaceWithdrawSetCarrierNames) {
    	return finaceWithdrawSetCarrierService.delWithdrawSetCarrier(finaceWithdrawSetCarrierIds, finaceWithdrawSetCarrierNames);
    }
}

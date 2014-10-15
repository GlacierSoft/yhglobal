package com.glacier.frame.web.controller.basicdatas;
 
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
import com.glacier.frame.dto.query.basicdatas.ParameterCarrierCreditworthinessTypeQueryDTO;
import com.glacier.frame.entity.basicdatas.ParameterCarrierCreditworthinessType;
import com.glacier.frame.service.basicdatas.ParameterCarrierCreditworthinessTypeService;

/*** 
 * @ClassName:  ParameterCarrierCreditworthinessTypeController
 * @Description: TODO(信誉度类型controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-09
 */
@Controller
@RequestMapping(value = "/creditworthinessType")
public class ParameterCarrierCreditworthinessTypeController extends AbstractController{

	@Autowired
	private ParameterCarrierCreditworthinessTypeService CreditworthinessType;
	
	// 进入信誉度类型信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/carrierCreditworthinessType_mgr/carrierCreditworthinessType");
        return mav;
    } 
     
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ParameterCarrierCreditworthinessTypeQueryDTO CreditworthinessTypeQueryDTO) {
        return CreditworthinessType.listAsGrid(jqPager, CreditworthinessTypeQueryDTO);
    }
      
    // 进入信誉度类型信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String creditworthinessTypeId) { 
    	ModelAndView mav = new ModelAndView("basicdatas_mgr/carrierCreditworthinessType_mgr/carrierCreditworthinessType_detail");
        if(StringUtils.isNotBlank(creditworthinessTypeId)){
            mav.addObject("creditworthinessTypeDate", CreditworthinessType.getCarrierCarType(creditworthinessTypeId));
        }
	    return mav;
    }
    
    // 进入信誉度类型信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String creditworthinessTypeId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/carrierCreditworthinessType_mgr/carrierCreditworthinessType_form");
        if(StringUtils.isNotBlank(creditworthinessTypeId)){
            mav.addObject("creditworthinessTypeDate", CreditworthinessType.getCarrierCarType(creditworthinessTypeId));
        }
        return mav;
    }
    
    // 增加信誉度类型信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid ParameterCarrierCreditworthinessType creditworthinessType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return CreditworthinessType.addCreditworthinessType(creditworthinessType);
    }
    
    //修改信誉度类型信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid ParameterCarrierCreditworthinessType creditworthinessType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return CreditworthinessType.editCreditworthinessType(creditworthinessType);
    }
    
    //批量删除信誉度类型信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> creditworthinessTypeIds,@RequestParam List<String> creditworthinessTypeNames) {
    	return CreditworthinessType.delCreditworthinessType(creditworthinessTypeIds, creditworthinessTypeNames);
    }
}

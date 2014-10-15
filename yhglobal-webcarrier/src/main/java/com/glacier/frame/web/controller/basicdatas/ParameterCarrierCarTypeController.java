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
import com.glacier.frame.dto.query.basicdatas.ParameterCarrierCarTypeQueryDTO;
import com.glacier.frame.entity.basicdatas.ParameterCarrierCarType;
import com.glacier.frame.service.basicdatas.ParameterCarrierCarTypeService;

/*** 
 * @ClassName:  ParameterCarrierCarTypeController
 * @Description: TODO(车辆类型controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-09
 */
@Controller
@RequestMapping(value = "/carrierCarType")
public class ParameterCarrierCarTypeController extends AbstractController{

	@Autowired
	private ParameterCarrierCarTypeService carrierCarTypeService;
	
	// 进入车辆类型信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/carrierCarType_mgr/carrierCarType");
        return mav;
    } 
     
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ParameterCarrierCarTypeQueryDTO carTypeQueryDTO) {
        return carrierCarTypeService.listAsGrid(jqPager, carTypeQueryDTO);
    }
      
    // 进入车辆类型信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String cartypeId) { 
    	ModelAndView mav = new ModelAndView("basicdatas_mgr/carrierCarType_mgr/carrierCarType_detail");
        if(StringUtils.isNotBlank(cartypeId)){
            mav.addObject("carTypeDate", carrierCarTypeService.getCarrierCarType(cartypeId));
        }
	    return mav;
    }
    
    // 进入车辆类型信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String carTypeId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/carrierCarType_mgr/carrierCarType_form");
        if(StringUtils.isNotBlank(carTypeId)){
            mav.addObject("carTypeDate", carrierCarTypeService.getCarrierCarType(carTypeId));
        }
        return mav;
    }
    
    // 增加车辆类型信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid ParameterCarrierCarType carrierCarType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return carrierCarTypeService.addCarType(carrierCarType);
    }
    
    //修改车辆类型信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid ParameterCarrierCarType carrierCarType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return carrierCarTypeService.editCarType(carrierCarType);
    }
    
    //批量删除车辆类型信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> carrierCarTypeIds,@RequestParam List<String> carrierCarTypeNames) {
    	return carrierCarTypeService.delCarType(carrierCarTypeIds, carrierCarTypeNames);
    }
}

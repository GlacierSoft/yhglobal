package com.glacier.frame.web.controller.carrier;
 
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
import com.glacier.frame.dto.query.carrier.CarrierMemberGradeQueryDTO;
import com.glacier.frame.entity.carrier.CarrierMemberGrade;
import com.glacier.frame.service.carrier.CarrierMemberGradeService;

/*** 
 * @ClassName:  CarrierMemberGradeController
 * @Description: TODO(承运商信誉等级controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-09
 */
@Controller
@RequestMapping(value = "/carrierMemberGrade")
public class CarrierMemberGradeController extends AbstractController{

	@Autowired
	private CarrierMemberGradeService carrierMemberGradeService;
	
	// 进入承运商信誉等级列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("carrier_mgr/carrierMemberGrade_mgr/carrierMemberGrade");
        return mav;
    } 
     
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, CarrierMemberGradeQueryDTO memberGradeQueryDTO) {
        return carrierMemberGradeService.listAsGrid(jqPager, memberGradeQueryDTO);
    }
      
    // 进入承运商信誉等级Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String gradeId) { 
    	ModelAndView mav = new ModelAndView("carrier_mgr/carrierMemberGrade_mgr/carrierMemberGrade_detail");
        if(StringUtils.isNotBlank(gradeId)){
            mav.addObject("gradeData", carrierMemberGradeService.getMemberGrade(gradeId));
        }
	    return mav;
    }
    
    // 进入承运商信誉等级Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String gradeId) {
        ModelAndView mav = new ModelAndView("carrier_mgr/carrierMemberGrade_mgr/carrierMemberGrade_form");
        if(StringUtils.isNotBlank(gradeId)){
            mav.addObject("gradeData", carrierMemberGradeService.getMemberGrade(gradeId));
        }
        return mav;
    }
    
    // 增加承运商信誉等级
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid CarrierMemberGrade memberGrade, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return carrierMemberGradeService.addNews(memberGrade);
    }
    
    //修改承运商信誉等级
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid CarrierMemberGrade memberGrade, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return carrierMemberGradeService.editNews(memberGrade);
    }
    
    //批量删除承运商信誉等级
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> memberGradeIds,@RequestParam List<String> memberGradeNames) {
    	return carrierMemberGradeService.delNews(memberGradeIds, memberGradeNames);
    }
}

package com.glacier.frame.web.controller.carrier;
 
import java.util.List;
import javax.validation.Valid;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
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
import com.glacier.frame.dto.query.carrier.CarrierCarInformationQueryDTO;
import com.glacier.frame.entity.carrier.CarrierCarInformation;
import com.glacier.frame.entity.carrier.CarrierMember;
import com.glacier.frame.service.carrier.CarrierCarInformationService;

/*** 
 * @ClassName:  CarrierCarInfomationController
 * @Description: TODO(承运商车辆controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-09
 */
@Controller
@RequestMapping(value = "/carrierCarInformation")
public class CarrierCarInfomationController extends AbstractController{

	@Autowired
	private CarrierCarInformationService carrierCarInformationService;
	
	// 进入承运商车辆列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("carrier_mgr/carrierCarInformation_mgr/carrierCarInformatione");
        return mav;
    } 
     
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, CarrierCarInformationQueryDTO memberGradeQueryDTO) {
    	Subject pricipalSubject = SecurityUtils.getSubject(); 
        CarrierMember pricipalUser = (CarrierMember) pricipalSubject.getPrincipal();
        memberGradeQueryDTO.setCarrierMemberId(pricipalUser.getCarrierMemberId());
    	return carrierCarInformationService.listAsGrid(jqPager, memberGradeQueryDTO);
    }
      
    // 进入承运商车辆Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoCarInformationDetailPage(String gradeId) { 
    	ModelAndView mav = new ModelAndView("carrier_mgr/carrierCarInformation_mgr/carrierCarInformatione_detail");
        if(StringUtils.isNotBlank(gradeId)){
            mav.addObject("carInfoformationData", carrierCarInformationService.getCarInformation(gradeId));
        }
	    return mav;
    }
    
    // 进入承运商车辆Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String carId) {
        ModelAndView mav = new ModelAndView("carrier_mgr/carrierCarInformation_mgr/carrierCarInformation_form");
        if(StringUtils.isNotBlank(carId)){
            mav.addObject("carInfoformationData", carrierCarInformationService.getCarInformation(carId));
        }
        return mav;
    }
    
    // 进入车辆信息审核audit表单页面
    @RequestMapping(value = "/intoAudit.htm")
    private Object intoAuditCarInformation(String carId) {
        ModelAndView mav = new ModelAndView("carrier_mgr/carrierCarInformation_mgr/carrierCarInformation_audit");
        if(StringUtils.isNotBlank(carId)){
        	mav.addObject("carInfoformationData", carrierCarInformationService.getCarInformation(carId));
        }
        return mav;
    }
    
    // 增加承运商车辆
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid CarrierCarInformation carInformation, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return carrierCarInformationService.addNews(carInformation);
    }
    
    // 审核车辆信息记录
    @RequestMapping(value = "/audit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object auditRechargeSet(@Valid CarrierCarInformation carInformation, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return carrierCarInformationService.auditCarInformation(carInformation);
    }
    
    //修改承运商车辆
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid CarrierCarInformation memberGrade, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return carrierCarInformationService.editNews(memberGrade);
    }
    
    //批量删除承运商车辆
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> carrierCarInformationIds,@RequestParam List<String> carrierCarInformationNames) {
    	return carrierCarInformationService.delNews(carrierCarInformationIds, carrierCarInformationNames);
    }
}

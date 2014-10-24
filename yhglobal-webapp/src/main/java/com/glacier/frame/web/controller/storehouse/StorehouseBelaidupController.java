package com.glacier.frame.web.controller.storehouse;
 
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
import com.glacier.frame.dto.query.storehouse.StorehouseBelaidupQueryDTO;
import com.glacier.frame.entity.storehouse.StorehouseBelaidup;
import com.glacier.frame.service.storehouse.StorehouseBelaidupService;
import com.glacier.frame.service.storehouse.StorehousePackCodeService;

/*** 
 * @ClassName:  StorehouseBelaidupController
 * @Description: TODO(货物controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-15
 */
@Controller
@RequestMapping(value = "/belaidup")
public class StorehouseBelaidupController extends AbstractController{

	@Autowired
	private StorehouseBelaidupService belaidupService;
	
	@Autowired
	private StorehousePackCodeService packCodeService;
	
	// 进入货物信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("storehouse_mgr/belaidup_mgr/belaidup");
        return mav;
    } 
     
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, StorehouseBelaidupQueryDTO belaidupQueryDTO) {
        return belaidupService.listAsGrid(jqPager, belaidupQueryDTO);
    }
      
    // 进入货物信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String belaidupId) { 
    	ModelAndView mav = new ModelAndView("storehouse_mgr/belaidup_mgr/belaidup_detail");
        if(StringUtils.isNotBlank(belaidupId)){
            mav.addObject("belaidupDate", belaidupService.getBelaidup(belaidupId));
        }
	    return mav;
    }
    
    // 进入货物信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String belaidupId) {
        ModelAndView mav = new ModelAndView("storehouse_mgr/belaidup_mgr/belaidup_form");
        if(StringUtils.isNotBlank(belaidupId)){
            mav.addObject("belaidupDate", belaidupService.getBelaidup(belaidupId));
            mav.addObject("packTypeDate",packCodeService.getPackCode(belaidupId));
        }
        return mav;
    }
    
    // 增加货物信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid StorehouseBelaidup belaidup, BindingResult bindingResult,String packageId) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return belaidupService.addBelaidup(belaidup,packageId);
    }
    
    //修改货物信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid StorehouseBelaidup belaidup, BindingResult bindingResult,String packageId) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return belaidupService.editBelaidup(belaidup,packageId);
    }
    
    //批量删除货物信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> belaidupIds,@RequestParam List<String> belaidupName) {
    	return belaidupService.delBelaidup(belaidupIds, belaidupName);
    }
    
    
    //添加货物配送页
     @RequestMapping(value = "/intoDispatchingForm.htm")
     private Object intoDispatchingForm(String belaidupId) {
         ModelAndView mav = new ModelAndView("orders_mgr/ordersDispatching_mgr/ordersDispatching_form");
         if(StringUtils.isNotBlank(belaidupId)){
             mav.addObject("belaidupDate", belaidupService.getBelaidup(belaidupId));
         }
         return mav;
     }
        
    //添加货物损坏页 
     @RequestMapping(value = "/intoStorehouseDamage_form.htm")
     private Object intoStorehouseDamageAudit(String belaidupId) {
         ModelAndView mav = new ModelAndView("storehouse_mgr/storehouseDamage_mgr/storehouseDamage_form");
         if(StringUtils.isNotBlank(belaidupId)){
             mav.addObject("belaidupDate", belaidupService.getBelaidup(belaidupId));
         }
         return mav;
     }
    
    
}

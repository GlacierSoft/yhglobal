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
import com.glacier.frame.dto.query.storehouse.StorehousePackagetypeSetQueryDTO;
import com.glacier.frame.entity.storehouse.StorehousePackagetypeSet;
import com.glacier.frame.service.storehouse.StorehousePackagetypeSetService;

/*** 
 * @ClassName:  StorehousePackagetypeSetController
 * @Description: TODO(包装类型controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-15
 */
@Controller
@RequestMapping(value = "/packagetype")
public class StorehousePackagetypeSetController extends AbstractController{

	@Autowired
	private StorehousePackagetypeSetService packagetypeSetService;
	
	// 进入包装类型信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("storehouse_mgr/packagetype_mgr/packagetype");
        return mav;
    } 
     
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, StorehousePackagetypeSetQueryDTO packagetypeSetQueryDTO) {
        return packagetypeSetService.listAsGrid(jqPager, packagetypeSetQueryDTO);
    }
      
    // 进入包装类型信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String packagetypeId) { 
    	ModelAndView mav = new ModelAndView("storehouse_mgr/packagetype_mgr/packagetype_detail");
        if(StringUtils.isNotBlank(packagetypeId)){
            mav.addObject("packagetypeDate", packagetypeSetService.getPackagetype(packagetypeId));
        }
	    return mav;
    }
    
    // 进入包装类型信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String packagetypeId) {
        ModelAndView mav = new ModelAndView("storehouse_mgr/packagetype_mgr/packagetype_form");
        if(StringUtils.isNotBlank(packagetypeId)){
            mav.addObject("packagetypeDate", packagetypeSetService.getPackagetype(packagetypeId));
        }
        return mav;
    }
    
    // 增加包装类型信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid StorehousePackagetypeSet packagetype, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return packagetypeSetService.addPackagetype(packagetype);
    }
    
    //修改包装类型信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid StorehousePackagetypeSet packagetype, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return packagetypeSetService.editPackagetype(packagetype);
    }
    
    //批量删除包装类型信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> packagetypeIds,@RequestParam List<String> packagetypeName) {
    	return packagetypeSetService.delPackagetype(packagetypeIds, packagetypeName);
    }
}

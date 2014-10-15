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
import com.glacier.frame.dto.query.storehouse.StorehouseStoragetypeSetQueryDTO;
import com.glacier.frame.entity.storehouse.StorehouseStoragetypeSet;
import com.glacier.frame.service.storehouse.StorehouseStoragetypeSetService;

/*** 
 * @ClassName:  StorehouseStoragetypeSetController
 * @Description: TODO(仓库类型controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-15
 */
@Controller
@RequestMapping(value = "/storagetype")
public class StorehouseStoragetypeSetController extends AbstractController{

	@Autowired
	private StorehouseStoragetypeSetService storagetypeSetService;
	
	// 进入仓库类型信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("storehouse_mgr/storagetype_mgr/storagetype");
        return mav;
    } 
     
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, StorehouseStoragetypeSetQueryDTO storagetypeSetQueryDTO) {
        return storagetypeSetService.listAsGrid(jqPager, storagetypeSetQueryDTO);
    }
      
    // 进入仓库类型信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String storagetypeId) { 
    	ModelAndView mav = new ModelAndView("storehouse_mgr/storagetype_mgr/storagetype_detail");
        if(StringUtils.isNotBlank(storagetypeId)){
            mav.addObject("storagetypeDate", storagetypeSetService.getStoragetype(storagetypeId));
        }
	    return mav;
    }
    
    // 进入仓库类型信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String storagetypeId) {
        ModelAndView mav = new ModelAndView("storehouse_mgr/storagetype_mgr/storagetype_form");
        if(StringUtils.isNotBlank(storagetypeId)){
            mav.addObject("storagetypeDate", storagetypeSetService.getStoragetype(storagetypeId));
        }
        return mav;
    }
    
    // 增加仓库类型信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid StorehouseStoragetypeSet storagetype, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return storagetypeSetService.addStoragetype(storagetype);
    }
    
    //修改仓库类型信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid StorehouseStoragetypeSet storagetype, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return storagetypeSetService.editStoragetype(storagetype);
    }
    
    //批量删除仓库类型信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> storagetypeIds,@RequestParam List<String> storagetypeName) {
    	return storagetypeSetService.delStoragetype(storagetypeIds, storagetypeName);
    }
}

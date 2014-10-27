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
import com.glacier.frame.dto.query.storehouse.StorehouseStorageQueryDTO;
import com.glacier.frame.entity.storehouse.StorehouseStorage;
import com.glacier.frame.service.storehouse.StorehouseStorageService;

/*** 
 * @ClassName:  StorehouseStorageController
 * @Description: TODO(仓库controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-16
 */
@Controller
@RequestMapping(value = "/storage")
public class StorehouseStorageController extends AbstractController{

	@Autowired
	private StorehouseStorageService storageService;
	
	// 进入仓库信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("storehouse_mgr/storage_mgr/storages");
        return mav;
    } 
     
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, StorehouseStorageQueryDTO storageSetQueryDTO) {
        return storageService.listAsGrid(jqPager, storageSetQueryDTO);
    }
      
    // 进入仓库信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String storageId) { 
    	ModelAndView mav = new ModelAndView("storehouse_mgr/storage_mgr/storages_detail");
        if(StringUtils.isNotBlank(storageId)){
            mav.addObject("storageDate", storageService.getStorage(storageId));
        }
	    return mav;
    }
    
    // 进入仓库信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String storageId) {
        ModelAndView mav = new ModelAndView("storehouse_mgr/storage_mgr/storages_form");
        if(StringUtils.isNotBlank(storageId)){
            mav.addObject("storageDate", storageService.getStorage(storageId));
        }
        return mav;
    }
    
    // 进入仓库维修
    @RequestMapping(value = "/addRepair.htm")
    private Object intooptgroupValueFormPoptgroupValue(String storageId) {
        ModelAndView mav = new ModelAndView("storehouse_mgr/storage_mgr/storageRepairs_form");
        mav.addObject("storageData", storageService.getStorage(storageId));
        return mav;
    }
    
    // 增加仓库信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid StorehouseStorage storage, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return storageService.addStorage(storage);
    }
    
    //修改仓库信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid StorehouseStorage storage, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return storageService.editStorage(storage);
    }
    
    //批量删除仓库信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> storageIds,@RequestParam List<String> storageName) {
    	return storageService.delStorage(storageIds, storageName);
    }
}

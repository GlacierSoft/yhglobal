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
import com.glacier.frame.dto.query.storehouse.StorehouseStorageRepairQueryDTO;
import com.glacier.frame.entity.storehouse.StorehouseStorageRepair;
import com.glacier.frame.service.storehouse.StorehouseStorageRepairService;

/*** 
 * @ClassName:  StorehouseStorageRepairController
 * @Description: TODO(仓库controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-16
 */
@Controller
@RequestMapping(value = "/storageRepair")
public class StorehouseStorageRepairController extends AbstractController{

	@Autowired
	private StorehouseStorageRepairService storageRepairService;
	
	// 进入仓库信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("storehouse_mgr/storageRepair_mgr/storageRepairs");
        return mav;
    } 
     
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, StorehouseStorageRepairQueryDTO storageRepairSetQueryDTO) {
        return storageRepairService.listAsGrid(jqPager, storageRepairSetQueryDTO);
    }
      
    // 进入仓库信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String storageRepairId) { 
    	ModelAndView mav = new ModelAndView("storehouse_mgr/storageRepair_mgr/storageRepairs_detail");
        if(StringUtils.isNotBlank(storageRepairId)){
            mav.addObject("storageRepairDate", storageRepairService.getStorageRepair(storageRepairId));
        }
	    return mav;
    }
    
    // 进入仓库信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String storageRepairId) {
        ModelAndView mav = new ModelAndView("storehouse_mgr/storageRepair_mgr/storageRepairs_form");
        if(StringUtils.isNotBlank(storageRepairId)){
            mav.addObject("storageRepairDate", storageRepairService.getStorageRepair(storageRepairId));
        }
        return mav;
    }
    
    // 增加仓库信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid StorehouseStorageRepair storageRepair, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return storageRepairService.addStorageRepair(storageRepair);
    }
    
    //修改仓库信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid StorehouseStorageRepair storageRepair, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return storageRepairService.editStorageRepair(storageRepair);
    }
    
    //批量删除仓库信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> storageRepairIds,@RequestParam List<String> storageRepairName) {
    	return storageRepairService.delStorageRepair(storageRepairIds, storageRepairName);
    }
}

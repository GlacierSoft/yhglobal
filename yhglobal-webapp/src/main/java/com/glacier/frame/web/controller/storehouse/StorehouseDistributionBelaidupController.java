/**
 * @Title: StorehouseDistributionBelaidupController.java 
 * @Package com.glacier.frame.web.controller.storehouse 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2014-12-18 下午4:23:17 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-12-18
				修改人：song.jundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：song.jundong 
 * 
 */
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
import com.glacier.frame.dto.query.storehouse.StorehouseBelaidupQueryDTO;
import com.glacier.frame.entity.storehouse.StorehouseBelaidup;
import com.glacier.frame.service.storehouse.StorehouseBelaidupService;
import com.glacier.frame.service.storehouse.StorehousePackCodeService;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName:  StorehouseDistributionBelaidupController
 * @Description: TODO(已分拣的物品)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-12-18  下午4:23:17
 */
@Controller
@RequestMapping(value = "/distributionBelaidup")
public class StorehouseDistributionBelaidupController extends AbstractController{

	@Autowired
	private StorehouseBelaidupService belaidupService;
	
	@Autowired
	private StorehousePackCodeService packCodeService;
	
	// 进入货物信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("storehouse_mgr/distributionBelaidup_mgr/belaidup");
        return mav;
    } 
     
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, StorehouseBelaidupQueryDTO belaidupQueryDTO) {
    	belaidupQueryDTO.setSortingStauts("hassorting");//已分拣的货物
    	return belaidupService.listAsGrid(jqPager, belaidupQueryDTO);
    }
      
    // 进入货物信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String belaidupId) { 
    	ModelAndView mav = new ModelAndView("storehouse_mgr/distributionBelaidup_mgr/belaidup_detail");
        if(StringUtils.isNotBlank(belaidupId)){
            mav.addObject("belaidupDate", belaidupService.getBelaidup(belaidupId));
        }
	    return mav;
    }
    
    // 进入货物信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String belaidupId) {
        ModelAndView mav = new ModelAndView("storehouse_mgr/distributionBelaidup_mgr/belaidup_form");
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

/**
 * @Title: FinancePlatformController.java 
 * @Package com.glacier.frame.web.controller.finace 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2014-10-30 上午10:03:18 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-10-30
				修改人：song.jundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：song.jundong 
 * 
 */
package com.glacier.frame.web.controller.finace; 
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
import com.glacier.frame.dto.query.finace.FinFinancePlatformQueryDTO;
import com.glacier.frame.entity.finace.FinancePlatform;
import com.glacier.frame.service.finace.FinancePlatformService;
import com.glacier.jqueryui.util.JqPager; 

/**
 * @ClassName:  FinancePlatformController
 * @Description: TODO(资金平台)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-10-30  上午10:03:18
 */
@Controller
@RequestMapping(value = "/financePlatform")
public class FinancePlatformController extends AbstractController{

    @Autowired
    private FinancePlatformService financePlatformService;// 注入资金平台记录业务Bean
    
    // 进入资金平台展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexFinancePlatform() {
        ModelAndView mav = new ModelAndView("finace_mgr/financePlatform_mgr/financePlatform");
        return mav;
    }
    
    // 进入资金平台Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoPlatformForm(String platformId) {
        ModelAndView mav = new ModelAndView("finace_mgr/financePlatform_mgr/financePlatform_form");
        if(StringUtils.isNotBlank(platformId)){
            mav.addObject("financePlatformData", financePlatformService.getPlatform(platformId));
        }
        return mav;
    }
    
    // 进入资金平台记录Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoPlatformDetailPage(String platformId) {
        ModelAndView mav = new ModelAndView("finace_mgr/financePlatform_mgr/financePlatform_detail");
        if(StringUtils.isNotBlank(platformId)){
            mav.addObject("financePlatformData", financePlatformService.getPlatform(platformId));
        }
        return mav;
    }
    
    // 进入资金平台audit表单页面
    @RequestMapping(value = "/intoAudit.htm")
    private Object intoAuditPlatform(String platformId) {
        ModelAndView mav = new ModelAndView("finace_mgr/financePlatform_mgr/financePlatform_audit");
        if(StringUtils.isNotBlank(platformId)){
            mav.addObject("financePlatformData", financePlatformService.getPlatform(platformId));
        }
        return mav;
    }
    
    // 审核资金平台记录
    @RequestMapping(value = "/audit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object auditPlatform(@Valid FinancePlatform financePlatform, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return financePlatformService.auditPlatform(financePlatform);
    }
    
    // 获取表格结构的所有资金平台数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listPlatformAsGridByPlatformId(FinFinancePlatformQueryDTO financePlatformQueryDTO,JqPager pager) {
        return financePlatformService.listAsGrid(financePlatformQueryDTO,pager);
    }
    
    // 增加资金平台
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addFinancePlatform(@Valid FinancePlatform financePlatform, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return financePlatformService.addPlatform(financePlatform);
    }
    
    // 修改资金平台
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editFinancePlatform(@Valid FinancePlatform financePlatform, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return financePlatformService.editPlatform(financePlatform);
    } 
    
    // 修改资金平台默认账号
    @RequestMapping(value = "/update.json", method = RequestMethod.POST)
    @ResponseBody
    private Object updateFinancePlatform(@Valid FinancePlatform financePlatform) {
         return financePlatformService.updatePlatform(financePlatform);
    }
     
    // 批量删除资金平台
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delPlatform(@RequestParam List<String> financePlatformIds,@RequestParam List<String> platformNames) {
    	return financePlatformService.delPlatform(financePlatformIds, platformNames);
    }
}

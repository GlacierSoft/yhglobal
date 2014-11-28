package com.glacier.frame.web.controller.member;

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

import com.glacier.frame.dto.query.member.ContractManagerQueryDTO;
import com.glacier.frame.entity.member.MemberContractType;
import com.glacier.frame.service.member.ContractManagerService;
import com.glacier.jqueryui.util.JqPager;

/*** 
 * @ClassName:  ContractManagerController
 * @Description: TODO(合同管理控制层)
 * @author zhengjunjie
 * @email 1203807137@QQ.com
 * @date 2014-10-08  下午2:09:10
 */
@Controller
@RequestMapping(value="/contractManager")
public class ContractManagerController {
	
	@Autowired
	private ContractManagerService contractManagerService;

    // 进入合同管理展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPservice() {
        ModelAndView mav = new ModelAndView("member_mgr/contractManager_mgr/contractManager");
        return mav;
    }
    
    //获取表格结构的所有合同管理记录信息
	@RequestMapping(value = "/list.json", method = RequestMethod.POST)
	@ResponseBody
	private Object listActionAsGridByMenuId(JqPager jqPager,ContractManagerQueryDTO contractManagerQueryDTO ,String q) {
	     return contractManagerService.listAsGrid(jqPager,contractManagerQueryDTO,q);
	}
	
	 //合同管理记录详情页
	 @RequestMapping(value = "/intoDetail.htm")
	 private Object intoContractManagerDetailPage(String contractTypeId) {
	     ModelAndView mav = new ModelAndView("member_mgr/contractManager_mgr/contractManager_detail");
	     if(StringUtils.isNotBlank(contractTypeId)){
	        mav.addObject("contractManagerData", contractManagerService.getContractManager(contractTypeId));
	     }
	     return mav;
	  }
	 
	 // 进入合同类型表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoContractManagerForm(String contractTypeId) {
        ModelAndView mav = new ModelAndView("member_mgr/contractManager_mgr/contractManager_form");
        if(StringUtils.isNotBlank(contractTypeId)){
            mav.addObject("contractManagerData", contractManagerService.getContractManager(contractTypeId));
        }
        return mav;
    }
	 
	//增加合同类型记录
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addContractManagerForm(@Valid MemberContractType memberContractType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            //return returnErrorBindingResult(bindingResult);
        }
        return contractManagerService.addContractManager(memberContractType);
    }
    
    // 修改合同管理信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editContractManagerForm(@Valid MemberContractType memberContractType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            //return returnErrorBindingResult(bindingResult);
        }
        return contractManagerService.editContractManager(memberContractType);
    }
    
    // 批量删除合同类型信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delContractManagerForm(@RequestParam List<String> contractTypeIds) {
    	return contractManagerService.delContractManager(contractTypeIds);
    }
    
    // 进入合同类型信息表单页面
    @RequestMapping(value = "/intoAudit.htm")
    private Object intoAuditWithdrawSet(String contractTypeId) {
        ModelAndView mav = new ModelAndView("member_mgr/contractManager_mgr/contractManager_audit");
        if(StringUtils.isNotBlank(contractTypeId)){
        	 mav.addObject("contractManagerData", contractManagerService.getContractManager(contractTypeId));
        }
        return mav;
    }
    
    //进入合同类型信息表单页面
    @RequestMapping(value = "/audit.json")
    @ResponseBody
    private Object auditContractType(String contractTypeId) {
        return contractManagerService.changeContractType(contractTypeId);
    }
	
}
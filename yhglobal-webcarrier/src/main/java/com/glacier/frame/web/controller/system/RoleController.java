package com.glacier.frame.web.controller.system;

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
import com.glacier.frame.dto.query.carrierlogin.CarrierloginRoleQueryDTO;
import com.glacier.frame.entity.carrierlogin.CarrierloginRole;
import com.glacier.frame.service.carrierlogin.CarrierloginRoleService;
import com.glacier.jqueryui.util.JqPager;

/***
 * @ClassName:  RoleController
 * @Description: TODO(角色Controller)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-8-18  下午5:05:40
 */
@Controller
@RequestMapping(value = "/role")
public class RoleController extends AbstractController{

    @Autowired
    private CarrierloginRoleService carrierloginRoleService;// 注入角色业务Bean
    
    // 进入角色列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPage() {
        ModelAndView mav = new ModelAndView("system_mgr/role_mgr/role");
        return mav;
    }
    
    // 进入角色Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoRoleFormPage(String roleId) {
        ModelAndView mav = new ModelAndView("system_mgr/role_mgr/role_form");
        if(StringUtils.isNotBlank(roleId)){
            mav.addObject("roleData", carrierloginRoleService.getRole(roleId));
        }
        return mav;
    }
    
    // 进入角色Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoRoleDetailPage(String roleId) {
        ModelAndView mav = new ModelAndView("system_mgr/role_mgr/role_detail");
        if(StringUtils.isNotBlank(roleId)){
            mav.addObject("roleData", carrierloginRoleService.getRole(roleId));
        }
        return mav;
    }
    
    // 检索表格结构的角色数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listRoleAsGridByMenuId(CarrierloginRoleQueryDTO carrierloginRoleQueryDTO, JqPager pager) {
        return carrierloginRoleService.listAsGrid(carrierloginRoleQueryDTO,pager);
    }
    
    // 增加角色
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addRole(@Valid CarrierloginRole carrierloginRole, BindingResult bindingResult) throws Exception {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return carrierloginRoleService.addRole(carrierloginRole);
    }
    
    // 修改角色
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editRole(@Valid CarrierloginRole carrierloginRole, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return carrierloginRoleService.editRole(carrierloginRole);
    }
    
    //批量删除角色
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delRoles(@RequestParam List<String> roleIds,@RequestParam List<String> roleCnNames) {
        return carrierloginRoleService.delRoles(roleIds, roleCnNames);
    }
}

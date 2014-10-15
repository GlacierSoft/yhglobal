/**
 * @Title: ShipperIntegralTypeController.java 
 * @Package com.glacier.frame.web.controller.member 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2014-10-10 上午10:38:18 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-10-10
				修改人：song.jundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：song.jundong 
 * 
 */
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

import com.glacier.core.controller.AbstractController;
import com.glacier.frame.entity.member.ShipperIntegralType;
import com.glacier.frame.service.member.ShipperIntegralTypeService;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName:  ShipperIntegralTypeController
 * @Description: TODO(积分类型控制器)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-10-10  上午10:38:18
 */
@Controller
@RequestMapping(value = "/integralType")
public class ShipperIntegralTypeController extends AbstractController{

    @Autowired
    private ShipperIntegralTypeService integralTypeService;// 注入积分类型业务Bean
    
    // 进入积分类型列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPcreditType() {
        ModelAndView mav = new ModelAndView("member_mgr/integralType_mgr/integralType");
        return mav;
    }
    
    // 获取表格结构的所有数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByIntegralId(JqPager pager) {
        return integralTypeService.listAsGrid(pager);
    }
    
    // 进入积分类型Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoIntegralTypeDetailPage(String integralTypeId) {
        ModelAndView mav = new ModelAndView("member_mgr/integralType_mgr/integralType_detail");
        if(StringUtils.isNotBlank(integralTypeId)){
            mav.addObject("integralTypeData", integralTypeService.getIntegralType(integralTypeId));
        }
        return mav;
    }
    
    // 进入积分类型Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoIntegralTypeFormPintegralType(String integralTypeId) {
        ModelAndView mav = new ModelAndView("member_mgr/integralType_mgr/integralType_form");
        if(StringUtils.isNotBlank(integralTypeId)){
            mav.addObject("integralTypeData", integralTypeService.getIntegralType(integralTypeId));
        }
        return mav;
    }
     
    // 增加积分类型
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addIntegralType(@Valid ShipperIntegralType shipperIntegralType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return integralTypeService.addIntegralType(shipperIntegralType);
    }
    
    // 修改积分类型
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editIntegralType(@Valid ShipperIntegralType shipperIntegralType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return integralTypeService.editIntegralType(shipperIntegralType);
    }
    
    // 批量删除积分类型
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delIntegralTypes(@RequestParam List<String> integralTypeIds,@RequestParam List<String> integralTypes) {
    	return integralTypeService.delIntegralTypes(integralTypeIds, integralTypes);
    } 
 

}

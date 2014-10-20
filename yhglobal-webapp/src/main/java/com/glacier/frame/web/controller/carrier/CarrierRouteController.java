/**
 * @Title: CarrierRouteController.java 
 * @Package com.glacier.frame.web.controller.carrier 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2014-10-16 上午11:09:45 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-10-16
				修改人：song.jundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：song.jundong 
 * 
 */
package com.glacier.frame.web.controller.carrier;
 
import javax.validation.Valid; 
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView; 
import com.glacier.core.controller.AbstractController; 
import com.glacier.frame.dto.query.carrier.CarrierRouteQueryDTO; 
import com.glacier.frame.entity.carrier.CarrierRoute;
import com.glacier.frame.service.carrier.CarrierRouterService;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName:  CarrierRouteController
 * @Description: TODO(班线Controller)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-10-16  上午11:09:45
 */

@Controller
@RequestMapping(value = "/carrierRoute")
public class CarrierRouteController extends AbstractController {
	
	@Autowired
	private CarrierRouterService carrierRouterService;
	
	// 进入承运商班线展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("carrier_mgr/carrierRoute_mgr/carrierRoute");
        return mav;
    } 
      
    // 查询显示所有的承运商会员信息
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager,CarrierRouteQueryDTO routeQueryDTO,String q) {
     	return carrierRouterService.listAsGrid(jqPager,routeQueryDTO, q);
    }
       
    // 进入班线Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberDetailPage(String routerId) { 
    	ModelAndView mav = new ModelAndView("carrier_mgr/carrierRoute_mgr/carrierRoute_detail");
    	 if(StringUtils.isNotBlank(routerId)){ 
	        mav.addObject("carrierRouteData",carrierRouterService.getRoute(routerId)); 
    	}
	     return mav;
    }
    
    // 启用、禁用班线
    @RequestMapping(value = "/status.json", method = RequestMethod.POST)
    @ResponseBody
    private Object updateStatus(String  routerId) {
    	return carrierRouterService.upStatus(routerId); 
    }  

    // 班线audit表单页面
    @RequestMapping(value = "/intoAudit.htm")
    private Object intoAuditMember(String routerId) {
        ModelAndView mav = new ModelAndView("carrier_mgr/carrierRoute_mgr/carrierRoute_audit");
        if(StringUtils.isNotBlank(routerId)){
        	 CarrierRoute carrierRoute=carrierRouterService.getRoute(routerId);
         	 mav.addObject("carrierRouteData", carrierRoute);   
          }
         return mav;
    }
    
    //班线审核
    @RequestMapping(value = "/audit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object auditMember(@Valid CarrierRoute carrierRoute, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return carrierRouterService.audit(carrierRoute);
    }
     
    //班线审核
    @RequestMapping(value = "/area.json", method = RequestMethod.POST)
    @ResponseBody
    private Object selectArea(String routeid) {  
         return carrierRouterService.selectArea(routeid);
      }
     
    // 进入班线Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String routerId) {
        ModelAndView mav = new ModelAndView("carrier_mgr/carrierRoute_mgr/carrierRoute_form");
        if(StringUtils.isNotBlank(routerId)){  
            mav.addObject("carrierRouteData", carrierRouterService.getRoute(routerId));
        } 
        return mav;
    } 
    
    //修改班线
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid CarrierRoute carrierRoute, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return carrierRouterService.editRoute(carrierRoute);
    }
    
}

/**
 * @Title: StorehouseDamageController.java 
 * @Package com.glacier.frame.web.controller.storehouse 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-10-21 上午11:14:31 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-10-21
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.web.controller.storehouse;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.frame.dto.query.storehouse.StorehouseDamageQueryDTO;
import com.glacier.frame.entity.storehouse.StorehouseDamage;
import com.glacier.frame.service.storehouse.StorehouseDamageService;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: StorehouseDamageController 
 * @Description: TODO(损坏记录表控制层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-10-21 上午11:14:31
 */


@Controller
@RequestMapping(value="storehouseDamage")
public class StorehouseDamageController {

	@Autowired
	private StorehouseDamageService storehouseDamageServcie;
	
    //进入货品损坏记录展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPservice() {
        ModelAndView mav = new ModelAndView("storehouse_mgr/storehouseDamage/storehouseDamage");
        return mav;
    }
   
    //获取表格结构的所有品损坏记录信息  
	@RequestMapping(value = "/list.json", method = RequestMethod.POST)
   	@ResponseBody
   	private Object listActionAsGridByMenuId(JqPager jqPager, StorehouseDamageQueryDTO storehouseDamageQueryDTO, String q,HttpSession session) {
   		JqGridReturn returnResult=(JqGridReturn)storehouseDamageServcie.listAsGrid(jqPager, storehouseDamageQueryDTO, q);
   	    if(returnResult!=null){
 	    	@SuppressWarnings("unchecked")
 	    	List<StorehouseDamage> list=(List<StorehouseDamage>) returnResult.getRows();
 	    	session.setAttribute("list", list);
 	    }	
   		return returnResult;
   	}
	
	//仓库货品流动记录信息详情页
   	@RequestMapping(value = "/intoDetail.htm")
   	private Object intoStorehouseDamageDetailPage(String damageId) {
   	    ModelAndView mav = new ModelAndView("storehouse_mgr/storehouseDamage/storehouseDamage_detail");
   	    if(StringUtils.isNotBlank(damageId)){
   	          mav.addObject("storehouseDamageData", storehouseDamageServcie.getStorehouseDamagePro(damageId));
   	    }
   	    return mav;
   	}
	
   //进入货物损坏信息审核页
    @RequestMapping(value = "/intoAudit.htm")
    private Object intoAuditStorehouseDamage(String damageId) {
        ModelAndView mav = new ModelAndView("storehouse_mgr/storehouseDamage/storehouseDamage_audit");
        if(StringUtils.isNotBlank(damageId)){
        	 mav.addObject("storehouseDamageData", storehouseDamageServcie.getStorehouseDamagePro(damageId));
        }
        return mav;
    }
    
    // 货主会员银行卡信息审核
    @RequestMapping(value = "/audit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object auditBankCard(@Valid StorehouseDamage storehouseDamage, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
        	// 后台校验的错误信息
            //return returnErrorBindingResult(bindingResult);
        }
        return storehouseDamageServcie.auditStorehouseDamage(storehouseDamage);
    }
   	
}  

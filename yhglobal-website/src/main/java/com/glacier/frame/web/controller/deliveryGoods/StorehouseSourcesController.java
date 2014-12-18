/**
 * @Title: StorehouseSourcesController.java 
 * @Package com.glacier.frame.web.controller.deliveryGoods 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-12-18 下午1:50:06 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-12-18
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.web.controller.deliveryGoods;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.frame.dto.query.storehouse.StorehouseBelaidupSourceQueryDTO;
import com.glacier.frame.entity.member.ShipperMember;
import com.glacier.frame.service.storehouse.StorehouseBelaidupSourceService;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: StorehouseSourcesController 
 * @Description: TODO(货源管理控制层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-12-18 下午1:50:06
 */

@Controller
@RequestMapping(value="/storehouseBelaidupSource")
public class StorehouseSourcesController {

	   @Autowired
	   private StorehouseBelaidupSourceService storehouseBelaidupSourceService;
	   
	    //货源管理展示页
	  	@RequestMapping(value="storehouseBelaidupSource.htm")
	    private Object intoReleaseManager(JqPager pager, StorehouseBelaidupSourceQueryDTO storehouseBelaidupSourceQueryDTO,int p,String loanState){
	  		ModelAndView mav=new ModelAndView("/member_mgr/memberReleaseManager");
	  		Subject pricipalSubject = SecurityUtils.getSubject();//获取当前认证用户
	  		ShipperMember pricipalMember = (ShipperMember) pricipalSubject.getPrincipal();
	  		storehouseBelaidupSourceQueryDTO.setMemberId(pricipalMember.getMemberId());
	  		if(StringUtils.isNotBlank(pricipalMember.getMemberId())){
	  			 //按钮状态
	  			if ("firstAudit".equals(loanState)) {
	  			    mav.addObject("buttonState","firstAudit");
	  			}else if("secondAudit".equals(loanState)){
	  				mav.addObject("buttonState","secondAudit");
	  			}else if("thirdAudit".equals(loanState)){
	  				mav.addObject("buttonState","thirdAudit");
	  			}
	  			//货源发布记录
	  	  		JqGridReturn returnResult=(JqGridReturn)storehouseBelaidupSourceService.listAsWebsite(pager, storehouseBelaidupSourceQueryDTO,p);
	  	  		mav.addObject("returnResult",returnResult); 
	  	      	mav.addObject("currentMemberId",pricipalMember.getMemberId()); 
		  		mav.addObject("storehouseBelaidupSourceQueryDTO",storehouseBelaidupSourceQueryDTO);
	  		 }
	  		 return mav;
	  	 } 	    
	   
	  
	  	
	  	
	  	
}

/**
 * @Title: FinaceRechargeMemberSetController.java 
 * @Package com.glacier.frame.web.controller.finace 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-10-28 下午4:19:24 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-10-28
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
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


import com.glacier.frame.dto.query.finace.FinaceWithdrawSetMemberQueryDTO;
import com.glacier.frame.entity.finace.FinaceWithdrawSetMember;
import com.glacier.frame.service.finace.FinaceWithdrawSetMemberService;
import com.glacier.jqueryui.util.JqPager;



/**
 * @ClassName: FinaceWithdrawSetMemberController 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-10-28 下午4:19:24
 */

@Controller
@RequestMapping(value="finaceWithdrawSetMemberController")
public class FinaceWithdrawSetMemberController {
   
	@Autowired
	private FinaceWithdrawSetMemberService finaceWithdrawSetMemberService;
	
	//进入承运商合同记录展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPservice() {
        ModelAndView mav = new ModelAndView("finace_mgr/finaceWithdrawSetMember_mgr/finaceWithdrawSetMember");
        return mav;
    }
    
    
    // 获取表格结构的所有菜单数据
       @RequestMapping(value = "/list.json", method = RequestMethod.POST)
       @ResponseBody
       private Object listActionAsGridByMenuId(JqPager jqPager, FinaceWithdrawSetMemberQueryDTO finaceWithdrawSetMemberQueryDTO) {
           return finaceWithdrawSetMemberService.listAsGrid(jqPager, finaceWithdrawSetMemberQueryDTO);
       }
       
     //会员充值信息详情页
      	@RequestMapping(value = "/intoDetail.htm")
      	private Object intoFinaceRechargeSetMemberDetailPage(String withdrawSetId) {
      	    ModelAndView mav = new ModelAndView("finace_mgr/finaceWithdrawSetMember_mgr/finaceWithdrawSetMember_detail");
      	    if(StringUtils.isNotBlank(withdrawSetId)){
      	          mav.addObject("finaceWithdrawSetMemberData", finaceWithdrawSetMemberService.getFinaceRechargeSetMemberPro(withdrawSetId));
      	    }
      	    return mav;
       }
    
      	
     // 进入会员充值类型audit表单页面
        @RequestMapping(value = "/intoAudit.htm")
        private Object intoAuditRechargeSetCarrier(String withdrawSetId) {
            ModelAndView mav = new ModelAndView("finace_mgr/finaceWithdrawSetMember_mgr/finaceWithdrawSetMember_audit");
            if(StringUtils.isNotBlank(withdrawSetId)){
            	mav.addObject("finaceWithdrawSetMemberData", finaceWithdrawSetMemberService.getFinaceRechargeSetMemberPro(withdrawSetId));
            }
            return mav;
        }
        
        // 审核充值类型
        @RequestMapping(value = "/audit.json", method = RequestMethod.POST)
        @ResponseBody
        private Object auditRechargeSet(@Valid FinaceWithdrawSetMember finaceWithdrawSetMember, BindingResult bindingResult) {
            return finaceWithdrawSetMemberService.auditWithdrawSetMember(finaceWithdrawSetMember);
        }	
      	
        
        // 批量删除设置信息
        @RequestMapping(value = "/del.json", method = RequestMethod.POST)
        @ResponseBody
        public Object delFinaceRechargeSetMember(@RequestParam List<String> withdrawSetIds) {
        	return finaceWithdrawSetMemberService.delFinaceRechargeSetMember(withdrawSetIds);
        }
      	
}

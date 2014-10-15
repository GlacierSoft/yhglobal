package com.glacier.frame.web.controller.member;

import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.frame.dto.query.member.ShipperMemberBankCardQueryDTO;
import com.glacier.frame.entity.member.ShipperMemberBankCard;
import com.glacier.frame.service.member.ShipperMemberBankCardService;
import com.glacier.jqueryui.util.JqPager;

/*** 
 * @ClassName:  ContractManagerController
 * @Description: TODO(会员银行卡管理控制层)
 * @author zhengjunjie
 * @email 1203807137@QQ.com
 * @date 2014-10-08  下午2:09:10
 */
@Controller
@RequestMapping(value="/memberBankCard")
public class MemberBankCardController {
    
	@Autowired
	private ShipperMemberBankCardService shipperMemberBankCardService;
	
	//进入货主会员卡信息列表页
	@RequestMapping(value="index.htm")
	private Object intoIndexPmember() {
      ModelAndView mav = new ModelAndView("member_mgr/bankCard_mgr/bankCard");
      return mav;
    }
	
	//获取表格结构的所有会员银行卡数据
   	@RequestMapping(value = "/list.json", method = RequestMethod.POST)
   	@ResponseBody
   	private Object listActionAsGridByMenuId(JqPager jqPager, ShipperMemberBankCardQueryDTO shipperMemberBankCardQueryDTO, String q) {
   	    return shipperMemberBankCardService.listAsGrid(jqPager, shipperMemberBankCardQueryDTO, q);
   	}
  	
    //进入货主会员银行卡信息详情页
 	@RequestMapping(value = "/intoDetail.htm")
 	private Object intoBankCardDetailPage(String bankcardId) {
	    ModelAndView mav = new ModelAndView("member_mgr/bankCard_mgr/bankCard_detail");
	    if(StringUtils.isNotBlank(bankcardId)){
	          mav.addObject("shipperMemberBankCardData", shipperMemberBankCardService.getBankCardPro(bankcardId));
	    }
	    return mav;
 	 }
 	
 	//进入货主会员银行卡信息审核页
    @RequestMapping(value = "/intoAudit.htm")
    private Object intoAuditBankCard(String bankcardId) {
        ModelAndView mav = new ModelAndView("member_mgr/bankCard_mgr/bankCard_audit");
        if(StringUtils.isNotBlank(bankcardId)){
        	 mav.addObject("shipperMemberBankCardData", shipperMemberBankCardService.getBankCardPro(bankcardId));
        }
        return mav;
    }
    
    // 货主会员银行卡信息审核
    @RequestMapping(value = "/audit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object auditBankCard(@Valid ShipperMemberBankCard shipperMemberBankCard, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            //return returnErrorBindingResult(bindingResult);
        }
        return shipperMemberBankCardService.auditBankCard(shipperMemberBankCard);
    }
	
}

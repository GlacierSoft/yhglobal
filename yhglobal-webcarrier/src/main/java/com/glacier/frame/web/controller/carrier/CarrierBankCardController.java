/**
 * @Title: CarrierBankCardController.java 
 * @Package com.glacier.frame.web.controller.carrier 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-10-11 下午4:23:56 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-10-11
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
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

import com.glacier.frame.dto.query.carrier.CarrierBankCardQueryDTO;
import com.glacier.frame.entity.carrier.CarrierBankCard;
import com.glacier.frame.service.carrier.CarrierBankCardService;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: CarrierBankCardController 
 * @Description: TODO(承运商银行卡信息管理控制层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-10-11 下午4:23:56
 */

@Controller
@RequestMapping(value="carrierBankCard")
public class CarrierBankCardController {
	
	
	@Autowired
	private CarrierBankCardService  carrierBankCardService;
	
	//进入承运商会员卡信息列表页
	@RequestMapping(value="index.htm")
	private Object intoIndexPmember() {
	      ModelAndView mav = new ModelAndView("carrier_mgr/carrierBankCard_mgr/carrierBankCard");
	      return mav;
	 }
		
	
	//获取表格结构的所有会员银行卡数据
   	@RequestMapping(value = "/list.json", method = RequestMethod.POST)
   	@ResponseBody
   	private Object listActionAsGridByMenuId(JqPager jqPager, CarrierBankCardQueryDTO carrierBankCardQueryDTO, String q) {
   	    return carrierBankCardService.listAsGrid(jqPager, carrierBankCardQueryDTO, q);
   	}
   	
    //进入承运商会员银行卡信息详情页
   	@RequestMapping(value = "/intoDetail.htm")
   	private Object intoBankCardDetailPage(String bankcardId) {
  	    ModelAndView mav = new ModelAndView("carrier_mgr/carrierBankCard_mgr/carrierBankCard_detail");
  	    if(StringUtils.isNotBlank(bankcardId)){
  	          mav.addObject("carrierBankCardData", carrierBankCardService.getBankCardPro(bankcardId));
  	    }
  	    return mav;
   	 }
   	
   	
   	//进入承运商银行卡信息审核页
    @RequestMapping(value = "/intoAudit.htm")
    private Object intoAuditBankCard(String bankcardId) {
        ModelAndView mav = new ModelAndView("carrier_mgr/carrierBankCard_mgr/carrierBankCard_audit");
        if(StringUtils.isNotBlank(bankcardId)){
        	 mav.addObject("carrierBankCardData", carrierBankCardService.getBankCardPro(bankcardId));
        }
        return mav;
    }
    
    // 承运商银行卡信息审核
    @RequestMapping(value = "/audit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object auditBankCard(@Valid CarrierBankCard carrierBankCard, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            //return returnErrorBindingResult(bindingResult);
        }
        return carrierBankCardService.auditBankCard(carrierBankCard);
    }
   	
}

/**
 * @Title: FinaceRechargeController.java 
 * @Package com.glacier.frame.web.controller.finace 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-11-24 下午2:51:05 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-11-24
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.web.controller.finace;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.glacier.frame.entity.finace.FinaceRechargeMember;
import com.glacier.frame.service.finace.FinaceRechargeMemberService;

/**
 * @ClassName: FinaceRechargeController 
 * @Description: TODO(会员充值类) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-11-24 下午2:51:05
 */
@Controller
@RequestMapping(value = "/recharge")
public class FinaceRechargeController {
  
	@Autowired
	private FinaceRechargeMemberService finaceRechargeMemberService;
	
	// 增加会员充值记录
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addRecharge(@Valid FinaceRechargeMember finaceRechargeMember, BindingResult bindingResult) {
        return finaceRechargeMemberService.addRecharge(finaceRechargeMember);
    }
	   
}

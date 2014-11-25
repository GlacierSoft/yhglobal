/**
 * @Title: FinaceWithdrawController.java 
 * @Package com.glacier.frame.web.controller.finace 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-11-24 下午5:30:10 
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

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.glacier.frame.entity.finace.FinaceWithdrawMember;
import com.glacier.frame.service.finace.FinaceWithdrawMemberService;

/**
 * @ClassName: FinaceWithdrawController 
 * @Description: TODO(会员提现信息类) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-11-24 下午5:30:10
 */

@Controller
@RequestMapping(value="/withdraw")
public class FinaceWithdrawController {
   
	@Autowired
    private FinaceWithdrawMemberService finaceWithdrawMemberService;

	@RequestMapping(value="/add.json")
	@ResponseBody
	private Object addWithdraw(@Valid FinaceWithdrawMember  finaceWithdrawMember,String tradersPassword, String bankCardId,int mobile_code,HttpSession session){
		int mobile_true=(Integer)session.getAttribute("mobile_code");
		return finaceWithdrawMemberService.addWithdraw(finaceWithdrawMember, tradersPassword,bankCardId,mobile_code,mobile_true);
	}
	
}

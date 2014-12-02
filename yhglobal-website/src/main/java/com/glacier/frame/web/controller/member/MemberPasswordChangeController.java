/**
 * @Title: MemberPasswordChangeController.java 
 * @Package com.glacier.frame.web.controller.member 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-12-2 下午1:53:58 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-12-2
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.web.controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.glacier.frame.service.member.MemberPasswordChangeService;

/**
 * @ClassName: MemberPasswordChangeController 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-12-2 下午1:53:58
 */
@Controller
@RequestMapping(value="memberPassword")
public class MemberPasswordChangeController {
   
	@Autowired
	private  MemberPasswordChangeService memberPasswordChangeService;
	  
	//修改用户密码方法
	@RequestMapping(value = "/changeLoginPwd.json", method = RequestMethod.POST)
    @ResponseBody
    public Object changeLoginPwd(String oldPassword, String newPassword) {
        return memberPasswordChangeService.modifyPsd(oldPassword, newPassword);
    }
	
	//修改交易密码方法
	@RequestMapping(value="/changeChargePwd.json",method=RequestMethod.POST)
	@ResponseBody
	public Object changeChargePwd(String oldPassword, String newPassword) {
        return memberPasswordChangeService.modifyChargePsd(oldPassword, newPassword);
    }
	
	  
}

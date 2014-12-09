/**
 * @Title: MemberDetailController.java 
 * @Package com.glacier.frame.web.controller.member 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-12-9 下午3:07:52 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-12-9
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.web.controller.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.glacier.frame.entity.member.ShipperIndividualityMember;
import com.glacier.frame.service.member.ShipperMemberService;


/**
 * @ClassName: MemberDetailController 
 * @Description: TODO(会员中心详细控制层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-12-9 下午3:07:52
 */
@Controller
@RequestMapping(value="memberDetail")
public class MemberDetailController {
  
	@Autowired
	private ShipperMemberService shipperMemberService;
	
	//个体会员信息添加
    @RequestMapping(value="addPro.json")
	@ResponseBody
	private Object addPro(ShipperIndividualityMember shipperIndividualityMember,int mobileValidate,HttpSession session){
    	int mobile_true=(Integer)session.getAttribute("mobile_code");
        return shipperMemberService.addProInfo(shipperIndividualityMember, mobileValidate,mobile_true);
     }
}

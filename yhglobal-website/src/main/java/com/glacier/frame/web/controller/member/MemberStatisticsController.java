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

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.frame.entity.finace.FinanceMember;
import com.glacier.frame.entity.member.ShipperMember;
import com.glacier.frame.service.finace.FinaceMemberService;
import com.glacier.frame.service.finace.FinaceWithdrawMemberService;
import com.glacier.frame.service.storehouse.StorehouseBelaidupService;

/**
 * @ClassName: MemberStatisticsController 
 * @Description: TODO(会员信息统计控制层) 
 * @author wuting
 * @email 920339213@qq.com
 * @date 2014-12-11 下午1:53:58
 */
@Controller
@RequestMapping(value="memberStatistics")
public class MemberStatisticsController {
   
	@Autowired
	private FinaceMemberService finaceMemberService;
	
	@Autowired
	private StorehouseBelaidupService belaidupService;
	
	@Autowired
	private FinaceWithdrawMemberService withdrawMemberService;
	
	//会员信息统计展示页
    @RequestMapping(value="/memberStatistics.htm")
    private Object intoRechargeWithdraw(){
    	Subject pricipalSubject = SecurityUtils.getSubject();
        ShipperMember pricipalUser = (ShipperMember) pricipalSubject.getPrincipal();
    	ModelAndView mav=new ModelAndView("member_mgr/memberStatistics");
    	FinanceMember finacemember = finaceMemberService.getFinaceMemberProMemberId(pricipalUser.getMemberId());
    	//运输费用
    	mav.addObject("CountTransportationData", belaidupService.getByCountPrice(pricipalUser.getMemberId()));
    	//保险费用
    	mav.addObject("CountInsuranceData", belaidupService.selectByInsurance(pricipalUser.getMemberId()));
    	//全部费用
    	mav.addObject("CountGoodsData", belaidupService.selectByGoods(pricipalUser.getMemberId()));
    	//交易次数
    	mav.addObject("CountStatusData", belaidupService.getCountByStatus(pricipalUser.getMemberId()));
    	//提现总金额
    	mav.addObject("withdrawMoneyData", withdrawMemberService.getWithdrawMoney(pricipalUser.getMemberId()));
    	//实际提现总金额
    	mav.addObject("withdrawReallyMoneyData", withdrawMemberService.getWithdrawReallyMoney(pricipalUser.getMemberId()));
    	//充值总金额
    	mav.addObject("finaceMemberData", finacemember);
  		return mav;
    }
	  
}

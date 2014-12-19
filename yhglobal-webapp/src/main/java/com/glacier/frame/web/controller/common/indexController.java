/**
 * @Title: CommonController.java 
 * @Package com.glacier.frame.web.controller 
 * @author zhenfei.zhang   
 * @email 289556866@qq.com
 * @date 2014-1-16 上午10:50:38 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-1-16
				修改人：zhenfei.zhang 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：zhenfei.zhang
 * 
 */
package com.glacier.frame.web.controller.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.frame.service.carrier.CarrierMemberService;
import com.glacier.frame.service.finace.FinaceRechargeMemberSetService;
import com.glacier.frame.service.finace.FinaceRechargeSetCarrierService;
import com.glacier.frame.service.finace.FinaceWithdrawSetCarrierService;
import com.glacier.frame.service.finace.FinaceWithdrawSetMemberService;
import com.glacier.frame.service.orders.OrdersOrderService;
import com.glacier.frame.service.storehouse.StorehouseBelaidupService;

/**
 * @ClassName: CommonController
 * @Description: TODO(公用控制器)
 * @author zhenfei.zhang
 * @email 289556866@qq.com
 * @date 2014-1-16 上午10:50:38
 */
@Controller
@RequestMapping(value="/index")
public class indexController {
    
    @Autowired
    private StorehouseBelaidupService storehouseBelaidupService;// 注入货物业务类
    
    @Autowired
    private OrdersOrderService ordersOrderService;// 注入订单业务类
    
    @Autowired
    private CarrierMemberService carrierMemberService;// 注入承运商业务类
    
    @Autowired
    private FinaceRechargeSetCarrierService finaceRechargeSetCarrierService;// 注入承运商充值设置业务类
    
    @Autowired
    private FinaceWithdrawSetCarrierService finaceWithdrawSetCarrierService;// 注入承运商提现设置业务类
    
    @Autowired
    private FinaceRechargeMemberSetService finaceRechargeMemberSetService;// 注入会员充值设置业务类
    
    @Autowired
    private FinaceWithdrawSetMemberService finaceWithdrawSetMemberService;// 注入会员提现设置业务类
    
    @RequestMapping(value = "/center", method = RequestMethod.GET)
    public Object intoIndex() {
        
        ModelAndView mav = new ModelAndView("layout/center");
        //货物管理
        mav.addObject("belaidupnNumWaitsorting", storehouseBelaidupService.getBelaidupnNumBySortingStauts("waitsorting"));//查询等待分拣货物记录条数
        mav.addObject("belaidupnNumHassorting", storehouseBelaidupService.getBelaidupnNumBySortingStauts("hassorting"));//查询已经分拣货物记录条数
        //订单管理
        mav.addObject("ordersNumWaitdistribute", ordersOrderService.getOrdersNumByDistributeStatus("waitdistribute"));//查询等待分拣货物记录条数
        mav.addObject("ordersNumHasdistribute", ordersOrderService.getOrdersNumByDistributeStatus("hasdistribute"));//查询已经分拣货物记录条数
        //审核管理
        mav.addObject("carrierNumAuditState", carrierMemberService.getCarrierNumByAuditState("authstr"));//查询等待审核的承运商条数
        mav.addObject("rechargeSetCarrierNum", finaceRechargeSetCarrierService.getRechargeSetCarrierNumByAuditState("authstr"));//查询等待审核的承运商条数
        mav.addObject("withdrawSetCarrierNum", finaceWithdrawSetCarrierService.getWithdrawSetCarrierNumByAuditState("authstr"));//查询等待审核的承运商条数
        mav.addObject("rechargeSetMemberNum", finaceRechargeMemberSetService.getRechargeSetMemberNumByAuditState("authstr"));//查询等待审核的承运商条数
        mav.addObject("withdrawMemberNum", finaceWithdrawSetMemberService.getWithdrawMemberNumByAuditState("authstr"));//查询等待审核的承运商条数
        return mav;
    }
}

package com.glacier.frame.web.controller.member;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView; 
import com.glacier.core.controller.AbstractController; 
import com.glacier.frame.entity.member.ShipperEnterpriseMember;
import com.glacier.frame.entity.member.ShipperIndividualityMember;
import com.glacier.frame.entity.member.ShipperMember;
import com.glacier.frame.entity.storehouse.StorehouseGoodstypeSet;
import com.glacier.frame.dto.query.finace.FinaceMemberRecordQueryDTO; 
import com.glacier.frame.dto.query.member.ShipperMemberMessageNoticeQueryDTO;
import com.glacier.frame.dto.query.storehouse.StorehouseBelaidupSourceQueryDTO;
import com.glacier.frame.dto.query.storehouse.StorehouseGoodstypeSetQueryDTO;
import com.glacier.frame.service.carrier.ShipperEnterpriseMemberService;
import com.glacier.frame.service.carrier.ShipperIndividualityMemberService;
import com.glacier.frame.service.member.ShipperMemberBankCardService;
import com.glacier.frame.service.member.ShipperMemberMessageNoticeService;
import com.glacier.frame.service.member.ShipperMemberService;
import com.glacier.frame.service.storehouse.StorehouseBelaidupService;
import com.glacier.frame.service.storehouse.StorehouseBelaidupSourceService;
import com.glacier.frame.service.finace.FinaceMemberRecordService;
import com.glacier.frame.service.finace.FinaceMemberService;
import com.glacier.frame.service.finace.FinaceRechargeMemberService;
import com.glacier.frame.service.finace.FinaceRechargeMemberSetService;
import com.glacier.frame.service.finace.FinaceWithdrawMemberService;
import com.glacier.frame.service.storehouse.StorehouseGoodstypeSetService;
import com.glacier.frame.service.finace.FinaceMemberDetailService;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;



@Controller
@RequestMapping(value = "member")
public class MemberController extends AbstractController{
    
    @Autowired
    private ShipperMemberService shipperMemberService;
    
    @Autowired
    private ShipperIndividualityMemberService individualityMemberService;
    
    @Autowired
    private ShipperEnterpriseMemberService enterpriseMemberService; 
    
    @Autowired
    private StorehouseGoodstypeSetService StorehouseGoodstypeSetService;
    
    @Autowired
	private StorehouseBelaidupService storehouseBelaidupService;
    
    @Autowired
    private FinaceMemberDetailService finaceMemberDetailService;
    
    @Autowired
    private  FinaceMemberService finaceMemberService;
    
    @Autowired
    private FinaceRechargeMemberSetService finaceRechargeMemberSetService;
    
    @Autowired
    private FinaceRechargeMemberService finaceRechargeMemberService;
    
    @Autowired
    private ShipperMemberBankCardService shipperMemberBankCardService;
    
    @Autowired
    private FinaceMemberRecordService  finaceMemberRecordService;
    
    @Autowired
    private ShipperMemberMessageNoticeService shipperMemberMessageNoticeService; 
    
	@Autowired
	private FinaceWithdrawMemberService withdrawMemberService;
	
	
	@Autowired
	private StorehouseBelaidupSourceService storehouseBelaidupSourceService;
    

    // 进入会员个人主页展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexMember(HttpServletRequest request,HttpSession session,HttpSession tips) {
    	//保存在session里面
    	tips.setAttribute("tips", "个人中心");
        ModelAndView mav = new ModelAndView("/member_mgr/member");
        Subject pricipalSubject = SecurityUtils.getSubject();//获取当前认证用户
        ShipperMember pricipalMember = (ShipperMember) pricipalSubject.getPrincipal();
        //重新获取当前登录用户信息，设置在session中
        ShipperMember member = (ShipperMember) shipperMemberService.getShipperMember(pricipalMember.getMemberId());
        ShipperIndividualityMember individuality = individualityMemberService.getShipperMember(pricipalMember.getMemberId());
        ShipperEnterpriseMember enterpriseMember = enterpriseMemberService.getShipperMember(pricipalMember.getMemberId());
        mav.addObject("individuality", individuality);
        mav.addObject("enterprise", enterpriseMember);
        mav.addObject("messageCount", shipperMemberMessageNoticeService.getMemberShipperMessageCount());
      //运输费用
    	mav.addObject("CountTransportationData", storehouseBelaidupService.getByCountPrice(pricipalMember.getMemberId()));
    	//保险费用
    	mav.addObject("CountInsuranceData", storehouseBelaidupService.selectByInsurance(pricipalMember.getMemberId()));
    	//全部费用
    	mav.addObject("CountGoodsData", storehouseBelaidupService.selectByGoods(pricipalMember.getMemberId()));
    	//交易次数
    	mav.addObject("CountStatusData", storehouseBelaidupService.getCountByStatus(pricipalMember.getMemberId()));
    	//实际到账总金额
    	mav.addObject("receiveMoneyData", finaceRechargeMemberService.getByCountReceiveMoney(pricipalMember.getMemberId()));
    	//提现总金额
    	mav.addObject("withdrawMoneyData", withdrawMemberService.getWithdrawMoney(pricipalMember.getMemberId()));
    	//实际提现总金额
    	mav.addObject("withdrawReallyMoneyData", withdrawMemberService.getWithdrawReallyMoney(pricipalMember.getMemberId()));
    	//充值总金额
    	mav.addObject("finaceMemberData", finaceMemberService.getFinaceMemberProMemberId(pricipalMember.getMemberId()));
        session.removeAttribute("currentMember");
        session.setAttribute("currentMember", member);
        return mav;
    }
    
    //加入货源发送展示页
    @RequestMapping(value="release.htm")
    private Object intoRelease(JqPager jqPager, StorehouseGoodstypeSetQueryDTO storehouseGoodstypeSetQueryDTO){
    	ModelAndView mav=new ModelAndView("/member_mgr/memberReleaseGoods");
    	storehouseGoodstypeSetQueryDTO.setStatus("enable");
    	JqGridReturn returnResult=(JqGridReturn) StorehouseGoodstypeSetService.listAsGrid(jqPager,storehouseGoodstypeSetQueryDTO);
    	@SuppressWarnings("unchecked")
		List<StorehouseGoodstypeSet> StorehouseGoodstypeSetList=(List<StorehouseGoodstypeSet>) returnResult.getRows();
    	mav.addObject("StorehouseGoodstypeSetList",StorehouseGoodstypeSetList);
    	return mav;
    }
    
    //转到头像上传页面。
  	@RequestMapping(value = "/memberPhotoInto.htm")
  	public Object memberPhotoInto(){
  		return "member_mgr/memberPhoto";
  	}
  	
    //货源管理展示页
  	@RequestMapping(value="releaseManager.htm")
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
  	      	mav.addObject("sourceNumber",storehouseBelaidupSourceService.getStoreBelaidupSourceNumber());
	  		mav.addObject("storehouseBelaidupSourceQueryDTO",storehouseBelaidupSourceQueryDTO);
  		 }
  		 return mav;
  	 } 	
  	
    //站内信展示页
  	@RequestMapping(value="memberLetterStation.htm")
  	public Object memberLetterStation(JqPager pager, ShipperMemberMessageNoticeQueryDTO shipperMemberMessageNoticeQueryDTO,int p,String loanState){
  	   Subject pricipalSubject = SecurityUtils.getSubject();//获取当前认证用户
       ShipperMember pricipalMember = (ShipperMember) pricipalSubject.getPrincipal();
       shipperMemberMessageNoticeQueryDTO.setReceiver(pricipalMember.getMemberId());
       ModelAndView mav=new ModelAndView("member_mgr/memberLetterStation");
       if("firstAudit".equals(loanState)){
      	  mav.addObject("buttonState","firstAudit"); 	
       }else if(loanState.equals("secondAudit")){
    	mav.addObject("buttonState","secondAudit"); 
      	shipperMemberMessageNoticeQueryDTO.setLetterstatus("unread");
       }else if("thirdAudit".equals(loanState)){
    	mav.addObject("buttonState","thirdAudit");
      	shipperMemberMessageNoticeQueryDTO.setLetterstatus("read");
       } 
      mav.addObject("shipperMemberMessageNoticeDate", shipperMemberMessageNoticeService.listAsGridWebsite(shipperMemberMessageNoticeQueryDTO, pager, p));
      mav.addObject("NoticeNumb",shipperMemberMessageNoticeService.getMemberShipperMessageNoticeNumber());
      return mav;
  	}
  	
  	//个体户的修改信息操作
    @RequestMapping(value = "/editIndividuality.htm")
	@ResponseBody
	public Object editIndividuality(@Valid ShipperIndividualityMember individuality,String email,BindingResult bindingResult,String memberId){
		if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
		return individualityMemberService.editIndividualityMember(individuality,email,memberId);
	}
    
    //企业用户的修改信息操作
    @RequestMapping(value = "/editEnterprise.htm")
	@ResponseBody
	public Object editEnterprise(@Valid ShipperEnterpriseMember enterprise,String email,BindingResult bindingResult,String memberId){
		if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
		return individualityMemberService.editEnterpriseMember(enterprise,email,memberId);
	}
    
    // 进入会员个人详细信息展示页面
    @RequestMapping(value = "/memberDetail.htm")
    private Object intoMemberDetail(HttpServletRequest request,HttpSession tips) {
    	//保存在session里面
    	tips.setAttribute("tips", "个人中心");
    	Subject pricipalSubject = SecurityUtils.getSubject();//获取当前认证用户
        ShipperMember pricipalMember = (ShipperMember) pricipalSubject.getPrincipal();
        ModelAndView mav = null;
        if(pricipalMember.getMemberType().equals("individuality")){
        	mav = new ModelAndView("member_mgr/memberDetail");
        }else{
        	mav = new ModelAndView("member_mgr/enterpriseMemberDetail");
        }
        ShipperMember member = (ShipperMember) shipperMemberService.getShipperMember(pricipalMember.getMemberId());
        ShipperIndividualityMember individuality = individualityMemberService.getShipperMember(pricipalMember.getMemberId());
        ShipperEnterpriseMember enterpriseMember = enterpriseMemberService.getShipperMember(pricipalMember.getMemberId());
        mav.addObject("member", member);
        mav.addObject("enterprise", enterpriseMember);
        mav.addObject("individuality", individuality);
        return mav;
    }
    
    //充值提现展示页
    @RequestMapping(value="/rechargeWithdraw.htm")
    private Object intoRechargeWithdraw(JqPager pager, FinaceMemberRecordQueryDTO finaceMemberRecordQueryDTO,int p){
    	ModelAndView mav=new ModelAndView("member_mgr/memberRechargeWithdraw");
    	Subject pricipalSubject = SecurityUtils.getSubject();//获取当前认证用户
  		ShipperMember pricipalMember = (ShipperMember) pricipalSubject.getPrincipal();
  		//会员详细信息
  		mav.addObject("individuality",individualityMemberService.getShipperMember(pricipalMember.getMemberId())); 
  		//会员资金记录
  	    mav.addObject("finaceMemberDate",finaceMemberService.getFinaceMemberProWebsite(pricipalMember.getMemberId()));
  	    //会员充值类型
  	    mav.addObject("finaceMemberRechargeSetDate", finaceRechargeMemberSetService.listWebsite());
  	    //会员银行卡信息
  	    mav.addObject("finaceMemberBankCardDate", shipperMemberBankCardService.listWebsite(pricipalMember.getMemberId()));
  	    //会员资金记录
  	    mav.addObject("finaceMemberRecordDate", finaceMemberRecordService.listAsWebsite(pager,finaceMemberRecordQueryDTO,pricipalMember.getMemberId(),p));
  	    //保存当前用户
  	    mav.addObject("currentMember",pricipalMember);
  		//mav.addObject("returnResult",returnResult); 
      	mav.addObject("currentMemberId",pricipalMember.getMemberId()); 
  		mav.addObject("finaceMemberRecordQueryDTO",finaceMemberRecordQueryDTO);
  		return mav;
    }
    
    //会员资金记录显示页面
    @RequestMapping(value="memberFinance.htm")
    private Object memberFinance(JqPager jqPager, FinaceMemberRecordQueryDTO finaceMemberRecordQueryDTO, int p){
    	ModelAndView mav=new ModelAndView("member_mgr/memberFinance");
    	Subject pricipalSubject = SecurityUtils.getSubject();
    	ShipperMember pricipalUser = (ShipperMember) pricipalSubject.getPrincipal(); 
    	mav.addObject("memberRecordDate", finaceMemberRecordService.listAsWebsite(jqPager, finaceMemberRecordQueryDTO,pricipalUser.getMemberId(),p)); 
    	return mav;
    }
     
    //登录密码密码修改页
    @RequestMapping(value="changeMemberPassword.htm")
    private Object intoMemberChangePassword(){
    	return "member_mgr/memberChangePassword";
    }
    
   //交易密码修改页面
   @RequestMapping(value="changeChargePassword.htm")
   private Object intoChargePassword(){
	   return "member_mgr/memberChangeCharge";
   }
}

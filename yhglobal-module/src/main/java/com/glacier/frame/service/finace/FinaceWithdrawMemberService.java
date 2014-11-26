/**
 * @Title: FinaceRechargeMemberServices.java 
 * @Package com.glacier.frame.service.finace 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-10-28 上午9:54:48 
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
package com.glacier.frame.service.finace;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.finace.FinaceMemberRecordMapper;
import com.glacier.frame.dao.finace.FinaceWithdrawMemberMapper;
import com.glacier.frame.dao.finace.FinaceWithdrawSetMemberMapper;
import com.glacier.frame.dao.finace.FinanceMemberMapper;
import com.glacier.frame.dao.member.ShipperMemberTokenMapper;
import com.glacier.frame.dao.system.UserMapper;
import com.glacier.frame.dto.query.finace.FinaceWithdrawMemberQueryDTO;
import com.glacier.frame.entity.finace.FinaceWithdrawMember;
import com.glacier.frame.entity.finace.FinaceWithdrawMemberExample;
import com.glacier.frame.entity.finace.FinaceWithdrawMemberExample.Criteria;
import com.glacier.frame.entity.finace.FinaceMemberRecord;
import com.glacier.frame.entity.finace.FinaceWithdrawSetMember;
import com.glacier.frame.entity.finace.FinaceWithdrawSetMemberExample;
import com.glacier.frame.entity.finace.FinanceMember;
import com.glacier.frame.entity.finace.FinanceMemberExample;
import com.glacier.frame.entity.member.ShipperMember;
import com.glacier.frame.entity.member.ShipperMemberToken;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.system.UserExample;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.security.util.Digests;
import com.glacier.security.util.Encodes;

/**
 * @ClassName: FinaceRechargeMemberServices 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-10-28 上午9:54:48
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class FinaceWithdrawMemberService {
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员记录信息) 
     * @param @param padvertisementr,finaceRechargeMemberQueryDTO,q
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
	@Autowired
	private FinaceWithdrawSetMemberMapper finaceWithdrawSetMemberMapper; 
	
	@Autowired
	private FinaceWithdrawMemberMapper finaceWithdrawMemberMapper;
	
	@Autowired
	private ShipperMemberTokenMapper shipperMemberTokenMapper;
	
	@Autowired
	private FinanceMemberMapper financeMemberMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private FinaceMemberRecordMapper finaceMemberRecordMapper;
	
	public Object listAsGrid(JqPager jqPager, FinaceWithdrawMemberQueryDTO finaceWithdrawMemberQueryDTO, String q) {
	    JqGridReturn returnResult = new JqGridReturn();
	    FinaceWithdrawMemberExample finaceWithdrawMemberExample = new FinaceWithdrawMemberExample();
	    Criteria queryCriteria = finaceWithdrawMemberExample.createCriteria();
	    finaceWithdrawMemberQueryDTO.setQueryCondition(queryCriteria, q);
	    if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
	    	finaceWithdrawMemberExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
	    	finaceWithdrawMemberExample.setLimitEnd(jqPager.getRows());
	    }
	    if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
	    	finaceWithdrawMemberExample.setOrderByClause(jqPager.getOrderBy("temp_finace_withdraw_member_"));
	    }
	    List<FinaceWithdrawMember>  finaceWithdrawMembers = finaceWithdrawMemberMapper.selectByExample(finaceWithdrawMemberExample); // 查询所有广告列表
	    int total = finaceWithdrawMemberMapper.countByExample(finaceWithdrawMemberExample); // 查询总页数
	    returnResult.setRows(finaceWithdrawMembers);
	    returnResult.setTotal(total);
	    return returnResult;// 返回ExtGrid表
	 }
	
	/**
	 * @Title: getFinaceWithdrawMemberPro 
	 * @Description: TODO(会员提现记录) 
	 * @param @param withdrawId
	 * @param @return    设定文件 
	 * @return Object    返回记录 
	 * @throws
	 */
	public Object getFinaceWithdrawMemberPro(String withdrawId){
      return finaceWithdrawMemberMapper.selectByPrimaryKey(withdrawId); 
	}
	
     /**
	 * @Title: auditRechargeMember 
	 * @Description: TODO(审核会员充值记录) 
	 * @param @param finaceRechargeMember
	 * @param @return    设定文件 
	 * @return Object    返回记录 
	 * @throws
	 */
	@Transactional(readOnly = false)
	public Object auditWithdrawMember(FinaceWithdrawMember finaceWithdrawMember) {
	    JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
	    if(finaceWithdrawMember.getAuditState().equals("authstr")){
	    	 returnResult.setMsg("无效的操作，请选择是否通过！！"); 
	         return returnResult; 
	    } 
	    int count = 0;
	    Subject pricipalSubject = SecurityUtils.getSubject();
	    User pricipalUser = (User) pricipalSubject.getPrincipal();
	    finaceWithdrawMember.setAuditor(pricipalUser.getUserId());
	    finaceWithdrawMember.setAuditTime(new Date());
	    finaceWithdrawMember.setUpdater(pricipalUser.getUserId());
	    finaceWithdrawMember.setUpdateTime(new Date());
	    count = finaceWithdrawMemberMapper.updateByPrimaryKeySelective(finaceWithdrawMember);
	    if (count == 1) {
	    	if((Integer)updateFinaceMember(finaceWithdrawMember.getWithdrawId())>0){
	    		returnResult.setSuccess(true);
		        returnResult.setMsg("充值记录审核操作成功");
	    	}else{
	    		returnResult.setSuccess(false);
		        returnResult.setMsg("充值记录审核操作失败，请联系管理员!");		
	    	}
	    } else {
	        returnResult.setMsg("发生未知错误，充值记录审核操作失败!");
	    }
	    return returnResult;
	}
	
	/**
	 * @Title: auditRechargeMember 
	 * @Description: TODO(审核会员充值记录) 
	 * @param @param finaceRechargeMember
	 * @param @return    设定文件 
	 * @return Object    返回记录 
	 * @throws
	 */
	
	 /**
	  * 加密方式
	  */
	  public static final String HASH_ALGORITHM = "SHA-1";
 
     /**
      * 计算次数
      */
	 public static final int HASH_INTERATIONS = 1024;
	
	 /**
	  * 盐值长度
	  */
	 public static final int SALT_SIZE = 1024;
	  
	  @Transactional(readOnly = false)
	  public Object addWithdraw(FinaceWithdrawMember  finaceWithdrawMember,String tradersPassword, String bankCardId,int mobile_code,int mobile_true){
	   Subject pricipalSubject = SecurityUtils.getSubject();//获取当前认证用户
	   ShipperMember pricipalMember = (ShipperMember) pricipalSubject.getPrincipal();
	   JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
	   // 验证会员真正的交易密码是否等于输入的交易密码 
	   ShipperMemberToken mt = shipperMemberTokenMapper.selectByPrimaryKey(pricipalMember.getMemberId());//通过memberId获取memberToken
	   //将前台传来的密码进行加密，
	   byte[] salt = Encodes.decodeHex(mt.getTradersSalt());
	   byte[] hashPassword = Digests.sha1(tradersPassword.getBytes(), salt, HASH_INTERATIONS);
	   String encodeHexPwd = Encodes.encodeHex(hashPassword);
	   if(!(mt.getTradersPassword()).equals(encodeHexPwd)){
		   returnResult.setMsg("交易密码错误，请重新输入");
           return returnResult;   
	   }
	   if(mobile_code!=mobile_true){
      	 returnResult.setMsg("验证码输入错误，请重新输入");
      	 return returnResult;
       }
	   //根据提现会员Id找到该会员的会员财务信息记录
	   FinanceMemberExample financeMemberExample=new FinanceMemberExample();
	   financeMemberExample.createCriteria().andMemberIdEqualTo(pricipalMember.getMemberId());
	   FinanceMember financeMember=financeMemberMapper.selectByExample(financeMemberExample).get(0);
	   
	   //提现总金额不能小于100或者大于可用金额 
       if(finaceWithdrawMember.getWithdrawMoney().compareTo(new BigDecimal(100))==-1||financeMember.getMrechageRemain().compareTo(finaceWithdrawMember.getWithdrawMoney())==-1){
       	    returnResult.setMsg("提现金额不能低于￥100，且不能大于可用余额");
  		    return returnResult;
       } 
       
	   //获取管理员
	   UserExample useExample=new UserExample();
	   useExample.createCriteria().andBuiltinEqualTo("admin");
	   User user=userMapper.selectByExample(useExample).get(0);
       
		 //默认比列收费
       FinaceWithdrawSetMemberExample finaceWithdrawSetMemberExample =new FinaceWithdrawSetMemberExample(); 
       finaceWithdrawSetMemberExample.createCriteria().andFeeWayEqualTo("proportion");
       FinaceWithdrawSetMember financeWithdrawSet=finaceWithdrawSetMemberMapper.selectByExample(finaceWithdrawSetMemberExample).get(0);
       finaceWithdrawMember.setChargeMoney(financeMember.getMrechageRemain().multiply(financeWithdrawSet.getWithdrawRate()));
       finaceWithdrawMember.setWithdrawReallyMoney(financeMember.getMrechageRemain().subtract(finaceWithdrawMember.getChargeMoney()));
       
       //构建提现对象
       finaceWithdrawMember.setWithdrawId(RandomGUID.getRandomGUID());
       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmm");
       finaceWithdrawMember.setWithdrawCode("WITHDRAW"+ "_" + dateFormat.format(new Date()));
       finaceWithdrawMember.setMemberId(pricipalMember.getMemberId());
       finaceWithdrawMember.setWithdrawName("会员提现");
       finaceWithdrawMember.setRemark("会员提现审核");
       finaceWithdrawMember.setAuditState("authstr");
       finaceWithdrawMember.setAuditOpinion("会员提现");
       finaceWithdrawMember.setAuditTime(new Date());
       finaceWithdrawMember.setAuditor(user.getUserId());
       finaceWithdrawMember.setCreater(user.getUserId());
       finaceWithdrawMember.setCreateTime(new Date());
       finaceWithdrawMember.setUpdater(user.getUserId());
       finaceWithdrawMember.setUpdateTime(new Date());
       int count = finaceWithdrawMemberMapper.insert(finaceWithdrawMember);
       if (count == 1) {
    	   returnResult.setSuccess(true);
           returnResult.setMsg("会员【" +pricipalMember.getMemberName()+"】 提现信息提交成功，等待审核中");
       } else {
           returnResult.setMsg("发生未知错误，会员提现记录信息保存失败");
       }
       return returnResult;	 
	  }
	
	  //会员信息更新
	
    @Transactional(readOnly=false)
	public Object updateFinaceMember(String id){
		int count=0;
		if(id!=null){
			
			//会员资金信息更新
			FinaceWithdrawMember finaceWithdrawMember=(FinaceWithdrawMember) getFinaceWithdrawMemberPro(id);
			FinanceMemberExample financeMemberExample=new FinanceMemberExample();
			financeMemberExample.createCriteria().andMemberIdEqualTo(finaceWithdrawMember.getMemberId());
			FinanceMember financeMember=financeMemberMapper.selectByExample(financeMemberExample).get(0);
			BigDecimal memberRechargeAdd=financeMember.getMrechageRemain();
			BigDecimal memberRechargeMoney=finaceWithdrawMember.getWithdrawMoney().add(finaceWithdrawMember.getChargeMoney());
			financeMember.setMrechageRemain(memberRechargeAdd.subtract(memberRechargeMoney));
		    count=financeMemberMapper.updateByPrimaryKeySelective(financeMember);
		    
		    //获取管理员
		    UserExample useExample=new UserExample();
		    useExample.createCriteria().andBuiltinEqualTo("admin");
		    User user=userMapper.selectByExample(useExample).get(0);
		    
		  //会员资金信息插入
		    FinaceMemberRecord finaceMemberRecord=new FinaceMemberRecord();
		    finaceMemberRecord.setTransactionMemberId(RandomGUID.getRandomGUID());
		    finaceMemberRecord.setFinaceMemberId(financeMember.getMrechageId());
		    finaceMemberRecord.setMemberId(finaceWithdrawMember.getMemberId());
		    finaceMemberRecord.setTransactionTarget("系统账号");
		    finaceMemberRecord.setTransactionType("提现");
		    finaceMemberRecord.setEarningMoney(new BigDecimal(0));
		    finaceMemberRecord.setExpendMoney(finaceWithdrawMember.getWithdrawMoney());
		    finaceMemberRecord.setUsableMoney(financeMember.getMrechageAdd());
		    finaceMemberRecord.setFrozenMoney(new BigDecimal(0));
		    finaceMemberRecord.setCollectingMoney(new BigDecimal(0));
		    finaceMemberRecord.setRefundMoney(new BigDecimal(0));
		    finaceMemberRecord.setAmount(financeMember.getMrechageAdd());
		    finaceMemberRecord.setRemark("提现");
		    finaceMemberRecord.setCreater(user.getUserId());
		    finaceMemberRecord.setCreateTime(new Date());
		    finaceMemberRecord.setUpdater(user.getUserId());
		    finaceMemberRecord.setUpdateTime(new Date());
		    
		    count+=finaceMemberRecordMapper.insert(finaceMemberRecord);
		    
		    
		}
		return count;
	}
		
}

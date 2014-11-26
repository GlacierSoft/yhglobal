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
import com.glacier.frame.dao.finace.FinaceRechargeMemberMapper;
import com.glacier.frame.dao.finace.FinaceRechargeSetMemberMapper;
import com.glacier.frame.dao.finace.FinanceMemberMapper;
import com.glacier.frame.dao.system.UserMapper;
import com.glacier.frame.dto.query.finace.FinaceRechargeMemberQueryDTO;
import com.glacier.frame.entity.finace.FinaceMemberRecord;
import com.glacier.frame.entity.finace.FinaceRechargeMember;
import com.glacier.frame.entity.finace.FinaceRechargeMemberExample;
import com.glacier.frame.entity.finace.FinanceMemberExample;
import com.glacier.frame.entity.finace.FinaceRechargeMemberExample.Criteria;
import com.glacier.frame.entity.finace.FinaceRechargeSetMember;
import com.glacier.frame.entity.finace.FinanceMember;
import com.glacier.frame.entity.member.ShipperMember;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.system.UserExample;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
/**
 * @ClassName: FinaceRechargeMemberServices 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-10-28 上午9:54:48
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class FinaceRechargeMemberService {
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员记录信息) 
     * @param @param padvertisementr,finaceRechargeMemberQueryDTO,q
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
	@Autowired
	private FinaceRechargeMemberMapper finaceRechargeMemberMapper;
	
	@Autowired
	private FinaceRechargeSetMemberMapper finaceRechargeSetMemberMapper;
	
	@Autowired
	private FinanceMemberMapper financeMemberMapper; 
	
	@Autowired
	private FinaceMemberRecordMapper finaceMemberRecordMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	public Object listAsGrid(JqPager jqPager, FinaceRechargeMemberQueryDTO finaceRechargeMemberQueryDTO, String q) {
	    JqGridReturn returnResult = new JqGridReturn();
	    FinaceRechargeMemberExample finaceRechargeMemberExample = new FinaceRechargeMemberExample();
	    Criteria queryCriteria = finaceRechargeMemberExample.createCriteria();
	    finaceRechargeMemberQueryDTO.setQueryCondition(queryCriteria, q);
	    if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
	    	finaceRechargeMemberExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
	    	finaceRechargeMemberExample.setLimitEnd(jqPager.getRows());
	    }
	    if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
	    	finaceRechargeMemberExample.setOrderByClause(jqPager.getOrderBy("temp_finace_recharge_member_"));
	    }
	    List<FinaceRechargeMember>  finaceRechargeMembers = finaceRechargeMemberMapper.selectByExample(finaceRechargeMemberExample); // 查询所有广告列表
	    int total = finaceRechargeMemberMapper.countByExample(finaceRechargeMemberExample); // 查询总页数
	    returnResult.setRows(finaceRechargeMembers);
	    returnResult.setTotal(total);
	    return returnResult;// 返回ExtGrid表
	 }
	
	
	/**
	 * @Title: getFinaceRechargeMemberPro 
	 * @Description: TODO(会员充值记录对象) 
	 * @param @param rechargeId
	 * @param @return    设定文件 
	 * @return Object    返回记录 
	 * @throws
	 */
	@Transactional(readOnly=false)
	public Object updateFinaceMember(String id){
		int count=0;
		if(id!=null){
			//获取管理员
		    UserExample useExample=new UserExample();
		    useExample.createCriteria().andBuiltinEqualTo("admin");
		    User user=userMapper.selectByExample(useExample).get(0);
			
			//会员资金信息更新
			FinaceRechargeMember  finaceRechargeMember=(FinaceRechargeMember) getFinaceRechargeMemberPro(id);
			FinanceMemberExample financeMemberExample=new FinanceMemberExample();
			financeMemberExample.createCriteria().andMemberIdEqualTo(finaceRechargeMember.getMemberId());
			FinanceMember financeMember=financeMemberMapper.selectByExample(financeMemberExample).get(0);
			BigDecimal memberRechargeAdd=financeMember.getMrechageAdd();
			financeMember.setMrechageAdd(memberRechargeAdd.add(finaceRechargeMember.getReceiveMoney()));
			financeMember.setMrechageRemain(memberRechargeAdd.add(finaceRechargeMember.getReceiveMoney()));
		    count=financeMemberMapper.updateByPrimaryKeySelective(financeMember);
		
		    //会员资金信息插入
		    FinaceMemberRecord finaceMemberRecord=new FinaceMemberRecord();
		    finaceMemberRecord.setTransactionMemberId(RandomGUID.getRandomGUID());
		    finaceMemberRecord.setFinaceMemberId(financeMember.getMrechageId());
		    finaceMemberRecord.setMemberId(finaceRechargeMember.getMemberId());
		    finaceMemberRecord.setTransactionTarget("系统账号");
		    finaceMemberRecord.setTransactionType("充值");
		    finaceMemberRecord.setEarningMoney(finaceRechargeMember.getReceiveMoney());
		    finaceMemberRecord.setExpendMoney(new BigDecimal(0));
		    finaceMemberRecord.setUsableMoney(financeMember.getMrechageAdd());
		    finaceMemberRecord.setFrozenMoney(new BigDecimal(0));
		    finaceMemberRecord.setCollectingMoney(new BigDecimal(0));
		    finaceMemberRecord.setRefundMoney(new BigDecimal(0));
		    finaceMemberRecord.setAmount(financeMember.getMrechageAdd());
		    finaceMemberRecord.setRemark("充值");
		    finaceMemberRecord.setCreater(user.getUserId());
		    finaceMemberRecord.setCreateTime(new Date());
		    finaceMemberRecord.setUpdater(user.getUserId());
		    finaceMemberRecord.setUpdateTime(new Date());
		    
		    count+=finaceMemberRecordMapper.insert(finaceMemberRecord);
		
		}
		return count;
	}
	
	/**
	 * @Title: getFinaceRechargeMemberPro 
	 * @Description: TODO(会员充值记录对象) 
	 * @param @param rechargeId
	 * @param @return    设定文件 
	 * @return Object    返回记录 
	 * @throws
	 */
	public Object getFinaceRechargeMemberPro(String rechargeId){
      return finaceRechargeMemberMapper.selectByPrimaryKey(rechargeId); 
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
	public Object auditRechargeMember(FinaceRechargeMember finaceRechargeMember) {
	    JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
	    Subject pricipalSubject = SecurityUtils.getSubject();
	    User pricipalUser = (User) pricipalSubject.getPrincipal();
	    if(finaceRechargeMember.getAuditState().equals("authstr")){
	    	 returnResult.setMsg("无效的操作，请选择是否通过！！"); 
	         return returnResult; 
	    } 
	    int count = 0;
	    finaceRechargeMember.setAuditor(pricipalUser.getUserId());
	    finaceRechargeMember.setAuditTime(new Date());
	    finaceRechargeMember.setUpdater(pricipalUser.getUserId());
	    finaceRechargeMember.setUpdateTime(new Date());
	    count = finaceRechargeMemberMapper.updateByPrimaryKeySelective(finaceRechargeMember);
	    if (count == 1) {
	    	if((Integer)updateFinaceMember(finaceRechargeMember.getRechargeId())>0){
	    		returnResult.setSuccess(true);
		        returnResult.setMsg("充值记录审核操作成功");	
	    	}else{
	    		returnResult.setSuccess(true);
		        returnResult.setMsg("充值记录审核操作失败，请尽快联系管理员!");
	    	}
	    } else {
	        returnResult.setMsg("发生未知错误，充值记录审核操作失败");
	    }
	    return returnResult;
	}

	/**
     * @Title: addRecharge 
     * @Description: TODO(新增会员充值记录) 
     * @param @param finaceRechargeMember
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
	@Transactional(readOnly = false)
	public Object addRecharge(FinaceRechargeMember finaceRechargeMember) {
		 JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		 Subject pricipalSubject = SecurityUtils.getSubject();//获取当前认证用户
	     ShipperMember pricipalMember = (ShipperMember) pricipalSubject.getPrincipal();
	     finaceRechargeMember.setRechargeId(RandomGUID.getRandomGUID());
	     finaceRechargeMember.setMemberId(pricipalMember.getMemberId());
	     // 赋值于充值记录的充值流水号
	     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmm");
	     finaceRechargeMember.setRechargeCode("RECHARGE"+ "_" + dateFormat.format(new Date()));
	     finaceRechargeMember.setAuditState("authstr"); 
	     //获取该充值设置的取费方式进行计算该充值的费率和手续费
	     FinaceRechargeSetMember finaceRechargeSetMember=new FinaceRechargeSetMember();
	     finaceRechargeSetMember=finaceRechargeSetMemberMapper.selectByPrimaryKey(finaceRechargeMember.getRechargeSetId());
	     String feeWay=finaceRechargeSetMember.getFeeWay();
	     if (null != feeWay && StringUtils.isNotBlank(feeWay)) {
        	 if ("directcost".equals(feeWay)) {//直接收费
        		 finaceRechargeMember.setChargeMoney(finaceRechargeSetMember.getRechargeMoney());//手续费即为充值设置的取值
             }else {//比例收费
            	 finaceRechargeMember.setChargeMoney(finaceRechargeMember.getRechargeMoney().multiply(finaceRechargeSetMember.getRechargeRate()));//手续费=总额*费率
             }
        }
	    //获取管理员
	     UserExample useExample=new UserExample();
	     useExample.createCriteria().andBuiltinEqualTo("admin");
	     User user=userMapper.selectByExample(useExample).get(0);
	     
	    //赋值操作 
	    finaceRechargeMember.setReceiveMoney(finaceRechargeMember.getRechargeMoney().subtract(finaceRechargeMember.getChargeMoney()));//到帐金额=总金额-手续费
	    finaceRechargeMember.setSaveMoney(new BigDecimal(0.000));
	    finaceRechargeMember.setReturnMoney(new BigDecimal(0.000));
	    finaceRechargeMember.setRemark("充值成功");
	    finaceRechargeMember.setAuditOpinion("会员充值");
	    finaceRechargeMember.setAuditor(user.getUserId());
	    finaceRechargeMember.setAuditTime(new Date());
	    finaceRechargeMember.setCreater(user.getUserId());
    	finaceRechargeMember.setCreateTime(new Date());
    	finaceRechargeMember.setUpdater(user.getUserId());
    	finaceRechargeMember.setUpdateTime(new Date());
    	//进行充值设置类型判断，如果是线上充值，系统自动进行审核，如果是线下充值，则需要人工手动进行审核
        if (null != finaceRechargeSetMember.getRechargeSetType() && StringUtils.isNotBlank(finaceRechargeSetMember.getRechargeSetType())) {
            if ("online".equals(finaceRechargeSetMember.getRechargeSetType())) {
            	finaceRechargeMember.setAuditState("pass");
            	finaceRechargeMember.setRemark("充值成功,系统自动审核通过");
            	finaceRechargeMember.setAuditor(user.getUserId());
            	finaceRechargeMember.setAuditTime(new Date());
            }
        }
        int count = finaceRechargeMemberMapper.insert(finaceRechargeMember);
        if (count == 1) {
        	//判断如果该充值记录通过审核，系统则会自动生成一条会员资金记录明细信息、平台资金记录明细信息，同时还会自动更新该会员的资金记录信息和平台的资金记录信息
        	if (null != finaceRechargeMember.getAuditState() && StringUtils.isNotBlank(finaceRechargeMember.getAuditState())) {
        		if ("pass".equals(finaceRechargeMember.getAuditState())) {//状态为通过的时候所执行的方法
        			 if((Integer)updateFinaceMember(finaceRechargeMember.getRechargeId())>0){
        				 returnResult.setSuccess(true);
                         returnResult.setMsg("充值成功，请在交易记录中查看充值信息!");
        			 }else{
        				 returnResult.setSuccess(false);
                         returnResult.setMsg("充值操作失败，请尽快联系管理员!");
        			 }
        		 }else if("authstr".equals(finaceRechargeMember.getAuditState())){//状态为待审核时进行的方法
        			returnResult.setSuccess(true);
                    returnResult.setMsg("所选的充值方式为线下充值,请耐心等待审核");
        		}
        	} 
         } else {
            returnResult.setMsg("发生未知错误，会员充值记录信息保存失败");
        }
        return returnResult;
	}
	
}

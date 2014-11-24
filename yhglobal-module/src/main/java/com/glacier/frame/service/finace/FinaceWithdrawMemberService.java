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

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.frame.dao.finace.FinaceWithdrawMemberMapper;
import com.glacier.frame.dao.member.ShipperMemberTokenMapper;
import com.glacier.frame.dto.query.finace.FinaceWithdrawMemberQueryDTO;
import com.glacier.frame.entity.finace.FinaceRechargeMember;
import com.glacier.frame.entity.finace.FinaceWithdrawMember;
import com.glacier.frame.entity.finace.FinaceWithdrawMemberExample;
import com.glacier.frame.entity.finace.FinaceWithdrawMemberExample.Criteria;
import com.glacier.frame.entity.member.ShipperMember;
import com.glacier.frame.entity.member.ShipperMemberToken;
import com.glacier.frame.entity.system.User;
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
	private FinaceWithdrawMemberMapper finaceWithdrawMemberMapper;
	
	@Autowired
	private ShipperMemberTokenMapper shipperMemberTokenMapper;
	
	
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
	        returnResult.setSuccess(true);
	        returnResult.setMsg("充值记录审核操作成功");
	    } else {
	        returnResult.setMsg("发生未知错误，充值记录审核操作失败");
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
	  public Object addWithdraw(FinaceWithdrawMember finaceWithdrawMember){
		 Subject pricipalSubject = SecurityUtils.getSubject();//获取当前认证用户
		 ShipperMember pricipalMember = (ShipperMember) pricipalSubject.getPrincipal();
			JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
	    	// 验证会员真正的交易密码是否等于输入的交易密码 
	    	ShipperMemberToken mt = shipperMemberTokenMapper.selectByPrimaryKey(pricipalMember.getMemberId());//通过memberId获取memberToken
	        //将前台传来的密码进行加密，
	    	byte[] salt = Encodes.decodeHex(mt.getTradersSalt());
	    	byte[] hashPassword = Digests.sha1(pricipalMember.getTradersPassword().getBytes(), salt, HASH_INTERATIONS);
	    	String encodeHexPwd = Encodes.encodeHex(hashPassword);
	      
		 return null;	 
	  }
	
}

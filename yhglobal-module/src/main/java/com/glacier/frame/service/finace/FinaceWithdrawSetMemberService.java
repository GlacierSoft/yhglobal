/**
 * @Title: FinaceRechargeMemberSetService.java 
 * @Package com.glacier.frame.service.finace 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-10-28 下午4:20:14 
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

import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.finace.FinaceWithdrawMemberMapper;
import com.glacier.frame.dao.finace.FinaceWithdrawSetMemberMapper;
import com.glacier.frame.dto.query.finace.FinaceWithdrawSetMemberQueryDTO;
import com.glacier.frame.entity.finace.FinaceWithdrawMemberExample;
import com.glacier.frame.entity.finace.FinaceWithdrawSetMember;
import com.glacier.frame.entity.finace.FinaceWithdrawSetMemberExample;
import com.glacier.frame.entity.finace.FinaceWithdrawSetMemberExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;



/**
 * @ClassName: FinaceWithdrawSetMemberService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-10-28 下午4:20:14
 */

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class FinaceWithdrawSetMemberService {

	
	@Autowired
	private   FinaceWithdrawSetMemberMapper finaceWithdrawSetMemberMapper;
	
	@Autowired
	private FinaceWithdrawMemberMapper finaceWithdrawMemberMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(设置信息展示) 
     * @param @param jqPager，FinaceRechargeSetMemberQueryDTO
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
	public Object listAsGrid(JqPager jqPager, FinaceWithdrawSetMemberQueryDTO finaceWithdrawSetMemberQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        FinaceWithdrawSetMemberExample finaceWithdrawSetMemberExample = new FinaceWithdrawSetMemberExample(); 
        Criteria queryCriteria = finaceWithdrawSetMemberExample.createCriteria();
        finaceWithdrawSetMemberQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	finaceWithdrawSetMemberExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	finaceWithdrawSetMemberExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	finaceWithdrawSetMemberExample.setOrderByClause(jqPager.getOrderBy("temp_finace_withdraw_set_member_"));
        }
        List<FinaceWithdrawSetMember>  finaceRechargeSetMembers = finaceWithdrawSetMemberMapper.selectByExample(finaceWithdrawSetMemberExample); // 查询所有会员列表
        int total = finaceWithdrawSetMemberMapper.countByExample(finaceWithdrawSetMemberExample); // 查询总页数
        returnResult.setRows(finaceRechargeSetMembers);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
	
	public Object getFinaceRechargeSetMemberPro(String withdrawSetId){
		return finaceWithdrawSetMemberMapper.selectByPrimaryKey(withdrawSetId); 
	}
	
	
	 /**
     * @Title: auditRechargeSetMember 
     * @Description: TODO(审核充值类型) 
     * @param @param rechargeSetCarrier
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object auditWithdrawSetMember(FinaceWithdrawSetMember finaceWithdrawSetMember) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
        if(finaceWithdrawSetMember.getAuditState().equals("authstr")){
        	 returnResult.setMsg("无效的操作，请选择是否通过！！"); 
             return returnResult; 
        } 
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        finaceWithdrawSetMember.setAuditor(pricipalUser.getUserId());
        finaceWithdrawSetMember.setAuditTime(new Date());
        finaceWithdrawSetMember.setUpdater(pricipalUser.getUserId());
        finaceWithdrawSetMember.setUpdateTime(new Date());
        count = finaceWithdrawSetMemberMapper.updateByPrimaryKeySelective(finaceWithdrawSetMember);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("充值类型审核操作成功");
        } else {
            returnResult.setMsg("发生未知错误，提现类型审核操作失败");
        }
        return returnResult;
    }
	
    
	 /**
     * @Title: delFinaceRechargeSetMember 
     * @Description: TODO(删除设置信息) 
     * @param @param rechargeSetIds
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
    @Transactional(readOnly = false)
    public Object delFinaceRechargeSetMember(List<String> withdrawSetIds) {
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int rightNumber = 0;
        boolean flag=true;
        String result_str="";
        if (withdrawSetIds.size() > 0) {
            for(int i=0;i<withdrawSetIds.size();i++){
            	//判断是否关联
            	FinaceWithdrawMemberExample finaceWithdrawMemberExample=new FinaceWithdrawMemberExample(); 
            	finaceWithdrawMemberExample.createCriteria().andWithdrawSetIdEqualTo(withdrawSetIds.get(i));
            	int count=finaceWithdrawMemberMapper.countByExample(finaceWithdrawMemberExample);
            	if(count<=0){
            		FinaceWithdrawSetMemberExample finaceWithdrawSetMemberExample = new FinaceWithdrawSetMemberExample();
            		finaceWithdrawSetMemberExample.createCriteria().andWithdrawSetIdEqualTo(withdrawSetIds.get(i));
                	int number = finaceWithdrawSetMemberMapper.deleteByExample(finaceWithdrawSetMemberExample);
        	        rightNumber += number;// 删除成功数据行数量记录 
            	}else{
            		if(flag){
            			result_str="数据行第<font style='color:red;font-weight: bold;'>【"+ (i+1) +"】</font>条记录与【会员提现信息】存在<font style='color:red;font-weight: bold;'>【"+ count + "】</font>条依赖关系," + "须删除【会员提现记录】中<font style='color:red;font-weight: bold;'>【"+ count + "】</font>条依赖数据    ";
    					flag = false;
            		}
            	}
            }
        }
        if(rightNumber>0){
        	returnResult.setMsg("成功删除<font style='color:red;font-weight: bold;'>【"+ rightNumber +"】</font> 条会员充值信息数据!"+result_str);
			returnResult.setSuccess(true);
        }else{
        	returnResult.setMsg("发生未知错误，会员提现信息删除失败!"+result_str);
			returnResult.setSuccess(false);
        }
        return returnResult;
    }
    
    
    /**
     * @Title: addWithdrawSetMember 
     * @Description: TODO(新增会员提现类型) 
     * @param @param rechargeSetMember
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addWithdrawSetMember(FinaceWithdrawSetMember finaceWithdrawSetMember) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        // 防止承运商充值类型牌号重复
        FinaceWithdrawSetMemberExample finaceWithdrawSetMemberExample = new FinaceWithdrawSetMemberExample();
        finaceWithdrawSetMemberExample.createCriteria().andWithdrawNameEqualTo(finaceWithdrawSetMember.getWithdrawName());
        count=finaceWithdrawSetMemberMapper.countByExample(finaceWithdrawSetMemberExample);
        if (count > 0) {
            returnResult.setMsg("会员充值类型名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        //防止无限添加
        FinaceWithdrawSetMemberExample FinaceWithdrawSetMemberExample_Second= new FinaceWithdrawSetMemberExample();
        FinaceWithdrawSetMemberExample_Second.createCriteria().andGradeIdEqualTo(finaceWithdrawSetMember.getGradeId());
        List<FinaceWithdrawSetMember> pro=finaceWithdrawSetMemberMapper.selectByExample(FinaceWithdrawSetMemberExample_Second);
        if(pro.size()>0&&pro!=null){
        	for(int i=0;i<pro.size();i++){
        		 FinaceWithdrawSetMember finaceWithdrawSetMember_TX=pro.get(i);
        		 if(finaceWithdrawSetMember_TX.getFeeWay().equals(finaceWithdrawSetMember.getFeeWay())){
        			 returnResult.setMsg("数据填写错误，会员提现类型信息已存在!");
             		 return returnResult;
        		 }
        	}
        	 
        }
        
        finaceWithdrawSetMember.setWithdrawSetId(RandomGUID.getRandomGUID());
        finaceWithdrawSetMember.setAuditState("authstr");
        finaceWithdrawSetMember.setAuditor(pricipalUser.getUserId());
        finaceWithdrawSetMember.setAuditTime(new Date());
        finaceWithdrawSetMember.setCreater(pricipalUser.getUserId());
        finaceWithdrawSetMember.setCreateTime(new Date());
        finaceWithdrawSetMember.setUpdater(pricipalUser.getUserId());
        finaceWithdrawSetMember.setUpdateTime(new Date());
        count = finaceWithdrawSetMemberMapper.insert(finaceWithdrawSetMember);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("会员提现类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，会员提现类型信息保存失败");
        }
        return returnResult;
        
    }
    
    /**
     * @Title: editRechargeSetMember 
     * @Description: TODO(修改会员提现设置) 
     * @param @param finaceRechargeSetMember
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editRechargeSetMember(FinaceWithdrawSetMember finaceWithdrawSetMember) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        FinaceWithdrawSetMemberExample finaceWithdrawSetMemberExample = new FinaceWithdrawSetMemberExample();
        int count = 0;
        // 防止承运商充值类型牌号重复
        finaceWithdrawSetMemberExample.createCriteria().andWithdrawNameEqualTo(finaceWithdrawSetMember.getWithdrawName()).andWithdrawSetIdNotEqualTo(finaceWithdrawSetMember.getWithdrawSetId());
        count = finaceWithdrawSetMemberMapper.countByExample(finaceWithdrawSetMemberExample);
        if (count > 0) {
            returnResult.setMsg("会员类型名称重复");
            return returnResult;
        }
      //根据ID获取承运商充值类型信息
        FinaceWithdrawSetMember finaceWithdrawSetMember_before= (FinaceWithdrawSetMember) getFinaceRechargeSetMemberPro(finaceWithdrawSetMember.getWithdrawSetId());
        finaceWithdrawSetMember.setAuditor(finaceWithdrawSetMember_before.getAuditor());
        finaceWithdrawSetMember.setAuditTime(new Date());
        finaceWithdrawSetMember.setAuditState(finaceWithdrawSetMember_before.getAuditState());
        finaceWithdrawSetMember.setCreater(finaceWithdrawSetMember_before.getCreater());
        finaceWithdrawSetMember.setCreateTime(finaceWithdrawSetMember_before.getCreateTime());
        finaceWithdrawSetMember.setUpdater(pricipalUser.getUserId());
        finaceWithdrawSetMember.setUpdateTime(new Date());
       
        count = finaceWithdrawSetMemberMapper.updateByPrimaryKey(finaceWithdrawSetMember);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("会员提现类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，会员提现类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: getWithdrawMemberNumByAuditState 
     * @Description: TODO(查找审核状态为审核中的会员提现设置的信息记录条数) 
     * @param  @param auditState
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    public Object getWithdrawMemberNumByAuditState(String auditState) {
        FinaceWithdrawSetMemberExample finaceWithdrawSetMemberExample = new FinaceWithdrawSetMemberExample();
        finaceWithdrawSetMemberExample.createCriteria().andAuditStateEqualTo(auditState);
        int withdrawMemberNum = finaceWithdrawSetMemberMapper.countByExample(finaceWithdrawSetMemberExample);
        return withdrawMemberNum;
    }
}
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
import com.glacier.frame.dao.finace.FinaceRechargeMemberMapper;
import com.glacier.frame.dao.finace.FinaceRechargeSetMemberMapper;
import com.glacier.frame.dto.query.finace.FinaceRechargeSetMemberQueryDTO;
import com.glacier.frame.entity.finace.FinaceRechargeMemberExample;
import com.glacier.frame.entity.finace.FinaceRechargeSetMember;
import com.glacier.frame.entity.finace.FinaceRechargeSetMemberExample;
import com.glacier.frame.entity.finace.FinaceRechargeSetMemberExample.Criteria;
import com.glacier.frame.entity.system.User;


import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName: FinaceRechargeMemberSetService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-10-28 下午4:20:14
 */

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class FinaceRechargeMemberSetService {
	
	@Autowired
	private   FinaceRechargeSetMemberMapper finaceRechargeSetMemberMapper;
	
	@Autowired
	private  FinaceRechargeMemberMapper finaceRechargeMemberMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(会员充值设置设置信息展示) 
     * @param @param jqPager，FinaceRechargeSetMemberQueryDTO
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
	public Object listAsGrid(JqPager jqPager, FinaceRechargeSetMemberQueryDTO finaceRechargeSetMemberQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        FinaceRechargeSetMemberExample finaceRechargeSetMemberExample = new FinaceRechargeSetMemberExample(); 
        Criteria queryCriteria = finaceRechargeSetMemberExample.createCriteria();
        finaceRechargeSetMemberQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	finaceRechargeSetMemberExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	finaceRechargeSetMemberExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	finaceRechargeSetMemberExample.setOrderByClause(jqPager.getOrderBy("temp_finace_recharge_set_member_"));
        }
        List<FinaceRechargeSetMember>  finaceRechargeSetMembers = finaceRechargeSetMemberMapper.selectByExample(finaceRechargeSetMemberExample); // 查询所有会员列表
        int total = finaceRechargeSetMemberMapper.countByExample(finaceRechargeSetMemberExample); // 查询总页数
        returnResult.setRows(finaceRechargeSetMembers);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
	
	 /**
     * @Title: listWebsite 
     * @Description: TODO(前台查找出“审核通过”的,且和该会员等级相匹配的所有充值设置列表) 
     * @param  @param 
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    public Object listWebsite() {
    	JqGridReturn returnResult = new JqGridReturn();
        FinaceRechargeSetMemberExample finaceRechargeSetMemberExample = new FinaceRechargeSetMemberExample(); 
        finaceRechargeSetMemberExample.createCriteria().andAuditStateEqualTo("pass");
        List<FinaceRechargeSetMember>  financeRechargeSets = finaceRechargeSetMemberMapper.selectByExample(finaceRechargeSetMemberExample); // 查询所有会员充值设置列表
        int total = finaceRechargeSetMemberMapper.countByExample(finaceRechargeSetMemberExample); // 查询总页数
        returnResult.setRows(financeRechargeSets);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
	
	/**
     * @Title: getFinaceRechargeSetMemberPro 
     * @Description: TODO(会员充值设置信息获取) 
     * @param @param rechargeId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
	public Object getFinaceRechargeSetMemberPro(String rechargeId){
      return finaceRechargeSetMemberMapper.selectByPrimaryKey(rechargeId); 
	}
	
	 /**
     * @Title: delFinaceRechargeSetMember 
     * @Description: TODO(会员充值设置信息删除) 
     * @param @param rechargeSetIds
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
    @Transactional(readOnly = false)
    public Object delFinaceRechargeSetMember(List<String> rechargeSetIds) {
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int rightNumber = 0;
        boolean flag=true;
        String result_str="";
        if (rechargeSetIds.size() > 0) {
            for(int i=0;i<rechargeSetIds.size();i++){
            	//判断是否关联
            	FinaceRechargeMemberExample finaceRechargeMemberExample=new FinaceRechargeMemberExample(); 
            	finaceRechargeMemberExample.createCriteria().andRechargeSetIdEqualTo(rechargeSetIds.get(i));
            	int count=finaceRechargeMemberMapper.countByExample(finaceRechargeMemberExample);
            	if(count<=0){
            		FinaceRechargeSetMemberExample finaceRechargeSetMemberExample = new FinaceRechargeSetMemberExample();
            		finaceRechargeSetMemberExample.createCriteria().andRechargeSetIdEqualTo(rechargeSetIds.get(i));
                	int number = finaceRechargeSetMemberMapper.deleteByExample(finaceRechargeSetMemberExample);
        	        rightNumber += number;// 删除成功数据行数量记录 
            	}else{
            		if(flag){
            			result_str="数据行第<font style='color:red;font-weight: bold;'>【"+ (i+1) +"】</font>条记录与【会员充值信息】存在<font style='color:red;font-weight: bold;'>【"+ count + "】</font>条依赖关系," + "须删除【会员充值记录】中<font style='color:red;font-weight: bold;'>【"+ count + "】</font>条依赖数据    ";
    					flag = false;
            		}
            	}
            }
        }
        if(rightNumber>0){
        	returnResult.setMsg("成功删除<font style='color:red;font-weight: bold;'>【"+ rightNumber +"】</font> 条会员充值信息数据!"+result_str);
			returnResult.setSuccess(true);
        }else{
        	returnResult.setMsg("发生未知错误，会员充值信息删除失败!"+result_str);
			returnResult.setSuccess(false);
        }
        return returnResult;
    }
	
    /**
     * @Title: auditRechargeSetMember 
     * @Description: TODO(会员充值类型信息审核) 
     * @param @param rechargeSetCarrier
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object auditRechargeSetMember(FinaceRechargeSetMember finaceRechargeSetMember) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
        if(finaceRechargeSetMember.getAuditState().equals("authstr")){
        	 returnResult.setMsg("无效的操作，请选择是否通过！！"); 
             return returnResult; 
        } 
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        finaceRechargeSetMember.setAuditor(pricipalUser.getUserId());
        finaceRechargeSetMember.setAuditTime(new Date());
        finaceRechargeSetMember.setUpdater(pricipalUser.getUserId());
        finaceRechargeSetMember.setUpdateTime(new Date());
        count = finaceRechargeSetMemberMapper.updateByPrimaryKeySelective(finaceRechargeSetMember);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("充值类型审核操作成功");
        } else {
            returnResult.setMsg("发生未知错误，充值类型审核操作失败");
        }
        return returnResult;
    }
    
    
    /**
     * @Title: editRechargeSetMember 
     * @Description: TODO(修改会员充值类型) 
     * @param @param finaceRechargeSetMember
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editRechargeSetMember(FinaceRechargeSetMember finaceRechargeSetMember) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        FinaceRechargeSetMemberExample finaceRechargeSetMemberExample = new FinaceRechargeSetMemberExample();
        int count = 0;
        // 防止会员充值类型名称重复
        finaceRechargeSetMemberExample.createCriteria().andRechargeSetNameEqualTo(finaceRechargeSetMember.getRechargeSetName()).andRechargeSetIdNotEqualTo(finaceRechargeSetMember.getRechargeSetId());
        count = finaceRechargeSetMemberMapper.countByExample(finaceRechargeSetMemberExample);
        if (count > 0) {
            returnResult.setMsg("会员充值类型名称重复");
            return returnResult;
        }
        //根据ID获取会员充值类型信息
        FinaceRechargeSetMember finaceRechargeSetMember_before= (FinaceRechargeSetMember) getFinaceRechargeSetMemberPro(finaceRechargeSetMember.getRechargeSetId());
        if(finaceRechargeSetMember_before.getAuditState().equals("pass"))
        	finaceRechargeSetMember.setAuditState("pass");
        else
        	finaceRechargeSetMember.setAuditState("authstr");
        count = finaceRechargeSetMemberMapper.updateByPrimaryKeySelective(finaceRechargeSetMember);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("会员充值类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，会员充值类型信息保存失败");
        }
        return returnResult;
    }
    
    
    /**
     * @Title: addRechargeSetMember 
     * @Description: TODO(新增会员充值类型) 
     * @param @param rechargeSetMember
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addRechargeSetMember(FinaceRechargeSetMember rechargeSetMember) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        // 防止会员充值类型名称重复
        FinaceRechargeSetMemberExample FinaceRechargeSetMemberExample = new FinaceRechargeSetMemberExample();
        FinaceRechargeSetMemberExample.createCriteria().andRechargeSetNameEqualTo(rechargeSetMember.getRechargeSetName());
        count = finaceRechargeSetMemberMapper.countByExample(FinaceRechargeSetMemberExample);
        if (count > 0) {
            returnResult.setMsg("会员充值类型名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        //防止无限添加
        FinaceRechargeSetMemberExample FinaceRechargeSetMemberExample_Second= new FinaceRechargeSetMemberExample();
        FinaceRechargeSetMemberExample_Second.createCriteria().andMemberGradeidEqualTo(rechargeSetMember.getMemberGradeid());
        List<FinaceRechargeSetMember> pro=finaceRechargeSetMemberMapper.selectByExample(FinaceRechargeSetMemberExample_Second);
        if(pro.size()>0&&pro!=null){
        	for(int i=0;i<pro.size();i++){
        		FinaceRechargeSetMember rechargeSetMember_way=pro.get(i);
            	if(rechargeSetMember_way.getFeeWay().equals(rechargeSetMember.getFeeWay())){
            		if(rechargeSetMember_way.getRechargeSetType().equals(rechargeSetMember.getRechargeSetType())){
            			returnResult.setMsg("数据填写错误，会员充值类型信息已存在!");
                		return returnResult;
            		}
            	}
        	}
        	
        }
        rechargeSetMember.setAuditState("authstr");
        rechargeSetMember.setAuditor(pricipalUser.getUserId());
        rechargeSetMember.setAuditTime(new Date());
        rechargeSetMember.setRechargeSetId(RandomGUID.getRandomGUID());
        rechargeSetMember.setCreater(pricipalUser.getUserId());
        rechargeSetMember.setCreateTime(new Date());
        rechargeSetMember.setUpdater(pricipalUser.getUserId());
        rechargeSetMember.setUpdateTime(new Date());
        count = finaceRechargeSetMemberMapper.insert(rechargeSetMember);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("会员充值类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，会员充值类型信息保存失败");
        }
        return returnResult;
    }
	
    /**
     * @Title: getRechargeSetMemberNumByAuditState 
     * @Description: TODO(查找审核状态为审核中的会员充值记录信息条数) 
     * @param  @param auditState
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    public Object getRechargeSetMemberNumByAuditState(String auditState) {
        FinaceRechargeSetMemberExample finaceRechargeSetMemberExample = new FinaceRechargeSetMemberExample();
        finaceRechargeSetMemberExample.createCriteria().andAuditStateEqualTo(auditState);
        int rechargeSetMemberNum = finaceRechargeSetMemberMapper.countByExample(finaceRechargeSetMemberExample);
        return rechargeSetMemberNum;
    }
}

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

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import com.glacier.frame.dao.finace.FinaceRechargeSetMemberMapper;
import com.glacier.frame.entity.finace.FinaceRechargeSetMember;
import com.glacier.frame.entity.finace.FinaceRechargeSetMemberExample;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;

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
	
	public Object listAsGrid(JqPager jqPager) {
		 JqGridReturn returnResult = new JqGridReturn();
		    FinaceRechargeSetMemberExample finaceRechargeSetMemberExample = new FinaceRechargeSetMemberExample();
		    if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
		    	finaceRechargeSetMemberExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
		    	finaceRechargeSetMemberExample.setLimitEnd(jqPager.getRows());
		    }
		    if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
		    	finaceRechargeSetMemberExample.setOrderByClause(jqPager.getOrderBy("temp_finace_recharge_set_member_"));
		    }																		
		    List<FinaceRechargeSetMember>  finaceRechargeSetMembers = finaceRechargeSetMemberMapper.selectByExample(finaceRechargeSetMemberExample); // 查询所有广告列表
		    int total = finaceRechargeSetMemberMapper.countByExample(finaceRechargeSetMemberExample); // 查询总页数
		    returnResult.setRows(finaceRechargeSetMembers);
		    returnResult.setTotal(total);
		    return returnResult;// 返回ExtGrid表
	 }
	
	public Object getFinaceRechargeSetMemberPro(String rechargeId){
      return finaceRechargeSetMemberMapper.selectByPrimaryKey(rechargeId); 
	}
}

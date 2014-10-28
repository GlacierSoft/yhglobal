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

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import com.glacier.frame.dao.finace.FinaceRechargeMemberMapper;
import com.glacier.frame.dto.query.finace.FinaceRechargeMemberQueryDTO;
import com.glacier.frame.entity.finace.FinaceRechargeMember;
import com.glacier.frame.entity.finace.FinaceRechargeMemberExample;
import com.glacier.frame.entity.finace.FinaceRechargeMemberExample.Criteria;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;

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
	
	
	public Object getFinaceRechargeMemberPro(String rechargeId){
      return finaceRechargeMemberMapper.selectByPrimaryKey(rechargeId); 
	}
}

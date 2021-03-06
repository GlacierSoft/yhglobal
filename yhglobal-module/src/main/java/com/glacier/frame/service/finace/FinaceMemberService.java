/**
 * @Title: FinaceMemberService.java 
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

import com.glacier.frame.dao.finace.FinanceMemberMapper;
import com.glacier.frame.dto.query.finace.FinaceMemberQueryDTO;
import com.glacier.frame.entity.finace.FinanceMember;
import com.glacier.frame.entity.finace.FinanceMemberExample;
import com.glacier.frame.entity.finace.FinanceMemberExample.Criteria;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: FinaceMemberService 
 * @Description: TODO(会员资金信息) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-10-28 上午9:54:48
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class FinaceMemberService {
    
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员记录信息) 
     * @param @param padvertisementr,finaceRechargeMemberQueryDTO,q
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
	@Autowired
	private FinanceMemberMapper financeMemberMapper;
	
	 
	public Object listAsGrid(JqPager jqPager, FinaceMemberQueryDTO finaceMemberQueryDTO, String q) {
	    JqGridReturn returnResult = new JqGridReturn();
	    FinanceMemberExample financeMemberExample = new FinanceMemberExample();
	    Criteria queryCriteria = financeMemberExample.createCriteria();
	    finaceMemberQueryDTO.setQueryCondition(queryCriteria, q);
	    if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
	    	financeMemberExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
	    	financeMemberExample.setLimitEnd(jqPager.getRows());
	    }
	    if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
	    	financeMemberExample.setOrderByClause(jqPager.getOrderBy("temp_finance_member_"));
	    }
	    List<FinanceMember>  finaceWithdrawMembers = financeMemberMapper.selectByExample(financeMemberExample); // 查询所有广告列表
	    int total = financeMemberMapper.countByExample(financeMemberExample); // 查询总页数
	    returnResult.setRows(finaceWithdrawMembers);
	    returnResult.setTotal(total);
	    return returnResult;// 返回ExtGrid表
	 }
	
	/**
	 * @Title: getFinaceMemberPro 
	 * @Description: TODO(会员资金信息) 
	 * @param @param withdrawId
	 * @param @return    设定文件 
	 * @return Object    返回记录 
	 * @throws
	 */
	public Object getFinaceMemberPro(String mrechageId){
      return financeMemberMapper.selectByPrimaryKey(mrechageId); 
	}
	
	/**
	 * @Title: getFinaceMemberProMemberId 
	 * @Description: TODO(会员资金信息) 
	 * @param @param memberId
	 * @param @return    设定文件 
	 * @return Object    返回记录 
	 * @throws
	 */
	public FinanceMember getFinaceMemberProMemberId(String memberId){
      return financeMemberMapper.selectByMemberId(memberId);
	}
	
	/**
	 * @Title: getFinaceMemberPro 
	 * @Description: TODO(会员资金信息) 
	 * @param @param withdrawId
	 * @param @return    设定文件 
	 * @return Object    返回记录 
	 * @throws
	 */
	public Object getFinaceMemberProWebsite(String memberId){
		FinanceMemberExample financeMemberExample = new FinanceMemberExample();
		financeMemberExample.createCriteria().andMemberIdEqualTo(memberId);
		List<FinanceMember> financeMembers=financeMemberMapper.selectByExample(financeMemberExample);
		if(financeMembers.size()==0){
			return null;
		}else{
			return financeMembers.get(0);
		}
	}
}

/**
 * @Title: FinaceMemberDetailService.java 
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

import com.glacier.frame.dao.finace.FinanceMemberDetailMapper;

import com.glacier.frame.dto.query.finace.FinaceMemberDetailQueryDTO;
import com.glacier.frame.entity.finace.FinanceMemberDetail;
import com.glacier.frame.entity.finace.FinanceMemberDetailExample;
import com.glacier.frame.entity.finace.FinanceMemberDetailExample.Criteria;
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
public class FinaceMemberDetailService {
    
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员记录信息) 
     * @param @param padvertisementr,finaceRechargeMemberQueryDTO,q
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
	@Autowired
	private FinanceMemberDetailMapper financeMemberDetailMapper;
	
	 
	public Object listAsGrid(JqPager jqPager, FinaceMemberDetailQueryDTO finaceMemberDetailQueryDTO, String q) {
	    JqGridReturn returnResult = new JqGridReturn();
	    FinanceMemberDetailExample financeMemberDetailExample = new FinanceMemberDetailExample();
	    Criteria queryCriteria = financeMemberDetailExample.createCriteria();
	    finaceMemberDetailQueryDTO.setQueryCondition(queryCriteria, q);
	    if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
	    	financeMemberDetailExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
	    	financeMemberDetailExample.setLimitEnd(jqPager.getRows());
	    }
	    if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
	    	financeMemberDetailExample.setOrderByClause(jqPager.getOrderBy("temp_finance_member_detail_"));
	    }
	    List<FinanceMemberDetail>  finaceWithdrawMembers = financeMemberDetailMapper.selectByExample(financeMemberDetailExample); // 查询所有广告列表
	    int total = financeMemberDetailMapper.countByExample(financeMemberDetailExample); // 查询总页数
	    returnResult.setRows(finaceWithdrawMembers);
	    returnResult.setTotal(total);
	    return returnResult;// 返回ExtGrid表
	 }
	
	/**
	 * @Title: getFinaceMemberDetailPro 
	 * @Description: TODO(会员资金信息) 
	 * @param @param withdrawId
	 * @param @return    设定文件 
	 * @return Object    返回记录 
	 * @throws
	 */
	public Object getFinaceMemberDetailPro(String mdetailId){
      return financeMemberDetailMapper.selectByPrimaryKey(mdetailId); 
	}
	
}

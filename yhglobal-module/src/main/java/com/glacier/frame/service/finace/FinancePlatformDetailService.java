/**
 * @Title: FinancePlatformDetailService.java 
 * @Package com.glacier.frame.service.finace 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2014-10-31 上午10:00:52 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-10-31
				修改人：song.jundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：song.jundong 
 * 
 */
package com.glacier.frame.service.finace;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.frame.dao.finace.FinancePlatformDetailMapper;
import com.glacier.frame.dto.query.finace.FinPlatformDetailQueryDTO;
import com.glacier.frame.entity.finace.FinancePlatformDetail;
import com.glacier.frame.entity.finace.FinancePlatformDetailExample;
import com.glacier.frame.entity.finace.FinancePlatformDetailExample.Criteria;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;  

/**
 * @ClassName:  FinancePlatformDetailService
 * @Description: TODO(平台资金记录service)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-10-31  上午10:00:52
 */

@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class FinancePlatformDetailService {
	@Autowired
	private FinancePlatformDetailMapper financePlatformDetailMapper;
	 
	/**
	 * @Title: getTransaction 
	 * @Description: TODO(根据平台资金记录Id获取平台资金记录信息) 
	 * @param @param platformDetailId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getTransaction(String platformDetailId) {
    	FinancePlatformDetail financePlatformDetail = financePlatformDetailMapper.selectByPrimaryKey(platformDetailId);
        return financePlatformDetail;
    } 
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有平台资金记录信息) 
     * @param @param pFinancePlatformDetailr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
    public Object listAsGrid(FinPlatformDetailQueryDTO finPlatformDetailQueryDTO,JqPager pager) { 
        JqGridReturn returnResult = new JqGridReturn();
        FinancePlatformDetailExample financePlatformDetailExample = new FinancePlatformDetailExample();
         Criteria queryCriteria = financePlatformDetailExample.createCriteria();
        finPlatformDetailQueryDTO.setQueryConditions(queryCriteria); 
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	financePlatformDetailExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	financePlatformDetailExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	financePlatformDetailExample.setOrderByClause(pager.getOrderBy("temp_finance_platform_detail_"));
        }
        List<FinancePlatformDetail>  FinancePlatformDetails = financePlatformDetailMapper.selectByExample(financePlatformDetailExample); // 查询所有平台资金记录列表
        int total = financePlatformDetailMapper.countByExample(financePlatformDetailExample); // 查询总页数
        returnResult.setRows(FinancePlatformDetails);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
}

/**
 * @Title: FinanceCarrierDetailService.java 
 * @Package com.glacier.global.service.FinanceCarrierDetail
 * @author wuting   
 * @email 920339213@qq.com
 * @date 2014-10-09
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.00          
 * @Review (审核人) ：wuting
 * 
 */
package com.glacier.frame.service.finace; 
import java.util.List;
import org.apache.commons.lang3.StringUtils; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional; 
import com.glacier.frame.dao.finace.FinanceCarrierDetailMapper;
import com.glacier.frame.dto.query.finace.FinanceCarrierDetailQueryDTO;
import com.glacier.frame.entity.finace.FinanceCarrierDetailExample;
import com.glacier.frame.entity.finace.FinanceCarrierDetail;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.frame.entity.finace.FinanceCarrierDetailExample.Criteria;
/*** 
 * @ClassName:  FinanceCarrierDetailService
 * @Description: TODO(承运商资金明细记录表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-11
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class FinanceCarrierDetailService {

	@Autowired
	private FinanceCarrierDetailMapper financeCarrierDetailMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有承运商资金明细记录信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回记录 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, FinanceCarrierDetailQueryDTO FinanceCarrierDetailQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        FinanceCarrierDetailExample financeCarrierDetailCarrierDetailExample = new FinanceCarrierDetailExample(); 
        Criteria queryCriteria = financeCarrierDetailCarrierDetailExample.createCriteria();
        FinanceCarrierDetailQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	financeCarrierDetailCarrierDetailExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	financeCarrierDetailCarrierDetailExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	financeCarrierDetailCarrierDetailExample.setOrderByClause(jqPager.getOrderBy("temp_finance_carrier_detail_"));
        }
        List<FinanceCarrierDetail>  financeCarrierDetails = financeCarrierDetailMapper.selectByExample(financeCarrierDetailCarrierDetailExample); // 查询所有会员列表
        int total = financeCarrierDetailMapper.countByExample(financeCarrierDetailCarrierDetailExample); // 查询总页数
        returnResult.setRows(financeCarrierDetails);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getMember 
	 * @Description: TODO(根据承运商资金明细记录Id获取承运商资金明细记录信息) 
	 * @param @param withdrawCarrierDetailId
	 * @param @return    设定文件 
	 * @return Object    返回记录 
	 * @throws
	 */
    public Object getWithdrawCarrierDetail(String memberWithdrawCarrierDetailId) {
    	FinanceCarrierDetail memberWithdrawCarrierDetail = financeCarrierDetailMapper.selectByPrimaryKey(memberWithdrawCarrierDetailId);
        return memberWithdrawCarrierDetail;
    }
}

/**
 * @Title: FinanceCarrierService.java 
 * @Package com.glacier.global.service.FinanceCarrier
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
import com.glacier.frame.dao.finace.FinanceCarrierMapper;
import com.glacier.frame.dto.query.finace.FinanceCarrierQueryDTO;
import com.glacier.frame.entity.finace.FinanceCarrierExample;
import com.glacier.frame.entity.finace.FinanceCarrier;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.frame.entity.finace.FinanceCarrierExample.Criteria;
/*** 
 * @ClassName:  FinanceCarrierService
 * @Description: TODO(承运商资金管理表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-11
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class FinanceCarrierService {

	@Autowired
	private FinanceCarrierMapper financeCarrierMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有承运商资金管理信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回记录 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, FinanceCarrierQueryDTO FinanceCarrierQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        FinanceCarrierExample financeCarrierCarrierExample = new FinanceCarrierExample(); 
        Criteria queryCriteria = financeCarrierCarrierExample.createCriteria();
        FinanceCarrierQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	financeCarrierCarrierExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	financeCarrierCarrierExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	financeCarrierCarrierExample.setOrderByClause(jqPager.getOrderBy("temp_finance_carrier_"));
        }
        List<FinanceCarrier>  financeCarriers = financeCarrierMapper.selectByExample(financeCarrierCarrierExample); // 查询所有会员列表
        int total = financeCarrierMapper.countByExample(financeCarrierCarrierExample); // 查询总页数
        returnResult.setRows(financeCarriers);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getMember 
	 * @Description: TODO(根据承运商资金管理Id获取承运商资金管理信息) 
	 * @param @param withdrawCarrierId
	 * @param @return    设定文件 
	 * @return Object    返回记录 
	 * @throws
	 */
    public Object getWithdrawCarrier(String memberWithdrawCarrierId) {
    	FinanceCarrier memberWithdrawCarrier = financeCarrierMapper.selectByPrimaryKey(memberWithdrawCarrierId);
        return memberWithdrawCarrier;
    }
}

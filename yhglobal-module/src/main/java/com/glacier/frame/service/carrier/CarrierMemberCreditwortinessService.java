/**
 * @Title: CarrierMemberCreditwortinessService.java 
 * @Package com.glacier.frame.service.carrier 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2014-10-14 上午9:30:18 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-10-14
				修改人：song.jundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：song.jundong 
 * 
 */
package com.glacier.frame.service.carrier;
 
import java.util.List; 
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;  
import com.glacier.frame.dao.carrier.CarrierMemberCreditworthinessMapper; 
import com.glacier.frame.dto.query.carrier.CarrierMemberCreditwortinessQueryDTO; 
import com.glacier.frame.entity.carrier.CarrierMemberCreditworthiness;
import com.glacier.frame.entity.carrier.CarrierMemberCreditworthinessExample;
import com.glacier.frame.entity.carrier.CarrierMemberCreditworthinessExample.Criteria;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName:  CarrierMemberCreditwortinessService
 * @Description: TODO(货主会员积分记录service)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-10-14  上午9:30:18
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class CarrierMemberCreditwortinessService {

	@Autowired
	private CarrierMemberCreditworthinessMapper carrierMemberCreditworthinessMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员信誉记录信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
    public Object listAsGrid(JqPager jqPager, CarrierMemberCreditwortinessQueryDTO carrierMemberCreditwortinessQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        CarrierMemberCreditworthinessExample creditworthinessExample = new CarrierMemberCreditworthinessExample(); 
        Criteria queryCriteria = creditworthinessExample.createCriteria();
        carrierMemberCreditwortinessQueryDTO.setQueryCondition(queryCriteria); 
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	creditworthinessExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	creditworthinessExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	creditworthinessExample.setOrderByClause(jqPager.getOrderBy("temp_carrier_member_creditworthiness_"));
        }
        List<CarrierMemberCreditworthiness>  shippermembers = carrierMemberCreditworthinessMapper.selectByExample(creditworthinessExample); // 查询所有积分列表
        int total = carrierMemberCreditworthinessMapper.countByExample(creditworthinessExample); // 查询总页数
        returnResult.setRows(shippermembers);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
      
    /**
	 * @Title: getMemberCreditworthiness 
	 * @Description: TODO(根据信誉记录id获取会员信息) 
	 * @param @param creditworthinessId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getMemberCreditworthiness(String creditworthinessId) { 
    	 CarrierMemberCreditworthiness creditworthiness = carrierMemberCreditworthinessMapper.selectByPrimaryKey(creditworthinessId);
    	 return creditworthiness;
    } 
	
}

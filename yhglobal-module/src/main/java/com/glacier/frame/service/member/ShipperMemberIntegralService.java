/**
 * @Title: ShipperMemberIntegral.java 
 * @Package com.glacier.frame.service.member 
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
package com.glacier.frame.service.member;
 
import java.util.List; 
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional; 
import com.glacier.frame.dao.member.ShipperMemberIntegralMapper;
import com.glacier.frame.dto.query.member.ShipperMemberIntegralQueryDTO;  
import com.glacier.frame.entity.member.ShipperMemberIntegral;
import com.glacier.frame.entity.member.ShipperMemberIntegralExample;
import com.glacier.frame.entity.member.ShipperMemberIntegralExample.Criteria;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName:  ShipperMemberIntegral
 * @Description: TODO(货主会员积分记录service)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-10-14  上午9:30:18
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ShipperMemberIntegralService {

	@Autowired
	private ShipperMemberIntegralMapper shipperMemberIntegralMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员积分记录信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
    public Object listAsGrid(JqPager jqPager, ShipperMemberIntegralQueryDTO shipperMemberIntegralQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ShipperMemberIntegralExample shipperMemberIntegralExample = new ShipperMemberIntegralExample(); 
        Criteria queryCriteria = shipperMemberIntegralExample.createCriteria();
        shipperMemberIntegralQueryDTO.setQueryCondition(queryCriteria); 
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	shipperMemberIntegralExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	shipperMemberIntegralExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	shipperMemberIntegralExample.setOrderByClause(jqPager.getOrderBy("temp_shipper_member_integral_"));
        }
        List<ShipperMemberIntegral>  shippermembers = shipperMemberIntegralMapper.selectByExample(shipperMemberIntegralExample); // 查询所有积分列表
        int total = shipperMemberIntegralMapper.countByExample(shipperMemberIntegralExample); // 查询总页数
        returnResult.setRows(shippermembers);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
      
    /**
	 * @Title: getMemberIntegral 
	 * @Description: TODO(根据会员积分记录id获取会员信息) 
	 * @param @param shipperMemberIntegralId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getMemberIntegral(String shipperMemberIntegralId) { 
    	 ShipperMemberIntegral memberIntegral = shipperMemberIntegralMapper.selectByPrimaryKey(shipperMemberIntegralId);
    	 return memberIntegral;
    } 
	
}

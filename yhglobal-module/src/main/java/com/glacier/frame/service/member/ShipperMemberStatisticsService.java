/**
 * @Title: ShipperMemberStatisticsService.java 
 * @Package com.glacier.frame.service.member 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2014-10-10 上午10:16:16 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-10-10
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

import com.glacier.frame.dao.member.ShipperMemberStatisticsMapper;
import com.glacier.frame.dao.system.UserMapper;
import com.glacier.frame.entity.member.ShipperMemberStatistics;
import com.glacier.frame.entity.member.ShipperMemberStatisticsExample; 
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 

/**
 * @ClassName:  ShipperMemberStatisticsService
 * @Description: TODO(会员统计信息service)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-12-17  上午10:16:16
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ShipperMemberStatisticsService { 

	@Autowired
    private ShipperMemberStatisticsMapper shipperMemberStatisticsMapper;
	
	@Autowired
    private UserMapper userMapper;
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(会员统计信息列表) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager,String memberName) {
        JqGridReturn returnResult = new JqGridReturn();
        ShipperMemberStatisticsExample shipperMemberStatisticsExample = new ShipperMemberStatisticsExample();
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	shipperMemberStatisticsExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	shipperMemberStatisticsExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	shipperMemberStatisticsExample.setOrderByClause(pager.getOrderBy("temp_shipper_member_statistics_"));
        }
        if(memberName == null){
        	memberName="%%";
        }else{
        	memberName="%"+memberName+"%";
        }
        List<ShipperMemberStatistics>  shipperMemberStatisticsList = shipperMemberStatisticsMapper.getStatisticsList(memberName); 
        int total = shipperMemberStatisticsMapper.countByExample(memberName); // 查询总页数
        returnResult.setRows(shipperMemberStatisticsList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: getStatistics 
     * @Description: TODO(根据Id取出会员统计信息) 
     * @param @param memberId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object getStatistics(String memberId) {
    	return shipperMemberStatisticsMapper.getStatistics(memberId);
    }
    
    
    
    
}
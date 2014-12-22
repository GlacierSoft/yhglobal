/**
 * @Title: CarrierMemberStatisticsService.java 
 * @Package com.glacier.frame.service.carrier 
 * @author wuting
 * @email 920339213@qq.com
 * @date 2014-10-10 上午10:16:16 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 *             
 * @Review (审核人) ：wuting
 * 
 */
package com.glacier.frame.service.carrier;
 
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional; 
import com.glacier.frame.dao.carrier.CarrierMemberStatisticsMapper;
import com.glacier.frame.dao.system.UserMapper;
import com.glacier.frame.entity.carrier.CarrierMemberStatistics;
import com.glacier.jqueryui.util.JqGridReturn;

/**
 * @ClassName:  CarrierMemberStatisticsService
 * @Description: TODO(承运商统计信息service)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-12-17  上午10:16:16
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class CarrierMemberStatisticsService { 

	@Autowired
    private CarrierMemberStatisticsMapper carrierMemberStatisticsMapper;
	
	@Autowired
    private UserMapper userMapper;
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(承运商统计信息列表) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(String memberName) {
        JqGridReturn returnResult = new JqGridReturn();
        if(memberName == null){
        	memberName="%%";
        }else{
        	memberName="%"+memberName+"%";
        }
        List<CarrierMemberStatistics>  shipperMemberStatisticsList = carrierMemberStatisticsMapper.getStatisticsList(memberName); 
        int total = carrierMemberStatisticsMapper.countByExample(memberName); // 查询总页数
        returnResult.setRows(shipperMemberStatisticsList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: getStatistics 
     * @Description: TODO(根据Id取出承运商统计信息) 
     * @param @param memberId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object getStatistics(String memberId) {
    	return carrierMemberStatisticsMapper.getStatistics(memberId);
    }
    
    
    
    
}
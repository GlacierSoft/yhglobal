/**
 * @Title: ShipperIndividualityMemberService.java 
 * @Package com.glacier.global.service.carrier
 * @author wuting   
 * @email 920339213@qq.com
 * @date 2014-10-11 下午1:40:53
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.00          
 * @Review (审核人) ：WuTing
 * 
 */
package com.glacier.frame.service.carrier; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.glacier.frame.dao.member.ShipperIndividualityMemberMapper;
import com.glacier.frame.entity.member.ShipperIndividualityMember;
/*** 
 * @ClassName:  ShipperIndividualityMemberService
 * @Description: TODO(会员表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-11 下午1:40:53
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ShipperIndividualityMemberService {

	@Autowired
	private ShipperIndividualityMemberMapper individualityMemberMapper;
	
    /**
     * @Title: getMember 
     * @Description: TODO(根据会员Id获取个体户会员信息) 
     * @param @param memberId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public ShipperIndividualityMember getShipperMember(String memberId) {
    	ShipperIndividualityMember individuality = individualityMemberMapper.selectByPrimaryKey(memberId);
        return individuality;
    }
}

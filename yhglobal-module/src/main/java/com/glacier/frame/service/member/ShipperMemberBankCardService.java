/**
 * @Title: ShipperMemberBankCardService.java 
 * @Package com.glacier.global.service.member
 * @author zhengjunjie   
 * @email 1203807137@qq.com
 * @date 2014-10-08 下午1:40:53
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.00          
 * @Review (审核人) ：zhengjunjie
 * 
 */
package com.glacier.frame.service.member;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.frame.dao.member.ShipperMemberBankCardMapper;
import com.glacier.frame.dto.query.member.ShipperMemberBankCardQueryDTO;
import com.glacier.frame.entity.member.ShipperMemberBankCard;
import com.glacier.frame.entity.member.ShipperMemberBankCardExample;
import com.glacier.frame.entity.member.ShipperMemberBankCardExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
/*** 
 * @ClassName:  ShipperMemberBankCardService
 * @Description: TODO(会员信用卡管理业务类)
 * @author zhengjunjie
 * @email 1203807137@QQ.com
 * @date 2014-10-08 下午1:40:53
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ShipperMemberBankCardService {
	
	@Autowired
    private ShipperMemberBankCardMapper shipperMemberBankCardMapper;
	  
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有合同类型记录信息) 
     * @param @param padvertisementr，shipperMemberBankCardQueryDTO，q
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
	public Object listAsGrid(JqPager jqPager, ShipperMemberBankCardQueryDTO shipperMemberBankCardQueryDTO, String q) {
        JqGridReturn returnResult = new JqGridReturn();
        ShipperMemberBankCardExample shipperMemberBankCardExample = new ShipperMemberBankCardExample();
        Criteria queryCriteria = shipperMemberBankCardExample.createCriteria();
        shipperMemberBankCardQueryDTO.setQueryCondition(queryCriteria, q);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	shipperMemberBankCardExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	shipperMemberBankCardExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	shipperMemberBankCardExample.setOrderByClause(jqPager.getOrderBy("temp_shipper_member_bank_card_"));
        }
        List<ShipperMemberBankCard>  shipperMemberContractRecords = shipperMemberBankCardMapper.selectByExample(shipperMemberBankCardExample); // 查询所有广告列表
        int total = shipperMemberBankCardMapper.countByExample(shipperMemberBankCardExample); // 查询总页数
        returnResult.setRows(shipperMemberContractRecords);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
	}
	
	 /**
     * @Title: listWebsite 
     * @Description: TODO(根据会员Id查找出所属的银行卡信息) 
     * @param  @param MemberId
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    public Object listWebsite(String memberId) {
    	ShipperMemberBankCardExample shipperMemberBankCardExample = new ShipperMemberBankCardExample();
    	shipperMemberBankCardExample.createCriteria().andMemberIdEqualTo(memberId);
        List<ShipperMemberBankCard> financeBankCards = shipperMemberBankCardMapper.selectByExample(shipperMemberBankCardExample);
        Map<String,String> map = new HashMap<String,String>();
        for (ShipperMemberBankCard financeBankCard : financeBankCards) {
        	financeBankCard.setCardName(financeBankCard.getCardName()+" (**"+financeBankCard.getCardNumber().substring(financeBankCard.getCardNumber().length())+")");
        	 
            map.put(financeBankCard.getBankcardId(),financeBankCard.getCardName());
        }
        return map;
    }
	
	/**
     * @Title: getBankCardPro 
     * @Description: TODO(获取单个合同类型记录信息) 
     * @param @param bankCardId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
	public Object getBankCardPro(String bankCardId) {
	    ShipperMemberBankCard shipperMemberBankCard = shipperMemberBankCardMapper.selectByPrimaryKey(bankCardId);
		return shipperMemberBankCard;
    }
	
	/**
     * @Title: auditBankCard 
     * @Description: TODO(审核合同类型记录信息) 
     * @param @param shipperMemberBankCard
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
    @Transactional(readOnly = false)
    public Object auditBankCard(ShipperMemberBankCard shipperMemberBankCard) {
	    JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
	    int count = 0;
	    Subject pricipalSubject = SecurityUtils.getSubject();
	    User pricipalUser = (User) pricipalSubject.getPrincipal();
	    shipperMemberBankCard.setUpdater(pricipalUser.getUserId());
	    shipperMemberBankCard.setUpdateTime(new Date());
	    count = shipperMemberBankCardMapper.updateByPrimaryKeySelective(shipperMemberBankCard);
	    if (count == 1) {
	        returnResult.setSuccess(true);
	        returnResult.setMsg("信用卡审核操作成功!");
	    } else {
	    	returnResult.setMsg("信用卡审核操作失败!");
	    }
	    return returnResult;
	}

}

/**
 * @Title: CarrierBankCardService.java 
 * @Package com.glacier.frame.service.carrier 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-10-11 下午4:57:30 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-10-11
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.service.carrier;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.frame.dao.carrier.CarrierBankCardMapper;
import com.glacier.frame.dto.query.carrier.CarrierBankCardQueryDTO;
import com.glacier.frame.entity.carrier.CarrierBankCard;
import com.glacier.frame.entity.carrier.CarrierBankCardExample;
import com.glacier.frame.entity.carrier.CarrierBankCardExample.Criteria;
import com.glacier.frame.entity.system.User;

import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName: CarrierBankCardService 
 * @Description: TODO(会员银行卡信息管理业务层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-10-11 下午4:57:30
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class CarrierBankCardService {
	@Autowired
    private CarrierBankCardMapper carrierBankCardMapper;
	  
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有合同类型记录信息) 
     * @param @param padvertisementr，carrierBankCardQueryDTO，q
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
	public Object listAsGrid(JqPager jqPager, CarrierBankCardQueryDTO carrierBankCardQueryDTO, String q) {
        JqGridReturn returnResult = new JqGridReturn();
        CarrierBankCardExample carrierBankCardExample = new CarrierBankCardExample();
        Criteria queryCriteria = carrierBankCardExample.createCriteria();
        carrierBankCardQueryDTO.setQueryCondition(queryCriteria, q);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	carrierBankCardExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	carrierBankCardExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	carrierBankCardExample.setOrderByClause(jqPager.getOrderBy("temp_carrier_bank_card_"));
        }
        List<CarrierBankCard>  carrierBankCards = carrierBankCardMapper.selectByExample(carrierBankCardExample); // 查询所有广告列表
        int total = carrierBankCardMapper.countByExample(carrierBankCardExample); // 查询总页数
        returnResult.setRows(carrierBankCards);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
	}
	
	/**
     * @Title: getBankCardPro 
     * @Description: TODO(获取承运商合同类型记录信息对象) 
     * @param @param bankCardId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
	public Object getBankCardPro(String bankCardId) {
	    CarrierBankCard carrierBankCard = carrierBankCardMapper.selectByPrimaryKey(bankCardId);
		return carrierBankCard;
    }
	
	
	/**
     * @Title: auditBankCard 
     * @Description: TODO(审核承运商合同类型记录信息) 
     * @param @param shipperMemberBankCard
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
    @Transactional(readOnly = false)
    public Object auditBankCard(CarrierBankCard carrierMemberBankCard) {
	    JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
	    int count = 0;
	    Subject pricipalSubject = SecurityUtils.getSubject();
	    User pricipalUser = (User) pricipalSubject.getPrincipal();
	    carrierMemberBankCard.setUpdater(pricipalUser.getUserId());
	    carrierMemberBankCard.setUpdateTime(new Date());
	    count = carrierBankCardMapper.updateByPrimaryKeySelective(carrierMemberBankCard);
	    if (count == 1) {
	        returnResult.setSuccess(true);
	        returnResult.setMsg("承运商信用卡审核操作成功!");
	    } else {
	    	returnResult.setMsg("承运商信用卡审核操作失败!");
	    }
	    return returnResult;
	}
	
}

/**
 * @Title: FinaceRechargeCarrierService.java 
 * @Package com.glacier.global.service.carrierCarInfomation
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
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils; 
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional; 
import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.finace.FinaceRechargeCarrierMapper;
import com.glacier.frame.dto.query.finace.FinaceRechargeCarrierQueryDTO;
import com.glacier.frame.entity.finace.FinaceRechargeCarrierExample;
import com.glacier.frame.entity.finace.FinaceRechargeCarrier;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.finace.FinaceRechargeCarrierExample.Criteria;
/*** 
 * @ClassName:  FinaceRechargeCarrierService
 * @Description: TODO(承运商充值记录表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-11
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class FinaceRechargeCarrierService {

	@Autowired
	private FinaceRechargeCarrierMapper finaceRechargeCarrierMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有承运商充值记录信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回记录 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, FinaceRechargeCarrierQueryDTO memberRechargeCarrierQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        FinaceRechargeCarrierExample memberRechargeCarrierExample = new FinaceRechargeCarrierExample(); 
        Criteria queryCriteria = memberRechargeCarrierExample.createCriteria();
        memberRechargeCarrierQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	memberRechargeCarrierExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	memberRechargeCarrierExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	memberRechargeCarrierExample.setOrderByClause(jqPager.getOrderBy("temp_finace_recharge_carrier_"));
        }
        List<FinaceRechargeCarrier>  finaceRechargeCarriers = finaceRechargeCarrierMapper.selectByExample(memberRechargeCarrierExample); // 查询所有会员列表
        int total = finaceRechargeCarrierMapper.countByExample(memberRechargeCarrierExample); // 查询总页数
        returnResult.setRows(finaceRechargeCarriers);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getMember 
	 * @Description: TODO(根据承运商充值记录Id获取承运商充值记录信息) 
	 * @param @param rechargeCarrierId
	 * @param @return    设定文件 
	 * @return Object    返回记录 
	 * @throws
	 */
    public Object getRechargeCarrier(String memberRechargeCarrierId) {
    	FinaceRechargeCarrier memberRechargeCarrier = finaceRechargeCarrierMapper.selectByPrimaryKey(memberRechargeCarrierId);
        return memberRechargeCarrier;
    }
    
    /**
     * @Title: addRechargeCarrier 
     * @Description: TODO(新增承运商充值记录) 
     * @param @param memberRechargeCarrier
     * @param @return    设定文件 
     * @return Object    返回记录 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addRechargeCarrier(FinaceRechargeCarrier rechargeCarrier) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        FinaceRechargeCarrierExample memberRechargeCarrierExample = new FinaceRechargeCarrierExample();
        int count = 0;
        // 防止承运商充值记录牌号重复
        //memberRechargeCarrierExample.createCriteria().andRechargeNameEqualTo(rechargeCarrier.getRechargeName());
        count = finaceRechargeCarrierMapper.countByExample(memberRechargeCarrierExample);
        if (count > 0) {
            returnResult.setMsg("承运商充值记录名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        rechargeCarrier.setAuditState("authstr");
        rechargeCarrier.setRechargeId(RandomGUID.getRandomGUID());
        rechargeCarrier.setCreater(pricipalUser.getUserId());
        rechargeCarrier.setCreateTime(new Date());
        rechargeCarrier.setUpdater(pricipalUser.getUserId());
        rechargeCarrier.setUpdateTime(new Date());
        count = finaceRechargeCarrierMapper.insert(rechargeCarrier);
        if (count == 1) {
            returnResult.setSuccess(true);
            //returnResult.setMsg("[" + rechargeCarrier.getRechargeName() + "] 承运商充值记录信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，承运商充值记录信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: auditRechargeCarrier 
     * @Description: TODO(审核充值记录) 
     * @param @param rechargeCarrier
     * @param @return    设定文件 
     * @return Object    返回记录 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object auditRechargeCarrier(FinaceRechargeCarrier rechargeCarrier) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
        if(rechargeCarrier.getAuditState().equals("authstr")){
        	 returnResult.setMsg("无效的操作，请选择是否通过！！"); 
             return returnResult; 
        } 
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        rechargeCarrier.setAuditor(pricipalUser.getUserId());
        rechargeCarrier.setAuditTime(new Date());
        count = finaceRechargeCarrierMapper.updateByPrimaryKeySelective(rechargeCarrier);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + rechargeCarrier.getRechargeCode() + "] 的充值记录审核操作成功");
        } else {
            returnResult.setMsg("发生未知错误，充值记录审核操作失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editRechargeCarrier 
     * @Description: TODO(修改承运商充值记录) 
     * @param @param memberRechargeCarrier
     * @param @return    设定文件 
     * @return Object    返回记录 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editRechargeCarrier(FinaceRechargeCarrier rechargeCarrier) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        FinaceRechargeCarrierExample memberRechargeCarrierExample = new FinaceRechargeCarrierExample();
        int count = 0;
        // 防止承运商充值记录牌号重复
        //memberRechargeCarrierExample.createCriteria().andRechargeNameEqualTo(rechargeCarrier.getRechargeName()).andRechargeIdNotEqualTo(rechargeCarrier.getRechargeId());
        count = finaceRechargeCarrierMapper.countByExample(memberRechargeCarrierExample);
        if (count > 0) {
            returnResult.setMsg("承运商充值记录名称重复");
            return returnResult;
        }
        //根据ID获取承运商充值记录信息
        FinaceRechargeCarrier memberRechargeCarrierTime = (FinaceRechargeCarrier) getRechargeCarrier(rechargeCarrier.getRechargeId());
        rechargeCarrier.setAuditor(memberRechargeCarrierTime.getAuditor());
        rechargeCarrier.setAuditTime(new Date());
        rechargeCarrier.setAuditState(memberRechargeCarrierTime.getAuditState());
        rechargeCarrier.setCreater(memberRechargeCarrierTime.getCreater());
        rechargeCarrier.setCreateTime(memberRechargeCarrierTime.getCreateTime());
        rechargeCarrier.setUpdater(pricipalUser.getUserId());
        rechargeCarrier.setUpdateTime(new Date());
        count = finaceRechargeCarrierMapper.updateByPrimaryKey(rechargeCarrier);
        if (count == 1) {
            returnResult.setSuccess(true);
            //returnResult.setMsg("[" + rechargeCarrier.getRechargeName() + "] 承运商充值记录信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，承运商充值记录信息保存失败");
        }
        return returnResult;
    }
    
}

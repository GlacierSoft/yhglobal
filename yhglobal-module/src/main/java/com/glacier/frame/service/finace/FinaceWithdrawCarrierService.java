/**
 * @Title: FinaceWithdrawCarrierService.java 
 * @Package com.glacier.global.service.FinaceWithdrawCarrier
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
import com.glacier.frame.dao.finace.FinaceWithdrawCarrierMapper;
import com.glacier.frame.dto.query.finace.FinaceWithdrawCarrierQueryDTO;
import com.glacier.frame.entity.finace.FinaceWithdrawCarrierExample;
import com.glacier.frame.entity.finace.FinaceWithdrawCarrier;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.finace.FinaceWithdrawCarrierExample.Criteria;
/*** 
 * @ClassName:  FinaceWithdrawCarrierService
 * @Description: TODO(承运商提现记录表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-11
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class FinaceWithdrawCarrierService {

	@Autowired
	private FinaceWithdrawCarrierMapper finaceWithdrawCarrierMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有承运商提现记录信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回记录 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, FinaceWithdrawCarrierQueryDTO memberWithdrawCarrierQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        FinaceWithdrawCarrierExample memberWithdrawCarrierExample = new FinaceWithdrawCarrierExample(); 
        Criteria queryCriteria = memberWithdrawCarrierExample.createCriteria();
        memberWithdrawCarrierQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	memberWithdrawCarrierExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	memberWithdrawCarrierExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	memberWithdrawCarrierExample.setOrderByClause(jqPager.getOrderBy("temp_finace_withdraw_carrier_"));
        }
        List<FinaceWithdrawCarrier>  finaceWithdrawCarriers = finaceWithdrawCarrierMapper.selectByExample(memberWithdrawCarrierExample); // 查询所有会员列表
        int total = finaceWithdrawCarrierMapper.countByExample(memberWithdrawCarrierExample); // 查询总页数
        returnResult.setRows(finaceWithdrawCarriers);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getMember 
	 * @Description: TODO(根据承运商提现记录Id获取承运商提现记录信息) 
	 * @param @param withdrawCarrierId
	 * @param @return    设定文件 
	 * @return Object    返回记录 
	 * @throws
	 */
    public Object getWithdrawCarrier(String memberWithdrawCarrierId) {
    	FinaceWithdrawCarrier memberWithdrawCarrier = finaceWithdrawCarrierMapper.selectByPrimaryKey(memberWithdrawCarrierId);
        return memberWithdrawCarrier;
    }
    
    /**
     * @Title: addWithdrawCarrier 
     * @Description: TODO(新增承运商提现记录) 
     * @param @param memberWithdrawCarrier
     * @param @return    设定文件 
     * @return Object    返回记录 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addWithdrawCarrier(FinaceWithdrawCarrier withdrawCarrier) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        FinaceWithdrawCarrierExample memberWithdrawCarrierExample = new FinaceWithdrawCarrierExample();
        int count = 0;
        // 防止承运商提现记录牌号重复
        //memberWithdrawCarrierExample.createCriteria().andWithdrawNameEqualTo(withdrawCarrier.getWithdrawName());
        count = finaceWithdrawCarrierMapper.countByExample(memberWithdrawCarrierExample);
        if (count > 0) {
            returnResult.setMsg("承运商提现记录名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        withdrawCarrier.setAuditState("authstr");
        withdrawCarrier.setWithdrawId(RandomGUID.getRandomGUID());
        withdrawCarrier.setCreater(pricipalUser.getUserId());
        withdrawCarrier.setCreateTime(new Date());
        withdrawCarrier.setUpdater(pricipalUser.getUserId());
        withdrawCarrier.setUpdateTime(new Date());
        count = finaceWithdrawCarrierMapper.insert(withdrawCarrier);
        if (count == 1) {
            returnResult.setSuccess(true);
            //returnResult.setMsg("[" + withdrawCarrier.getWithdrawName() + "] 承运商提现记录信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，承运商提现记录信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: auditWithdrawCarrier 
     * @Description: TODO(审核提现记录) 
     * @param @param withdrawCarrier
     * @param @return    设定文件 
     * @return Object    返回记录 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object auditWithdrawCarrier(FinaceWithdrawCarrier withdrawCarrier) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
        if(withdrawCarrier.getAuditState().equals("authstr")){
        	 returnResult.setMsg("无效的操作，请选择是否通过！！"); 
             return returnResult; 
        } 
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        withdrawCarrier.setAuditor(pricipalUser.getUserId());
        withdrawCarrier.setAuditTime(new Date());
        count = finaceWithdrawCarrierMapper.updateByPrimaryKeySelective(withdrawCarrier);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + withdrawCarrier.getWithdrawCode() + "] 的提现记录审核操作成功");
        } else {
            returnResult.setMsg("发生未知错误，提现记录审核操作失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editWithdrawCarrier 
     * @Description: TODO(修改承运商提现记录) 
     * @param @param memberWithdrawCarrier
     * @param @return    设定文件 
     * @return Object    返回记录 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editWithdrawCarrier(FinaceWithdrawCarrier withdrawCarrier) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        FinaceWithdrawCarrierExample memberWithdrawCarrierExample = new FinaceWithdrawCarrierExample();
        int count = 0;
        // 防止承运商提现记录牌号重复
        //memberWithdrawCarrierExample.createCriteria().andWithdrawNameEqualTo(withdrawCarrier.getWithdrawName()).andWithdrawIdNotEqualTo(withdrawCarrier.getWithdrawId());
        count = finaceWithdrawCarrierMapper.countByExample(memberWithdrawCarrierExample);
        if (count > 0) {
            returnResult.setMsg("承运商提现记录名称重复");
            return returnResult;
        }
        //根据ID获取承运商提现记录信息
        FinaceWithdrawCarrier memberWithdrawCarrierTime = (FinaceWithdrawCarrier) getWithdrawCarrier(withdrawCarrier.getWithdrawId());
        withdrawCarrier.setAuditor(memberWithdrawCarrierTime.getAuditor());
        withdrawCarrier.setAuditTime(new Date());
        withdrawCarrier.setAuditState(memberWithdrawCarrierTime.getAuditState());
        withdrawCarrier.setCreater(memberWithdrawCarrierTime.getCreater());
        withdrawCarrier.setCreateTime(memberWithdrawCarrierTime.getCreateTime());
        withdrawCarrier.setUpdater(pricipalUser.getUserId());
        withdrawCarrier.setUpdateTime(new Date());
        count = finaceWithdrawCarrierMapper.updateByPrimaryKey(withdrawCarrier);
        if (count == 1) {
            returnResult.setSuccess(true);
            //returnResult.setMsg("[" + withdrawCarrier.getWithdrawName() + "] 承运商提现记录信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，承运商提现记录信息保存失败");
        }
        return returnResult;
    }
    
}

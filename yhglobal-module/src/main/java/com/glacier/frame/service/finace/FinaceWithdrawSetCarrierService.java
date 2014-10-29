/**
 * @Title: FinaceWithdrawSetCarrierService.java 
 * @Package com.glacier.global.service.FinaceWithdrawSetCarrier
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
import com.glacier.frame.dao.finace.FinaceWithdrawSetCarrierMapper;
import com.glacier.frame.dto.query.finace.FinaceWithdrawSetCarrierQueryDTO;
import com.glacier.frame.entity.finace.FinaceWithdrawCarrierExample;
import com.glacier.frame.entity.finace.FinaceWithdrawSetCarrier;
import com.glacier.frame.entity.finace.FinaceWithdrawSetCarrierExample;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.finace.FinaceWithdrawSetCarrierExample.Criteria;
/*** 
 * @ClassName:  FinaceWithdrawSetCarrierService
 * @Description: TODO(承运商提现类型表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-11
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class FinaceWithdrawSetCarrierService {

	@Autowired
	private FinaceWithdrawSetCarrierMapper finaceWithdrawSetCarrierMapper;
	
	@Autowired
	private FinaceWithdrawCarrierMapper finaceWithdrawCarrierMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有承运商提现类型信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, FinaceWithdrawSetCarrierQueryDTO memberWithdrawSetCarrierQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        FinaceWithdrawSetCarrierExample memberWithdrawSetCarrierExample = new FinaceWithdrawSetCarrierExample(); 
        Criteria queryCriteria = memberWithdrawSetCarrierExample.createCriteria();
        memberWithdrawSetCarrierQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	memberWithdrawSetCarrierExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	memberWithdrawSetCarrierExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	memberWithdrawSetCarrierExample.setOrderByClause(jqPager.getOrderBy("temp_finace_withdraw_set_carrier_"));
        }
        List<FinaceWithdrawSetCarrier>  finaceWithdrawSetCarriers = finaceWithdrawSetCarrierMapper.selectByExample(memberWithdrawSetCarrierExample); // 查询所有会员列表
        int total = finaceWithdrawSetCarrierMapper.countByExample(memberWithdrawSetCarrierExample); // 查询总页数
        returnResult.setRows(finaceWithdrawSetCarriers);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getMember 
	 * @Description: TODO(根据承运商提现类型Id获取承运商提现类型信息) 
	 * @param @param rechargeSetCarrierId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getWithdrawSetCarrier(String memberWithdrawSetCarrierId) {
    	FinaceWithdrawSetCarrier memberWithdrawSetCarrier = finaceWithdrawSetCarrierMapper.selectByPrimaryKey(memberWithdrawSetCarrierId);
        return memberWithdrawSetCarrier;
    }
    
    /**
     * @Title: addWithdrawSetCarrier 
     * @Description: TODO(新增承运商提现类型) 
     * @param @param memberWithdrawSetCarrier
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addWithdrawSetCarrier(FinaceWithdrawSetCarrier rechargeSetCarrier) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        FinaceWithdrawSetCarrierExample memberWithdrawSetCarrierExample = new FinaceWithdrawSetCarrierExample();
        int count = 0;
        // 防止承运商提现类型牌号重复
        memberWithdrawSetCarrierExample.createCriteria().andWithdrawNameEqualTo(rechargeSetCarrier.getWithdrawName());
        count = finaceWithdrawSetCarrierMapper.countByExample(memberWithdrawSetCarrierExample);
        if (count > 0) {
            returnResult.setMsg("承运商提现类型名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        rechargeSetCarrier.setAuditState("authstr");
        rechargeSetCarrier.setWithdrawSetId(RandomGUID.getRandomGUID());
        rechargeSetCarrier.setCreater(pricipalUser.getUserId());
        rechargeSetCarrier.setCraeteTime(new Date());
        rechargeSetCarrier.setUpdater(pricipalUser.getUserId());
        rechargeSetCarrier.setUpdateTime(new Date());
        count = finaceWithdrawSetCarrierMapper.insert(rechargeSetCarrier);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + rechargeSetCarrier.getWithdrawName() + "] 承运商提现类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，承运商提现类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: auditWithdrawSetCarrier 
     * @Description: TODO(审核提现类型) 
     * @param @param rechargeSetCarrier
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object auditWithdrawSetCarrier(FinaceWithdrawSetCarrier rechargeSetCarrier) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
        if(rechargeSetCarrier.getAuditState().equals("authstr")){
        	 returnResult.setMsg("无效的操作，请选择是否通过！！"); 
             return returnResult; 
        } 
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        rechargeSetCarrier.setAuditor(pricipalUser.getUserId());
        rechargeSetCarrier.setAuditTime(new Date());
        count = finaceWithdrawSetCarrierMapper.updateByPrimaryKeySelective(rechargeSetCarrier);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + rechargeSetCarrier.getWithdrawName() + "] 的提现类型审核操作成功");
        } else {
            returnResult.setMsg("发生未知错误，提现类型审核操作失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editWithdrawSetCarrier 
     * @Description: TODO(修改承运商提现类型) 
     * @param @param memberWithdrawSetCarrier
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editWithdrawSetCarrier(FinaceWithdrawSetCarrier rechargeSetCarrier) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        FinaceWithdrawSetCarrierExample memberWithdrawSetCarrierExample = new FinaceWithdrawSetCarrierExample();
        int count = 0;
        // 防止承运商提现类型牌号重复
        memberWithdrawSetCarrierExample.createCriteria().andWithdrawNameEqualTo(rechargeSetCarrier.getWithdrawName()).andWithdrawSetIdNotEqualTo(rechargeSetCarrier.getWithdrawSetId());
        count = finaceWithdrawSetCarrierMapper.countByExample(memberWithdrawSetCarrierExample);
        if (count > 0) {
            returnResult.setMsg("承运商提现类型名称重复");
            return returnResult;
        }
        
        //根据ID获取承运商提现类型信息
        FinaceWithdrawSetCarrier memberWithdrawSetCarrierTime = (FinaceWithdrawSetCarrier) getWithdrawSetCarrier(rechargeSetCarrier.getWithdrawSetId());
        rechargeSetCarrier.setAuditor(memberWithdrawSetCarrierTime.getAuditor());
        rechargeSetCarrier.setAuditTime(new Date());
        rechargeSetCarrier.setAuditState("authstr");
        rechargeSetCarrier.setCreater(memberWithdrawSetCarrierTime.getCreater());
        rechargeSetCarrier.setCraeteTime(memberWithdrawSetCarrierTime.getCraeteTime());
        rechargeSetCarrier.setUpdater(pricipalUser.getUserId());
        rechargeSetCarrier.setUpdateTime(new Date());
        count = finaceWithdrawSetCarrierMapper.updateByPrimaryKey(rechargeSetCarrier);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + rechargeSetCarrier.getWithdrawName() + "] 承运商提现类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，承运商提现类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delWithdrawSetCarrier 
     * @Description: TODO(删除承运商提现类型) 
     * @param @param rechargeSetCarrierIds
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object delWithdrawSetCarrier(List<String> rechargeSetCarrierIds, List<String> rechargeSetCarrierName) {
        /*JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (rechargeSetCarrierIds.size() > 0) {
        	FinaceWithdrawSetCarrierExample memberWithdrawSetCarrierExample = new FinaceWithdrawSetCarrierExample();
        	memberWithdrawSetCarrierExample.createCriteria().andWithdrawSetIdIn(rechargeSetCarrierIds);
            count = finaceWithdrawSetCarrierMapper.deleteByExample(memberWithdrawSetCarrierExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(rechargeSetCarrierName, ",") + " ]承运商提现类型");
            } else {
                returnResult.setMsg("发生未知错误，承运商提现类型信息删除失败");
            }
        }*/
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
        // 定义删除成功数据行数量
        int rightNumber = 0;
        // 定义返回结果
        String result_str = ""; 
        // 定义是否显示提示
        boolean isFlag = true;
        //数据行长度判断
        if (rechargeSetCarrierIds.size() > 0) { 
           //匹配删除信息
           for (int i = 0; i < rechargeSetCarrierIds.size(); i++) {  
                 // 相关联提现记录
        	   	FinaceWithdrawCarrierExample rechargeCarrierExample = new FinaceWithdrawCarrierExample();
        	   	rechargeCarrierExample.createCriteria().andWithdrawSetIdEqualTo(rechargeSetCarrierIds.get(i));
        		int count = finaceWithdrawCarrierMapper.countByExample(rechargeCarrierExample);
                // 判断是否关联
        		if (count <= 0) { 
        			FinaceWithdrawSetCarrierExample rechargeSetCarrierExample= new FinaceWithdrawSetCarrierExample();
        			rechargeSetCarrierExample.createCriteria().andWithdrawSetIdEqualTo(rechargeSetCarrierIds.get(i));
        		      int number = finaceWithdrawSetCarrierMapper.deleteByExample(rechargeSetCarrierExample);
        	          rightNumber += number;// 删除成功数据行数量记录 
                 } else { 
                       if(isFlag){ 
        				if(count > 0){
        					result_str=" 数据行第<font style='color:red;font-weight: bold;'>【"+ (i+1) +"】</font>条记录与" + "【承运商提现类型】存在<font style='color:red;font-weight: bold;'>【"+ count + "】</font>条依赖关系," + "须删除【承运商提现信息】中<font style='color:red;font-weight: bold;'>【"+ count + "】</font>条依赖数据    ";
        					isFlag = false;
        					} 
                        }  
                       }
        			}
        		// 删除成功数量大于0即为操作成功,且提示关联信息
        		if(rightNumber>0){
        			returnResult.setMsg("成功删除<font style='color:red;font-weight: bold;'>【"+ rightNumber +"】</font> 条数据," +result_str);
        			returnResult.setSuccess(true);
        		}else{
        			returnResult.setMsg(result_str.trim());
        			returnResult.setSuccess(false);
        		     }
        	   }
        return returnResult;
    }
}

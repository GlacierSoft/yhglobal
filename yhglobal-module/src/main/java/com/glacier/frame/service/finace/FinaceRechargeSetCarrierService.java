/**
 * @Title: FinaceRechargeSetCarrierService.java 
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
import com.glacier.frame.dao.finace.FinaceRechargeSetCarrierMapper;
import com.glacier.frame.dto.query.finace.FinaceRechargeSetCarrierQueryDTO;
import com.glacier.frame.entity.finace.FinaceRechargeCarrierExample;
import com.glacier.frame.entity.finace.FinaceRechargeSetCarrier;
import com.glacier.frame.entity.finace.FinaceRechargeSetCarrierExample;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.finace.FinaceRechargeSetCarrierExample.Criteria;
/*** 
 * @ClassName:  FinaceRechargeSetCarrierService
 * @Description: TODO(承运商充值类型表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-11
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class FinaceRechargeSetCarrierService {

	@Autowired
	private FinaceRechargeSetCarrierMapper finaceRechargeSetCarrierMapper;
	
	@Autowired
	private FinaceRechargeCarrierMapper finaceRechargeCarrierMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有承运商充值类型信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, FinaceRechargeSetCarrierQueryDTO memberRechargeSetCarrierQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        FinaceRechargeSetCarrierExample memberRechargeSetCarrierExample = new FinaceRechargeSetCarrierExample(); 
        Criteria queryCriteria = memberRechargeSetCarrierExample.createCriteria();
        memberRechargeSetCarrierQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	memberRechargeSetCarrierExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	memberRechargeSetCarrierExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	memberRechargeSetCarrierExample.setOrderByClause(jqPager.getOrderBy("temp_finace_recharge_set_carrier_"));
        }
        List<FinaceRechargeSetCarrier>  finaceRechargeSetCarriers = finaceRechargeSetCarrierMapper.selectByExample(memberRechargeSetCarrierExample); // 查询所有承运商列表
        int total = finaceRechargeSetCarrierMapper.countByExample(memberRechargeSetCarrierExample); // 查询总页数
        returnResult.setRows(finaceRechargeSetCarriers);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getMember 
	 * @Description: TODO(根据承运商充值类型Id获取承运商充值类型信息) 
	 * @param @param rechargeSetCarrierId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getRechargeSetCarrier(String memberRechargeSetCarrierId) {
    	FinaceRechargeSetCarrier memberRechargeSetCarrier = finaceRechargeSetCarrierMapper.selectByPrimaryKey(memberRechargeSetCarrierId);
        return memberRechargeSetCarrier;
    }
    
    /**
     * @Title: addRechargeSetCarrier 
     * @Description: TODO(新增承运商充值类型) 
     * @param @param memberRechargeSetCarrier
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addRechargeSetCarrier(FinaceRechargeSetCarrier rechargeSetCarrier) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        FinaceRechargeSetCarrierExample memberRechargeSetCarrierExample = new FinaceRechargeSetCarrierExample();
        int count = 0;
        // 防止承运商充值类型牌号重复
        memberRechargeSetCarrierExample.createCriteria().andRechargeNameEqualTo(rechargeSetCarrier.getRechargeName());
        count = finaceRechargeSetCarrierMapper.countByExample(memberRechargeSetCarrierExample);
        if (count > 0) {
            returnResult.setMsg("承运商充值类型名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        rechargeSetCarrier.setAuditState("authstr");
        rechargeSetCarrier.setRechargeSetId(RandomGUID.getRandomGUID());
        rechargeSetCarrier.setCreater(pricipalUser.getUserId());
        rechargeSetCarrier.setCreateTime(new Date());
        rechargeSetCarrier.setUpdater(pricipalUser.getUserId());
        rechargeSetCarrier.setUpdateTime(new Date());
        count = finaceRechargeSetCarrierMapper.insert(rechargeSetCarrier);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + rechargeSetCarrier.getRechargeName() + "] 承运商充值类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，承运商充值类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: auditRechargeSetCarrier 
     * @Description: TODO(审核承运商充值类型) 
     * @param @param rechargeSetCarrier
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object auditRechargeSetCarrier(FinaceRechargeSetCarrier rechargeSetCarrier) {
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
        count = finaceRechargeSetCarrierMapper.updateByPrimaryKeySelective(rechargeSetCarrier);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + rechargeSetCarrier.getRechargeName() + "] 的充值类型审核操作成功");
        } else {
            returnResult.setMsg("发生未知错误，充值类型审核操作失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editRechargeSetCarrier 
     * @Description: TODO(修改承运商充值类型) 
     * @param @param memberRechargeSetCarrier
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editRechargeSetCarrier(FinaceRechargeSetCarrier rechargeSetCarrier) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        FinaceRechargeSetCarrierExample memberRechargeSetCarrierExample = new FinaceRechargeSetCarrierExample();
        int count = 0;
        // 防止承运商充值类型名称重复
        memberRechargeSetCarrierExample.createCriteria().andRechargeNameEqualTo(rechargeSetCarrier.getRechargeName()).andRechargeSetIdNotEqualTo(rechargeSetCarrier.getRechargeSetId());
        count = finaceRechargeSetCarrierMapper.countByExample(memberRechargeSetCarrierExample);
        if (count > 0) {
            returnResult.setMsg("承运商充值类型名称重复");
            return returnResult;
        }
        
        //根据ID获取承运商充值类型信息
        FinaceRechargeSetCarrier FinaceRechargeSetCarrier_before = (FinaceRechargeSetCarrier) getRechargeSetCarrier(rechargeSetCarrier.getRechargeSetId());
        if(FinaceRechargeSetCarrier_before.getAuditState().equals("pass"))
        	rechargeSetCarrier.setAuditState("pass");
        else
        	rechargeSetCarrier.setAuditState("authstr");
        count = finaceRechargeSetCarrierMapper.updateByPrimaryKeySelective(rechargeSetCarrier);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + rechargeSetCarrier.getRechargeName() + "] 承运商充值类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，承运商充值类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delRechargeSetCarrier 
     * @Description: TODO(删除承运商充值类型) 
     * @param @param rechargeSetCarrierIds
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object delRechargeSetCarrier(List<String> rechargeSetCarrierIds, List<String> rechargeSetCarrierName) {
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
                 // 相关联充值记录
        	   	FinaceRechargeCarrierExample rechargeCarrierExample = new FinaceRechargeCarrierExample();
        	   	rechargeCarrierExample.createCriteria().andRechargeSetIdEqualTo(rechargeSetCarrierIds.get(i));
        		int count = finaceRechargeCarrierMapper.countByExample(rechargeCarrierExample);
                // 判断是否关联
        		if (count <= 0) { 
        			FinaceRechargeSetCarrierExample rechargeSetCarrierExample= new FinaceRechargeSetCarrierExample();
        			rechargeSetCarrierExample.createCriteria().andRechargeSetIdEqualTo(rechargeSetCarrierIds.get(i));
        		      int number = finaceRechargeSetCarrierMapper.deleteByExample(rechargeSetCarrierExample);
        	          rightNumber += number;// 删除成功数据行数量记录 
                 } else { 
                       if(isFlag){ 
        				if(count > 0){
        					result_str=" 数据行第<font style='color:red;font-weight: bold;'>【"+ (i+1) +"】</font>条记录与" + "【承运商充值类型】存在<font style='color:red;font-weight: bold;'>【"+ count + "】</font>条依赖关系," + "须删除【承运商充值信息】中<font style='color:red;font-weight: bold;'>【"+ count + "】</font>条依赖数据    ";
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

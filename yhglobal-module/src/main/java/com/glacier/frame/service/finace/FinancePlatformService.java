/**
 * @Title: FinancePlatformService.java 
 * @Package com.glacier.frame.service.finace 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2014-10-30 上午9:22:00 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-10-30
				修改人：song.jundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：song.jundong 
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
import com.glacier.frame.dao.finace.FinancePlatformDetailMapper;
import com.glacier.frame.dao.finace.FinancePlatformMapper;
import com.glacier.frame.dto.query.finace.FinFinancePlatformQueryDTO;
import com.glacier.frame.entity.finace.FinancePlatform;
import com.glacier.frame.entity.finace.FinancePlatformDetailExample;
import com.glacier.frame.entity.finace.FinancePlatformExample;
import com.glacier.frame.entity.finace.FinancePlatformExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;  
/**
 * @ClassName:  FinancePlatformService
 * @Description: TODO(平台资金)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-10-30  上午9:22:00
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class FinancePlatformService {

	@Autowired
	private FinancePlatformMapper financePlatformMapper; 
	
	@Autowired
	private FinancePlatformDetailMapper financePlatformDetailMapper;
	/**
	 * @Title: getPlatform 
	 * @Description: TODO(根据平台资金记录Id获取平台资金信息) 
	 * @param @param financePlatformId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getPlatform(String financePlatformId) {
    	FinancePlatform financePlatform = financePlatformMapper.selectByPrimaryKey(financePlatformId);
        return financePlatform;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有平台资金信息) 
     * @param @param pfinancePlatformr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(FinFinancePlatformQueryDTO financePlatformQueryDTO,JqPager pager) {
        JqGridReturn returnResult = new JqGridReturn();
        FinancePlatformExample financePlatformExample = new FinancePlatformExample();

        Criteria queryCriteria = financePlatformExample.createCriteria();
        financePlatformQueryDTO.setQueryConditions(queryCriteria);
        
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	financePlatformExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	financePlatformExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	financePlatformExample.setOrderByClause(pager.getOrderBy("temp_finance_platform_"));
        }
        List<FinancePlatform>  financePlatforms = financePlatformMapper.selectByExample(financePlatformExample); // 查询所有平台资金记录列表
        int total = financePlatformMapper.countByExample(financePlatformExample); // 查询总页数
        returnResult.setRows(financePlatforms);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addPlatform 
     * @Description: TODO(新增平台资金) 
     * @param @param financePlatform
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addPlatform(FinancePlatform financePlatform) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal(); 
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        //判断账号代码和账号名称是否相同
        //账号代码
        FinancePlatformExample financePlatformExample = new FinancePlatformExample();
        financePlatformExample.createCriteria().andPlatformCodeEqualTo(financePlatform.getPlatformCode());
        int codeNum = financePlatformMapper.countByExample(financePlatformExample);
        //账号名称
        FinancePlatformExample financePlatformExampleTwo = new FinancePlatformExample();
        financePlatformExampleTwo.createCriteria().andPlatformNameEqualTo(financePlatform.getPlatformName());
        int nameNum = financePlatformMapper.countByExample(financePlatformExampleTwo);
        if(codeNum > 0){
        	returnResult.setMsg("平台资金编号信息不能重复，保存失败");
        	return returnResult;
        }
        if(codeNum > 0 || nameNum >0){
        	returnResult.setMsg("平台资金账号名称信息不能重复，保存失败");
        	return returnResult;
        } 
        //进行赋值
        financePlatform.setPlatformId(RandomGUID.getRandomGUID());
        financePlatform.setAuditState("authstr");
        financePlatform.setCreater(pricipalUser.getUserId());
        financePlatform.setCreateTime(new Date());
        financePlatform.setUpdater(pricipalUser.getUserId());
        financePlatform.setUpdateTime(new Date());
        financePlatform.setBankType("external");//所以新增的资金平台类型都默认为外置账户
        count = financePlatformMapper.insert(financePlatform);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("平台资金信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，平台资金信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editPlatform 
     * @Description: TODO(修改平台资金) 
     * @param @param financePlatform
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false) 
    public Object editPlatform(FinancePlatform financePlatform) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        FinancePlatform financeInfo=financePlatformMapper.selectByPrimaryKey(financePlatform.getPlatformId());
	    if(financeInfo.getAuditState().equals("pass")){
	    	returnResult.setMsg("该账户审核已通过，不能进行内容更改！");
	    	return returnResult;
	    }  
	    //判断账号代码和账号名称是否相同
        //账号代码
        FinancePlatformExample financePlatformExample = new FinancePlatformExample();
        financePlatformExample.createCriteria().andPlatformCodeEqualTo(financePlatform.getPlatformCode()).andPlatformIdNotEqualTo(financePlatform.getPlatformId());
        int codeNum = financePlatformMapper.countByExample(financePlatformExample);
        //账号名称
        FinancePlatformExample financePlatformExampleTwo = new FinancePlatformExample();
        financePlatformExampleTwo.createCriteria().andPlatformNameEqualTo(financePlatform.getPlatformName()).andPlatformIdNotEqualTo(financePlatform.getPlatformId());
        int nameNum = financePlatformMapper.countByExample(financePlatformExampleTwo);
        if(codeNum > 0){
        	returnResult.setMsg("平台资金编号信息不能重复，保存失败");
        	return returnResult;
        }
        if(nameNum >0){
        	returnResult.setMsg("平台资金账号名称信息不能重复，保存失败");
        	return returnResult;
        }  
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        financePlatform.setUpdater(pricipalUser.getUserId());
        financePlatform.setAuditState("authstr");
        financePlatform.setUpdateTime(new Date());
        count = financePlatformMapper.updateByPrimaryKeySelective(financePlatform); 
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("平台资金记录信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，平台资金记录信息修改失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: updatelatform 
     * @Description: TODO(设置默认平台资金) 
     * @param @param financePlatform
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false) 
    public  Object updatePlatform(FinancePlatform financePlatform){  
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal(); 
        //取出默认的资金平台，进行更改
        FinancePlatformExample  financePlatformExample=new FinancePlatformExample();
        financePlatformExample.createCriteria().andBankTypeEqualTo("default");
        List<FinancePlatform> financePlatforms = financePlatformMapper.selectByExample(financePlatformExample);
	    FinancePlatform financePlatDate=financePlatforms.get(0); 
	    FinancePlatform financeInfo=financePlatformMapper.selectByPrimaryKey(financePlatform.getPlatformId());
	    if(financeInfo.getAuditState().equals("pass")==false){
	    	returnResult.setMsg("该账户审核状态不是通过状态，不能进行设置！");
	    	return returnResult;
	    } 
	    if(financePlatDate.getPlatformId().equals(financePlatform.getPlatformId())){
	    	 returnResult.setMsg("该账户已经为默认账户！"); 
	    }else{  
		    financePlatDate.setBankType("external");//更改为外置账户
	        financePlatDate.setUpdater(pricipalUser.getUserId());
	        financePlatDate.setUpdateTime(new Date());
	        financePlatformMapper.updateByPrimaryKeySelective(financePlatDate);//更改以前为默认账户的账号
	        //根据前台传递来的参数，取出对象
	        financeInfo.setBankType("default");//更改为内置账户
	        financeInfo.setUpdater(pricipalUser.getUserId());
	        financeInfo.setUpdateTime(new Date());
	        count = financePlatformMapper.updateByPrimaryKeySelective(financeInfo);
	        if (count == 1) {
	            returnResult.setSuccess(true);
	            returnResult.setMsg("设置默认账户成功！");
	        } else {
	            returnResult.setMsg("发生未知错误，平台资金记录信息修改失败");
	        }
	    } 
        return returnResult;  
    }
    
    /**
     * @Title: auditPlatform 
     * @Description: TODO(审核平台资金信息) 
     * @param @param financePlatform
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false) 
    public Object auditPlatform(FinancePlatform financePlatform) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        FinancePlatform financeInfo=financePlatformMapper.selectByPrimaryKey(financePlatform.getPlatformId());
	    if(financeInfo.getAuditState().equals("authstr")==false){
	    	returnResult.setMsg("该资金平台已进行过审核操作！");
	    	return returnResult;
	    }  
	    if(financePlatform.getAuditState().equals("authstr")){
	    	returnResult.setMsg("无效的操作，请选择审核状态！");
	    	return returnResult;
	    } 
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        financePlatform.setAuditor(pricipalUser.getUserId());
        financePlatform.setAuditTime(new Date());
        financePlatform.setUpdater(pricipalUser.getUserId());
        financePlatform.setUpdateTime(new Date());
        count = financePlatformMapper.updateByPrimaryKeySelective(financePlatform);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + financePlatform.getPlatformName()+ "] 平台资金记录信息已审核");
        } else {
            returnResult.setMsg("发生未知错误，平台资金记录信息审核失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delPlatform 
     * @Description: TODO(删除平台资金记录) 
     * @param @param financePlatformId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false) 
    public Object delPlatform(List<String> financePlatformIds, List<String> platformNames) {
       JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false  
		// 定义删除成功数据行数量
		int rightNumber = 0;
		// 定义返回结果
		String result_str = "";  
		//名称记录
		String result_name="";
		String str=null;
		// 定义是否显示提示
		boolean isFlag = true;
		//数据行长度判断
		if (financePlatformIds.size() > 0) { 
			//匹配删除信息
			for (int i = 0; i < financePlatformIds.size(); i++) {   
                // 相关联平台资金记录
				FinancePlatformDetailExample financePlatformDetailExample = new FinancePlatformDetailExample();
				financePlatformDetailExample.createCriteria().andPlatformIdEqualTo(financePlatformIds.get(i));
				int count = financePlatformDetailMapper.countByExample(financePlatformDetailExample); 
				// 判断是否关联 
				if (count <= 0) {
				    FinancePlatform financeInfo=financePlatformMapper.selectByPrimaryKey(financePlatformIds.get(i));
				    if(financeInfo.getBankType().equals("default")){ 
				    	str="默认账户不能进行删除!";
				    	continue;
				    }  
				 	FinancePlatformExample financePlatformExample = new FinancePlatformExample();
		        	financePlatformExample.createCriteria().andPlatformIdEqualTo(financePlatformIds.get(i)); 
		        	int number = financePlatformMapper.deleteByPrimaryKey(financePlatformIds.get(i));
	                rightNumber += number;// 删除成功数据行数量记录  
                    result_name+=platformNames.get(i)+" ";// 删除成功数据名称记录
                } else { 
                	if(isFlag){ 
						if(count > 0){
							result_str=" 数据行第<font style='color:red;font-weight: bold;'>【"+ (i+1) +"】</font>条记录与" + "【平台资金记录】存在<font style='color:red;font-weight: bold;'>【"+ count + "】</font>条依赖关系," + "须删除【平台资金记录】中<font style='color:red;font-weight: bold;'>【"+ count + "】</font>条依赖数据    ";
							isFlag = false;
						} 
                	}  
               }
			}
		if(str!=null){
			result_str+=str;
		} 
		// 删除成功数量大于0即为操作成功,且提示关联信息
		if(rightNumber>0){
			returnResult.setMsg("成功删除<font style='color:red;font-weight: bold;'>【"+result_name+"】</font> " +result_str);
			returnResult.setSuccess(true);
		}else{
			returnResult.setMsg(result_str.trim());
			returnResult.setSuccess(false);
		     }
	   }
        return returnResult;
    }
}

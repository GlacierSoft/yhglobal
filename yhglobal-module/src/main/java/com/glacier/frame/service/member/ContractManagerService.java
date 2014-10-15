/**
 * @Title: ContractManagerService.java 
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
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.member.MemberContractTypeMapper;
import com.glacier.frame.dao.member.ShipperMemberContractRecordMapper;
import com.glacier.frame.entity.member.MemberContractType;
import com.glacier.frame.entity.member.MemberContractTypeExample;
import com.glacier.frame.entity.member.ShipperMemberContractRecordExample;
import com.glacier.frame.entity.system.User;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/*** 
 * @ClassName:  ContractManagerService
 * @Description: TODO(合同类型管理业务类)
 * @author zhengjunjie
 * @email 1203807137@QQ.com
 * @date 2014-10-08 下午1:40:53
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ContractManagerService {
	
	@Autowired
    private MemberContractTypeMapper memberContractTypeMapper;
	
	@Autowired
	private ShipperMemberContractRecordMapper shipperMemberContractRecordMapper;

	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有合同类型记录信息) 
     * @param @param padvertisementr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
    public Object listAsGrid(JqPager jqPager) {
        JqGridReturn returnResult = new JqGridReturn();
        MemberContractTypeExample memberContractTypExample = new MemberContractTypeExample();
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	memberContractTypExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	memberContractTypExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	memberContractTypExample.setOrderByClause(jqPager.getOrderBy("temp_member_contract_type_"));
        }
        List<MemberContractType>  memberContractTypes = memberContractTypeMapper.selectByExample(memberContractTypExample); // 查询所有广告列表
        int total = memberContractTypeMapper.countByExample(memberContractTypExample); // 查询总页数
        returnResult.setRows(memberContractTypes);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
	
    /**
     * @Title: getContractManager 
     * @Description: TODO(获取单个合同类型记录信息) 
     * @param @param contractTypeId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
    public Object getContractManager(String contractTypeId) {
    	MemberContractType accountInvest = memberContractTypeMapper.selectByPrimaryKey(contractTypeId);
		return accountInvest;
	}
    
    /**
     * @Title: addContractManager 
     * @Description: TODO(添加合同类型记录信息) 
     * @param @param memberContractType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
    @Transactional(readOnly = false)
    public Object addContractManager(MemberContractType memberContractType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal(); 
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        memberContractType.setContractTypeId(RandomGUID.getRandomGUID());
        memberContractType.setCreater(pricipalUser.getUserId());
        memberContractType.setCreateTime(new Date());
        memberContractType.setUpdater(pricipalUser.getUserId());
        memberContractType.setUpdateTime(new Date());
        int count=0;
        count = memberContractTypeMapper.insert(memberContractType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("新增合同类型操作成功");
        } else {
            returnResult.setMsg("发生未知错误，新增合同类型保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editContractManager 
     * @Description: TODO(修改合同类型记录信息) 
     * @param @param memberContractType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
    @Transactional(readOnly = false)
    public Object editContractManager(MemberContractType memberContractType) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        memberContractType.setUpdater(pricipalUser.getUserId());
        memberContractType.setUpdateTime(new Date());
        count = memberContractTypeMapper.updateByPrimaryKeySelective(memberContractType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("合同类型修改操作成功");
         } else {
            returnResult.setMsg("发生未知错误，合同类型信息修改失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delContractManager 
     * @Description: TODO(删除合同类型记录信息) 
     * @param @param contractTypeIds
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
    @Transactional(readOnly = false)
    public Object delContractManager(List<String> contractTypeIds) {
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int rightNumber = 0;
        boolean flag=true;
        String result_str="";
        if (contractTypeIds.size() > 0) {
            for(int i=0;i<contractTypeIds.size();i++){
            	//判断是否关联
            	ShipperMemberContractRecordExample shipperMemberContractRecordExample=new ShipperMemberContractRecordExample(); 
            	shipperMemberContractRecordExample.createCriteria().andContractTypeIdEqualTo(contractTypeIds.get(i));
            	int count=shipperMemberContractRecordMapper.countByExample(shipperMemberContractRecordExample);
            	if(count<=0){
            		MemberContractTypeExample memberContractTypExample = new MemberContractTypeExample();
                	memberContractTypExample.createCriteria().andContractTypeIdEqualTo(contractTypeIds.get(i));
                	int number = memberContractTypeMapper.deleteByExample(memberContractTypExample);
        	        rightNumber += number;// 删除成功数据行数量记录 
            	}else{
            		if(flag){
            			result_str="数据行第<font style='color:red;font-weight: bold;'>【"+ (i+1) +"】</font>条记录与【会员合同记录】存在<font style='color:red;font-weight: bold;'>【"+ count + "】</font>条依赖关系," + "须删除【会员合同记录】中<font style='color:red;font-weight: bold;'>【"+ count + "】</font>条依赖数据    ";
    					flag = false;
            		}
            	}
            }
        }
        if(rightNumber>0){
        	returnResult.setMsg("成功删除<font style='color:red;font-weight: bold;'>【"+ rightNumber +"】</font> 条合同类型信息数据!"+result_str);
			returnResult.setSuccess(true);
        }else{
        	returnResult.setMsg("发生未知错误，合同类型信息删除失败!"+result_str);
			returnResult.setSuccess(false);
        }
        return returnResult;
    }
    
    /**
     * @Title: changeContractType 
     * @Description: TODO(启用/禁用合同类型记录信息) 
     * @param @param contractTypeId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
    @Transactional(readOnly = false)
    public Object changeContractType(String contractTypeId){
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
    	MemberContractType accountInvest = memberContractTypeMapper.selectByPrimaryKey(contractTypeId);
    	String str="";
    	if(accountInvest.getStatus().equals("enable")){
    		accountInvest.setStatus("disable");
    		str="禁用";
    	}else{
    		accountInvest.setStatus("enable");
    		str="启用";
    	}
    	int count=memberContractTypeMapper.updateByPrimaryKeySelective(accountInvest);
    	if(count==1){
    		returnResult.setSuccess(true);
    		returnResult.setMsg("【"+accountInvest.getContractTypeName()+"】合同类型"+str+"操作成功!");
    	}else{
    	   returnResult.setSuccess(true);
   		   returnResult.setMsg("发生未知错误,【"+accountInvest.getContractTypeName()+"】合同类型"+str+"操作失败!");
    	}
    	return returnResult;
    }
    
}

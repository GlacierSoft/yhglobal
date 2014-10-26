/**
 * @Title: StorehouseDamageService.java 
 * @Package com.glacier.frame.service.storehouse 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-10-21 上午11:13:46 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-10-21
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.service.storehouse;

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
import com.glacier.frame.dao.storehouse.StorehouseBelaidupMapper;
import com.glacier.frame.dao.storehouse.StorehouseDamageMapper;
import com.glacier.frame.dto.query.storehouse.StorehouseDamageQueryDTO;
import com.glacier.frame.entity.storehouse.StorehouseBelaidup;
import com.glacier.frame.entity.storehouse.StorehouseDamage;
import com.glacier.frame.entity.storehouse.StorehouseDamageExample;
import com.glacier.frame.entity.storehouse.StorehouseDamageExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName: StorehouseDamageService 
 * @Description: 货物损坏记录业务层
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-10-21 上午11:13:46
 */

@Service
@Transactional(readOnly=true,propagation=Propagation.REQUIRED)
public class StorehouseDamageService {
   
       @Autowired
       private StorehouseDamageMapper storehouseDamageMapper;
       
       @Autowired
       private StorehouseBelaidupMapper storehouseBelaidupMapper;
       
       /**
	    * 
	    * @Title: listAsGrid 
	    * @Description: TODO(获取货品损坏记录信息) 
	    * @param  @param jqPager，storehouseStorageGoodsrunQueryDTO，q
	    * @param  @return 设定文件返回类型 
	    * @throws 
	    * 备注<p>已检查测试:Green<p>
	    */
	public Object listAsGrid(JqPager jqPager, StorehouseDamageQueryDTO storehouseDamageQueryDTO, String q) {
	    JqGridReturn returnResult = new JqGridReturn();
	    StorehouseDamageExample storehouseDamageExample = new StorehouseDamageExample();
	    Criteria queryCriteria = storehouseDamageExample.createCriteria();
	    storehouseDamageQueryDTO.setQueryCondition(queryCriteria, q);
	    if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
	    	storehouseDamageExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
	    	storehouseDamageExample.setLimitEnd(jqPager.getRows());
	    }
	    if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
	    	storehouseDamageExample.setOrderByClause(jqPager.getOrderBy("temp_storehouse_damage_"));
	    }
	    List<StorehouseDamage>  storehouseDamages = storehouseDamageMapper.selectByExample(storehouseDamageExample); // 查询所有广告列表
	    int total = storehouseDamageMapper.countByExample(storehouseDamageExample); // 查询总页数
	    returnResult.setRows(storehouseDamages);
	    returnResult.setTotal(total);
	    return returnResult;// 返回ExtGrid表
	 }
	
	
	  /**
	    * 
	    * @Title: getStorehouseStorageGoodsrunPro 
	    * @Description: TODO(获取货品损坏记录信息) 
	    * @param  @param damageId
	    * @param  @return
	    * @throws 
	    * 备注<p>已检查测试:Green<p>
	    */
		public Object getStorehouseDamagePro(String damageId) {
			StorehouseDamage storehouseDamage = storehouseDamageMapper.selectByPrimaryKey(damageId);
			return storehouseDamage;
		}
		
		
		/**
	     * @Title: auditStorehouseDamage 
	     * @Description: TODO(审核货物损坏记录信息) 
	     * @param @param shipperMemberBankCard
	     * @param @return    设定文件 
	     * @return Object    返回类型 
	     * @throws
	     */ 
	    @Transactional(readOnly = false)
	    public Object auditStorehouseDamage(StorehouseDamage storehouseDamage) {
	       JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
	       int count = 0;
	       if(storehouseDamage.getAuditStatus().equals("authstr")){
	    	 returnResult.setMsg("货物损坏信息中审核状态不可为【审核中】，请重新操作!");
		   }else{
	    	 Subject pricipalSubject = SecurityUtils.getSubject();
		     User pricipalUser = (User) pricipalSubject.getPrincipal();
		     storehouseDamage.setUpdater(pricipalUser.getUserId());
		     storehouseDamage.setUpdateTime(new Date());
		     count = storehouseDamageMapper.updateByPrimaryKeySelective(storehouseDamage);
		     if (count == 1) {
		        returnResult.setSuccess(true);
		        returnResult.setMsg("货物损坏信息审核操作成功!");
		     } else {
		    	returnResult.setMsg("货物损坏信息审核操作失败!");
		     }
		}
	    return returnResult;
	}
	    
	    /**
	     * @Title: checkStoreDamageNumb 
	     * @Description: T损坏记录添加
	     * @param @param belaidupId
	     * @param @return    设定文件 
	     * @return Object    返回类型 
	     * @throws
	     */   
	 @Transactional(readOnly = false)
     public Object addStoreDamageNumb(List<String> belaidupIds){
    	Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal(); 
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
    	int damage_add_count=0;//记录添加损坏数量
    	for(String belaidupId:belaidupIds){
    		 StorehouseBelaidup  storehouseBelaidup=storehouseBelaidupMapper.selectByPrimaryKey(belaidupId); 
    		 if(storehouseBelaidup.getSortingStauts().equals("waitsorting")){
    			 StorehouseDamageExample storehouseDamageExample = new StorehouseDamageExample();
    			 storehouseDamageExample.createCriteria().andBelaidupIdEqualTo(belaidupId);
    			 int count=storehouseDamageMapper.countByExample(storehouseDamageExample);
    			 if(count<=0){
    				 StorehouseDamage storehouseDamage=new StorehouseDamage();
    				 storehouseDamage.setDamageId(RandomGUID.getRandomGUID());
    				 storehouseDamage.setBelaidupId(belaidupId);
   	    	         storehouseDamage.setRemark("损坏");
   	    	         storehouseDamage.setYesOrNo("no");
   	    	         storehouseDamage.setAuditStatus("authstr");
   	    	         storehouseDamage.setAuditOpinion("损坏");
   	    	         storehouseDamage.setAuditor(pricipalUser.getUserId());
   	    	         storehouseDamage.setAuditDate(new Date());
   	    	         storehouseDamage.setCreater(pricipalUser.getUserId());
   	    	         storehouseDamage.setCreateTime(new Date());
   	    	         storehouseDamage.setUpdater(pricipalUser.getUserId());
   	    	         storehouseDamage.setUpdateTime(new Date());
   	    	         int numb= storehouseDamageMapper.insert(storehouseDamage);
   	    	         damage_add_count+=numb;
    			 }
    		 }
    	}  
    	 if(damage_add_count==0){
    		 returnResult.setSuccess(false);
    		 returnResult.setMsg("【"+belaidupIds.size()+"】条货物信息添加损坏记录失败!");
    	 }else{
    		 returnResult.setSuccess(true);
    		 returnResult.setMsg("【"+damage_add_count+"】条货物信息添加损坏记录成功!");
    	 }
    	return returnResult;
  }
	   
	     /**
	     * @Title: checkStoreDamageNumb 
	     * @Description: T损坏记录添加
	     * @param @param belaidupId
	     * @param @return    设定文件 
	     * @return Object    返回类型 
	     * @throws
	     */   
	    public Object checkStoreDamageNumb(String belaidupId){ 
	    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
	    	StorehouseDamageExample storehouseDamageExample = new StorehouseDamageExample();
	    	storehouseDamageExample.createCriteria().andBelaidupIdEqualTo(belaidupId);
	    	int count=storehouseDamageMapper.countByExample(storehouseDamageExample);
	    	if(count<0){
	    		returnResult.setSuccess(true);
	    	}else{
	    		returnResult.setSuccess(false);
	    	}
	    		return returnResult;
	    }
	    
}

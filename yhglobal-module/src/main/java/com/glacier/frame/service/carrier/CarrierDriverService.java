/**
 * @Title: CarrierDriverService.java 
 * @Package com.glacier.frame.service.carrier 
 * @author songjundong
 * @email 985776597@qq.com
 * @date 2014-10-28 下午1:32:04 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-10-28
				修改人：songjundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：songjundong
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

import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.carrier.CarrierDriverMapper;
import com.glacier.frame.dao.orders.OrdersDispatchingMapper;
import com.glacier.frame.dto.query.carrier.CarrierDriverQueryDTO;
import com.glacier.frame.entity.carrier.CarrierDriver;
import com.glacier.frame.entity.carrier.CarrierDriverExample;
import com.glacier.frame.entity.carrier.CarrierMember;
import com.glacier.frame.entity.carrier.CarrierDriverExample.Criteria;
import com.glacier.frame.entity.orders.OrdersDispatchingExample;
import com.glacier.frame.entity.system.User;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName:  CarrierDriverService
 * @Description: TODO(驾驶员service)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date2014-10-28 下午1:32:04 
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class CarrierDriverService {
    
	@Autowired
	private CarrierDriverMapper carrierDriverMapper;
	
	@Autowired
	private OrdersDispatchingMapper ordersDispatchingMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有驾驶员信息) 
     * @param @param jqPager，carrierDriverQueryDTO，q
     * @param @return    设定文件 
     * @return Object    返回类型
     * @throws
     */ 
	public Object listAsGrid(JqPager jqPager, CarrierDriverQueryDTO carrierDriverQueryDTO, String q) {
        JqGridReturn returnResult = new JqGridReturn();
        CarrierDriverExample carrierDriverExample = new CarrierDriverExample();
        Criteria queryCriteria = carrierDriverExample.createCriteria();
        carrierDriverQueryDTO.setQueryCondition(queryCriteria, q);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	carrierDriverExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	carrierDriverExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	carrierDriverExample.setOrderByClause(jqPager.getOrderBy("temp_carrier_driver_"));
        }
        List<CarrierDriver>  carrierDrivers = carrierDriverMapper.selectByExample(carrierDriverExample); // 查询所有广告列表
        int total = carrierDriverMapper.countByExample(carrierDriverExample); // 查询总页数
        returnResult.setRows(carrierDrivers);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
	}
	
	/**
	 * @Title: getDriver  
	 * @Description: TODO(获取驾驶员信息)  
	 * @param @param driverId
	 * @param @return    设定文件  
	 * @return CarrierDriver    返回类型  
	 * @throws
	 */
	public Object getDriver(String id){ 
		CarrierDriver carrierDriver=carrierDriverMapper.selectByPrimaryKey(id);
		return carrierDriver;
	}
	
	/** 
	 * @Title: addDriver  
	 * @Description: TODO(新增驾驶员)  
	 * @param @return    设定文件  
	 * @return Object    返回类型  
	 * @throws
	 */
	@Transactional(readOnly = false)
	public Object addDriver(CarrierDriver carrierDriver){ 
		 JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
		 Subject pricipalSubject = SecurityUtils.getSubject();
	     CarrierMember pricipalUser = (CarrierMember) pricipalSubject.getPrincipal();
		 carrierDriver.setDriverId(RandomGUID.getRandomGUID());
		 carrierDriver.setCreater(pricipalUser.getCarrierMemberId());
		 carrierDriver.setCarrierMemberId(pricipalUser.getCarrierMemberId());
		 carrierDriver.setCreateTime(new Date());
		 carrierDriver.setUpdater(pricipalUser.getCarrierMemberId());
		 carrierDriver.setUpdateTime(new Date());
		 carrierDriver.setAuditState("authstr");
		 carrierDriver.setDriverStatus("wait");   
		 int count=carrierDriverMapper.insertSelective(carrierDriver);
		 if(count>0){
			 returnResult.setSuccess(true);
			 returnResult.setMsg("新增驾驶员成功！");
		 }else{
			 returnResult.setMsg("发送未知错误，信息保存失败。");
		 }
		return returnResult; 
	}  
	
	/** 
	 * @Title: editDriver  
	 * @Description: TODO(修改驾驶员信息)  
	 * @param @param carrierDriver
	 * @param @return    设定文件  
	 * @return Object    返回类型  
	 * @throws
	 */
	@Transactional(readOnly = false)
	public Object editDriver(CarrierDriver carrierDriver){ 
		 JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
		 Subject pricipalSubject = SecurityUtils.getSubject();
	     CarrierMember pricipalUser = (CarrierMember) pricipalSubject.getPrincipal();
		 CarrierDriver driver=carrierDriverMapper.selectByPrimaryKey(carrierDriver.getDriverId());
		 if(driver.getAuditState().equals("pass")){
			returnResult.setMsg("该驾驶员信息已经审核通过了，不能更改！");
			return returnResult;
		 } 
		 carrierDriver.setCarrierMemberId(driver.getCarrierMemberId());
		 carrierDriver.setUpdater(pricipalUser.getCarrierMemberId());
		 carrierDriver.setUpdateTime(new Date());
		 carrierDriver.setAudit(driver.getAudit());
		 carrierDriver.setAuditTime(driver.getAuditTime());
		 carrierDriver.setAuditState("authstr");
		 carrierDriver.setAuditOpinion(driver.getAuditOpinion());
		 carrierDriver.setCreater(driver.getCreater());
		 carrierDriver.setCreateTime(driver.getCreateTime());
		 int count=carrierDriverMapper.updateByPrimaryKey(carrierDriver);
		 if(count>0){
			 returnResult.setSuccess(true);
			 returnResult.setMsg("驾驶员信息修改成功！");
		 }else{
			 returnResult.setMsg("发送未知错误，驾驶员信息修改失败！");
		 }
		 return returnResult;
	}
	
	/** 
	 * @Title: auditDriver  
	 * @Description: TODO(驾驶员审核)  
	 * @param @param carrierDriver
	 * @param @return    设定文件  
	 * @return Object    返回类型  
	 * @throws
	 */
	@Transactional(readOnly = false)
	public Object auditDriver(CarrierDriver carrierDriver){
		 JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
		 Subject pricipalSubject = SecurityUtils.getSubject();
		 CarrierDriver driver = carrierDriverMapper.selectByPrimaryKey(carrierDriver.getDriverId());
		 if(driver.getAuditState().equals("authstr")==false){
			 returnResult.setMsg("该驾驶员已经进行过审核操作，不可再审核");
			 return returnResult;
		 } 
		 User pricipalUser = (User) pricipalSubject.getPrincipal();
		 driver.setAudit(pricipalUser.getUserId());
		 driver.setAuditState(carrierDriver.getAuditState());
		 driver.setAuditOpinion(carrierDriver.getAuditOpinion());
		 driver.setAuditTime(new Date());
		 int count=carrierDriverMapper.updateByPrimaryKeySelective(driver);
		 if(count>0){
			 returnResult.setSuccess(true);
			 returnResult.setMsg("审核操作成功。");
		 }else{
			 returnResult.setMsg("发生未知错误，信息审核失败！");
		 }
		 return returnResult;
	}
	 
	/** 
	 * @Title: delDriver  
	 * @Description: TODO(批量删除驾驶员)  
	 * @param @param driverIds
	 * @param @param driverNames
	 * @param @return    设定文件  
	 * @return Object    返回类型  
	 * @throws
	 */
	@Transactional(readOnly = false)
	public Object delDriver(List<String> driverIds){
		 JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
		 int i=0;
		 int n=0;
		 if(driverIds.size()>0){
			 for (String id : driverIds) { 
				 OrdersDispatchingExample ordersDispatchingExample=new OrdersDispatchingExample();
				 ordersDispatchingExample.createCriteria().andDriverIdEqualTo(id);
				 int count=ordersDispatchingMapper.selectByExample(ordersDispatchingExample).size();
			     if(count>0){
			    	n++;
			    	continue;
			     }
			     carrierDriverMapper.deleteByPrimaryKey(id);
			     i++; 
			 }
			 returnResult.setSuccess(true);
			 if(n==0){ 
				 returnResult.setMsg("成功的删除了【"+i+"】条数据");
			 }else{
				 returnResult.setMsg("成功的删除了【"+i+"】条数据,其中有【"+n+"】条数据存在关联关系,请先删除关联数据,再进行删除操作！");
			 }
		 }else{
			 returnResult.setMsg("删除列表为空！");
		 } 
		 return returnResult;
	}
	
}

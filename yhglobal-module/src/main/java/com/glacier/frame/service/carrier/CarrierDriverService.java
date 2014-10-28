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
import com.glacier.frame.dto.query.carrier.CarrierDriverQueryDTO;
import com.glacier.frame.entity.carrier.CarrierDriver;
import com.glacier.frame.entity.carrier.CarrierDriverExample;
import com.glacier.frame.entity.carrier.CarrierMember;
import com.glacier.frame.entity.carrier.CarrierDriverExample.Criteria;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;


@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class CarrierDriverService {
    
	@Autowired
	private CarrierDriverMapper carrierDriverMapper;
	
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
		 int count=carrierDriverMapper.insert(carrierDriver);
		 if(count>0){
			 returnResult.setSuccess(true);
			 returnResult.setMsg("新增驾驶员成功！");
		 }else{
			 returnResult.setMsg("发送未知错误，信息保存失败。");
		 }
		return returnResult; 
	}  
}

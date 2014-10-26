package com.glacier.frame.service.carrier;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.frame.dao.carrier.CarrierDriverMapper;
import com.glacier.frame.dto.query.carrier.CarrierDriverQueryDTO;
import com.glacier.frame.entity.carrier.CarrierDriver;
import com.glacier.frame.entity.carrier.CarrierDriverExample;
import com.glacier.frame.entity.carrier.CarrierDriverExample.Criteria;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;


@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class CarrierDriverService {
    
	@Autowired
	private CarrierDriverMapper carrierDriverMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员银行卡记录信息) 
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
	
}

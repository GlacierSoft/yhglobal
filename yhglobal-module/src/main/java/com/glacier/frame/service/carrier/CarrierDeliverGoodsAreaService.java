/**
 * @Title: CarrierDeliverGoodsAreaService.java 
 * @Package com.glacier.frame.service.carrier 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2014-11-17 下午3:03:38 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-11-17
				修改人：song.jundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：song.jundong 
 * 
 */
package com.glacier.frame.service.carrier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.frame.dao.carrier.CarrierDeliverGoodsAreaMapper;
import com.glacier.frame.entity.carrier.CarrierDeliverGoodsArea;

/**
 * @ClassName:  CarrierDeliverGoodsAreaService
 * @Description: TODO(发货区域service)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-11-17  下午3:03:38
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class CarrierDeliverGoodsAreaService {

	@Autowired
	private CarrierDeliverGoodsAreaMapper carrierDeliverMapper;
	
	/** 
	 * @Title: selectOne  
	 * @Description: TODO(查询某个发货区域的详细信息)  
	 * @param @param id
	 * @param @return    设定文件  
	 * @return CarrierDeliverGoodsArea    返回类型  
	 * @throws
	 */
	public CarrierDeliverGoodsArea selectOne(String id){
		return carrierDeliverMapper.selectByPrimaryKey(id);
	}
}

/**
 * @Title: CarrierPickUpGoodsArea.java 
 * @Package com.glacier.frame.service.carrier 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2014-11-17 下午3:25:44 
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

import com.glacier.frame.dao.carrier.CarrierPickUpgoodsAreaMapper;
import com.glacier.frame.entity.carrier.CarrierPickUpgoodsArea;

/**
 * @ClassName:  CarrierPickUpGoodsArea
 * @Description: TODO(收货区域service)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-11-17  下午3:25:44
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class CarrierPickUpGoodsAreaService {
 
	@Autowired
	private CarrierPickUpgoodsAreaMapper carrierPickMapper;
	
	/**
	 * 
	 * @Title: selectOne  
	 * @Description: TODO(查询某个收货区域站点的详细信息)  
	 * @param @param id
	 * @param @return    设定文件  
	 * @return CarrierPickUpgoodsArea    返回类型  
	 * @throws
	 */
	public CarrierPickUpgoodsArea  selectOne(String id){
		return carrierPickMapper.selectByPrimaryKey(id);
	}
}

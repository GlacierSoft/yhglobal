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

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.frame.dao.storehouse.StorehouseDamageMapper;
import com.glacier.frame.dto.query.storehouse.StorehouseDamageQueryDTO;
import com.glacier.frame.entity.storehouse.StorehouseDamage;
import com.glacier.frame.entity.storehouse.StorehouseDamageExample;
import com.glacier.frame.entity.storehouse.StorehouseDamageExample.Criteria;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: StorehouseDamageService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-10-21 上午11:13:46
 */

@Service
@Transactional(readOnly=true,propagation=Propagation.REQUIRED)
public class StorehouseDamageService {
   
       @Autowired
       private StorehouseDamageMapper storehouseDamageMapper;
       
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
		
}

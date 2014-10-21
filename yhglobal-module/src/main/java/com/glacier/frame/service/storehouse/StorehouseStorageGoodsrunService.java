/**
 * @Title: StorehouseStorageGoodsrunService.java 
 * @Package com.glacier.frame.service.storehouse 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-10-21 上午9:58:10 
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


import com.glacier.frame.dao.storehouse.StorehouseStorageGoodsrunMapper;
import com.glacier.frame.dto.query.storehouse.StorehouseStorageGoodsrunQueryDTO;
import com.glacier.frame.entity.storehouse.StorehouseStorageGoodsrun;
import com.glacier.frame.entity.storehouse.StorehouseStorageGoodsrunExample;
import com.glacier.frame.entity.storehouse.StorehouseStorageGoodsrunExample.Criteria;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName: StorehouseStorageGoodsrunService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-10-21 上午9:58:10
 */
@Service
@Transactional(readOnly=true,propagation=Propagation.REQUIRED)

public class StorehouseStorageGoodsrunService {
	
	@Autowired
	private StorehouseStorageGoodsrunMapper storehouseStorageGoodsrunMapper;
	
	 /**
	    * 
	    * @Title: listAsGrid 
	    * @Description: TODO(获取仓库货品流动记录信息) 
	    * @param  @param jqPager，storehouseStorageGoodsrunQueryDTO，q
	    * @param  @return 设定文件返回类型 
	    * @throws 
	    * 备注<p>已检查测试:Green<p>
	    */
	public Object listAsGrid(JqPager jqPager, StorehouseStorageGoodsrunQueryDTO storehouseStorageGoodsrunQueryDTO, String q) {
	    JqGridReturn returnResult = new JqGridReturn();
	    StorehouseStorageGoodsrunExample storehouseStorageGoodsrunExample = new StorehouseStorageGoodsrunExample();
	    Criteria queryCriteria = storehouseStorageGoodsrunExample.createCriteria();
	    storehouseStorageGoodsrunQueryDTO.setQueryCondition(queryCriteria, q);
	    if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
	    	storehouseStorageGoodsrunExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
	    	storehouseStorageGoodsrunExample.setLimitEnd(jqPager.getRows());
	    }
	    if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
	    	storehouseStorageGoodsrunExample.setOrderByClause(jqPager.getOrderBy("temp_storehouse_storage_goodsrun_"));
	    }
	    List<StorehouseStorageGoodsrun>  storehouseStorageGoodsruns = storehouseStorageGoodsrunMapper.selectByExample(storehouseStorageGoodsrunExample); // 查询所有广告列表
	    int total = storehouseStorageGoodsrunMapper.countByExample(storehouseStorageGoodsrunExample); // 查询总页数
	    returnResult.setRows(storehouseStorageGoodsruns);
	    returnResult.setTotal(total);
	    return returnResult;// 返回ExtGrid表
	 }
	
	  /**
	    * 
	    * @Title: getStorehouseStorageGoodsrunPro 
	    * @Description: TODO(获取仓库货品流动记录信息) 
	    * @param  @param goodsrunId
	    * @param  @return
	    * @throws 
	    * 备注<p>已检查测试:Green<p>
	    */
		public Object getStorehouseStorageGoodsrunPro(String goodsrunId) {
			StorehouseStorageGoodsrun storehouseStorageGoodsrun = storehouseStorageGoodsrunMapper.selectByPrimaryKey(goodsrunId);
			return storehouseStorageGoodsrun;
		}
		
		/**
		 * 
		 * @Title: changeStorehouseStorageGoodsrunType 
		 * @Description: TODO(货物流动记录信息审核方法) 
		 * @param  @param goodsrunId
		 * @param  @return
		 * @throws 
		 * 备注<p>已检查测试:Green<p>
		 */
	    @Transactional(readOnly = false)
	    public Object changeStorehouseStorageGoodsrunType(String goodsrunId){
	    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
	    	StorehouseStorageGoodsrun storehouseStorageGoodsrun = storehouseStorageGoodsrunMapper.selectByPrimaryKey(goodsrunId);
	    	String str="";
	    	if(storehouseStorageGoodsrun.getStatus().equals("enable")){
	    		storehouseStorageGoodsrun.setStatus("disable");
	    		str="禁用";
	    	}else{
	    		storehouseStorageGoodsrun.setStatus("enable");
	    		str="启用";
	    	}
	    	int count=storehouseStorageGoodsrunMapper.updateByPrimaryKeySelective(storehouseStorageGoodsrun);
	    	if(count==1){
	    		returnResult.setSuccess(true);
	    		returnResult.setMsg("【"+storehouseStorageGoodsrun.getBelaidupDisplay()+"】货物流动记录信息"+str+"操作成功!");
	    	}else{
	    	   returnResult.setSuccess(true);
	   		   returnResult.setMsg("发生未知错误,【"+storehouseStorageGoodsrun.getBelaidupDisplay()+"】货物流动记录信息"+str+"操作失败!");
	    	}
	    	return returnResult;
	    }
}

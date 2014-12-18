/**
 * @Title: StorehouseBelaidupSourceService.java 
 * @Package com.glacier.frame.service.storehouse 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-12-18 下午1:51:21 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-12-18
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

import com.glacier.frame.dao.storehouse.StorehouseBelaidupSourceMapper;
import com.glacier.frame.dto.query.storehouse.StorehouseBelaidupSourceQueryDTO;
import com.glacier.frame.entity.storehouse.StorehouseBelaidupSource;
import com.glacier.frame.entity.storehouse.StorehouseBelaidupSourceExample;
import com.glacier.frame.entity.storehouse.StorehouseBelaidupSourceExample.Criteria;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: StorehouseBelaidupSourceService 
 * @Description: TODO(货源管理服务层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-12-18 下午1:51:21
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class StorehouseBelaidupSourceService {
   
	  @Autowired
	  private StorehouseBelaidupSourceMapper storehouseBelaidupSourceMapper;
	  
	  
	    /**
	     * @Title: listAsWebsite 
	     * @Description: TODO(前台获取登录会员货源发布记录) 
	     * @param @param pager
	     * @param @param memberId
	     * @param @return    设定文件 
	     * @return Object    返回类型 
	     * @throws
	     */
	    public Object listAsWebsite(JqPager pager, StorehouseBelaidupSourceQueryDTO storehouseBelaidupSourceQueryDTO,int p) {
	        JqGridReturn returnResult = new JqGridReturn();
	        StorehouseBelaidupSourceExample storehouseBelaidupSourceExample = new StorehouseBelaidupSourceExample();
	        Criteria criteria = storehouseBelaidupSourceExample.createCriteria();
	        storehouseBelaidupSourceQueryDTO.setQueryCondition(criteria);//前台条件查询
	        
	        pager.setSort("createTime");// 定义排序字段
	        pager.setOrder("DESC");// 升序还是降序
	        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
	        	storehouseBelaidupSourceExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
	        	storehouseBelaidupSourceExample.setLimitEnd(pager.getRows());
	        }
	        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
	        	storehouseBelaidupSourceExample.setOrderByClause(pager.getOrderBy("temp_storehouse_belaidup_source_"));
	        }
	        int startTemp = ((p-1)*5);//根据前台返回的页数进行设置
	        storehouseBelaidupSourceExample.setLimitStart(startTemp);
	        storehouseBelaidupSourceExample.setLimitEnd(5);
	        List<StorehouseBelaidupSource>  StorehouseBelaidups = storehouseBelaidupSourceMapper.selectByExample(storehouseBelaidupSourceExample); // 查询所有会员资金记录列表
	        int total = storehouseBelaidupSourceMapper.countByExample(storehouseBelaidupSourceExample); // 查询总页数
	        returnResult.setRows(StorehouseBelaidups);
	        returnResult.setTotal(total);
	        returnResult.setP(p);
	        return returnResult;// 返回ExtGrid表
	    }
	    
	    /**
	     * @Title: listAsWebsite 
	     * @Description: TODO(前台获取登录会员货源发布详细) 
	     * @param @param pager
	     * @param @param memberId
	     * @param @return    设定文件 
	     * @return Object    返回类型 
	     * @throws
	     */
	    public Object getBelaidup(String belaidupId) {
	    	StorehouseBelaidupSource storehouseBelaidupSource = storehouseBelaidupSourceMapper.selectByPrimaryKey(belaidupId);
	        return storehouseBelaidupSource;
	    } 
	  
}

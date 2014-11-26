/**
 * @Title: OrdersOrderService.java 
 * @Package com.glacier.global.service.OrdersOrder
 * @author wuting   
 * @email 920339213@qq.com
 * @date 2014-10-14
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.00          
 * @Review (审核人) ：wuting
 * 
 */
package com.glacier.frame.service.orders; 
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
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
import com.glacier.frame.dao.orders.OrdersOrderInfoMapper;
import com.glacier.frame.dao.orders.OrdersOrderMapper;
import com.glacier.frame.dao.storehouse.StorehouseBelaidupMapper;
import com.glacier.frame.dto.query.orders.OrdersOrderQueryDTO;
import com.glacier.frame.entity.orders.OrdersOrder;
import com.glacier.frame.entity.orders.OrdersOrderExample;
import com.glacier.frame.entity.orders.OrdersOrderExample.Criteria;
import com.glacier.frame.entity.orders.OrdersOrderInfo;
import com.glacier.frame.entity.orders.OrdersOrderInfoExample;
import com.glacier.frame.entity.storehouse.StorehouseBelaidup;
import com.glacier.frame.entity.system.User;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
/*** 
 * @ClassName:  OrdersOrderService
 * @Description: TODO(订单表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-15
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class OrdersOrderService {

	@Autowired
	private OrdersOrderMapper orderMapper;
	
	@Autowired
	private OrdersOrderInfoMapper order_InfoMapper;
	
	@Autowired
	private StorehouseBelaidupMapper belaidupMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有订单信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, OrdersOrderQueryDTO orderQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        OrdersOrderExample orderExample = new OrdersOrderExample(); 
        Criteria queryCriteria = orderExample.createCriteria();
        orderQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	orderExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	orderExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	orderExample.setOrderByClause(jqPager.getOrderBy("temp_orders_order_"));
        }
        List<OrdersOrder> orderTypeList = orderMapper.selectByExample(orderExample); // 查询所有会员列表
        int total = orderMapper.countByExample(orderExample); // 查询总页数
        returnResult.setRows(orderTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getOrder 
	 * @Description: TODO(根据订单Id获取订单信息) 
	 * @param @param orderId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getOrder(String orderId) {
    	OrdersOrder carrierCarType = orderMapper.selectByPrimaryKey(orderId);
        return carrierCarType;
    }
    
    public static BigDecimal add(BigDecimal d1, BigDecimal d2)
    {        // 进行加法运算
             //BigDecimal b1 = new BigDecimal(d1);
             //BigDecimal b2 = new BigDecimal(d2);
            return d1.add(d2);
    }
    
    /**
     * @Title: addOrder 
     * @Description: TODO(新增订单) 
     * @param @param order
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
	@Transactional(readOnly = false)
    public Object addOrder(List<String> belaidupIds, List<String> belaidupName) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        //判断该货物是否已分拣
        for (String belaidupId : belaidupIds) {
        	StorehouseBelaidup belaidup = belaidupMapper.selectByPrimaryKey(belaidupId);
        	if(belaidup.getSortingStauts().equals("hassorting")){
        		returnResult.setSuccess(false);
                returnResult.setMsg("[" + belaidup.getBelaidupProdName() + "] 货物信息已分拣,请重新选择！");
                return returnResult;
        	}
		}
        //判断终点目的
        if(belaidupIds.size() > 1){
        	StorehouseBelaidup belaidupTerminu = belaidupMapper.selectByPrimaryKey(belaidupIds.get(0));
        	String firstTerminu = belaidupTerminu.getBelaidupTerminu().substring(0, belaidupTerminu.getBelaidupTerminu().lastIndexOf("-"));
        	for (String belaidupId : belaidupIds) {
            	StorehouseBelaidup belaidup = belaidupMapper.selectByPrimaryKey(belaidupId);
            	if(!firstTerminu.equals(belaidup.getBelaidupTerminu().substring(0, belaidupTerminu.getBelaidupTerminu().lastIndexOf("-")))){
            		returnResult.setSuccess(false);
                    returnResult.setMsg("[" + belaidup.getBelaidupProdName() + "] 货物信息与所选的货物不为同一目的地,请重新选择！");
                    return returnResult;
            	}
    		}
        	
        }
        OrdersOrder order = new OrdersOrder();
        //构建订单编号ID
        int orderCount = orderMapper.countByExample(new OrdersOrderExample());//取出仓库的数量
        //时间转换
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy_MM_dd");
        //构建订单信息
        order.setOrderId(RandomGUID.getRandomGUID());
        OrdersOrderExample orderExample = new OrdersOrderExample(); 
        int count = 0;
        
        order.setOrderCode("OR_ORDER_"+formatDate.format(new Date())+"_"+(orderCount+1));
        // 防止订单名称重复
        orderExample.createCriteria().andOrderCodeEqualTo(order.getOrderCode());
        count = orderMapper.countByExample(orderExample);
        if (count > 0) {
        	order.setOrderCode("OR_ORDER_"+formatDate.format(new Date())+"_"+(orderCount+2));
        }
        order.setOrderNum(belaidupIds.size());
        for (String belaidupId : belaidupIds) {
        	StorehouseBelaidup belaidupMoney = belaidupMapper.selectByPrimaryKey(belaidupId);
        	if(order.getOrderPrice() != null){//判断是否为空
        		order.setOrderPrice(order.getOrderPrice().add(belaidupMoney.getStockPrice()));
        	}else{
        		order.setOrderPrice(belaidupMoney.getStockPrice());
        	}
        }
        order.setOrderStatus("waitconfirm");
        order.setStatus("enable");
        order.setDistributeStatus("waitdistribute");
        order.setRemark("暂无");
        order.setCreater(pricipalUser.getUserId());
        order.setCreateTime(new Date());
        order.setUpdater(pricipalUser.getUserId());
        order.setUpdateTime(new Date());
        count = orderMapper.insert(order);
        if (count == 1) {
        	for (String belaidupId : belaidupIds) {
				//构建订单详情信息
        		OrdersOrderInfo order_Info = new OrdersOrderInfo();
        		order_Info.setOrderInfoId(RandomGUID.getRandomGUID());
        		order_Info.setBelaidupId(belaidupId);
        		order_Info.setOrderId(order.getOrderId());
        		order_Info.setYesOrNo("no");
        		order_Info.setRemark("暂无");
        		order_Info.setCreater(pricipalUser.getUserId());
        		order_Info.setCreateTime(new Date());
        		order_Info.setUpdater(pricipalUser.getUserId());
        		order_Info.setUpdateTime(new Date());
        		order_InfoMapper.insert(order_Info);
        		//修改货物的分拣状态为已分拣
        		StorehouseBelaidup belaidup = belaidupMapper.selectByPrimaryKey(belaidupId);
        		belaidup.setSortingStauts("hassorting");
        		belaidupMapper.updateByPrimaryKey(belaidup);
			}
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + order.getOrderCode() + "] 订单信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，订单信息保存失败");
        }
        return returnResult;
    }
    
    
    
    /**
     * @Title: delOrder
     * @Description: TODO(删除订单) 
     * @param @param gradeIds
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object delOrder(List<String> orderIds, List<String> orderName) {
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
        for (String orderId : orderIds) {
        	//先查询出所有关联此订单ID的订单详情信息
        	OrdersOrderInfoExample order_InfoExample = new OrdersOrderInfoExample();
        	order_InfoExample.createCriteria().andOrderIdEqualTo(orderId);
        	List<OrdersOrderInfo> order_InfoList = order_InfoMapper.selectByExample(order_InfoExample);
        	//删除前，先改变货物的分拣状态
        	for (OrdersOrderInfo ordersOrder_info : order_InfoList) {
				StorehouseBelaidup belaidup = belaidupMapper.selectByPrimaryKey(ordersOrder_info.getBelaidupId());
				belaidup.setSortingStauts("waitsorting");
				belaidupMapper.updateByPrimaryKey(belaidup);
			}
        	//执行删除
        	order_InfoMapper.deleteByExample(order_InfoExample);
        	//最后删除订单信息
        	orderMapper.deleteByPrimaryKey(orderId);
        }
        returnResult.setSuccess(true);
        returnResult.setMsg("订单信息删除成功!");
        return returnResult;
    }
}

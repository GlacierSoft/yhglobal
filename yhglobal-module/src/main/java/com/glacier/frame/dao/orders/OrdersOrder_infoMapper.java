package com.glacier.frame.dao.orders;

import com.glacier.frame.entity.orders.OrderQuery;
import com.glacier.frame.entity.orders.OrdersOrder_info;
import com.glacier.frame.entity.orders.OrdersOrder_infoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface OrdersOrder_infoMapper {
    int countByExample(OrdersOrder_infoExample example);

    int deleteByExample(OrdersOrder_infoExample example);

    int deleteByPrimaryKey(String orderInfoId);

    int insert(OrdersOrder_info record);

    int insertSelective(OrdersOrder_info record);

    List<OrdersOrder_info> selectByExample(OrdersOrder_infoExample example);

    OrdersOrder_info selectByPrimaryKey(String orderInfoId);
    
	@Select("SELECT orders.order_code,belaidup.belaidup_prod_name,belaidup.order_consignee,belaidup.belaidup_terminu,belaidup.create_time,belaidup.belaidup_status,belaidup.belaidup_unitprice " +
    		"from t_orders_order_info orderinfo,t_orders_order orders,t_storehouse_belaidup belaidup " +
    		"where orderinfo.order_id = orders.order_id and orderinfo.belaidup_id = belaidup.belaidup_id " +
    		"and belaidup.member_id = '3' ORDER BY orders.create_time DESC LIMIT 10")
    List<OrderQuery> getLoginQuery(String memberId,int row);
    
    @Select("SELECT count(*) " +
    		"from t_orders_order_info orderinfo,t_orders_order orders,t_storehouse_belaidup belaidup " +
    		"where orderinfo.order_id = orders.order_id and orderinfo.belaidup_id = belaidup.belaidup_id " +
    		"and belaidup.member_id = '3' ORDER BY orders.create_time DESC")
    int getRowQuery(String memberId);

    int updateByExampleSelective(@Param("record") OrdersOrder_info record, @Param("example") OrdersOrder_infoExample example);

    int updateByExample(@Param("record") OrdersOrder_info record, @Param("example") OrdersOrder_infoExample example);

    int updateByPrimaryKeySelective(OrdersOrder_info record);

    int updateByPrimaryKey(OrdersOrder_info record);
}
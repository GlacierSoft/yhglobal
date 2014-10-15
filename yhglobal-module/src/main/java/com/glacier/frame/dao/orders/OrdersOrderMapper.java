package com.glacier.frame.dao.orders;

import com.glacier.frame.entity.orders.OrdersOrder;
import com.glacier.frame.entity.orders.OrdersOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersOrderMapper {
    int countByExample(OrdersOrderExample example);

    int deleteByExample(OrdersOrderExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(OrdersOrder record);

    int insertSelective(OrdersOrder record);

    List<OrdersOrder> selectByExample(OrdersOrderExample example);

    OrdersOrder selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") OrdersOrder record, @Param("example") OrdersOrderExample example);

    int updateByExample(@Param("record") OrdersOrder record, @Param("example") OrdersOrderExample example);

    int updateByPrimaryKeySelective(OrdersOrder record);

    int updateByPrimaryKey(OrdersOrder record);
}
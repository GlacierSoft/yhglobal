package com.glacier.frame.dao.orders;

import com.glacier.frame.entity.orders.OrdersDispatching;
import com.glacier.frame.entity.orders.OrdersDispatchingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersDispatchingMapper {
    int countByExample(OrdersDispatchingExample example);

    int deleteByExample(OrdersDispatchingExample example);

    int deleteByPrimaryKey(String dispatchingId);

    int insert(OrdersDispatching record);

    int insertSelective(OrdersDispatching record);

    List<OrdersDispatching> selectByExample(OrdersDispatchingExample example);

    OrdersDispatching selectByPrimaryKey(String dispatchingId);

    int updateByExampleSelective(@Param("record") OrdersDispatching record, @Param("example") OrdersDispatchingExample example);

    int updateByExample(@Param("record") OrdersDispatching record, @Param("example") OrdersDispatchingExample example);

    int updateByPrimaryKeySelective(OrdersDispatching record);

    int updateByPrimaryKey(OrdersDispatching record);
}
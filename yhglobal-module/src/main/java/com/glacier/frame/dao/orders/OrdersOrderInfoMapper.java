package com.glacier.frame.dao.orders;

import com.glacier.frame.entity.orders.OrdersOrderInfo;
import com.glacier.frame.entity.orders.OrdersOrderInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersOrderInfoMapper {
    int countByExample(OrdersOrderInfoExample example);

    int deleteByExample(OrdersOrderInfoExample example);

    int deleteByPrimaryKey(String orderInfoId);

    int insert(OrdersOrderInfo record);

    int insertSelective(OrdersOrderInfo record);

    List<OrdersOrderInfo> selectByExample(OrdersOrderInfoExample example);

    OrdersOrderInfo selectByPrimaryKey(String orderInfoId);

    int updateByExampleSelective(@Param("record") OrdersOrderInfo record, @Param("example") OrdersOrderInfoExample example);

    int updateByExample(@Param("record") OrdersOrderInfo record, @Param("example") OrdersOrderInfoExample example);

    int updateByPrimaryKeySelective(OrdersOrderInfo record);

    int updateByPrimaryKey(OrdersOrderInfo record);
}
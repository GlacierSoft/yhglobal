package com.glacier.frame.dao.orders;

import com.glacier.frame.entity.orders.OrdersTracking;
import com.glacier.frame.entity.orders.OrdersTrackingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersTrackingMapper {
    int countByExample(OrdersTrackingExample example);

    int deleteByExample(OrdersTrackingExample example);

    int deleteByPrimaryKey(String trackingId);

    int insert(OrdersTracking record);

    int insertSelective(OrdersTracking record);

    List<OrdersTracking> selectByExample(OrdersTrackingExample example);

    OrdersTracking selectByPrimaryKey(String trackingId);

    int updateByExampleSelective(@Param("record") OrdersTracking record, @Param("example") OrdersTrackingExample example);

    int updateByExample(@Param("record") OrdersTracking record, @Param("example") OrdersTrackingExample example);

    int updateByPrimaryKeySelective(OrdersTracking record);

    int updateByPrimaryKey(OrdersTracking record);
}
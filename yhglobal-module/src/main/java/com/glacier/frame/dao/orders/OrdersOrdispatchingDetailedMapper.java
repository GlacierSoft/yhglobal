package com.glacier.frame.dao.orders;

import com.glacier.frame.entity.orders.OrdersOrdispatchingDetailed;
import com.glacier.frame.entity.orders.OrdersOrdispatchingDetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersOrdispatchingDetailedMapper {
    int countByExample(OrdersOrdispatchingDetailedExample example);

    int deleteByExample(OrdersOrdispatchingDetailedExample example);

    int deleteByPrimaryKey(String ordisdetailedId);

    int insert(OrdersOrdispatchingDetailed record);

    int insertSelective(OrdersOrdispatchingDetailed record);

    List<OrdersOrdispatchingDetailed> selectByExample(OrdersOrdispatchingDetailedExample example);

    OrdersOrdispatchingDetailed selectByPrimaryKey(String ordisdetailedId);
    
    OrdersOrdispatchingDetailed selectByDetailed(String OrdersOrdispatchingId);

    int updateByExampleSelective(@Param("record") OrdersOrdispatchingDetailed record, @Param("example") OrdersOrdispatchingDetailedExample example);

    int updateByExample(@Param("record") OrdersOrdispatchingDetailed record, @Param("example") OrdersOrdispatchingDetailedExample example);

    int updateByPrimaryKeySelective(OrdersOrdispatchingDetailed record);

    int updateByPrimaryKey(OrdersOrdispatchingDetailed record);
}
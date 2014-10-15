package com.glacier.frame.dao.orders;

import com.glacier.frame.entity.orders.OrdersOrder_info;
import com.glacier.frame.entity.orders.OrdersOrder_infoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersOrder_infoMapper {
    int countByExample(OrdersOrder_infoExample example);

    int deleteByExample(OrdersOrder_infoExample example);

    int deleteByPrimaryKey(String orderInfoId);

    int insert(OrdersOrder_info record);

    int insertSelective(OrdersOrder_info record);

    List<OrdersOrder_info> selectByExample(OrdersOrder_infoExample example);

    OrdersOrder_info selectByPrimaryKey(String orderInfoId);

    int updateByExampleSelective(@Param("record") OrdersOrder_info record, @Param("example") OrdersOrder_infoExample example);

    int updateByExample(@Param("record") OrdersOrder_info record, @Param("example") OrdersOrder_infoExample example);

    int updateByPrimaryKeySelective(OrdersOrder_info record);

    int updateByPrimaryKey(OrdersOrder_info record);
}
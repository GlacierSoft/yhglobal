package com.glacier.frame.dao.carrier;

import com.glacier.frame.entity.carrier.CarrierRoute;
import com.glacier.frame.entity.carrier.CarrierRouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface CarrierRouteMapper {
    int countByExample(CarrierRouteExample example);

    int deleteByExample(CarrierRouteExample example);

    int deleteByPrimaryKey(String routerId);

    int insert(CarrierRoute record);

    int insertSelective(CarrierRoute record); 
    
    //倒序查询班次编号
    @Select("SELECT route_number FROM t_carrier_route ORDER BY route_number DESC LIMIT 1")
    String selectTop();
    
    List<CarrierRoute> selectByExample(CarrierRouteExample example);

    CarrierRoute selectByPrimaryKey(String routerId);

    int updateByExampleSelective(@Param("record") CarrierRoute record, @Param("example") CarrierRouteExample example);

    int updateByExample(@Param("record") CarrierRoute record, @Param("example") CarrierRouteExample example);

    int updateByPrimaryKeySelective(CarrierRoute record);

    int updateByPrimaryKey(CarrierRoute record);
}
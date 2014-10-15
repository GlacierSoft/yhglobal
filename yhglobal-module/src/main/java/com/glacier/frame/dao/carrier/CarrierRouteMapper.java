package com.glacier.frame.dao.carrier;

import com.glacier.frame.entity.carrier.CarrierRoute;
import com.glacier.frame.entity.carrier.CarrierRouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarrierRouteMapper {
    int countByExample(CarrierRouteExample example);

    int deleteByExample(CarrierRouteExample example);

    int deleteByPrimaryKey(String routerId);

    int insert(CarrierRoute record);

    int insertSelective(CarrierRoute record);

    List<CarrierRoute> selectByExample(CarrierRouteExample example);

    CarrierRoute selectByPrimaryKey(String routerId);

    int updateByExampleSelective(@Param("record") CarrierRoute record, @Param("example") CarrierRouteExample example);

    int updateByExample(@Param("record") CarrierRoute record, @Param("example") CarrierRouteExample example);

    int updateByPrimaryKeySelective(CarrierRoute record);

    int updateByPrimaryKey(CarrierRoute record);
}
package com.glacier.frame.dao.carrier;

import com.glacier.frame.entity.carrier.CarrierAmongRoute;
import com.glacier.frame.entity.carrier.CarrierAmongRouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarrierAmongRouteMapper {
    int countByExample(CarrierAmongRouteExample example);

    int deleteByExample(CarrierAmongRouteExample example);

    int deleteByPrimaryKey(String amongId);

    int insert(CarrierAmongRoute record);

    int insertSelective(CarrierAmongRoute record);

    List<CarrierAmongRoute> selectByExample(CarrierAmongRouteExample example);

    CarrierAmongRoute selectByPrimaryKey(String amongId);

    int updateByExampleSelective(@Param("record") CarrierAmongRoute record, @Param("example") CarrierAmongRouteExample example);

    int updateByExample(@Param("record") CarrierAmongRoute record, @Param("example") CarrierAmongRouteExample example);

    int updateByPrimaryKeySelective(CarrierAmongRoute record);

    int updateByPrimaryKey(CarrierAmongRoute record);
}
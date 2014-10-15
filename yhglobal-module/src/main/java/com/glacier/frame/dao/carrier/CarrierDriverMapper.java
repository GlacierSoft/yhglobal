package com.glacier.frame.dao.carrier;

import com.glacier.frame.entity.carrier.CarrierDriver;
import com.glacier.frame.entity.carrier.CarrierDriverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarrierDriverMapper {
    int countByExample(CarrierDriverExample example);

    int deleteByExample(CarrierDriverExample example);

    int deleteByPrimaryKey(String driverId);

    int insert(CarrierDriver record);

    int insertSelective(CarrierDriver record);

    List<CarrierDriver> selectByExample(CarrierDriverExample example);

    CarrierDriver selectByPrimaryKey(String driverId);

    int updateByExampleSelective(@Param("record") CarrierDriver record, @Param("example") CarrierDriverExample example);

    int updateByExample(@Param("record") CarrierDriver record, @Param("example") CarrierDriverExample example);

    int updateByPrimaryKeySelective(CarrierDriver record);

    int updateByPrimaryKey(CarrierDriver record);
}
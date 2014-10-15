package com.glacier.frame.dao.carrier;

import com.glacier.frame.entity.carrier.CarrierCarInformation;
import com.glacier.frame.entity.carrier.CarrierCarInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarrierCarInformationMapper {
    int countByExample(CarrierCarInformationExample example);

    int deleteByExample(CarrierCarInformationExample example);

    int deleteByPrimaryKey(String carId);

    int insert(CarrierCarInformation record);

    int insertSelective(CarrierCarInformation record);

    List<CarrierCarInformation> selectByExampleWithBLOBs(CarrierCarInformationExample example);

    List<CarrierCarInformation> selectByExample(CarrierCarInformationExample example);

    CarrierCarInformation selectByPrimaryKey(String carId);

    int updateByExampleSelective(@Param("record") CarrierCarInformation record, @Param("example") CarrierCarInformationExample example);

    int updateByExampleWithBLOBs(@Param("record") CarrierCarInformation record, @Param("example") CarrierCarInformationExample example);

    int updateByExample(@Param("record") CarrierCarInformation record, @Param("example") CarrierCarInformationExample example);

    int updateByPrimaryKeySelective(CarrierCarInformation record);

    int updateByPrimaryKeyWithBLOBs(CarrierCarInformation record);

    int updateByPrimaryKey(CarrierCarInformation record);
}
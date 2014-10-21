package com.glacier.frame.dao.carrierlogin;

import com.glacier.frame.entity.carrierlogin.CarrierloginOperalog;
import com.glacier.frame.entity.carrierlogin.CarrierloginOperalogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarrierloginOperalogMapper {
    int countByExample(CarrierloginOperalogExample example);

    int deleteByExample(CarrierloginOperalogExample example);

    int deleteByPrimaryKey(String operalogId);

    int insert(CarrierloginOperalog record);

    int insertSelective(CarrierloginOperalog record);

    List<CarrierloginOperalog> selectByExample(CarrierloginOperalogExample example);

    CarrierloginOperalog selectByPrimaryKey(String operalogId);

    int updateByExampleSelective(@Param("record") CarrierloginOperalog record, @Param("example") CarrierloginOperalogExample example);

    int updateByExample(@Param("record") CarrierloginOperalog record, @Param("example") CarrierloginOperalogExample example);

    int updateByPrimaryKeySelective(CarrierloginOperalog record);

    int updateByPrimaryKey(CarrierloginOperalog record);
}
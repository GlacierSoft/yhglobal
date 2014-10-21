package com.glacier.frame.dao.carrierlogin;

import com.glacier.frame.entity.carrierlogin.CarrierloginAction;
import com.glacier.frame.entity.carrierlogin.CarrierloginActionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarrierloginActionMapper {
    int countByExample(CarrierloginActionExample example);

    int deleteByExample(CarrierloginActionExample example);

    int deleteByPrimaryKey(String actionId);

    int insert(CarrierloginAction record);

    int insertSelective(CarrierloginAction record);

    List<CarrierloginAction> selectByExample(CarrierloginActionExample example);

    CarrierloginAction selectByPrimaryKey(String actionId);

    int updateByExampleSelective(@Param("record") CarrierloginAction record, @Param("example") CarrierloginActionExample example);

    int updateByExample(@Param("record") CarrierloginAction record, @Param("example") CarrierloginActionExample example);

    int updateByPrimaryKeySelective(CarrierloginAction record);

    int updateByPrimaryKey(CarrierloginAction record);
}
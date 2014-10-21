package com.glacier.frame.dao.carrierlogin;

import com.glacier.frame.entity.carrierlogin.CarrierloginUser;
import com.glacier.frame.entity.carrierlogin.CarrierloginUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarrierloginUserMapper {
    int countByExample(CarrierloginUserExample example);

    int deleteByExample(CarrierloginUserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(CarrierloginUser record);

    int insertSelective(CarrierloginUser record);

    List<CarrierloginUser> selectByExample(CarrierloginUserExample example);

    CarrierloginUser selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") CarrierloginUser record, @Param("example") CarrierloginUserExample example);

    int updateByExample(@Param("record") CarrierloginUser record, @Param("example") CarrierloginUserExample example);

    int updateByPrimaryKeySelective(CarrierloginUser record);

    int updateByPrimaryKey(CarrierloginUser record);
}
package com.glacier.frame.dao.carrierlogin;

import com.glacier.frame.entity.carrierlogin.CarrierloginUserRoleExample;
import com.glacier.frame.entity.carrierlogin.CarrierloginUserRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarrierloginUserRoleMapper {
    int countByExample(CarrierloginUserRoleExample example);

    int deleteByExample(CarrierloginUserRoleExample example);

    int deleteByPrimaryKey(CarrierloginUserRoleKey key);

    int insert(CarrierloginUserRoleKey record);

    int insertSelective(CarrierloginUserRoleKey record);

    List<CarrierloginUserRoleKey> selectByExample(CarrierloginUserRoleExample example);

    int updateByExampleSelective(@Param("record") CarrierloginUserRoleKey record, @Param("example") CarrierloginUserRoleExample example);

    int updateByExample(@Param("record") CarrierloginUserRoleKey record, @Param("example") CarrierloginUserRoleExample example);
}
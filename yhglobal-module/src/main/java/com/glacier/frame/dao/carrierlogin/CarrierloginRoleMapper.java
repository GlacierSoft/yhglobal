package com.glacier.frame.dao.carrierlogin;

import com.glacier.frame.entity.carrierlogin.CarrierloginRole;
import com.glacier.frame.entity.carrierlogin.CarrierloginRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarrierloginRoleMapper {
    int countByExample(CarrierloginRoleExample example);

    int deleteByExample(CarrierloginRoleExample example);

    int deleteByPrimaryKey(String roleId);

    int insert(CarrierloginRole record);

    int insertSelective(CarrierloginRole record);

    List<CarrierloginRole> selectByExample(CarrierloginRoleExample example);

    CarrierloginRole selectByPrimaryKey(String roleId);

    int updateByExampleSelective(@Param("record") CarrierloginRole record, @Param("example") CarrierloginRoleExample example);

    int updateByExample(@Param("record") CarrierloginRole record, @Param("example") CarrierloginRoleExample example);

    int updateByPrimaryKeySelective(CarrierloginRole record);

    int updateByPrimaryKey(CarrierloginRole record);
}
package com.glacier.frame.dao.carrierlogin;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.glacier.frame.entity.carrierlogin.CarrierloginMenu;
import com.glacier.frame.entity.carrierlogin.CarrierloginMenuExample;

public interface CarrierloginMenuMapper {
    int countByExample(CarrierloginMenuExample example);

    int deleteByExample(CarrierloginMenuExample example);

    int deleteByPrimaryKey(String menuId);

    int insert(CarrierloginMenu record);

    int insertSelective(CarrierloginMenu record);

    List<CarrierloginMenu> selectByExample(CarrierloginMenuExample example);

    CarrierloginMenu selectByPrimaryKey(String menuId);

    int updateByExampleSelective(@Param("record") CarrierloginMenu record, @Param("example") CarrierloginMenuExample example);

    int updateByExample(@Param("record") CarrierloginMenu record, @Param("example") CarrierloginMenuExample example);

    int updateByPrimaryKeySelective(CarrierloginMenu record);

    int updateByPrimaryKey(CarrierloginMenu record);
    
    // 自定义方法
    List<CarrierloginMenu> selectByUserId(String userId);
}
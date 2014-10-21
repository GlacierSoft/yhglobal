package com.glacier.frame.dao.carrierlogin;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.glacier.frame.entity.carrierlogin.CarrierloginAuthority;
import com.glacier.frame.entity.carrierlogin.CarrierloginAuthorityExample;
import com.glacier.frame.entity.carrierlogin.CarrierloginAuthorityKey;

public interface CarrierloginAuthorityMapper {
    int countByExample(CarrierloginAuthorityExample example);

    int deleteByExample(CarrierloginAuthorityExample example);

    int deleteByPrimaryKey(CarrierloginAuthorityKey key);

    int insert(CarrierloginAuthority record);

    int insertSelective(CarrierloginAuthority record);

    List<CarrierloginAuthority> selectByExample(CarrierloginAuthorityExample example);

    CarrierloginAuthority selectByPrimaryKey(CarrierloginAuthorityKey key);

    int updateByExampleSelective(@Param("record") CarrierloginAuthority record, @Param("example") CarrierloginAuthorityExample example);

    int updateByExample(@Param("record") CarrierloginAuthority record, @Param("example") CarrierloginAuthorityExample example);

    int updateByPrimaryKeySelective(CarrierloginAuthority record);

    int updateByPrimaryKey(CarrierloginAuthority record);
    
    List<CarrierloginAuthority> selectByCarrierloginUserId(String userId);
}
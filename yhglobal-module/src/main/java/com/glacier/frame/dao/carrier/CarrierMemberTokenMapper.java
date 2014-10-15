package com.glacier.frame.dao.carrier;

import com.glacier.frame.entity.carrier.CarrierMemberToken;
import com.glacier.frame.entity.carrier.CarrierMemberTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarrierMemberTokenMapper {
    int countByExample(CarrierMemberTokenExample example);

    int deleteByExample(CarrierMemberTokenExample example);

    int deleteByPrimaryKey(String carrierMemberId);

    int insert(CarrierMemberToken record);

    int insertSelective(CarrierMemberToken record);

    List<CarrierMemberToken> selectByExample(CarrierMemberTokenExample example);

    CarrierMemberToken selectByPrimaryKey(String carrierMemberId);

    int updateByExampleSelective(@Param("record") CarrierMemberToken record, @Param("example") CarrierMemberTokenExample example);

    int updateByExample(@Param("record") CarrierMemberToken record, @Param("example") CarrierMemberTokenExample example);

    int updateByPrimaryKeySelective(CarrierMemberToken record);

    int updateByPrimaryKey(CarrierMemberToken record);
}
package com.glacier.frame.dao.carrier;

import com.glacier.frame.entity.carrier.CarrierEnterpriserMember;
import com.glacier.frame.entity.carrier.CarrierEnterpriserMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarrierEnterpriserMemberMapper {
    int countByExample(CarrierEnterpriserMemberExample example);

    int deleteByExample(CarrierEnterpriserMemberExample example);

    int deleteByPrimaryKey(String carrierMemberId);

    int insert(CarrierEnterpriserMember record);

    int insertSelective(CarrierEnterpriserMember record);

    List<CarrierEnterpriserMember> selectByExample(CarrierEnterpriserMemberExample example);

    CarrierEnterpriserMember selectByPrimaryKey(String carrierMemberId);

    int updateByExampleSelective(@Param("record") CarrierEnterpriserMember record, @Param("example") CarrierEnterpriserMemberExample example);

    int updateByExample(@Param("record") CarrierEnterpriserMember record, @Param("example") CarrierEnterpriserMemberExample example);

    int updateByPrimaryKeySelective(CarrierEnterpriserMember record);

    int updateByPrimaryKey(CarrierEnterpriserMember record);
}
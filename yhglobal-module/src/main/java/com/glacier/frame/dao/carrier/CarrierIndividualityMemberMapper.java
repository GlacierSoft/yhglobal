package com.glacier.frame.dao.carrier;

import com.glacier.frame.entity.carrier.CarrierIndividualityMember;
import com.glacier.frame.entity.carrier.CarrierIndividualityMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarrierIndividualityMemberMapper {
    int countByExample(CarrierIndividualityMemberExample example);

    int deleteByExample(CarrierIndividualityMemberExample example);

    int deleteByPrimaryKey(String carrierMemberId);

    int insert(CarrierIndividualityMember record);

    int insertSelective(CarrierIndividualityMember record);

    List<CarrierIndividualityMember> selectByExample(CarrierIndividualityMemberExample example);

    CarrierIndividualityMember selectByPrimaryKey(String carrierMemberId);

    int updateByExampleSelective(@Param("record") CarrierIndividualityMember record, @Param("example") CarrierIndividualityMemberExample example);

    int updateByExample(@Param("record") CarrierIndividualityMember record, @Param("example") CarrierIndividualityMemberExample example);

    int updateByPrimaryKeySelective(CarrierIndividualityMember record);

    int updateByPrimaryKey(CarrierIndividualityMember record);
}
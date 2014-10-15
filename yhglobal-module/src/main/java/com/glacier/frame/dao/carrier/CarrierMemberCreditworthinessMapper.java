package com.glacier.frame.dao.carrier;

import com.glacier.frame.entity.carrier.CarrierMemberCreditworthiness;
import com.glacier.frame.entity.carrier.CarrierMemberCreditworthinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarrierMemberCreditworthinessMapper {
    int countByExample(CarrierMemberCreditworthinessExample example);

    int deleteByExample(CarrierMemberCreditworthinessExample example);

    int deleteByPrimaryKey(String carrierMemberCreditworthinessId);

    int insert(CarrierMemberCreditworthiness record);

    int insertSelective(CarrierMemberCreditworthiness record);

    List<CarrierMemberCreditworthiness> selectByExample(CarrierMemberCreditworthinessExample example);

    CarrierMemberCreditworthiness selectByPrimaryKey(String carrierMemberCreditworthinessId);

    int updateByExampleSelective(@Param("record") CarrierMemberCreditworthiness record, @Param("example") CarrierMemberCreditworthinessExample example);

    int updateByExample(@Param("record") CarrierMemberCreditworthiness record, @Param("example") CarrierMemberCreditworthinessExample example);

    int updateByPrimaryKeySelective(CarrierMemberCreditworthiness record);

    int updateByPrimaryKey(CarrierMemberCreditworthiness record);
}
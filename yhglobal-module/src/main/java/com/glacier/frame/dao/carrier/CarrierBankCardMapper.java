package com.glacier.frame.dao.carrier;

import com.glacier.frame.entity.carrier.CarrierBankCard;
import com.glacier.frame.entity.carrier.CarrierBankCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarrierBankCardMapper {
    int countByExample(CarrierBankCardExample example);

    int deleteByExample(CarrierBankCardExample example);

    int deleteByPrimaryKey(String bankcardId);

    int insert(CarrierBankCard record);

    int insertSelective(CarrierBankCard record);

    List<CarrierBankCard> selectByExample(CarrierBankCardExample example);

    CarrierBankCard selectByPrimaryKey(String bankcardId);

    int updateByExampleSelective(@Param("record") CarrierBankCard record, @Param("example") CarrierBankCardExample example);

    int updateByExample(@Param("record") CarrierBankCard record, @Param("example") CarrierBankCardExample example);

    int updateByPrimaryKeySelective(CarrierBankCard record);

    int updateByPrimaryKey(CarrierBankCard record);
}
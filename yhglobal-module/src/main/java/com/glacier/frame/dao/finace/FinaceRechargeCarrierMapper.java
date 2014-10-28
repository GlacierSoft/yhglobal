package com.glacier.frame.dao.finace;

import com.glacier.frame.entity.finace.FinaceRechargeCarrier;
import com.glacier.frame.entity.finace.FinaceRechargeCarrierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinaceRechargeCarrierMapper {
    int countByExample(FinaceRechargeCarrierExample example);

    int deleteByExample(FinaceRechargeCarrierExample example);

    int deleteByPrimaryKey(String rechargeId);

    int insert(FinaceRechargeCarrier record);

    int insertSelective(FinaceRechargeCarrier record);

    List<FinaceRechargeCarrier> selectByExample(FinaceRechargeCarrierExample example);

    FinaceRechargeCarrier selectByPrimaryKey(String rechargeId);

    int updateByExampleSelective(@Param("record") FinaceRechargeCarrier record, @Param("example") FinaceRechargeCarrierExample example);

    int updateByExample(@Param("record") FinaceRechargeCarrier record, @Param("example") FinaceRechargeCarrierExample example);

    int updateByPrimaryKeySelective(FinaceRechargeCarrier record);

    int updateByPrimaryKey(FinaceRechargeCarrier record);
}
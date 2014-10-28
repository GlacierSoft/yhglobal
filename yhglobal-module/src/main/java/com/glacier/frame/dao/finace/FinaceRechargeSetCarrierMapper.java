package com.glacier.frame.dao.finace;

import com.glacier.frame.entity.finace.FinaceRechargeSetCarrier;
import com.glacier.frame.entity.finace.FinaceRechargeSetCarrierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinaceRechargeSetCarrierMapper {
    int countByExample(FinaceRechargeSetCarrierExample example);

    int deleteByExample(FinaceRechargeSetCarrierExample example);

    int deleteByPrimaryKey(String rechargeSetId);

    int insert(FinaceRechargeSetCarrier record);

    int insertSelective(FinaceRechargeSetCarrier record);

    List<FinaceRechargeSetCarrier> selectByExample(FinaceRechargeSetCarrierExample example);

    FinaceRechargeSetCarrier selectByPrimaryKey(String rechargeSetId);

    int updateByExampleSelective(@Param("record") FinaceRechargeSetCarrier record, @Param("example") FinaceRechargeSetCarrierExample example);

    int updateByExample(@Param("record") FinaceRechargeSetCarrier record, @Param("example") FinaceRechargeSetCarrierExample example);

    int updateByPrimaryKeySelective(FinaceRechargeSetCarrier record);

    int updateByPrimaryKey(FinaceRechargeSetCarrier record);
}
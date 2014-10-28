package com.glacier.frame.dao.finace;

import com.glacier.frame.entity.finace.FinaceWithdrawCarrier;
import com.glacier.frame.entity.finace.FinaceWithdrawCarrierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinaceWithdrawCarrierMapper {
    int countByExample(FinaceWithdrawCarrierExample example);

    int deleteByExample(FinaceWithdrawCarrierExample example);

    int deleteByPrimaryKey(String withdrawId);

    int insert(FinaceWithdrawCarrier record);

    int insertSelective(FinaceWithdrawCarrier record);

    List<FinaceWithdrawCarrier> selectByExample(FinaceWithdrawCarrierExample example);

    FinaceWithdrawCarrier selectByPrimaryKey(String withdrawId);

    int updateByExampleSelective(@Param("record") FinaceWithdrawCarrier record, @Param("example") FinaceWithdrawCarrierExample example);

    int updateByExample(@Param("record") FinaceWithdrawCarrier record, @Param("example") FinaceWithdrawCarrierExample example);

    int updateByPrimaryKeySelective(FinaceWithdrawCarrier record);

    int updateByPrimaryKey(FinaceWithdrawCarrier record);
}
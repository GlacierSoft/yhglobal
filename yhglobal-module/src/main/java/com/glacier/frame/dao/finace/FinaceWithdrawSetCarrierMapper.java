package com.glacier.frame.dao.finace;

import com.glacier.frame.entity.finace.FinaceWithdrawSetCarrier;
import com.glacier.frame.entity.finace.FinaceWithdrawSetCarrierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinaceWithdrawSetCarrierMapper {
    int countByExample(FinaceWithdrawSetCarrierExample example);

    int deleteByExample(FinaceWithdrawSetCarrierExample example);

    int deleteByPrimaryKey(String withdrawSetId);

    int insert(FinaceWithdrawSetCarrier record);

    int insertSelective(FinaceWithdrawSetCarrier record);

    List<FinaceWithdrawSetCarrier> selectByExample(FinaceWithdrawSetCarrierExample example);

    FinaceWithdrawSetCarrier selectByPrimaryKey(String withdrawSetId);

    int updateByExampleSelective(@Param("record") FinaceWithdrawSetCarrier record, @Param("example") FinaceWithdrawSetCarrierExample example);

    int updateByExample(@Param("record") FinaceWithdrawSetCarrier record, @Param("example") FinaceWithdrawSetCarrierExample example);

    int updateByPrimaryKeySelective(FinaceWithdrawSetCarrier record);

    int updateByPrimaryKey(FinaceWithdrawSetCarrier record);
}
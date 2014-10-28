package com.glacier.frame.dao.finace;

import com.glacier.frame.entity.finace.FinanceCarrier;
import com.glacier.frame.entity.finace.FinanceCarrierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceCarrierMapper {
    int countByExample(FinanceCarrierExample example);

    int deleteByExample(FinanceCarrierExample example);

    int deleteByPrimaryKey(String carrierId);

    int insert(FinanceCarrier record);

    int insertSelective(FinanceCarrier record);

    List<FinanceCarrier> selectByExample(FinanceCarrierExample example);

    FinanceCarrier selectByPrimaryKey(String carrierId);

    int updateByExampleSelective(@Param("record") FinanceCarrier record, @Param("example") FinanceCarrierExample example);

    int updateByExample(@Param("record") FinanceCarrier record, @Param("example") FinanceCarrierExample example);

    int updateByPrimaryKeySelective(FinanceCarrier record);

    int updateByPrimaryKey(FinanceCarrier record);
}
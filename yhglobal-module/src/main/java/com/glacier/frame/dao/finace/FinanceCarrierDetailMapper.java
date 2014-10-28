package com.glacier.frame.dao.finace;

import com.glacier.frame.entity.finace.FinanceCarrierDetail;
import com.glacier.frame.entity.finace.FinanceCarrierDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceCarrierDetailMapper {
    int countByExample(FinanceCarrierDetailExample example);

    int deleteByExample(FinanceCarrierDetailExample example);

    int deleteByPrimaryKey(String detailId);

    int insert(FinanceCarrierDetail record);

    int insertSelective(FinanceCarrierDetail record);

    List<FinanceCarrierDetail> selectByExample(FinanceCarrierDetailExample example);

    FinanceCarrierDetail selectByPrimaryKey(String detailId);

    int updateByExampleSelective(@Param("record") FinanceCarrierDetail record, @Param("example") FinanceCarrierDetailExample example);

    int updateByExample(@Param("record") FinanceCarrierDetail record, @Param("example") FinanceCarrierDetailExample example);

    int updateByPrimaryKeySelective(FinanceCarrierDetail record);

    int updateByPrimaryKey(FinanceCarrierDetail record);
}
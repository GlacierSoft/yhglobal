package com.glacier.frame.dao.finace;

import com.glacier.frame.entity.finace.FinancePlatformDetail;
import com.glacier.frame.entity.finace.FinancePlatformDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinancePlatformDetailMapper {
    int countByExample(FinancePlatformDetailExample example);

    int deleteByExample(FinancePlatformDetailExample example);

    int deleteByPrimaryKey(String detailId);

    int insert(FinancePlatformDetail record);

    int insertSelective(FinancePlatformDetail record);

    List<FinancePlatformDetail> selectByExample(FinancePlatformDetailExample example);

    FinancePlatformDetail selectByPrimaryKey(String detailId);

    int updateByExampleSelective(@Param("record") FinancePlatformDetail record, @Param("example") FinancePlatformDetailExample example);

    int updateByExample(@Param("record") FinancePlatformDetail record, @Param("example") FinancePlatformDetailExample example);

    int updateByPrimaryKeySelective(FinancePlatformDetail record);

    int updateByPrimaryKey(FinancePlatformDetail record);
}
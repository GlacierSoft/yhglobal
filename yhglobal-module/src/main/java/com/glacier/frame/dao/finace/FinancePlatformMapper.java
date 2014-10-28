package com.glacier.frame.dao.finace;

import com.glacier.frame.entity.finace.FinancePlatform;
import com.glacier.frame.entity.finace.FinancePlatformExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinancePlatformMapper {
    int countByExample(FinancePlatformExample example);

    int deleteByExample(FinancePlatformExample example);

    int deleteByPrimaryKey(String platformId);

    int insert(FinancePlatform record);

    int insertSelective(FinancePlatform record);

    List<FinancePlatform> selectByExample(FinancePlatformExample example);

    FinancePlatform selectByPrimaryKey(String platformId);

    int updateByExampleSelective(@Param("record") FinancePlatform record, @Param("example") FinancePlatformExample example);

    int updateByExample(@Param("record") FinancePlatform record, @Param("example") FinancePlatformExample example);

    int updateByPrimaryKeySelective(FinancePlatform record);

    int updateByPrimaryKey(FinancePlatform record);
}
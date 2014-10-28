package com.glacier.frame.dao.finace;

import com.glacier.frame.entity.finace.FinanceMemberDetail;
import com.glacier.frame.entity.finace.FinanceMemberDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceMemberDetailMapper {
    int countByExample(FinanceMemberDetailExample example);

    int deleteByExample(FinanceMemberDetailExample example);

    int deleteByPrimaryKey(String mdetailId);

    int insert(FinanceMemberDetail record);

    int insertSelective(FinanceMemberDetail record);

    List<FinanceMemberDetail> selectByExample(FinanceMemberDetailExample example);

    FinanceMemberDetail selectByPrimaryKey(String mdetailId);

    int updateByExampleSelective(@Param("record") FinanceMemberDetail record, @Param("example") FinanceMemberDetailExample example);

    int updateByExample(@Param("record") FinanceMemberDetail record, @Param("example") FinanceMemberDetailExample example);

    int updateByPrimaryKeySelective(FinanceMemberDetail record);

    int updateByPrimaryKey(FinanceMemberDetail record);
}
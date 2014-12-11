package com.glacier.frame.dao.finace;

import com.glacier.frame.entity.finace.FinanceMember;
import com.glacier.frame.entity.finace.FinanceMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceMemberMapper {
    int countByExample(FinanceMemberExample example);

    int deleteByExample(FinanceMemberExample example);

    int deleteByPrimaryKey(String mrechageId);

    int insert(FinanceMember record);

    int insertSelective(FinanceMember record);

    List<FinanceMember> selectByExample(FinanceMemberExample example);

    FinanceMember selectByMemberId(String memberId);
    
    FinanceMember selectByPrimaryKey(String mrechageId);

    int updateByExampleSelective(@Param("record") FinanceMember record, @Param("example") FinanceMemberExample example);

    int updateByExample(@Param("record") FinanceMember record, @Param("example") FinanceMemberExample example);

    int updateByPrimaryKeySelective(FinanceMember record);

    int updateByPrimaryKey(FinanceMember record);
}
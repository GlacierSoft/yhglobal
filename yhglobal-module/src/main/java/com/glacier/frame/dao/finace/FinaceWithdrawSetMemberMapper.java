package com.glacier.frame.dao.finace;

import com.glacier.frame.entity.finace.FinaceWithdrawSetMember;
import com.glacier.frame.entity.finace.FinaceWithdrawSetMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinaceWithdrawSetMemberMapper {
    int countByExample(FinaceWithdrawSetMemberExample example);

    int deleteByExample(FinaceWithdrawSetMemberExample example);

    int deleteByPrimaryKey(String withdrawSetId);

    int insert(FinaceWithdrawSetMember record);

    int insertSelective(FinaceWithdrawSetMember record);

    List<FinaceWithdrawSetMember> selectByExample(FinaceWithdrawSetMemberExample example);

    FinaceWithdrawSetMember selectByPrimaryKey(String withdrawSetId);

    int updateByExampleSelective(@Param("record") FinaceWithdrawSetMember record, @Param("example") FinaceWithdrawSetMemberExample example);

    int updateByExample(@Param("record") FinaceWithdrawSetMember record, @Param("example") FinaceWithdrawSetMemberExample example);

    int updateByPrimaryKeySelective(FinaceWithdrawSetMember record);

    int updateByPrimaryKey(FinaceWithdrawSetMember record);
}
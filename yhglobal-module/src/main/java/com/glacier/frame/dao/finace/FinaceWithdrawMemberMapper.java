package com.glacier.frame.dao.finace;

import com.glacier.frame.entity.finace.FinaceWithdrawMember;
import com.glacier.frame.entity.finace.FinaceWithdrawMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinaceWithdrawMemberMapper {
    int countByExample(FinaceWithdrawMemberExample example);

    int deleteByExample(FinaceWithdrawMemberExample example);

    int deleteByPrimaryKey(String withdrawId);

    int insert(FinaceWithdrawMember record);

    int insertSelective(FinaceWithdrawMember record);

    List<FinaceWithdrawMember> selectByExample(FinaceWithdrawMemberExample example);

    FinaceWithdrawMember selectByPrimaryKey(String withdrawId);

    int updateByExampleSelective(@Param("record") FinaceWithdrawMember record, @Param("example") FinaceWithdrawMemberExample example);

    int updateByExample(@Param("record") FinaceWithdrawMember record, @Param("example") FinaceWithdrawMemberExample example);

    int updateByPrimaryKeySelective(FinaceWithdrawMember record);

    int updateByPrimaryKey(FinaceWithdrawMember record);
}
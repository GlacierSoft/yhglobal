package com.glacier.frame.dao.finace;

import com.glacier.frame.entity.finace.FinaceWithdrawSetMemberr;
import com.glacier.frame.entity.finace.FinaceWithdrawSetMemberrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinaceWithdrawSetMemberrMapper {
    int countByExample(FinaceWithdrawSetMemberrExample example);

    int deleteByExample(FinaceWithdrawSetMemberrExample example);

    int deleteByPrimaryKey(String withdrawSetId);

    int insert(FinaceWithdrawSetMemberr record);

    int insertSelective(FinaceWithdrawSetMemberr record);

    List<FinaceWithdrawSetMemberr> selectByExample(FinaceWithdrawSetMemberrExample example);

    FinaceWithdrawSetMemberr selectByPrimaryKey(String withdrawSetId);

    int updateByExampleSelective(@Param("record") FinaceWithdrawSetMemberr record, @Param("example") FinaceWithdrawSetMemberrExample example);

    int updateByExample(@Param("record") FinaceWithdrawSetMemberr record, @Param("example") FinaceWithdrawSetMemberrExample example);

    int updateByPrimaryKeySelective(FinaceWithdrawSetMemberr record);

    int updateByPrimaryKey(FinaceWithdrawSetMemberr record);
}
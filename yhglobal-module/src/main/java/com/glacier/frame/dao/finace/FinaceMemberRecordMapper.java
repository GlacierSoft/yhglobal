package com.glacier.frame.dao.finace;

import com.glacier.frame.entity.finace.FinaceMemberRecord;
import com.glacier.frame.entity.finace.FinaceMemberRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinaceMemberRecordMapper {
    int countByExample(FinaceMemberRecordExample example);

    int deleteByExample(FinaceMemberRecordExample example);

    int deleteByPrimaryKey(String transactionMemberId);

    int insert(FinaceMemberRecord record);

    int insertSelective(FinaceMemberRecord record);

    List<FinaceMemberRecord> selectByExample(FinaceMemberRecordExample example);

    FinaceMemberRecord selectByPrimaryKey(String transactionMemberId);

    int updateByExampleSelective(@Param("record") FinaceMemberRecord record, @Param("example") FinaceMemberRecordExample example);

    int updateByExample(@Param("record") FinaceMemberRecord record, @Param("example") FinaceMemberRecordExample example);

    int updateByPrimaryKeySelective(FinaceMemberRecord record);

    int updateByPrimaryKey(FinaceMemberRecord record);
}
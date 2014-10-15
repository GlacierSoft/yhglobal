package com.glacier.frame.dao.member;

import com.glacier.frame.entity.member.ShipperMemberContractRecord;
import com.glacier.frame.entity.member.ShipperMemberContractRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShipperMemberContractRecordMapper {
    int countByExample(ShipperMemberContractRecordExample example);

    int deleteByExample(ShipperMemberContractRecordExample example);

    int deleteByPrimaryKey(String contractRecordId);

    int insert(ShipperMemberContractRecord record);

    int insertSelective(ShipperMemberContractRecord record);

    List<ShipperMemberContractRecord> selectByExample(ShipperMemberContractRecordExample example);

    ShipperMemberContractRecord selectByPrimaryKey(String contractRecordId);

    int updateByExampleSelective(@Param("record") ShipperMemberContractRecord record, @Param("example") ShipperMemberContractRecordExample example);

    int updateByExample(@Param("record") ShipperMemberContractRecord record, @Param("example") ShipperMemberContractRecordExample example);

    int updateByPrimaryKeySelective(ShipperMemberContractRecord record);

    int updateByPrimaryKey(ShipperMemberContractRecord record);
}
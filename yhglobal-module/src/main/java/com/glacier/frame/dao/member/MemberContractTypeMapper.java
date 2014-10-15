package com.glacier.frame.dao.member;

import com.glacier.frame.entity.member.MemberContractType;
import com.glacier.frame.entity.member.MemberContractTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberContractTypeMapper {
    int countByExample(MemberContractTypeExample example);

    int deleteByExample(MemberContractTypeExample example);

    int deleteByPrimaryKey(String contractTypeId);

    int insert(MemberContractType record);

    int insertSelective(MemberContractType record);

    List<MemberContractType> selectByExample(MemberContractTypeExample example);

    MemberContractType selectByPrimaryKey(String contractTypeId);

    int updateByExampleSelective(@Param("record") MemberContractType record, @Param("example") MemberContractTypeExample example);

    int updateByExample(@Param("record") MemberContractType record, @Param("example") MemberContractTypeExample example);

    int updateByPrimaryKeySelective(MemberContractType record);

    int updateByPrimaryKey(MemberContractType record);
}
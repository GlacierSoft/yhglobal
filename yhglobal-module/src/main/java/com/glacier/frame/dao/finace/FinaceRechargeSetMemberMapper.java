package com.glacier.frame.dao.finace;

import com.glacier.frame.entity.finace.FinaceRechargeSetMember;
import com.glacier.frame.entity.finace.FinaceRechargeSetMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinaceRechargeSetMemberMapper {
    int countByExample(FinaceRechargeSetMemberExample example);

    int deleteByExample(FinaceRechargeSetMemberExample example);

    int deleteByPrimaryKey(String rechargeSetId);

    int insert(FinaceRechargeSetMember record);

    int insertSelective(FinaceRechargeSetMember record);

    List<FinaceRechargeSetMember> selectByExample(FinaceRechargeSetMemberExample example);

    FinaceRechargeSetMember selectByPrimaryKey(String rechargeSetId);

    int updateByExampleSelective(@Param("record") FinaceRechargeSetMember record, @Param("example") FinaceRechargeSetMemberExample example);

    int updateByExample(@Param("record") FinaceRechargeSetMember record, @Param("example") FinaceRechargeSetMemberExample example);

    int updateByPrimaryKeySelective(FinaceRechargeSetMember record);

    int updateByPrimaryKey(FinaceRechargeSetMember record);
}
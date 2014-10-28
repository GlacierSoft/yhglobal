package com.glacier.frame.dao.finace;

import com.glacier.frame.entity.finace.FinaceRechargeMember;
import com.glacier.frame.entity.finace.FinaceRechargeMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinaceRechargeMemberMapper {
    int countByExample(FinaceRechargeMemberExample example);

    int deleteByExample(FinaceRechargeMemberExample example);

    int deleteByPrimaryKey(String rechargeId);

    int insert(FinaceRechargeMember record);

    int insertSelective(FinaceRechargeMember record);

    List<FinaceRechargeMember> selectByExample(FinaceRechargeMemberExample example);

    FinaceRechargeMember selectByPrimaryKey(String rechargeId);

    int updateByExampleSelective(@Param("record") FinaceRechargeMember record, @Param("example") FinaceRechargeMemberExample example);

    int updateByExample(@Param("record") FinaceRechargeMember record, @Param("example") FinaceRechargeMemberExample example);

    int updateByPrimaryKeySelective(FinaceRechargeMember record);

    int updateByPrimaryKey(FinaceRechargeMember record);
}
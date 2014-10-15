package com.glacier.frame.dao.member;

import com.glacier.frame.entity.member.ShipperEnterpriseMember;
import com.glacier.frame.entity.member.ShipperEnterpriseMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShipperEnterpriseMemberMapper {
    int countByExample(ShipperEnterpriseMemberExample example);

    int deleteByExample(ShipperEnterpriseMemberExample example);

    int deleteByPrimaryKey(String memberId);

    int insert(ShipperEnterpriseMember record);

    int insertSelective(ShipperEnterpriseMember record);

    List<ShipperEnterpriseMember> selectByExample(ShipperEnterpriseMemberExample example);

    ShipperEnterpriseMember selectByPrimaryKey(String memberId);

    int updateByExampleSelective(@Param("record") ShipperEnterpriseMember record, @Param("example") ShipperEnterpriseMemberExample example);

    int updateByExample(@Param("record") ShipperEnterpriseMember record, @Param("example") ShipperEnterpriseMemberExample example);

    int updateByPrimaryKeySelective(ShipperEnterpriseMember record);

    int updateByPrimaryKey(ShipperEnterpriseMember record);
}
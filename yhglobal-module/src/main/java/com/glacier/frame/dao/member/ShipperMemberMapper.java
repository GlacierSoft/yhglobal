package com.glacier.frame.dao.member;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.glacier.frame.entity.member.ShipperMember;
import com.glacier.frame.entity.member.ShipperMemberExample;

public interface ShipperMemberMapper {
    int countByExample(ShipperMemberExample example);

    int deleteByExample(ShipperMemberExample example);

    int deleteByPrimaryKey(String memberId);

    int insert(ShipperMember record);

    int insertSelective(ShipperMember record);

    List<ShipperMember> selectByExample(ShipperMemberExample example);

    ShipperMember selectByPrimaryKey(String memberId);
    
    //自定义方法，根据会员用户名进行查找会员信息
    ShipperMember selectByMemberName(String memberName);

    int updateByExampleSelective(@Param("record") ShipperMember record, @Param("example") ShipperMemberExample example);

    int updateByExample(@Param("record") ShipperMember record, @Param("example") ShipperMemberExample example);

    int updateByPrimaryKeySelective(ShipperMember record);

    int updateByPrimaryKey(ShipperMember record);
}
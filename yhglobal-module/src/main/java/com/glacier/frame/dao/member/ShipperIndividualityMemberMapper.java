package com.glacier.frame.dao.member;

import com.glacier.frame.entity.member.ShipperIndividualityMember;
import com.glacier.frame.entity.member.ShipperIndividualityMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShipperIndividualityMemberMapper {
    int countByExample(ShipperIndividualityMemberExample example);

    int deleteByExample(ShipperIndividualityMemberExample example);

    int deleteByPrimaryKey(String memberId);

    int insert(ShipperIndividualityMember record);

    int insertSelective(ShipperIndividualityMember record);

    List<ShipperIndividualityMember> selectByExample(ShipperIndividualityMemberExample example);

    ShipperIndividualityMember selectByPrimaryKey(String memberId);

    int updateByExampleSelective(@Param("record") ShipperIndividualityMember record, @Param("example") ShipperIndividualityMemberExample example);

    int updateByExample(@Param("record") ShipperIndividualityMember record, @Param("example") ShipperIndividualityMemberExample example);

    int updateByPrimaryKeySelective(ShipperIndividualityMember record);

    int updateByPrimaryKey(ShipperIndividualityMember record);
}
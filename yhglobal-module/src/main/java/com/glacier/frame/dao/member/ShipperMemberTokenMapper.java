package com.glacier.frame.dao.member;

import com.glacier.frame.entity.member.ShipperMemberToken;
import com.glacier.frame.entity.member.ShipperMemberTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShipperMemberTokenMapper {
    int countByExample(ShipperMemberTokenExample example);

    int deleteByExample(ShipperMemberTokenExample example);

    int deleteByPrimaryKey(String memberId);

    int insert(ShipperMemberToken record);

    int insertSelective(ShipperMemberToken record);

    List<ShipperMemberToken> selectByExample(ShipperMemberTokenExample example);

    ShipperMemberToken selectByPrimaryKey(String memberId);

    int updateByExampleSelective(@Param("record") ShipperMemberToken record, @Param("example") ShipperMemberTokenExample example);

    int updateByExample(@Param("record") ShipperMemberToken record, @Param("example") ShipperMemberTokenExample example);

    int updateByPrimaryKeySelective(ShipperMemberToken record);

    int updateByPrimaryKey(ShipperMemberToken record);
}
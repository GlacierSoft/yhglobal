package com.glacier.frame.dao.member;

import com.glacier.frame.entity.member.ShipperMemberIntegral;
import com.glacier.frame.entity.member.ShipperMemberIntegralExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShipperMemberIntegralMapper {
    int countByExample(ShipperMemberIntegralExample example);

    int deleteByExample(ShipperMemberIntegralExample example);

    int deleteByPrimaryKey(String shipperMemberIntegralId);

    int insert(ShipperMemberIntegral record);

    int insertSelective(ShipperMemberIntegral record);

    List<ShipperMemberIntegral> selectByExample(ShipperMemberIntegralExample example);

    ShipperMemberIntegral selectByPrimaryKey(String shipperMemberIntegralId);

    int updateByExampleSelective(@Param("record") ShipperMemberIntegral record, @Param("example") ShipperMemberIntegralExample example);

    int updateByExample(@Param("record") ShipperMemberIntegral record, @Param("example") ShipperMemberIntegralExample example);

    int updateByPrimaryKeySelective(ShipperMemberIntegral record);

    int updateByPrimaryKey(ShipperMemberIntegral record);
}
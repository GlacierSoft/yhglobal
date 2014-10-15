package com.glacier.frame.dao.member;

import com.glacier.frame.entity.member.ShipperIntegralType;
import com.glacier.frame.entity.member.ShipperIntegralTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShipperIntegralTypeMapper {
    int countByExample(ShipperIntegralTypeExample example);

    int deleteByExample(ShipperIntegralTypeExample example);

    int deleteByPrimaryKey(String integralTypeId);

    int insert(ShipperIntegralType record);

    int insertSelective(ShipperIntegralType record);

    List<ShipperIntegralType> selectByExample(ShipperIntegralTypeExample example);

    ShipperIntegralType selectByPrimaryKey(String integralTypeId);

    int updateByExampleSelective(@Param("record") ShipperIntegralType record, @Param("example") ShipperIntegralTypeExample example);

    int updateByExample(@Param("record") ShipperIntegralType record, @Param("example") ShipperIntegralTypeExample example);

    int updateByPrimaryKeySelective(ShipperIntegralType record);

    int updateByPrimaryKey(ShipperIntegralType record);
}
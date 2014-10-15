package com.glacier.frame.dao.member;

import com.glacier.frame.entity.member.ShipperMemberBankCard;
import com.glacier.frame.entity.member.ShipperMemberBankCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShipperMemberBankCardMapper {
    int countByExample(ShipperMemberBankCardExample example);

    int deleteByExample(ShipperMemberBankCardExample example);

    int deleteByPrimaryKey(String bankcardId);

    int insert(ShipperMemberBankCard record);

    int insertSelective(ShipperMemberBankCard record);

    List<ShipperMemberBankCard> selectByExample(ShipperMemberBankCardExample example);

    ShipperMemberBankCard selectByPrimaryKey(String bankcardId);

    int updateByExampleSelective(@Param("record") ShipperMemberBankCard record, @Param("example") ShipperMemberBankCardExample example);

    int updateByExample(@Param("record") ShipperMemberBankCard record, @Param("example") ShipperMemberBankCardExample example);

    int updateByPrimaryKeySelective(ShipperMemberBankCard record);

    int updateByPrimaryKey(ShipperMemberBankCard record);
}
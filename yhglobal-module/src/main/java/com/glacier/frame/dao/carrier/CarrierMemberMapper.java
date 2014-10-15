package com.glacier.frame.dao.carrier;

import com.glacier.frame.entity.carrier.CarrierMember;
import com.glacier.frame.entity.carrier.CarrierMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarrierMemberMapper {
    int countByExample(CarrierMemberExample example);

    int deleteByExample(CarrierMemberExample example);

    int deleteByPrimaryKey(String carrierMemberId);

    int insert(CarrierMember record);

    int insertSelective(CarrierMember record);

    List<CarrierMember> selectByExample(CarrierMemberExample example);

    CarrierMember selectByPrimaryKey(String carrierMemberId);
    
    //  自定义方法，根据名字查找承运商
    CarrierMember selectByMemberName(String memberName);

    int updateByExampleSelective(@Param("record") CarrierMember record, @Param("example") CarrierMemberExample example);

    int updateByExample(@Param("record") CarrierMember record, @Param("example") CarrierMemberExample example);

    int updateByPrimaryKeySelective(CarrierMember record);

    int updateByPrimaryKey(CarrierMember record);
}
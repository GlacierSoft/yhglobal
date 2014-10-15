package com.glacier.frame.dao.carrier;

import com.glacier.frame.entity.carrier.CarrierMemberGrade;
import com.glacier.frame.entity.carrier.CarrierMemberGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarrierMemberGradeMapper {
    int countByExample(CarrierMemberGradeExample example);

    int deleteByExample(CarrierMemberGradeExample example);

    int deleteByPrimaryKey(String gradeId);

    int insert(CarrierMemberGrade record);

    int insertSelective(CarrierMemberGrade record);

    List<CarrierMemberGrade> selectByExample(CarrierMemberGradeExample example);

    CarrierMemberGrade selectByPrimaryKey(String gradeId);

    int updateByExampleSelective(@Param("record") CarrierMemberGrade record, @Param("example") CarrierMemberGradeExample example);

    int updateByExample(@Param("record") CarrierMemberGrade record, @Param("example") CarrierMemberGradeExample example);

    int updateByPrimaryKeySelective(CarrierMemberGrade record);

    int updateByPrimaryKey(CarrierMemberGrade record);
}
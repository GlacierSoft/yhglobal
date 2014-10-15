package com.glacier.frame.dao.member;

import com.glacier.frame.entity.member.ShipperMemberGrade;
import com.glacier.frame.entity.member.ShipperMemberGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShipperMemberGradeMapper {
    int countByExample(ShipperMemberGradeExample example);

    int deleteByExample(ShipperMemberGradeExample example);

    int deleteByPrimaryKey(String gradeId);

    int insert(ShipperMemberGrade record);

    int insertSelective(ShipperMemberGrade record);

    List<ShipperMemberGrade> selectByExample(ShipperMemberGradeExample example);

    ShipperMemberGrade selectByPrimaryKey(String gradeId);

    int updateByExampleSelective(@Param("record") ShipperMemberGrade record, @Param("example") ShipperMemberGradeExample example);

    int updateByExample(@Param("record") ShipperMemberGrade record, @Param("example") ShipperMemberGradeExample example);

    int updateByPrimaryKeySelective(ShipperMemberGrade record);

    int updateByPrimaryKey(ShipperMemberGrade record);
}
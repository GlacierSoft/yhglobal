package com.glacier.frame.dao.member;

import com.glacier.frame.entity.member.ShipperMemberMessageNotice;
import com.glacier.frame.entity.member.ShipperMemberMessageNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShipperMemberMessageNoticeMapper {
    int countByExample(ShipperMemberMessageNoticeExample example);

    int deleteByExample(ShipperMemberMessageNoticeExample example);

    int deleteByPrimaryKey(String messageNoticeId);

    int insert(ShipperMemberMessageNotice record);

    int insertSelective(ShipperMemberMessageNotice record);

    List<ShipperMemberMessageNotice> selectByExample(ShipperMemberMessageNoticeExample example);

    ShipperMemberMessageNotice selectByPrimaryKey(String messageNoticeId);

    int updateByExampleSelective(@Param("record") ShipperMemberMessageNotice record, @Param("example") ShipperMemberMessageNoticeExample example);

    int updateByExample(@Param("record") ShipperMemberMessageNotice record, @Param("example") ShipperMemberMessageNoticeExample example);

    int updateByPrimaryKeySelective(ShipperMemberMessageNotice record);

    int updateByPrimaryKey(ShipperMemberMessageNotice record);
}
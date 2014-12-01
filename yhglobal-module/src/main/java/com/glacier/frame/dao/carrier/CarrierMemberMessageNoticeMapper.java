package com.glacier.frame.dao.carrier;

import com.glacier.frame.entity.carrier.CarrierMemberMessageNotice;
import com.glacier.frame.entity.carrier.CarrierMemberMessageNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarrierMemberMessageNoticeMapper {
    int countByExample(CarrierMemberMessageNoticeExample example);

    int deleteByExample(CarrierMemberMessageNoticeExample example);

    int deleteByPrimaryKey(String messageNoticeId);

    int insert(CarrierMemberMessageNotice record);

    int insertSelective(CarrierMemberMessageNotice record);

    List<CarrierMemberMessageNotice> selectByExample(CarrierMemberMessageNoticeExample example);

    CarrierMemberMessageNotice selectByPrimaryKey(String messageNoticeId);

    int updateByExampleSelective(@Param("record") CarrierMemberMessageNotice record, @Param("example") CarrierMemberMessageNoticeExample example);

    int updateByExample(@Param("record") CarrierMemberMessageNotice record, @Param("example") CarrierMemberMessageNoticeExample example);

    int updateByPrimaryKeySelective(CarrierMemberMessageNotice record);

    int updateByPrimaryKey(CarrierMemberMessageNotice record);
}
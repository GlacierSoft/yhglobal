package com.glacier.frame.dao.carrier;

import com.glacier.frame.entity.carrier.CarrierDeliverGoodsArea;
import com.glacier.frame.entity.carrier.CarrierDeliverGoodsAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarrierDeliverGoodsAreaMapper {
    int countByExample(CarrierDeliverGoodsAreaExample example);

    int deleteByExample(CarrierDeliverGoodsAreaExample example);

    int deleteByPrimaryKey(String deliverGoodsAreaId);

    int insert(CarrierDeliverGoodsArea record);

    int insertSelective(CarrierDeliverGoodsArea record);

    List<CarrierDeliverGoodsArea> selectByExample(CarrierDeliverGoodsAreaExample example);

    CarrierDeliverGoodsArea selectByPrimaryKey(String deliverGoodsAreaId);

    int updateByExampleSelective(@Param("record") CarrierDeliverGoodsArea record, @Param("example") CarrierDeliverGoodsAreaExample example);

    int updateByExample(@Param("record") CarrierDeliverGoodsArea record, @Param("example") CarrierDeliverGoodsAreaExample example);

    int updateByPrimaryKeySelective(CarrierDeliverGoodsArea record);

    int updateByPrimaryKey(CarrierDeliverGoodsArea record);
}
package com.glacier.frame.dao.carrier;

import com.glacier.frame.entity.carrier.CarrierPickUpgoodsArea;
import com.glacier.frame.entity.carrier.CarrierPickUpgoodsAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarrierPickUpgoodsAreaMapper {
    int countByExample(CarrierPickUpgoodsAreaExample example);

    int deleteByExample(CarrierPickUpgoodsAreaExample example);

    int deleteByPrimaryKey(String pickUpGoodsAreaId);

    int insert(CarrierPickUpgoodsArea record);

    int insertSelective(CarrierPickUpgoodsArea record);

    List<CarrierPickUpgoodsArea> selectByExample(CarrierPickUpgoodsAreaExample example);

    CarrierPickUpgoodsArea selectByPrimaryKey(String pickUpGoodsAreaId);

    int updateByExampleSelective(@Param("record") CarrierPickUpgoodsArea record, @Param("example") CarrierPickUpgoodsAreaExample example);

    int updateByExample(@Param("record") CarrierPickUpgoodsArea record, @Param("example") CarrierPickUpgoodsAreaExample example);

    int updateByPrimaryKeySelective(CarrierPickUpgoodsArea record);

    int updateByPrimaryKey(CarrierPickUpgoodsArea record);
}
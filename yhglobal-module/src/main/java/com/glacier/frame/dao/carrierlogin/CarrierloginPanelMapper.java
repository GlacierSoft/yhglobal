package com.glacier.frame.dao.carrierlogin;

import com.glacier.frame.entity.carrierlogin.CarrierloginPanel;
import com.glacier.frame.entity.carrierlogin.CarrierloginPanelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarrierloginPanelMapper {
    int countByExample(CarrierloginPanelExample example);

    int deleteByExample(CarrierloginPanelExample example);

    int deleteByPrimaryKey(String panelId);

    int insert(CarrierloginPanel record);

    int insertSelective(CarrierloginPanel record);

    List<CarrierloginPanel> selectByExample(CarrierloginPanelExample example);

    CarrierloginPanel selectByPrimaryKey(String panelId);

    int updateByExampleSelective(@Param("record") CarrierloginPanel record, @Param("example") CarrierloginPanelExample example);

    int updateByExample(@Param("record") CarrierloginPanel record, @Param("example") CarrierloginPanelExample example);

    int updateByPrimaryKeySelective(CarrierloginPanel record);

    int updateByPrimaryKey(CarrierloginPanel record);
}
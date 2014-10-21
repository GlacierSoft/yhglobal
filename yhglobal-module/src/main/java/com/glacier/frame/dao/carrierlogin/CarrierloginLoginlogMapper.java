package com.glacier.frame.dao.carrierlogin;

import com.glacier.frame.entity.carrierlogin.CarrierloginLoginlog;
import com.glacier.frame.entity.carrierlogin.CarrierloginLoginlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarrierloginLoginlogMapper {
    int countByExample(CarrierloginLoginlogExample example);

    int deleteByExample(CarrierloginLoginlogExample example);

    int deleteByPrimaryKey(String loginlogId);

    int insert(CarrierloginLoginlog record);

    int insertSelective(CarrierloginLoginlog record);

    List<CarrierloginLoginlog> selectByExample(CarrierloginLoginlogExample example);

    CarrierloginLoginlog selectByPrimaryKey(String loginlogId);

    int updateByExampleSelective(@Param("record") CarrierloginLoginlog record, @Param("example") CarrierloginLoginlogExample example);

    int updateByExample(@Param("record") CarrierloginLoginlog record, @Param("example") CarrierloginLoginlogExample example);

    int updateByPrimaryKeySelective(CarrierloginLoginlog record);

    int updateByPrimaryKey(CarrierloginLoginlog record);
}
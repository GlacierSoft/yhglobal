package com.glacier.frame.dao.carrier;

import com.glacier.frame.entity.carrier.CarrierContractRecord;
import com.glacier.frame.entity.carrier.CarrierContractRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarrierContractRecordMapper {
    int countByExample(CarrierContractRecordExample example);

    int deleteByExample(CarrierContractRecordExample example);

    int deleteByPrimaryKey(String contractRecordId);

    int insert(CarrierContractRecord record);

    int insertSelective(CarrierContractRecord record);

    List<CarrierContractRecord> selectByExample(CarrierContractRecordExample example);

    CarrierContractRecord selectByPrimaryKey(String contractRecordId);

    int updateByExampleSelective(@Param("record") CarrierContractRecord record, @Param("example") CarrierContractRecordExample example);

    int updateByExample(@Param("record") CarrierContractRecord record, @Param("example") CarrierContractRecordExample example);

    int updateByPrimaryKeySelective(CarrierContractRecord record);

    int updateByPrimaryKey(CarrierContractRecord record);
}
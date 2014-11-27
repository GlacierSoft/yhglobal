package com.glacier.frame.dao.storehouse;

import com.glacier.frame.entity.storehouse.StorehouseAddedService;
import com.glacier.frame.entity.storehouse.StorehouseAddedServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorehouseAddedServiceMapper {
    int countByExample(StorehouseAddedServiceExample example);

    int deleteByExample(StorehouseAddedServiceExample example);

    int deleteByPrimaryKey(String addedServiceId);

    int insert(StorehouseAddedService record);

    int insertSelective(StorehouseAddedService record);

    List<StorehouseAddedService> selectByExample(StorehouseAddedServiceExample example);

    StorehouseAddedService selectByPrimaryKey(String addedServiceId);

    int updateByExampleSelective(@Param("record") StorehouseAddedService record, @Param("example") StorehouseAddedServiceExample example);

    int updateByExample(@Param("record") StorehouseAddedService record, @Param("example") StorehouseAddedServiceExample example);

    int updateByPrimaryKeySelective(StorehouseAddedService record);

    int updateByPrimaryKey(StorehouseAddedService record);
}
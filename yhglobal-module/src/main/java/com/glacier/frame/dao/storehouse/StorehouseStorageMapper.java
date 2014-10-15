package com.glacier.frame.dao.storehouse;

import com.glacier.frame.entity.storehouse.StorehouseStorage;
import com.glacier.frame.entity.storehouse.StorehouseStorageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorehouseStorageMapper {
    int countByExample(StorehouseStorageExample example);

    int deleteByExample(StorehouseStorageExample example);

    int deleteByPrimaryKey(String storageId);

    int insert(StorehouseStorage record);

    int insertSelective(StorehouseStorage record);

    List<StorehouseStorage> selectByExample(StorehouseStorageExample example);

    StorehouseStorage selectByPrimaryKey(String storageId);

    int updateByExampleSelective(@Param("record") StorehouseStorage record, @Param("example") StorehouseStorageExample example);

    int updateByExample(@Param("record") StorehouseStorage record, @Param("example") StorehouseStorageExample example);

    int updateByPrimaryKeySelective(StorehouseStorage record);

    int updateByPrimaryKey(StorehouseStorage record);
}
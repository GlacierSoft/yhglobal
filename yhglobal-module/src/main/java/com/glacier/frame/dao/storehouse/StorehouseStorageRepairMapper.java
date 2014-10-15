package com.glacier.frame.dao.storehouse;

import com.glacier.frame.entity.storehouse.StorehouseStorageRepair;
import com.glacier.frame.entity.storehouse.StorehouseStorageRepairExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorehouseStorageRepairMapper {
    int countByExample(StorehouseStorageRepairExample example);

    int deleteByExample(StorehouseStorageRepairExample example);

    int deleteByPrimaryKey(String repairId);

    int insert(StorehouseStorageRepair record);

    int insertSelective(StorehouseStorageRepair record);

    List<StorehouseStorageRepair> selectByExample(StorehouseStorageRepairExample example);

    StorehouseStorageRepair selectByPrimaryKey(String repairId);

    int updateByExampleSelective(@Param("record") StorehouseStorageRepair record, @Param("example") StorehouseStorageRepairExample example);

    int updateByExample(@Param("record") StorehouseStorageRepair record, @Param("example") StorehouseStorageRepairExample example);

    int updateByPrimaryKeySelective(StorehouseStorageRepair record);

    int updateByPrimaryKey(StorehouseStorageRepair record);
}
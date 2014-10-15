package com.glacier.frame.dao.storehouse;

import com.glacier.frame.entity.storehouse.StorehousePackCode;
import com.glacier.frame.entity.storehouse.StorehousePackCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorehousePackCodeMapper {
    int countByExample(StorehousePackCodeExample example);

    int deleteByExample(StorehousePackCodeExample example);

    int deleteByPrimaryKey(String packCodeId);

    int insert(StorehousePackCode record);

    int insertSelective(StorehousePackCode record);

    List<StorehousePackCode> selectByExample(StorehousePackCodeExample example);

    StorehousePackCode selectByPrimaryKey(String packCodeId);

    int updateByExampleSelective(@Param("record") StorehousePackCode record, @Param("example") StorehousePackCodeExample example);

    int updateByExample(@Param("record") StorehousePackCode record, @Param("example") StorehousePackCodeExample example);

    int updateByPrimaryKeySelective(StorehousePackCode record);

    int updateByPrimaryKey(StorehousePackCode record);
}
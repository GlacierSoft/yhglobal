package com.glacier.frame.dao.storehouse;

import com.glacier.frame.entity.storehouse.StorehousePackagetypeSet;
import com.glacier.frame.entity.storehouse.StorehousePackagetypeSetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorehousePackagetypeSetMapper {
    int countByExample(StorehousePackagetypeSetExample example);

    int deleteByExample(StorehousePackagetypeSetExample example);

    int deleteByPrimaryKey(String packagetypeId);

    int insert(StorehousePackagetypeSet record);

    int insertSelective(StorehousePackagetypeSet record);

    List<StorehousePackagetypeSet> selectByExample(StorehousePackagetypeSetExample example);

    StorehousePackagetypeSet selectByPrimaryKey(String packagetypeId);

    int updateByExampleSelective(@Param("record") StorehousePackagetypeSet record, @Param("example") StorehousePackagetypeSetExample example);

    int updateByExample(@Param("record") StorehousePackagetypeSet record, @Param("example") StorehousePackagetypeSetExample example);

    int updateByPrimaryKeySelective(StorehousePackagetypeSet record);

    int updateByPrimaryKey(StorehousePackagetypeSet record);
}
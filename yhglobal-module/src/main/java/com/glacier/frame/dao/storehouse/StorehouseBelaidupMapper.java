package com.glacier.frame.dao.storehouse;

import com.glacier.frame.entity.storehouse.StorehouseBelaidup;
import com.glacier.frame.entity.storehouse.StorehouseBelaidupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorehouseBelaidupMapper {
    int countByExample(StorehouseBelaidupExample example);

    int deleteByExample(StorehouseBelaidupExample example);

    int deleteByPrimaryKey(String belaidupId);

    int insert(StorehouseBelaidup record);

    int insertSelective(StorehouseBelaidup record);

    List<StorehouseBelaidup> selectByExample(StorehouseBelaidupExample example);

    StorehouseBelaidup selectByPrimaryKey(String belaidupId);

    int updateByExampleSelective(@Param("record") StorehouseBelaidup record, @Param("example") StorehouseBelaidupExample example);

    int updateByExample(@Param("record") StorehouseBelaidup record, @Param("example") StorehouseBelaidupExample example);

    int updateByPrimaryKeySelective(StorehouseBelaidup record);

    int updateByPrimaryKey(StorehouseBelaidup record);
}
package com.glacier.frame.dao.storehouse;

import com.glacier.frame.entity.storehouse.StorehouseBelaidupSource;
import com.glacier.frame.entity.storehouse.StorehouseBelaidupSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorehouseBelaidupSourceMapper {
    int countByExample(StorehouseBelaidupSourceExample example);

    int deleteByExample(StorehouseBelaidupSourceExample example);

    int deleteByPrimaryKey(String belaidupId);

    int insert(StorehouseBelaidupSource record);

    int insertSelective(StorehouseBelaidupSource record);

    List<StorehouseBelaidupSource> selectByExample(StorehouseBelaidupSourceExample example);

    StorehouseBelaidupSource selectByPrimaryKey(String belaidupId);

    int updateByExampleSelective(@Param("record") StorehouseBelaidupSource record, @Param("example") StorehouseBelaidupSourceExample example);

    int updateByExample(@Param("record") StorehouseBelaidupSource record, @Param("example") StorehouseBelaidupSourceExample example);

    int updateByPrimaryKeySelective(StorehouseBelaidupSource record);

    int updateByPrimaryKey(StorehouseBelaidupSource record);
}
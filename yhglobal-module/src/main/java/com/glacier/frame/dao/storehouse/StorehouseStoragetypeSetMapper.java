package com.glacier.frame.dao.storehouse;

import com.glacier.frame.entity.storehouse.StorehouseStoragetypeSet;
import com.glacier.frame.entity.storehouse.StorehouseStoragetypeSetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorehouseStoragetypeSetMapper {
    int countByExample(StorehouseStoragetypeSetExample example);

    int deleteByExample(StorehouseStoragetypeSetExample example);

    int deleteByPrimaryKey(String storagetypeId);

    int insert(StorehouseStoragetypeSet record);

    int insertSelective(StorehouseStoragetypeSet record);

    List<StorehouseStoragetypeSet> selectByExample(StorehouseStoragetypeSetExample example);

    StorehouseStoragetypeSet selectByPrimaryKey(String storagetypeId);

    int updateByExampleSelective(@Param("record") StorehouseStoragetypeSet record, @Param("example") StorehouseStoragetypeSetExample example);

    int updateByExample(@Param("record") StorehouseStoragetypeSet record, @Param("example") StorehouseStoragetypeSetExample example);

    int updateByPrimaryKeySelective(StorehouseStoragetypeSet record);

    int updateByPrimaryKey(StorehouseStoragetypeSet record);
}
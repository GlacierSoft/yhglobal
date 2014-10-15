package com.glacier.frame.dao.storehouse;

import com.glacier.frame.entity.storehouse.StorehouseGoodstypeSet;
import com.glacier.frame.entity.storehouse.StorehouseGoodstypeSetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorehouseGoodstypeSetMapper {
    int countByExample(StorehouseGoodstypeSetExample example);

    int deleteByExample(StorehouseGoodstypeSetExample example);

    int deleteByPrimaryKey(String goodstypeId);

    int insert(StorehouseGoodstypeSet record);

    int insertSelective(StorehouseGoodstypeSet record);

    List<StorehouseGoodstypeSet> selectByExample(StorehouseGoodstypeSetExample example);

    StorehouseGoodstypeSet selectByPrimaryKey(String goodstypeId);

    int updateByExampleSelective(@Param("record") StorehouseGoodstypeSet record, @Param("example") StorehouseGoodstypeSetExample example);

    int updateByExample(@Param("record") StorehouseGoodstypeSet record, @Param("example") StorehouseGoodstypeSetExample example);

    int updateByPrimaryKeySelective(StorehouseGoodstypeSet record);

    int updateByPrimaryKey(StorehouseGoodstypeSet record);
}
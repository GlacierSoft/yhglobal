package com.glacier.frame.dao.storehouse;

import com.glacier.frame.entity.storehouse.StorehouseStorageGoodsrun;
import com.glacier.frame.entity.storehouse.StorehouseStorageGoodsrunExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorehouseStorageGoodsrunMapper {
    int countByExample(StorehouseStorageGoodsrunExample example);

    int deleteByExample(StorehouseStorageGoodsrunExample example);

    int deleteByPrimaryKey(String goodsrunId);

    int insert(StorehouseStorageGoodsrun record);

    int insertSelective(StorehouseStorageGoodsrun record);

    List<StorehouseStorageGoodsrun> selectByExample(StorehouseStorageGoodsrunExample example);

    StorehouseStorageGoodsrun selectByPrimaryKey(String goodsrunId);

    int updateByExampleSelective(@Param("record") StorehouseStorageGoodsrun record, @Param("example") StorehouseStorageGoodsrunExample example);

    int updateByExample(@Param("record") StorehouseStorageGoodsrun record, @Param("example") StorehouseStorageGoodsrunExample example);

    int updateByPrimaryKeySelective(StorehouseStorageGoodsrun record);

    int updateByPrimaryKey(StorehouseStorageGoodsrun record);
}
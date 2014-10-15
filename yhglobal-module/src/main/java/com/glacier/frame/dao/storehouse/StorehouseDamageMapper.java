package com.glacier.frame.dao.storehouse;

import com.glacier.frame.entity.storehouse.StorehouseDamage;
import com.glacier.frame.entity.storehouse.StorehouseDamageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorehouseDamageMapper {
    int countByExample(StorehouseDamageExample example);

    int deleteByExample(StorehouseDamageExample example);

    int deleteByPrimaryKey(String damageId);

    int insert(StorehouseDamage record);

    int insertSelective(StorehouseDamage record);

    List<StorehouseDamage> selectByExample(StorehouseDamageExample example);

    StorehouseDamage selectByPrimaryKey(String damageId);

    int updateByExampleSelective(@Param("record") StorehouseDamage record, @Param("example") StorehouseDamageExample example);

    int updateByExample(@Param("record") StorehouseDamage record, @Param("example") StorehouseDamageExample example);

    int updateByPrimaryKeySelective(StorehouseDamage record);

    int updateByPrimaryKey(StorehouseDamage record);
}
package com.glacier.frame.dao.storehouse;

import com.glacier.frame.entity.storehouse.StorehouseTemplate;
import com.glacier.frame.entity.storehouse.StorehouseTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorehouseTemplateMapper {
    int countByExample(StorehouseTemplateExample example);

    int deleteByExample(StorehouseTemplateExample example);

    int deleteByPrimaryKey(String templateid);

    int insert(StorehouseTemplate record);

    int insertSelective(StorehouseTemplate record);

    List<StorehouseTemplate> selectByExample(StorehouseTemplateExample example);

    StorehouseTemplate selectByPrimaryKey(String templateid);

    int updateByExampleSelective(@Param("record") StorehouseTemplate record, @Param("example") StorehouseTemplateExample example);

    int updateByExample(@Param("record") StorehouseTemplate record, @Param("example") StorehouseTemplateExample example);

    int updateByPrimaryKeySelective(StorehouseTemplate record);

    int updateByPrimaryKey(StorehouseTemplate record);
}
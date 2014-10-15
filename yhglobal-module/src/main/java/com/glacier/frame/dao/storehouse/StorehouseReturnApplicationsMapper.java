package com.glacier.frame.dao.storehouse;

import com.glacier.frame.entity.storehouse.StorehouseReturnApplications;
import com.glacier.frame.entity.storehouse.StorehouseReturnApplicationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorehouseReturnApplicationsMapper {
    int countByExample(StorehouseReturnApplicationsExample example);

    int deleteByExample(StorehouseReturnApplicationsExample example);

    int deleteByPrimaryKey(String returnId);

    int insert(StorehouseReturnApplications record);

    int insertSelective(StorehouseReturnApplications record);

    List<StorehouseReturnApplications> selectByExample(StorehouseReturnApplicationsExample example);

    StorehouseReturnApplications selectByPrimaryKey(String returnId);

    int updateByExampleSelective(@Param("record") StorehouseReturnApplications record, @Param("example") StorehouseReturnApplicationsExample example);

    int updateByExample(@Param("record") StorehouseReturnApplications record, @Param("example") StorehouseReturnApplicationsExample example);

    int updateByPrimaryKeySelective(StorehouseReturnApplications record);

    int updateByPrimaryKey(StorehouseReturnApplications record);
}
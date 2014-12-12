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
    
    //自定义查询：查询交易成功次数
    int countByStatusExample(String memberId);
    
   //倒序查询最后一次添加的订单，取出它的基本信息
   //  @Select("SELECT  * FROM t_storehouse_belaidup where member_id = #{memberId} ORDER BY create_time DESC LIMIT 1")
    StorehouseBelaidup selectTop(String memberId);

    List<StorehouseBelaidup> selectByExample(StorehouseBelaidupExample example);

    StorehouseBelaidup selectByPrimaryKey(String belaidupId);

    int updateByExampleSelective(@Param("record") StorehouseBelaidup record, @Param("example") StorehouseBelaidupExample example);

    int updateByExample(@Param("record") StorehouseBelaidup record, @Param("example") StorehouseBelaidupExample example);

    int updateByPrimaryKeySelective(StorehouseBelaidup record);

    int updateByPrimaryKey(StorehouseBelaidup record);
}
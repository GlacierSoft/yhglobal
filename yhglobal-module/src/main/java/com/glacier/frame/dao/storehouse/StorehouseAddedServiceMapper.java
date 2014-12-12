package com.glacier.frame.dao.storehouse;

import com.glacier.frame.entity.storehouse.StorehouseAddedService;
import com.glacier.frame.entity.storehouse.StorehouseAddedServiceExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface StorehouseAddedServiceMapper {
    int countByExample(StorehouseAddedServiceExample example);

    int deleteByExample(StorehouseAddedServiceExample example);

    int deleteByPrimaryKey(String addedServiceId);

    int insert(StorehouseAddedService record);

    int insertSelective(StorehouseAddedService record);

    @Select("SELECT SUM(s.transportation_cost) from t_storehouse_belaidup b " +
    		"LEFT JOIN t_storehouse_added_service s ON b.belaidup_id = s.belaidup_id " +
    		"WHERE b.member_id=#{memberId}")
    List<String> selectByTransportation(String memberId);
    
    @Select("SELECT SUM(s.insurance_cost) from t_storehouse_belaidup b " +
    		"LEFT JOIN t_storehouse_added_service s ON b.belaidup_id = s.belaidup_id " +
    		"WHERE b.member_id=#{memberId}")
    List<String> selectByInsurance(String memberId);
    
    @Select("SELECT SUM(s.goods_cost) from t_storehouse_belaidup b " +
    		"LEFT JOIN t_storehouse_added_service s ON b.belaidup_id = s.belaidup_id " +
    		"WHERE b.member_id=#{memberId}")
    List<String> selectByGoods(String memberId);
    
    List<StorehouseAddedService> selectByExample(StorehouseAddedServiceExample example);

    StorehouseAddedService selectByPrimaryKey(String addedServiceId);

    int updateByExampleSelective(@Param("record") StorehouseAddedService record, @Param("example") StorehouseAddedServiceExample example);

    int updateByExample(@Param("record") StorehouseAddedService record, @Param("example") StorehouseAddedServiceExample example);

    int updateByPrimaryKeySelective(StorehouseAddedService record);

    int updateByPrimaryKey(StorehouseAddedService record);
}
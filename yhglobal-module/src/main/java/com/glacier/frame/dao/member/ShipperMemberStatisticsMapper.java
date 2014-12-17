package com.glacier.frame.dao.member;

import com.glacier.frame.entity.member.ShipperMemberStatistics;
import java.util.List;
import org.apache.ibatis.annotations.Select;

public interface ShipperMemberStatisticsMapper {
    
	//获取所有的会员统计信息
	@Select("select t1.member_id as statisticsId,t1.member_name as memberId,t5.countstatus,t3.mrechageadd,t2.receivemoney,t4.withdrawmoney,t4.withdrawreallymoney,t3.mrechargemark,t1.counttransportation,t1.countinsurance,t1.countgoods from " +
			"(select a.member_id,a.member_name,sum(c.transportation_cost) as counttransportation, sum(c.insurance_cost) as countinsurance ,sum(c.goods_cost) as countgoods " +
			"from  t_shipper_member a left join t_storehouse_belaidup  b on a.member_id = b.member_id " +
			"left join t_storehouse_added_service c on b.belaidup_id=c.belaidup_id " +
			"group by a.member_id) t1 " +
			"left join " +
			"(select a.member_id,sum(b.recharge_money) as receivemoney " +
			"from t_shipper_member a left join t_finace_recharge_member b on a.member_id=b.member_id " +
			"group by a.member_id) t2  on t1.member_id=t2.member_id " +
			"LEFT JOIN " +
			"(select member.member_id,sum(finances.mrechage_add) as mrechageadd,SUM(finances.mrecharge_mark) as mrechargemark " +
			"from t_shipper_member member LEFT JOIN t_finance_member finances on finances.member_id = member.member_id " +
			"group by member.member_id) t3 ON t1.member_id=t3.member_id " +
			"LEFT JOIN " +
			"(select member.member_id,sum(withdraws.withdraw_money) as withdrawmoney,sum(withdraws.withdraw_really_money) as withdrawreallymoney " +
			"from t_shipper_member member LEFT JOIN t_finace_withdraw_member withdraws on member.member_id = withdraws.member_id " +
			"group by member.member_id) t4 on t1.member_id=t4.member_id " +
			"LEFT JOIN " +
			"(select member.member_id,COUNT(*) as countstatus " +
			"from t_shipper_member member left join t_storehouse_belaidup  b on member.member_id = b.member_id " +
			"where b.belaidup_status = 'business' group by member.member_id) t5 on t1.member_id=t5.member_id where t1.member_name like #{memberName}")
	List<ShipperMemberStatistics> getStatisticsList(String memberName);
	
	//根据ID获取单个会员统计信息
	@Select("select t1.member_id as statisticsId,t1.member_name as memberId,t5.countstatus,t3.mrechageadd,t2.receivemoney,t4.withdrawmoney,t4.withdrawreallymoney,t3.mrechargemark,t1.counttransportation,t1.countinsurance,t1.countgoods from " +
			"(select a.member_id,a.member_name,sum(c.transportation_cost) as counttransportation, sum(c.insurance_cost) as countinsurance ,sum(c.goods_cost) as countgoods " +
			"from  t_shipper_member a left join t_storehouse_belaidup  b on a.member_id = b.member_id " +
			"left join t_storehouse_added_service c on b.belaidup_id=c.belaidup_id " +
			"group by a.member_id) t1 " +
			"left join " +
			"(select a.member_id,sum(b.recharge_money) as receivemoney " +
			"from t_shipper_member a left join t_finace_recharge_member b on a.member_id=b.member_id " +
			"group by a.member_id) t2  on t1.member_id=t2.member_id " +
			"LEFT JOIN " +
			"(select member.member_id,sum(finances.mrechage_add) as mrechageadd,SUM(finances.mrecharge_mark) as mrechargemark " +
			"from t_shipper_member member LEFT JOIN t_finance_member finances on finances.member_id = member.member_id " +
			"group by member.member_id) t3 ON t1.member_id=t3.member_id " +
			"LEFT JOIN " +
			"(select member.member_id,sum(withdraws.withdraw_money) as withdrawmoney,sum(withdraws.withdraw_really_money) as withdrawreallymoney " +
			"from t_shipper_member member LEFT JOIN t_finace_withdraw_member withdraws on member.member_id = withdraws.member_id " +
			"group by member.member_id) t4 on t1.member_id=t4.member_id " +
			"LEFT JOIN " +
			"(select member.member_id,COUNT(*) as countstatus " +
			"from t_shipper_member member left join t_storehouse_belaidup  b on member.member_id = b.member_id " +
			"where b.belaidup_status = 'business' group by member.member_id) t5 on t1.member_id=t5.member_id where t1.member_id = #{memberId}")
	ShipperMemberStatistics getStatistics(String memberId);
	
	
	//获取统计会员的条数
	@Select("select count(*) from " +
			"(select a.member_id,a.member_name,sum(c.transportation_cost) as counttransportation, sum(c.insurance_cost) as countinsurance ,sum(c.goods_cost) as countgoods  " +
			"from  t_shipper_member a left join t_storehouse_belaidup  b on a.member_id = b.member_id " +
			"left join t_storehouse_added_service c on b.belaidup_id=c.belaidup_id " +
			"group by a.member_id) t1 " +
			"left join " +
			"(select a.member_id,sum(b.recharge_money) as receivemoney " +
			"from t_shipper_member a left join t_finace_recharge_member b on a.member_id=b.member_id " +
			"group by a.member_id) t2  on t1.member_id=t2.member_id " +
			"LEFT JOIN " +
			"(select member.member_id,sum(finances.mrechage_add) as mrechageadd,SUM(finances.mrecharge_mark) as mrechargemark " +
			"from t_shipper_member member LEFT JOIN t_finance_member finances on finances.member_id = member.member_id " +
			"group by member.member_id) t3 ON t1.member_id=t3.member_id " +
			"LEFT JOIN " +
			"(select member.member_id,sum(withdraws.withdraw_money) as withdrawmoney,sum(withdraws.withdraw_really_money) as withdrawreallymoney " +
			"from t_shipper_member member LEFT JOIN t_finace_withdraw_member withdraws on member.member_id = withdraws.member_id " +
			"group by member.member_id) t4 on t1.member_id=t4.member_id " +
			"LEFT JOIN " +
			"(select member.member_id,COUNT(*) as countstatus " +
			"from t_shipper_member member left join t_storehouse_belaidup  b on member.member_id = b.member_id " +
			"where b.belaidup_status = 'business' group by member.member_id) t5 on t1.member_id=t5.member_id where t1.member_name like #{memberName}")
	int countByExample(String memberName);
}
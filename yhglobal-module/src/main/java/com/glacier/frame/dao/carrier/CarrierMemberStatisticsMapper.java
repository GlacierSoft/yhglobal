package com.glacier.frame.dao.carrier;

import com.glacier.frame.entity.carrier.CarrierMemberStatistics;
import java.util.List;
import org.apache.ibatis.annotations.Select;

public interface CarrierMemberStatisticsMapper {
    
	//获取所有的承运商统计信息
	@Select("SELECT t1.memberId,t1.memberName,t1.income,t1.retruns,t1.recharge,t1.withdarw,t2.driverCount,t3.carCount,t4.dispatchingCount FROM " +
			"(SELECT  member.carrier_member_id as memberId,member.member_name as memberName,ifnull(carrier.carrier_income,0) as income," +
			"ifnull(carrier.carrier_return,0) as retruns,ifnull(carrier.carrier_recharge,0) as recharge,ifnull(carrier.carrier_withdraw,0) as withdarw " +
			"FROM t_carrier_member member LEFT JOIN t_finance_carrier carrier ON member.carrier_member_id = carrier.carrier_member_id GROUP BY member.carrier_member_id) t1 " +
			"LEFT JOIN" +
			"(SELECT member.carrier_member_id as memberId,member.member_name,ifnull(COUNT(*),0) as driverCount " +
			"FROM t_carrier_member member,t_carrier_driver driver WHERE member.carrier_member_id = driver.carrier_member_id " +
			"GROUP BY member.carrier_member_id) t2 " +
			"ON t1.memberId = t2.memberId " +
			"LEFT JOIN" +
			"(SELECT member.carrier_member_id as memberId,ifnull(COUNT(*),0) as carCount " +
			"FROM t_carrier_member member,t_carrier_car_information information where member.carrier_member_id = information.carrier_member_id " +
			"GROUP BY member.carrier_member_id) t3 ON t1.memberId = t3.memberId " +
			"LEFT JOIN" +
			"(SELECT member.carrier_member_id as memberId,ifnull(COUNT(*),0) as dispatchingCount " +
			"FROM t_carrier_member member,t_orders_dispatching dispatching where member.carrier_member_id = dispatching.carrier_id and dispatching.dispatching_status = 'completion' " +
			"GROUP BY member.carrier_member_id) t4 ON t1.memberId = t4.memberId WHERE t1.memberName != 'admin' and t1.memberName like #{memberName}")
	List<CarrierMemberStatistics> getStatisticsList(String memberName);
	
	//根据ID获取单个承运商统计信息
	@Select("SELECT t1.memberId,t1.memberName,t1.income,t1.retruns,t1.recharge,t1.withdarw,t2.driverCount,t3.carCount,t4.dispatchingCount FROM " +
			"(SELECT  member.carrier_member_id as memberId,member.member_name as memberName,ifnull(carrier.carrier_income,0) as income," +
			"ifnull(carrier.carrier_return,0) as retruns,ifnull(carrier.carrier_recharge,0) as recharge,ifnull(carrier.carrier_withdraw,0) as withdarw " +
			"FROM t_carrier_member member LEFT JOIN t_finance_carrier carrier ON member.carrier_member_id = carrier.carrier_member_id GROUP BY member.carrier_member_id) t1 " +
			"LEFT JOIN" +
			"(SELECT member.carrier_member_id as memberId,member.member_name,ifnull(COUNT(*),0) as driverCount " +
			"FROM t_carrier_member member,t_carrier_driver driver WHERE member.carrier_member_id = driver.carrier_member_id " +
			"GROUP BY member.carrier_member_id) t2 " +
			"ON t1.memberId = t2.memberId " +
			"LEFT JOIN" +
			"(SELECT member.carrier_member_id as memberId,ifnull(COUNT(*),0) as carCount " +
			"FROM t_carrier_member member,t_carrier_car_information information where member.carrier_member_id = information.carrier_member_id " +
			"GROUP BY member.carrier_member_id) t3 ON t1.memberId = t3.memberId " +
			"LEFT JOIN" +
			"(SELECT member.carrier_member_id as memberId,ifnull(COUNT(*),0) as dispatchingCount " +
			"FROM t_carrier_member member,t_orders_dispatching dispatching where member.carrier_member_id = dispatching.carrier_id and dispatching.dispatching_status = 'completion' " +
			"GROUP BY member.carrier_member_id) t4 ON t1.memberId = t4.memberId WHERE t1.memberName != 'admin' and t1.memberId = #{memberId}")
	CarrierMemberStatistics getStatistics(String memberId);
	
	
	//获取统计承运商的条数
	@Select("SELECT count(*) FROM " +
			"(SELECT  member.carrier_member_id as memberId,member.member_name as memberName,ifnull(carrier.carrier_income,0) as income," +
			"ifnull(carrier.carrier_return,0) as retruns,ifnull(carrier.carrier_recharge,0) as recharge,ifnull(carrier.carrier_withdraw,0) as withdarw " +
			"FROM t_carrier_member member LEFT JOIN t_finance_carrier carrier ON member.carrier_member_id = carrier.carrier_member_id GROUP BY member.carrier_member_id) t1 " +
			"LEFT JOIN" +
			"(SELECT member.carrier_member_id as memberId,member.member_name,ifnull(COUNT(*),0) as driverCount " +
			"FROM t_carrier_member member,t_carrier_driver driver WHERE member.carrier_member_id = driver.carrier_member_id " +
			"GROUP BY member.carrier_member_id) t2 " +
			"ON t1.memberId = t2.memberId " +
			"LEFT JOIN" +
			"(SELECT member.carrier_member_id as memberId,ifnull(COUNT(*),0) as carCount " +
			"FROM t_carrier_member member,t_carrier_car_information information where member.carrier_member_id = information.carrier_member_id " +
			"GROUP BY member.carrier_member_id) t3 ON t1.memberId = t3.memberId " +
			"LEFT JOIN" +
			"(SELECT member.carrier_member_id as memberId,ifnull(COUNT(*),0) as dispatchingCount " +
			"FROM t_carrier_member member,t_orders_dispatching dispatching where member.carrier_member_id = dispatching.carrier_id and dispatching.dispatching_status = 'completion' " +
			"GROUP BY member.carrier_member_id) t4 ON t1.memberId = t4.memberId WHERE t1.memberName != 'admin' and t1.memberName like #{memberName}")
	int countByExample(String memberName);
}
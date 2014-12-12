package com.glacier.frame.dao.finace;

import com.glacier.frame.entity.finace.FinaceWithdrawMember;
import com.glacier.frame.entity.finace.FinaceWithdrawMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface FinaceWithdrawMemberMapper {
    int countByExample(FinaceWithdrawMemberExample example);

    int deleteByExample(FinaceWithdrawMemberExample example);

    int deleteByPrimaryKey(String withdrawId);

    int insert(FinaceWithdrawMember record);

    int insertSelective(FinaceWithdrawMember record);

    @Select("SELECT SUM(w.withdraw_money) from t_finace_withdraw_member w " +
    		"WHERE w.member_id=#{memberId}")
    List<String> getWithdrawMoney(String memberId);
    
    @Select("SELECT SUM(w.withdraw_really_money) from t_finace_withdraw_member w " +
    		"WHERE w.member_id=#{memberId}")
    List<String> getWithdrawReallyMoney(String memberId);
    
    List<FinaceWithdrawMember> selectByExample(FinaceWithdrawMemberExample example);

    FinaceWithdrawMember selectByPrimaryKey(String withdrawId);

    int updateByExampleSelective(@Param("record") FinaceWithdrawMember record, @Param("example") FinaceWithdrawMemberExample example);

    int updateByExample(@Param("record") FinaceWithdrawMember record, @Param("example") FinaceWithdrawMemberExample example);

    int updateByPrimaryKeySelective(FinaceWithdrawMember record);

    int updateByPrimaryKey(FinaceWithdrawMember record);
}
package com.glacier.frame.dto.query.finace;

import com.glacier.frame.entity.finace.FinaceRechargeMember;
import com.glacier.frame.entity.finace.FinaceRechargeMemberExample.Criteria;

public class FinaceRechargeMemberQueryDTO extends FinaceRechargeMember{

	public void setQueryCondition(Criteria queryCriteria, String q) {
	      if(this.getMemberDispaly()!=null)
	    	     queryCriteria.andMemberDisplayLike("%" + this.getMemberDispaly() + "%");
	}

}

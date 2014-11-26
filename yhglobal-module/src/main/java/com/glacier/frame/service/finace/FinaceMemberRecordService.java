package com.glacier.frame.service.finace;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import com.glacier.frame.dao.finace.FinaceMemberRecordMapper;
import com.glacier.frame.dto.query.finace.FinaceMemberRecordQueryDTO;
import com.glacier.frame.entity.finace.FinaceMemberRecord;
import com.glacier.frame.entity.finace.FinaceMemberRecordExample;
import com.glacier.frame.entity.finace.FinaceMemberRecordExample.Criteria;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class FinaceMemberRecordService {
     
	
	
	@Autowired
	private FinaceMemberRecordMapper finaceMemberRecordMapper;
	
	/**
     * @Title: listAsWebsite 
     * @Description: TODO(前台获取登录会员资金记录) 
     * @param @param pager
     * @param @param memberId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
	public Object listAsWebsite(JqPager pager, FinaceMemberRecordQueryDTO finaceMemberRecordQueryDTO, String memberId, int p) {
        JqGridReturn returnResult = new JqGridReturn();
        FinaceMemberRecordExample finaceMemberRecordExample = new FinaceMemberRecordExample();
        Criteria criteria = finaceMemberRecordExample.createCriteria();
        finaceMemberRecordQueryDTO.setQueryCondition(criteria,memberId);//前台条件查询
        
        pager.setSort("createTime");// 定义排序字段
        pager.setOrder("DESC");// 升序还是降序
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	finaceMemberRecordExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	finaceMemberRecordExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	finaceMemberRecordExample.setOrderByClause(pager.getOrderBy("temp_finance_member_record_"));
        }
        int startTemp = ((p-1)*5);//根据前台返回的页数进行设置
        finaceMemberRecordExample.setLimitStart(startTemp);
        finaceMemberRecordExample.setLimitEnd(5);
        List<FinaceMemberRecord>  FinaceMemberRecords = finaceMemberRecordMapper.selectByExample(finaceMemberRecordExample); // 查询所有会员资金记录列表
        int total = finaceMemberRecordMapper.countByExample(finaceMemberRecordExample); // 查询总页数
        returnResult.setRows(FinaceMemberRecords);
        returnResult.setTotal(total);
        returnResult.setP(p);
        return returnResult;// 返回ExtGrid表
    }
	
	
}

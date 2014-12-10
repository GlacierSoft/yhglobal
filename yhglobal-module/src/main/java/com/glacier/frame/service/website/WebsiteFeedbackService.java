/*
 * @(#)WebsiteFeedbackService.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.service.website;

import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.glacier.basic.util.CollectionsUtil;
import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.dao.system.UserMapper;
import com.glacier.frame.dao.website.WebsiteFeedbackMapper;
import com.glacier.frame.entity.member.ShipperMember;
import com.glacier.frame.entity.website.WebsiteFeedback;
import com.glacier.frame.entity.website.WebsiteFeedbackExample;
import com.glacier.frame.util.MethodLog;

/** 
 * @ClassName: WebsiteFeedbackService 
 * @Description: TODO(意见业务类) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class WebsiteFeedbackService {

	@Autowired
    private WebsiteFeedbackMapper feedbackMapper;

	@Autowired
    private UserMapper userMapper;
	
	/**
	 * @Title: getFeedback 
	 * @Description: TODO(根据意见Id获取意见信息) 
	 * @param @param webFdbId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    @Transactional(readOnly = false)
    public Object getFeedback(String webFdbId) {
    	WebsiteFeedback websiteFeedback = feedbackMapper.selectByPrimaryKey(webFdbId); 
    	return websiteFeedback;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有意见信息) 
     * @param @param pfeedbackr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager) {
        JqGridReturn returnResult = new JqGridReturn();
        WebsiteFeedbackExample websiteFeedbackExample = new WebsiteFeedbackExample();
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	websiteFeedbackExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	websiteFeedbackExample.setLimitEnd(pager.getRows());
        }
        pager.setOrder("DESC");// 升序还是降序
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	websiteFeedbackExample.setOrderByClause(pager.getOrderBy("temp_website_feedback_"));
        }
        List<WebsiteFeedback>  websiteFeedbacks = feedbackMapper.selectByExample(websiteFeedbackExample); // 查询所有意见列表
        int total = feedbackMapper.countByExample(websiteFeedbackExample); // 查询总页数
        returnResult.setRows(websiteFeedbacks);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addFeedback 
     * @Description: TODO(新增意见) 
     * @param @param feedback
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addFeedback(WebsiteFeedback feedback) {
    	Subject pricipalSubject = SecurityUtils.getSubject();
        ShipperMember pricipalUser = (ShipperMember) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        feedback.setWebFdbId(RandomGUID.getRandomGUID());
        feedback.setCreater(pricipalUser.getMemberId());
        feedback.setCreateTime(new Date());
        feedback.setUpdater(pricipalUser.getMemberId());
        feedback.setUpdateTime(new Date());
        count = feedbackMapper.insert(feedback);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("发送成功，感谢您对我们网站提出了宝贵的意见！");
        } else {
            returnResult.setMsg("发生未知错误，发送信息失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delFeedback 
     * @Description: TODO(删除意见) 
     * @param @param webFdbIds
     * @param @param annThemes
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "FeedbackList_del")
    public Object delFeedback(List<String> webFdbIds, List<String> webAnnThemes) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (webFdbIds.size() > 0) {
        	for (int i = 0; i < webFdbIds.size(); i++) {
        		System.out.println(webFdbIds.get(i));
			}
        	WebsiteFeedbackExample feedbackExample = new WebsiteFeedbackExample();
        	feedbackExample.createCriteria().andWebFdbIdIn(webFdbIds);
            count = feedbackMapper.deleteByExample(feedbackExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(webAnnThemes, ",") + " ]意见");
            } else {
                returnResult.setMsg("发生未知错误，意见信息删除失败");
            }
        }
        return returnResult;
    }
}

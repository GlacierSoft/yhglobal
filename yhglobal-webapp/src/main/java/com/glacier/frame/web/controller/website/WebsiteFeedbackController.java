/*
 * @(#)WebsiteFeedbackController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.web.controller.website;

import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.frame.service.website.WebsiteFeedbackService;

/** 
 * @ClassName: WebsiteFeedbackController 
 * @Description: TODO(意见的控制器) 
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-12-8 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/feedback")
public class WebsiteFeedbackController extends AbstractController{

    @Autowired
    private WebsiteFeedbackService feedbackService;// 注入意见业务Bean
    
    // 进入意见列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPfeedback() {
        ModelAndView mav = new ModelAndView("website_mgr/feedback_mgr/feedback");
        return mav;
    }
    
    // 进入意见Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoFeedbackDetailPage(String webFdbId) {
        ModelAndView mav = new ModelAndView("website_mgr/feedback_mgr/feedback_detail");
        if(StringUtils.isNotBlank(webFdbId)){
            mav.addObject("feedbackData", feedbackService.getFeedback(webFdbId));
        }
        return mav;
    }
    
    // 获取表格结构的所有意见数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listFeedbackAsGridByMenuId(JqPager pager) {
        return feedbackService.listAsGrid(pager);
    }
    
    // 批量删除意见
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delAnn(@RequestParam List<String> webAnnIds,@RequestParam List<String> webAnnThemes) {
    	return feedbackService.delFeedback(webAnnIds, webAnnThemes);
    }
}

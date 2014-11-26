/**
 * @Title: FinaceMemberRecord.java 
 * @Package com.glacier.frame.web.controller.finace 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-11-26 下午1:24:54 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-11-26
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.web.controller.finace;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.frame.dto.query.finace.FinaceMemberRecordSQueryDTO;
import com.glacier.frame.service.finace.FinaceMemberRecordService;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: FinaceMemberRecord 
 * @Description: TODO(会员资金记录) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-11-26 下午1:24:54
 */


@Controller
@RequestMapping(value="finaceMemberRecord")
public class FinaceMemberRecordCotroller {
   
	@Autowired
	private  FinaceMemberRecordService finaceMemberRecordService;
	
	//进入会员充值记录展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPservice() {
        ModelAndView mav = new ModelAndView("finace_mgr/finaceMemberRecord_mgr/finaceMemberRecord");
        return mav;
    }
	  
    //获取表格结构的所有会员充值记录信息
   	@RequestMapping(value = "/list.json", method = RequestMethod.POST)
   	@ResponseBody
   	private Object listActionAsGridByMenuId(JqPager jqPager, FinaceMemberRecordSQueryDTO FinaceMemberRecordSQueryDTO, String q) {
   		return finaceMemberRecordService.listAsGrid(jqPager, FinaceMemberRecordSQueryDTO,q);
   	}
   	
  //仓库货品损坏记录信息详情页
   	@RequestMapping(value = "/intoDetail.htm")
   	private Object intoFinaceRechargeMemberDetailPage(String transactionMemberId) {
   	    ModelAndView mav = new ModelAndView("finace_mgr/finaceMemberRecord_mgr/finaceMemberRecord_detail");
   	    if(StringUtils.isNotBlank(transactionMemberId)){
   	          mav.addObject("finaceMemberRecordData", finaceMemberRecordService.getFinaceMemberRecordPro(transactionMemberId));
   	    }
   	    return mav;
   	}
	
	
	      
}

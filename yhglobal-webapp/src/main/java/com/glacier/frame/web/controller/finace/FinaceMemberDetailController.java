/**
 * @Title: FinaceMemberDetailController.java 
 * @Package com.glacier.frame.web.controller.finace 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-10-28 上午9:53:57 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-10-28
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.web.controller.finace;


import java.util.List;


import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.frame.dto.query.finace.FinaceMemberDetailQueryDTO;
import com.glacier.frame.entity.finace.FinanceMemberDetail;
import com.glacier.frame.service.finace.FinaceMemberDetailService;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: FinaceMemberDetailController 
 * @Description: TODO(会员资金明细控制层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-10-28 上午9:53:57
 */


@Controller
@RequestMapping(value="finaceMemberDetailController")
public class FinaceMemberDetailController {
  
	@Autowired
	private FinaceMemberDetailService finaceMemberDetailService;
	  
	//进入会员提现记录展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPservice() {
        ModelAndView mav = new ModelAndView("finace_mgr/finaceMemberDetail_mgr/finaceMemberDetail");
        return mav;
    }
	  
    
    //获取表格结构的所有会员充值记录信息
   	@RequestMapping(value = "/list.json", method = RequestMethod.POST)
   	@ResponseBody
   	private Object listActionAsGridByMenuId(JqPager jqPager, FinaceMemberDetailQueryDTO finaceMemberDetailQueryDTO, String q,HttpSession session) {
   		JqGridReturn returnResult=(JqGridReturn)finaceMemberDetailService.listAsGrid(jqPager, finaceMemberDetailQueryDTO, q);
   	    if(returnResult!=null){
 	    	@SuppressWarnings("unchecked")
 	    	List<FinanceMemberDetail> list=(List<FinanceMemberDetail>) returnResult.getRows();
 	    	session.setAttribute("list", list);
 	    }	
   		return returnResult;
   	}
   	
  //会员提现详情页
   	@RequestMapping(value = "/intoDetail.htm")
   	private Object intoFinaceWithdrawMemberDetailPage(String mdetailId) {
   	    ModelAndView mav = new ModelAndView("finace_mgr/finaceMemberDetail_mgr/finaceMemberDetail_detail");
   	    if(StringUtils.isNotBlank(mdetailId)){
   	          mav.addObject("finaceMemberDetailData", finaceMemberDetailService.getFinaceMemberDetailPro(mdetailId));
   	    }
   	    return mav;
   	}

}

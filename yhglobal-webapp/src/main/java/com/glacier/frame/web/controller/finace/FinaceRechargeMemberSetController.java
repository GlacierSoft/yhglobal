/**
 * @Title: FinaceRechargeMemberSetController.java 
 * @Package com.glacier.frame.web.controller.finace 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-10-28 下午4:19:24 
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



import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.glacier.frame.service.finace.FinaceRechargeMemberSetService;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: FinaceRechargeMemberSetController 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-10-28 下午4:19:24
 */

@Controller
@RequestMapping(value="finaceRechargeSetMemberController")
public class FinaceRechargeMemberSetController {
      
	private FinaceRechargeMemberSetService finaceRechargeMemberSetService;
	
	//进入承运商合同记录展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPservice() {
        ModelAndView mav = new ModelAndView("finace_mgr/finaceRechargeSetMember_mgr/finaceRechargeSetMember");
        return mav;
    }
	  
    
  //获取表格结构的所有合同管理记录信息
  	@RequestMapping(value = "/list.json", method = RequestMethod.POST)
  	@ResponseBody
  	private Object listActionAsGridByMenuId(JqPager jqPager) {
  	     return finaceRechargeMemberSetService.listAsGrid(jqPager);
  	}
   	
  //仓库货品损坏记录信息详情页
   	@RequestMapping(value = "/intoDetail.htm")
   	private Object intoFinaceRechargeSetMemberDetailPage(String rechargeSetId) {
   	    ModelAndView mav = new ModelAndView("finace_mgr/finaceRechargeMember_mgr/finaceRechargeSetMember_detail");
   	    if(StringUtils.isNotBlank(rechargeSetId)){
   	          mav.addObject("finaceRechargeSetMemberData", finaceRechargeMemberSetService.getFinaceRechargeSetMemberPro(rechargeSetId));
   	    }
   	    return mav;
   	}
	
	
}

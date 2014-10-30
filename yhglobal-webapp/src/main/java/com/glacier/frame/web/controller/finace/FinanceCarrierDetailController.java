package com.glacier.frame.web.controller.finace;
 
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.frame.dto.query.finace.FinanceCarrierDetailQueryDTO;
import com.glacier.frame.service.finace.FinanceCarrierDetailService;

/*** 
 * @ClassName:  FinanceCarrierDetailController
 * @Description: TODO(承运商资金明细记录controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-09
 */
@Controller
@RequestMapping(value = "/financeCarrierDetail")
public class FinanceCarrierDetailController extends AbstractController{

	@Autowired
	private FinanceCarrierDetailService financeCarrierDetailService;
	
	// 进入承运商资金明细记录列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("finace_mgr/financeCarrierDetail_mgr/financeCarrierDetail");
        return mav;
    } 
     
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, FinanceCarrierDetailQueryDTO memberGradeQueryDTO) {
        return financeCarrierDetailService.listAsGrid(jqPager, memberGradeQueryDTO);
    }
      
    // 进入承运商资金明细记录Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoWithdrawCarrierDetailDetailPage(String carrierId) { 
    	ModelAndView mav = new ModelAndView("finace_mgr/financeCarrierDetail_mgr/financeCarrierDetail_detail");
        if(StringUtils.isNotBlank(carrierId)){
            mav.addObject("CarrierDetailData", financeCarrierDetailService.getWithdrawCarrierDetail(carrierId));
        }
	    return mav;
    }
}

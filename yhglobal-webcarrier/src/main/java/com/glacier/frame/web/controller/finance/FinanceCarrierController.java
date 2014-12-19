package com.glacier.frame.web.controller.finance;
 
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.frame.dto.query.finace.FinanceCarrierQueryDTO;
import com.glacier.frame.service.finace.FinanceCarrierService;

/*** 
 * @ClassName:  FinanceCarrierController
 * @Description: TODO(承运商资金管理controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-09
 */
@Controller
@RequestMapping(value = "/financeCarrier")
public class FinanceCarrierController extends AbstractController{

	@Autowired
	private FinanceCarrierService financeCarrierService;
	
	// 进入承运商资金管理列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("finace_mgr/financeCarrier_mgr/financeCarrier");
        return mav;
    } 
     
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, FinanceCarrierQueryDTO memberGradeQueryDTO) {
        return financeCarrierService.listAsGrid(jqPager, memberGradeQueryDTO);
    }
      
    // 进入承运商资金管理Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoWithdrawCarrierDetailPage(String carrierId) { 
    	ModelAndView mav = new ModelAndView("finace_mgr/financeCarrier_mgr/financeCarrier_detail");
        if(StringUtils.isNotBlank(carrierId)){
            mav.addObject("CarrierData", financeCarrierService.getWithdrawCarrier(carrierId));
        }
	    return mav;
    }
}

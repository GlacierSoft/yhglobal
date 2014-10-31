/**
 * @Title: FinancePlatformDetailController.java 
 * @Package com.glacier.frame.web.controller.finace 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2014-10-31 上午10:23:28 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-10-31
				修改人：song.jundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：song.jundong 
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
import com.glacier.core.controller.AbstractController;
import com.glacier.frame.dto.query.finace.FinPlatformDetailQueryDTO;
import com.glacier.frame.service.finace.FinancePlatformDetailService;
import com.glacier.jqueryui.util.JqPager; 

/**
 * @ClassName:  FinancePlatformDetailController
 * @Description: TODO(平台资金明细控制器)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-10-31  上午10:23:28
 */
@Controller
@RequestMapping(value = "/platformTransaction")
public class FinancePlatformDetailController extends AbstractController{
	
	@Autowired
    private FinancePlatformDetailService financePlatformDetailService;// 注入平台资金记录业务Bean
     
	// 进入平台资金记录列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPfinancePlatformTransaction() {
        ModelAndView mav = new ModelAndView("finace_mgr/financePlatformDetail_mgr/financePlatformDetail"); 
        return mav; 
    }
    
    // 进入平台资金记录Detail信息页面aaaa
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoTransactionDetailPage(String detailId) {
        ModelAndView mav = new ModelAndView("finace_mgr/financePlatformDetail_mgr/financePlatformDetail_detail");
        if(StringUtils.isNotBlank(detailId)){
            mav.addObject("transactionData", financePlatformDetailService.getTransaction(detailId));
        }
        return mav;
    }
    
    // 获取表格结构的所有平台资金记录数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listTransactionAsGridByMenuId(FinPlatformDetailQueryDTO finPlatformDetailQueryDTO,JqPager pfinancePlatformTransactionr) {
        return financePlatformDetailService.listAsGrid(finPlatformDetailQueryDTO,pfinancePlatformTransactionr);
    }
	
}

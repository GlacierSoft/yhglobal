/**
 * @Title: StorehouseStorageGoodsrunController.java 
 * @Package com.glacier.frame.web.controller.storehouse 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-10-21 上午10:01:39 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-10-21
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.web.controller.storehouse;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.frame.dto.query.storehouse.StorehouseStorageGoodsrunQueryDTO;
import com.glacier.frame.entity.storehouse.StorehouseStorageGoodsrun;
import com.glacier.frame.service.storehouse.StorehouseStorageGoodsrunService;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: StorehouseStorageGoodsrunController 
 * @Description: TODO(仓库货品流动记录控制层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-10-21 上午10:01:39
 */

@Controller
@RequestMapping(value="/storageGoodsrun")
public class StorehouseStorageGoodsrunController {

	@Autowired
    private StorehouseStorageGoodsrunService   storehouseStorageGoodsrunService;
	
	//进入仓库货品流动记录展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPservice() {
        ModelAndView mav = new ModelAndView("storehouse_mgr/storageGoodsrun_mgr/storageGoodsrun");
        return mav;
    }
    
    //获取表格结构的所有仓库货品流动记录信息
   	@RequestMapping(value = "/list.json", method = RequestMethod.POST)
   	@ResponseBody
   	private Object listActionAsGridByMenuId(JqPager jqPager, StorehouseStorageGoodsrunQueryDTO storehouseStorageGoodsrunQueryDTO, String q,HttpSession session) {
   		JqGridReturn returnResult=(JqGridReturn)storehouseStorageGoodsrunService.listAsGrid(jqPager, storehouseStorageGoodsrunQueryDTO, q);
   	    if(returnResult!=null){
 	    	@SuppressWarnings("unchecked")
 	    	List<StorehouseStorageGoodsrun> list=(List<StorehouseStorageGoodsrun>) returnResult.getRows();
 	    	session.setAttribute("list", list);
 	    }	
   		return returnResult;
   	}
   	
   	
    //仓库货品流动记录信息详情页
   	@RequestMapping(value = "/intoDetail.htm")
   	private Object intoStorehouseStorageGoodsrunDetailPage(String goodsrunId) {
   	    ModelAndView mav = new ModelAndView("storehouse_mgr/storageGoodsrun_mgr/storageGoodsrun_detail");
   	    if(StringUtils.isNotBlank(goodsrunId)){
   	          mav.addObject("storehouseStorageGoodsrunData", storehouseStorageGoodsrunService.getStorehouseStorageGoodsrunPro(goodsrunId));
   	    }
   	    return mav;
   	}
	
    //进入仓库货品流动记录信息审核页
    @RequestMapping(value = "/intoAudit.htm")
    private Object intoStorehouseStorageGoodsrunAudit(String goodsrunId) {
        ModelAndView mav = new ModelAndView("storehouse_mgr/storageGoodsrun_mgr/storageGoodsrun_audit");
        if(StringUtils.isNotBlank(goodsrunId)){
        	 mav.addObject("storehouseStorageGoodsrunData", storehouseStorageGoodsrunService.getStorehouseStorageGoodsrunPro(goodsrunId));
        }
        return mav;
    }
    
    //修改货物流动启用或禁用状态
    @RequestMapping(value = "/audit.json")
    @ResponseBody
    private Object auditStorehouseStorageGoodsrun(String goodsrunId) {
        return storehouseStorageGoodsrunService.changeStorehouseStorageGoodsrunType(goodsrunId);
    }
   	
}

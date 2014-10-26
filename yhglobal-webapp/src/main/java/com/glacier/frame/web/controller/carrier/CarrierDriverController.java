/**
 * 
 */
package com.glacier.frame.web.controller.carrier;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.glacier.frame.dto.query.carrier.CarrierDriverQueryDTO;
import com.glacier.frame.entity.carrier.CarrierDriver;
import com.glacier.frame.service.carrier.CarrierDriverService;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;

/**
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="carrierDriver")
public class CarrierDriverController {
   
	@Autowired
	private CarrierDriverService carrierDriverService;
	
    //获取表格结构的所有品损坏记录信息  
	@RequestMapping(value = "/list.json", method = RequestMethod.POST)
   	@ResponseBody
   	private Object listActionAsGridByMenuId(JqPager jqPager, CarrierDriverQueryDTO carrierDriverQueryDTO, String q,HttpSession session) {
   		JqGridReturn returnResult=(JqGridReturn)carrierDriverService.listAsGrid(jqPager, carrierDriverQueryDTO, q);
   	    if(returnResult!=null){
 	    	@SuppressWarnings("unchecked")
 	    	List<CarrierDriver> list=(List<CarrierDriver>) returnResult.getRows();
 	    	session.setAttribute("list", list);
 	    }	
   		return returnResult;
   	}
}

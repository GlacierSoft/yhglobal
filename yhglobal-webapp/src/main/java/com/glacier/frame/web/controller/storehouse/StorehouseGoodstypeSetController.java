package com.glacier.frame.web.controller.storehouse;
 
import java.util.List;
import javax.validation.Valid;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; 
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.frame.dto.query.storehouse.StorehouseGoodstypeSetQueryDTO;
import com.glacier.frame.entity.storehouse.StorehouseGoodstypeSet;
import com.glacier.frame.service.storehouse.StorehouseGoodstypeSetService;

/*** 
 * @ClassName:  StorehouseGoodstypeSetController
 * @Description: TODO(货物类型controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-15
 */
@Controller
@RequestMapping(value = "/goodstype")
public class StorehouseGoodstypeSetController extends AbstractController{

	@Autowired
	private StorehouseGoodstypeSetService goodstypeSetService;
	
	// 进入货物类型信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("storehouse_mgr/goodstype_mgr/goodstype");
        return mav;
    } 
     
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, StorehouseGoodstypeSetQueryDTO goodstypeSetQueryDTO) {
        return goodstypeSetService.listAsGrid(jqPager, goodstypeSetQueryDTO);
    }
      
    // 进入货物类型信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String goodstypeId) { 
    	ModelAndView mav = new ModelAndView("storehouse_mgr/goodstype_mgr/goodstype_detail");
        if(StringUtils.isNotBlank(goodstypeId)){
            mav.addObject("goodstypeDate", goodstypeSetService.getGoodstype(goodstypeId));
        }
	    return mav;
    }
    
    // 进入货物类型信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String goodstypeId) {
        ModelAndView mav = new ModelAndView("storehouse_mgr/goodstype_mgr/goodstype_form");
        if(StringUtils.isNotBlank(goodstypeId)){
            mav.addObject("goodstypeDate", goodstypeSetService.getGoodstype(goodstypeId));
        }
        return mav;
    }
    
    // 增加货物类型信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid StorehouseGoodstypeSet goodstype, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return goodstypeSetService.addGoodstype(goodstype);
    }
    
    //修改货物类型信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid StorehouseGoodstypeSet goodstype, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return goodstypeSetService.editGoodstype(goodstype);
    }
    
    //批量删除货物类型信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> goodstypeIds,@RequestParam List<String> goodstypeName) {
    	return goodstypeSetService.delGoodstype(goodstypeIds, goodstypeName);
    }
}

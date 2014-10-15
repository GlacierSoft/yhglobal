package com.glacier.frame.web.controller.member;
 
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
import com.glacier.frame.dto.query.member.ShipperMemberGradeQueryDTO;
import com.glacier.frame.entity.member.ShipperMemberGrade;
import com.glacier.frame.service.member.ShipperMemberGradeService;

/*** 
 * @ClassName:  ShipperMemberGradeController
 * @Description: TODO(货主会员等级controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-09
 */
@Controller
@RequestMapping(value = "/shipperMemberGrade")
public class ShipperMemberGradeController extends AbstractController{

	@Autowired
	private ShipperMemberGradeService shipperMemberGradeService;
	
	// 进入会员等级列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("member_mgr/shipperMemberGrade_mgr/shipperMemberGrade");
        return mav;
    } 
     
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ShipperMemberGradeQueryDTO memberGradeQueryDTO) {
        return shipperMemberGradeService.listAsGrid(jqPager, memberGradeQueryDTO);
    }
      
    // 进入会员等级Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String gradeId) { 
    	ModelAndView mav = new ModelAndView("member_mgr/shipperMemberGrade_mgr/shipperMemberGrade_detail");
        if(StringUtils.isNotBlank(gradeId)){
            mav.addObject("gradeData", shipperMemberGradeService.getMemberGrade(gradeId));
        }
	    return mav;
    }
    
    // 进入会员等级Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String gradeId) {
        ModelAndView mav = new ModelAndView("member_mgr/shipperMemberGrade_mgr/shipperMemberGrade_form");
        if(StringUtils.isNotBlank(gradeId)){
            mav.addObject("gradeData", shipperMemberGradeService.getMemberGrade(gradeId));
        }
        return mav;
    }
    
    // 增加会员等级
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid ShipperMemberGrade memberGrade, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return shipperMemberGradeService.addNews(memberGrade);
    }
    
    //修改会员等级
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid ShipperMemberGrade memberGrade, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return shipperMemberGradeService.editNews(memberGrade);
    }
    
    //批量删除会员等级
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> memberGradeIds,@RequestParam List<String> memberGradeNames) {
    	return shipperMemberGradeService.delNews(memberGradeIds, memberGradeNames);
    }
}

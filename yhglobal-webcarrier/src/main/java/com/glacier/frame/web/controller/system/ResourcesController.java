package com.glacier.frame.web.controller.system;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.glacier.frame.entity.carrierlogin.CarrierloginAction;
import com.glacier.frame.entity.carrierlogin.CarrierloginMenu;
import com.glacier.frame.entity.carrierlogin.CarrierloginPanel;
import com.glacier.frame.service.carrierlogin.CarrierloginActionService;
import com.glacier.frame.service.carrierlogin.CarrierloginMenuService;
import com.glacier.frame.service.carrierlogin.CarrierloginPanelService;
import com.glacier.jqueryui.util.JqPager;
 
/*** 
 * @ClassName:  ResourcesController
 * @Description: TODO(资源控制器，此控制器包含了对三个业务的请求处理：菜单、面板、操作)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-8-18  下午5:02:51
 */
@Controller
@RequestMapping(value = "/res")
public class ResourcesController extends AbstractController{

    @Autowired
    private CarrierloginMenuService carrierloginMenuService;// 注入菜单业务Bean
    
    @Autowired
    private CarrierloginPanelService carrierloginPanelService;// 注入面板业务Bean

    @Autowired
    private CarrierloginActionService carrierloginActionService;// 注入操作业务Bean
    
    //进入资源展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPage(String menuId) {
        ModelAndView mav = new ModelAndView("system_mgr/res_mgr/res");
        return mav;
    }

    // 获取当前用户授权菜单树
    @RequestMapping(value = "/menu/getPrincipalUserMenu.json", method = RequestMethod.POST)
    @ResponseBody
    private Object getPrincipalUserMenu() {
        return carrierloginMenuService.getPrincipalUserMenu();
    }
    
    // 进入菜单Form表单页面
    @RequestMapping(value = "/menu/intoForm.htm")
    private Object intoMenuFormPage(String menuId) {
        ModelAndView mav = new ModelAndView("system_mgr/res_mgr/menu_form");
        mav.addObject("allMenuTreeNodeData", carrierloginMenuService.getAllTreeMenuNode(true,""));
        if(StringUtils.isNotBlank(menuId)){
            mav.addObject("menuData", carrierloginMenuService.getMenu(menuId));
        }
        return mav;
    }
    
    //进入面板Form表单页面
    @RequestMapping(value = "/panel/intoForm.htm")
    private Object intoPanelFormPage() {
        ModelAndView mav = new ModelAndView("system_mgr/res_mgr/panel_form");
        mav.addObject("allMenuTreeNodeData", carrierloginMenuService.getAllTreeMenuNode(false,""));
        return mav;
    }
    
    // 进入操作Form表单页面
    @RequestMapping(value = "/action/intoForm.htm")
    private Object intoActionFormPage() {
        ModelAndView mav = new ModelAndView("system_mgr/res_mgr/action_form");
        mav.addObject("allMenuTreeNodeData", carrierloginMenuService.getAllTreeMenuNode(false,""));
        return mav;
    }

    // 查看菜单Detail页面
    @RequestMapping(value = "/menu/intoDetail.htm")
    private Object intoDetailsPage(String menuId) {
        ModelAndView mav = new ModelAndView("system_mgr/res_mgr/menu_detail");
        mav.addObject("menuData",carrierloginMenuService.getMenu(menuId));
        return mav;
    }

    // 获取菜单下的树结构的所有菜单数据
    @RequestMapping(value = "/menu/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listMenuAsTreeByMenuId() {
        return carrierloginMenuService.listAsTree();
    }
    
    // 获取菜单下的表格结构的所有面板数据
    @RequestMapping(value = "/panel/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listPanelAsGridByMenuId(String menuId,JqPager pager) {
        return carrierloginPanelService.listAsGrid(menuId,pager);
    }

    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/action/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByCondition(String menuId,String panelId,JqPager pager) {
        return carrierloginActionService.listAsGrid(menuId,panelId,pager);
    }

    // 增加菜单
    @RequestMapping(value = "/menu/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addMenu(@Valid CarrierloginMenu carrierloginMenu, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return carrierloginMenuService.addMenu(carrierloginMenu);
    }
    
    // 增加面板
    @RequestMapping(value = "/panel/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addPanel(@Valid CarrierloginPanel carrierloginPanel, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return carrierloginPanelService.addPanel(carrierloginPanel);
    }
    
    // 增加操作
    @RequestMapping(value = "/action/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addAction(@Valid CarrierloginAction carrierloginAction, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return carrierloginActionService.addAction(carrierloginAction);
    }

    // 修改菜单
    @RequestMapping(value = "/menu/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editMenu(@Valid CarrierloginMenu carrierloginMenu, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return carrierloginMenuService.editMenu(carrierloginMenu);
    }
    
    // 修改面板
    @RequestMapping(value = "/panel/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editPanel(@Valid CarrierloginPanel carrierloginPanel, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return carrierloginPanelService.editPanel(carrierloginPanel);
    }
    
    //修改操作
    @RequestMapping(value = "/action/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editAction(@Valid CarrierloginAction carrierloginAction, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return carrierloginActionService.editAction(carrierloginAction);
    }
    
    //删除菜单
    @RequestMapping(value = "/menu/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delMenu(CarrierloginMenu carrierloginMenu) {
        return carrierloginMenuService.delMenu(carrierloginMenu);
    }
    
    //删除面板
    @RequestMapping(value = "/panel/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delPanel(CarrierloginPanel carrierloginPanel) {
        return carrierloginPanelService.delPanel(carrierloginPanel);
    }
    
    
    //删除操作
    @RequestMapping(value = "/action/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delActions(@RequestParam List<String> actionIds,@RequestParam List<String> actionCnNames) {
        return carrierloginActionService.delActions(actionIds,actionCnNames);
    }
    
    //根据菜单获取面板数据
    @RequestMapping(value = "/panel/getPanelsByMenuId.json", method = RequestMethod.POST)
    @ResponseBody
    public Object getPanelsByMenuId(String menuId) {
        return carrierloginPanelService.getPanelsByMenuId(menuId);
    }
    
    //数据还原
    @RequestMapping(value="/dataBcakUp.json")
    @ResponseBody
    public Object dataBcakUp(){
    	//获取当前项目目录
    	String sqlPath=System.getProperty("user.dir");
    	//路径格式转化
	    String sqlWebapp=sqlPath.replaceAll("\\\\","\\\\\\\\");
		//设定返回值结果	
    	boolean flag = true;
		Map<String, Object> map = new HashMap<String, Object>();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			File file = new File(""+sqlWebapp+"\\src\\main\\webapp\\resources\\backupsql");
			long time = file.lastModified();// 返回文件最后修改时间，是以个long型毫秒数
			String ctime = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date(time));
			String netlaon_name = "frame" + ctime + ".sql";
			String fPath = ""+sqlWebapp+"\\src\\main\\webapp\\resources\\backupsql\\" + netlaon_name+ "";
			Runtime rt = Runtime.getRuntime();
            // 调用 mysql命令
			Process child = rt.exec(""+sqlWebapp+"\\src\\main\\webapp\\resources\\mysql\\mysql.exe -uroot -proot frame");
			OutputStream out = child.getOutputStream();// 控制台的输入信息作为输出流
			String inStr;
			StringBuffer sb = new StringBuffer("");
			String outStr;
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fPath), "utf8"));
			while ((inStr = br.readLine()) != null) {
				sb.append(inStr + "\r\n");
			}
			outStr = sb.toString();
            OutputStreamWriter writer = new OutputStreamWriter(out, "utf8");
			writer.write(outStr);
			// 如果用缓冲方式写入文件的话，会导致中文乱码，用flush()方法则可以避免
			writer.flush();
			// 关闭输入输出流
			out.close();
			br.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
			flag = false;
		}
		map.put("data", flag);
		list.add(map);
		return list;
	}
}

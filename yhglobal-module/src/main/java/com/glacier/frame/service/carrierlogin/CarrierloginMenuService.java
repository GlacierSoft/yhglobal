/**
 * @Title: MenuService.java 
 * @Package com.glacier.permissions.service 
 * @author zhenfei.zhang   
 * @email 289556866@qq.com
 * @date 2014-08-17 下午4:00:46 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *          <p>
                第一次修改：
                时间：2014-08-17
                修改人：zhenfei.zhang 
                修改内容简介 ：新建面板业务类
            </p>              
 * @Review (审核人) ：zhenfei.zhang
 * 
 */
package com.glacier.frame.service.carrierlogin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.basic.util.JackJson;
import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.carrierlogin.CarrierloginActionMapper;
import com.glacier.frame.dao.carrierlogin.CarrierloginAuthorityMapper;
import com.glacier.frame.dao.carrierlogin.CarrierloginMenuMapper;
import com.glacier.frame.dao.carrierlogin.CarrierloginPanelMapper;
import com.glacier.frame.entity.carrier.CarrierMember;
import com.glacier.frame.entity.carrierlogin.CarrierloginActionExample;
import com.glacier.frame.entity.carrierlogin.CarrierloginAuthority;
import com.glacier.frame.entity.carrierlogin.CarrierloginAuthorityExample;
import com.glacier.frame.entity.carrierlogin.CarrierloginMenu;
import com.glacier.frame.entity.carrierlogin.CarrierloginMenuExample;
import com.glacier.frame.entity.system.Authority;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.jqueryui.util.Tree;

/**
 * @ClassName: MenuService
 * @Description: TODO(菜单业务类：为控制器提供服务)
 * @author zhenfei.zhang
 * @email 289556866@qq.com
 * @date 2014-08-17 下午4:00:46
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class CarrierloginMenuService {

    @Autowired
    private CarrierloginPanelMapper carrierloginPanelMapper;

    @Autowired
    private CarrierloginMenuMapper carrierloginMenuMapper;

    @Autowired
    private CarrierloginActionMapper carrierloginActionMapper;

    @Autowired
    private CarrierloginAuthorityMapper carrierloginAuthorityMapper;
    
    /**
     * @Title: getMenu
     * @Description: TODO(根据菜单ID获取角色信息)
     * @param @param roleId
     * @param @return
     * @throws 备注
     * <p>
     * 已检查测试:Green
     * <p>
     */
    public Object getMenu(String menuId) {
        return carrierloginMenuMapper.selectByPrimaryKey(menuId);
    }

    /**
     * @Title: addMenu
     * @Description: TODO(增加菜单)
     * @param @param menu
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    @Transactional(readOnly = false)
//    @MethodLog(opera = "MenuTree_add")
    public Object addMenu(CarrierloginMenu carrierloginMenu) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        CarrierloginMenuExample carrierloginMenuExample = new CarrierloginMenuExample();
        int count = 0;
        // 防止菜单名称重复
        carrierloginMenuExample.createCriteria().andMenuCnNameEqualTo(carrierloginMenu.getMenuCnName());
        count = carrierloginMenuMapper.countByExample(carrierloginMenuExample);// 查找相同中文名称的菜单数量
        if (count > 0) {
            returnResult.setMsg("菜单名称重复");
            return returnResult;
        }
        // 防止英文名称重复
        carrierloginMenuExample.clear();
        carrierloginMenuExample.createCriteria().andMenuEnNameEqualTo(carrierloginMenu.getMenuEnName());
        count = carrierloginMenuMapper.countByExample(carrierloginMenuExample);// 查找相同英文名称的菜单数量
        if (count > 0) {
            returnResult.setMsg("英文名称重复");
            return returnResult;
        }
        carrierloginMenu.setMenuId(RandomGUID.getRandomGUID());
        if (carrierloginMenu.getPid().equals("ROOT") || carrierloginMenu.getPid().equals("")) {// 如果父级菜单的Id为"ROOT"或为空，则将父级菜单的值设置为null保存到数据库
            carrierloginMenu.setPid(null);
        }
        count = carrierloginMenuMapper.insert(carrierloginMenu);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + carrierloginMenu.getMenuCnName() + "] 菜单信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，菜单信息保存失败");
        }
        return returnResult;
    }

    /**
     * @Title: editMenu
     * @Description: TODO(修改菜单)
     * @param @param menu
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    @Transactional(readOnly = false)
//    @MethodLog(opera = "MenuTree_edit")
    public Object editMenu(CarrierloginMenu carrierloginMenu) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        // 防止选择自身作为父菜单，引起死循环
        List<String> retrunMenuList = new ArrayList<String>();
        retrunMenuList = getMenuChild(carrierloginMenu.getMenuId(), retrunMenuList);
        retrunMenuList.add(carrierloginMenu.getMenuId());
        if (retrunMenuList.contains(carrierloginMenu.getPid())) {
            returnResult.setMsg("禁止选择菜单本身及子菜单作为上级菜单");
            return returnResult;
        }
        CarrierloginMenuExample carrierloginMenuExample = new CarrierloginMenuExample();
        int count = 0;
        // 防止菜单名称重复
        carrierloginMenuExample.createCriteria().andMenuCnNameEqualTo(carrierloginMenu.getMenuCnName()).andMenuIdNotEqualTo(carrierloginMenu.getMenuId());
        count = carrierloginMenuMapper.countByExample(carrierloginMenuExample);// 查找相同中文名称的菜单数量
        if (count > 0) {
            returnResult.setMsg("菜单名称重复");
            return returnResult;
        }
        // 防止英文名称重复
        carrierloginMenuExample.clear();
        carrierloginMenuExample.createCriteria().andMenuEnNameEqualTo(carrierloginMenu.getMenuEnName()).andMenuIdNotEqualTo(carrierloginMenu.getMenuId());
        count = carrierloginMenuMapper.countByExample(carrierloginMenuExample);// 查找相同英文名称的菜单数量
        if (count > 0) {
            returnResult.setMsg("英文名称重复");
            return returnResult;
        }
        if (carrierloginMenu.getPid().equals("ROOT") || carrierloginMenu.getPid().equals("")) {// 如果父级菜单的Id为"ROOT"或为空，则将父级菜单的值设置为null保存到数据库
            carrierloginMenu.setPid(null);
        }
        count = carrierloginMenuMapper.updateByPrimaryKey(carrierloginMenu);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + carrierloginMenu.getMenuCnName() + "] 菜单信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，菜单信息更新失败");
        }
        return returnResult;
    }

    /**
     * @Title: delMenu
     * @Description: TODO(删除菜单)
     * @param @param menu
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    @Transactional(readOnly = false)
//    @MethodLog(opera = "MenuTree_del")
    public Object delMenu(CarrierloginMenu carrierloginMenu) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int menuCount = 0;
        //删除菜单先检查菜单是否有子菜单
        CarrierloginMenuExample carrierloginMenuExample = new CarrierloginMenuExample();
        carrierloginMenuExample.createCriteria().andPidEqualTo(carrierloginMenu.getMenuId());
        List<CarrierloginMenu> carrierloginMenus = carrierloginMenuMapper.selectByExample(carrierloginMenuExample);
        if(carrierloginMenus.size() > 0){
            returnResult.setSuccess(false);
            returnResult.setMsg("菜单删除失败，不能删除有子菜单的菜单");
            return returnResult;
        }else{
        	// 删除菜单必须先删除菜单对应的操作
            CarrierloginActionExample carrierloginActionExample = new CarrierloginActionExample();
            carrierloginActionExample.createCriteria().andMenuIdEqualTo(carrierloginMenu.getMenuId());
            menuCount = carrierloginActionMapper.countByExample(carrierloginActionExample);
            if (menuCount > 0) {
                returnResult.setSuccess(false);
                returnResult.setMsg("该菜单下存在对应的操作，请先删除其操作再尝试!");
                return returnResult;
            }
            // 同时删除权限表中引用的菜单
            CarrierloginAuthorityExample carrierloginAuthorityExample = new CarrierloginAuthorityExample();
            carrierloginAuthorityExample.createCriteria().andMenuIdEqualTo(carrierloginMenu.getMenuId());
            carrierloginAuthorityMapper.deleteByExample(carrierloginAuthorityExample);
            // 删除菜单
            menuCount = carrierloginMenuMapper.deleteByPrimaryKey(carrierloginMenu.getMenuId());
            if (menuCount > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除名称为：[ " + carrierloginMenu.getMenuCnName() + " ]菜单");
                return returnResult;
            }else{
            	returnResult.setMsg("发生未知错误，[ " + carrierloginMenu.getMenuCnName() + " ]菜单删除失败");        	
            }
        }
        return returnResult;
    }

    /**
     * @Title: getMenuChild
     * @Description: TODO(递归获取菜单和菜单子节点)
     * @param @param menuId 要获取的当前菜单
     * @param @param retrunMenuList 返回的所有菜单信息
     * @param @return 设定文件
     * @return List<String> 返回类型
     * @throws
     */
    private List<String> getMenuChild(String menuId, List<String> retrunMenuList) {
        CarrierloginMenuExample carrierloginMenuExample = new CarrierloginMenuExample();
        carrierloginMenuExample.createCriteria().andPidEqualTo(menuId);// 查询子菜单
        List<CarrierloginMenu> menuList = carrierloginMenuMapper.selectByExample(carrierloginMenuExample);
        if (menuList.size() > 0) {// 如果存在子菜单则遍历
            for (CarrierloginMenu carrierloginMenu : menuList) {
                this.getMenuChild(carrierloginMenu.getMenuId(), retrunMenuList);// 递归查询是否存在子菜单
            }
        }
        retrunMenuList.add(menuId);
        return retrunMenuList;
    }

    /**
     * @Title: getPrincipalUserMenu
     * @Description: TODO(获取用户可用Menu)
     * @param @return 设定文件
     * @return String 返回类型
     * @throws
     */
    public Object getPrincipalUserMenu() {
        CarrierMember principalUser = (CarrierMember) SecurityUtils.getSubject().getPrincipal();// 获取已认证对象
        List<CarrierloginMenu> principalMenus = carrierloginMenuMapper.selectByUserId(principalUser.getCarrierMemberId());
        List<Tree> principalMenuTrees = new ArrayList<Tree>();
        for (CarrierloginMenu carrierloginMenu : principalMenus) {
            Tree menuTree = new Tree();
            Map<String, String> treeAttributes = new HashMap<String, String>();
            menuTree.setId(carrierloginMenu.getMenuId());
            menuTree.setPid(carrierloginMenu.getPid());
            menuTree.setText(carrierloginMenu.getMenuCnName());
            menuTree.setIconCls(carrierloginMenu.getIconCls());
            treeAttributes.put("url", carrierloginMenu.getUrl());
            menuTree.setAttributes(treeAttributes);
            principalMenuTrees.add(menuTree);
        }
        return principalMenuTrees;
    }

    /**
     * @Title: listAsTree
     * @Description: TODO(以树结构展示菜单列表)
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    public Object listAsTree() {
        CarrierloginMenuExample carrierloginMenuExample = new CarrierloginMenuExample();
        carrierloginMenuExample.setOrderByClause("temp_carrierlogin_menu.order_num asc");
        List<CarrierloginMenu> menuList = carrierloginMenuMapper.selectByExample(carrierloginMenuExample);
        return menuList;
    }

    /**
     * @Title: getAllTreeMenuNode
     * @Description: TODO(获取全部的菜单数据组装成EasyUI树节点JSON)
     * @param @param virtualRoot 是否构建虚拟ROOT -> 系统菜单作为导航
     * @param @return 设定文件
     * @return String 返回类型
     * @throws
     */
    public String getAllTreeMenuNode(boolean virtualRoot, String roleId) {
        List<Tree> items = new ArrayList<Tree>();
        if (virtualRoot) {
            Tree menuItem = new Tree();// 增加总的树节点作为菜单导航
            menuItem.setId("ROOT");
            menuItem.setText("导航");
            menuItem.setIconCls("anchor");
            items.add(menuItem);
        }
        CarrierloginMenuExample carrierloginMenuExample = new CarrierloginMenuExample();
        carrierloginMenuExample.setOrderByClause("temp_carrierlogin_menu.order_num asc");
        List<CarrierloginMenu> menuList = carrierloginMenuMapper.selectByExample(carrierloginMenuExample);
        if (null != menuList && menuList.size() > 0) {
            List<CarrierloginAuthority> authorities = null;
            if (StringUtils.isNotBlank(roleId)) {
                CarrierloginAuthorityExample carrierloginAuthorityExample = new CarrierloginAuthorityExample();
                carrierloginAuthorityExample.createCriteria().andRoleIdEqualTo(roleId);
                authorities = carrierloginAuthorityMapper.selectByExample(carrierloginAuthorityExample);
            }
            for (CarrierloginMenu carrierloginMenu : menuList) {
                Tree item = new Tree();// 将查询到的菜单记录某些属性值设置在ComboTreeItem中，用于页面的ComboTree的数据绑定
                item.setId(carrierloginMenu.getMenuId());
                item.setText(carrierloginMenu.getMenuCnName());
                if (StringUtils.isNotBlank(carrierloginMenu.getPid())) {
                    item.setPid(carrierloginMenu.getPid());
                } else if (virtualRoot) {
                    item.setPid("ROOT");// 如果父节点为空说明上一级为总节点
                }
                if (null != authorities && authorities.size() > 0) {
                    Authority authority = new Authority();
                    authority.setMenuId(carrierloginMenu.getMenuId());
                    authority.setRoleId(roleId);
                    if (StringUtils.isNotBlank(carrierloginMenu.getUrl()) && authorities.contains(authority)) {
                        item.setChecked(true);
                    }
                }
                if (StringUtils.isNotBlank(carrierloginMenu.getUrl())) {
                    Map<String, String> treeAttributes = new HashMap<String, String>();
                    treeAttributes.put("url", carrierloginMenu.getUrl());
                    item.setAttributes(treeAttributes);
                }
                item.setIconCls(carrierloginMenu.getIconCls());
                items.add(item);
            }
        }
        return JackJson.fromObjectToJson(items);
    }

}

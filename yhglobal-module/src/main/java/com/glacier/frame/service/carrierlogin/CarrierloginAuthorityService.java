/**
 * @Title: AuthorityService.java 
 * @Package com.glacier.frame.service.system 
 * @author songjundong   
 * @email 985776597@qq.com
 * @date  2014-8-18  下午2:47:36
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *          <p>
                第一次修改：
                时间：2014-8-18
                修改人：songjundong 
                修改内容简介 ：
            </p>              
 * @Review (审核人) ：songjundong
 * 
 */
package com.glacier.frame.service.carrierlogin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.frame.dao.carrier.CarrierMemberMapper;
import com.glacier.frame.dao.carrierlogin.CarrierloginActionMapper;
import com.glacier.frame.dao.carrierlogin.CarrierloginAuthorityMapper;
import com.glacier.frame.dao.carrierlogin.CarrierloginMenuMapper;
import com.glacier.frame.dao.carrierlogin.CarrierloginRoleMapper;
import com.glacier.frame.dao.carrierlogin.CarrierloginUserRoleMapper;
import com.glacier.frame.dto.service.carrierloginDTO.CarrierloginAuthMenuActionDTO;
import com.glacier.frame.entity.carrier.CarrierMember;
import com.glacier.frame.entity.carrierlogin.CarrierloginAction;
import com.glacier.frame.entity.carrierlogin.CarrierloginActionExample;
import com.glacier.frame.entity.carrierlogin.CarrierloginAuthority;
import com.glacier.frame.entity.carrierlogin.CarrierloginAuthorityExample;
import com.glacier.frame.entity.carrierlogin.CarrierloginMenu;
import com.glacier.frame.entity.carrierlogin.CarrierloginMenuExample;
import com.glacier.frame.entity.carrierlogin.CarrierloginRole;
import com.glacier.frame.entity.carrierlogin.CarrierloginRoleExample;
import com.glacier.frame.entity.carrierlogin.CarrierloginUserRoleExample;
import com.glacier.frame.entity.carrierlogin.CarrierloginUserRoleKey;
import com.glacier.frame.entity.common.util.CommonBuiltin;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.jqueryui.util.Tree;
 
/***
 * @ClassName:  AuthorityService
 * @Description: TODO(权限)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-8-18   下午2:47:36
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class CarrierloginAuthorityService {

    @Autowired
    private CarrierMemberMapper carrierMemberMapper;
    
    @Autowired
    private CarrierloginMenuMapper carrierloginMenuMapper;

    @Autowired
    private CarrierloginActionMapper carrierloginActionMapper;

    @Autowired
    private CarrierloginAuthorityMapper carrierloginAuthorityMapper;

    @Autowired
    private CarrierloginRoleMapper carrierloginRoleMapper;

    @Autowired
    private CarrierloginUserRoleMapper carrierloginUserRoleMapper;

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
        for (CarrierloginMenu menu : principalMenus) {
            Tree menuTree = new Tree();
            Map<String, String> treeAttributes = new HashMap<String, String>();
            menuTree.setId(menu.getMenuId());
            menuTree.setPid(menu.getPid());
            menuTree.setText(menu.getMenuCnName());
            menuTree.setIconCls(menu.getIconCls());
            treeAttributes.put("url", menu.getUrl());
            menuTree.setAttributes(treeAttributes);
            //menuTree.setState("closed");//会出现无穷循环
            principalMenuTrees.add(menuTree);
        }
        return principalMenuTrees;
    }

    /**
     * @Title: getAuthsByRoleId
     * @Description: TODO(根据角色获取权限)
     * @param @param roleId
     * @param @return
     * @throws 备注
     * <p>
     * 已检查测试:Green
     * <p>
     */
    public Object getAuthsByRoleId(String roleId) {
        List<CarrierloginAuthMenuActionDTO> returnAuthList = new ArrayList<CarrierloginAuthMenuActionDTO>();// 要返回的List数据
        List<CarrierloginMenu> sysNaviMenus = carrierloginMenuMapper.selectByExample(new CarrierloginMenuExample());// 获取系统导航菜单列表
        if (null != sysNaviMenus && sysNaviMenus.size() > 0) {
            CarrierloginAuthorityExample carrierloginAuthorityExample = new CarrierloginAuthorityExample();
            carrierloginAuthorityExample.createCriteria().andRoleIdEqualTo(roleId);
            List<CarrierloginAuthority> roleAuths = carrierloginAuthorityMapper.selectByExample(carrierloginAuthorityExample);// 获取角色权限
            Map<String, CarrierloginAuthority> authsMap = new HashMap<String, CarrierloginAuthority>();
            for (CarrierloginAuthority carrierloginAuthority : roleAuths) {
                authsMap.put(carrierloginAuthority.getMenuId() + "_" + carrierloginAuthority.getRoleId(), carrierloginAuthority);// 以menuId和roleId构建权限Map
            }
            for (CarrierloginMenu carrierloginMenu : sysNaviMenus) {
                String menuId = carrierloginMenu.getMenuId();
                String menuParentId = carrierloginMenu.getPid();
                String menuCnName = carrierloginMenu.getMenuCnName();
                String iconCls = carrierloginMenu.getIconCls();
                // 构建菜单列表树
                CarrierloginAuthMenuActionDTO authMenuActionVO = new CarrierloginAuthMenuActionDTO();
                authMenuActionVO.setId(menuId);
                authMenuActionVO.setPid(menuParentId);
                authMenuActionVO.setMenuName(menuCnName);
                authMenuActionVO.setIconCls(iconCls);
                if (authsMap.containsKey(carrierloginMenu.getMenuId() + "_" + roleId)) {
                    authMenuActionVO.setChecked(true);
                }
                String[] ownActions = null;
                CarrierloginAuthority roleAuth = authsMap.get(menuId + "_" + roleId);
                if (null != roleAuth && StringUtils.isNotBlank(roleAuth.getActions())) {
                    ownActions = roleAuth.getActions().split(",");
                }
                // 查找菜单所有的操作集合
                CarrierloginActionExample carrierloginActionExample = new CarrierloginActionExample();
                carrierloginActionExample.createCriteria().andMenuIdEqualTo(menuId);
                carrierloginActionExample.setOrderByClause("temp_carrierlogin_action.order_num asc");
                List<CarrierloginAction> actions = carrierloginActionMapper.selectByExample(carrierloginActionExample);
                StringBuilder menuActionsBuilder = new StringBuilder();// 构建操作返回字符串，拼复选框，后台编写提高效率
                if (null != actions && actions.size() > 0) {
                    menuActionsBuilder.append("<table class='auth_table'>");
                    Map<String, List<CarrierloginAction>> panelActionsMap = new HashMap<String, List<CarrierloginAction>>();
                    for (CarrierloginAction action : actions) {
                        if (panelActionsMap.containsKey(action.getPanelCnName())) {
                            panelActionsMap.get(action.getPanelCnName()).add(action);
                        } else {
                            List<CarrierloginAction> actionTemps = new ArrayList<CarrierloginAction>();
                            actionTemps.add(action);
                            panelActionsMap.put(action.getPanelCnName(), actionTemps);
                        }
                    }
                    Set<String> keySet = panelActionsMap.keySet();
                    for (Iterator<String> it = keySet.iterator(); it.hasNext();) {
                        String key = it.next();
                        List<CarrierloginAction> actionTemps = panelActionsMap.get(key);
                        menuActionsBuilder.append("<tr><td><span class='label label-info'>");
                        menuActionsBuilder.append(key + "：");
                        menuActionsBuilder.append("</span></td><td>");
                        for (CarrierloginAction action : actionTemps) {
                            menuActionsBuilder.append("<input name='actionCB' type='checkbox' id='" + carrierloginMenu.getMenuId() + ":" + action.getPanelEnName() + "_" + action.getActionEnName() + "' ");
                            boolean checked = false;
                            if (null != ownActions && ownActions.length > 0) {
                                for (String ownAction : ownActions) {
                                    if ((action.getPanelEnName() + "_" + action.getActionEnName()).equals(ownAction)) {
                                        checked = true;
                                    }
                                }
                            }
                            if (checked) {
                                menuActionsBuilder.append("checked=" + checked);
                            }
                            menuActionsBuilder.append(" /><span class='auth_span'>" + action.getActionCnName() + "</span> ");
                        }
                    }
                    menuActionsBuilder.append("</td></tr></table>");
                    String menuActions = menuActionsBuilder.toString();
                    authMenuActionVO.setActions(menuActions);
                }
                returnAuthList.add(authMenuActionVO);
            }
        }
        return returnAuthList;
    }
    
    /**
     * @Title: getRolesAndRational
     * @Description: TODO(根据用户Id获取角色列表)
     * @param @param userId
     * @param @return
     * @throws 备注
     *<p>
     *已检查测试:Green
     *<p>
     */
    public Object getRolesAndRational(String carrierMemberId) {
        CarrierloginRoleExample carrierloginRoleExample = new CarrierloginRoleExample();// 后面做优化，需要开
        List<CarrierloginRole> carrierloginRoles = carrierloginRoleMapper.selectByExample(carrierloginRoleExample);
        CarrierloginUserRoleExample carrierloginUserRoleExample = new CarrierloginUserRoleExample();
        carrierloginUserRoleExample.createCriteria().andUserIdEqualTo(carrierMemberId);
        List<CarrierloginUserRoleKey> CarrierMemberRoleList = carrierloginUserRoleMapper.selectByExample(carrierloginUserRoleExample);// 查找传入用户Id拥有的角色
        for (CarrierloginRole carrierloginRole : carrierloginRoles) {
            CarrierloginUserRoleKey carrierloginUserRoleKey = new CarrierloginUserRoleKey();
            carrierloginUserRoleKey.setUserId(carrierMemberId);
            carrierloginUserRoleKey.setRoleId(carrierloginRole.getRoleId());
            if (CarrierMemberRoleList.contains(carrierloginUserRoleKey)) {
                carrierloginRole.setChecked(true);
            }
        }
        return carrierloginRoles;
    }

   /**
     * @Title: saveRoleAuths
     * @Description: TODO(保存角色权限)
     * @param @param roleId
     * @param @param menuIds
     * @param @param authActions
     * @param @return
     * @throws 备注
     *<p>
     *已检查测试:Green
     *<p>
     */
    @Transactional(readOnly = false)
//    @MethodLog(opera = "RoleList_auth")
    public Object saveRoleAuths(String roleId, Set<String> menuIds, Set<String> authActions) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject();//管理员类型用户只有所属创建者才能对其进行分配角色
        CarrierMember pricipalUser = (CarrierMember) pricipalSubject.getPrincipal();
        // 管理员类型用户只有所属创建者才能进行修改
        CarrierloginRole originalRole = carrierloginRoleMapper.selectByPrimaryKey(roleId);// 获取原角色相关信息
        // 管理员类型角色只有所属创建者才能进行修改
        if (originalRole.getBuiltin() == CommonBuiltin.admin) {
            if (!pricipalUser.getCarrierMemberId().equals(originalRole.getCreater())) {
                returnResult.setMsg("管理员类型角色只有所属创建者才能对其进行授权");
                return returnResult;
            }
        }
        CarrierloginAuthorityExample authExample = new CarrierloginAuthorityExample();
        authExample.createCriteria().andRoleIdEqualTo(roleId);
        carrierloginAuthorityMapper.deleteByExample(authExample);// 先删除角色权限关联表中的roleId的数据
        if (null != menuIds && menuIds.size() > 0) {// 　判断关联数据是否为空
            for (String menuId : menuIds) {// 循环插入关联表数据
                CarrierloginAuthority carrierloginAuthorityTemp = new CarrierloginAuthority();
                carrierloginAuthorityTemp.setRoleId(roleId);
                carrierloginAuthorityTemp.setMenuId(menuId);
                count = carrierloginAuthorityMapper.insert(carrierloginAuthorityTemp);// 插入关联表数据
            }
        }
        if (null != authActions && authActions.size() > 0) {
            Map<String, String> menuMap = new HashMap<String, String>();
            for (String menuAction : authActions) {
                String[] menuActionString = menuAction.split(":");
                String menuId = menuActionString[0];
                String actionString = menuActionString[1];
                if (menuMap.containsKey(menuId)) {
                    StringBuilder actions = new StringBuilder(menuMap.get(menuId));
                    actions.append("," + actionString);
                    menuMap.put(menuId, actions.toString());
                } else {
                    menuMap.put(menuId, actionString);
                }
            }
            for (Entry<String, String> entry : menuMap.entrySet()) {
                CarrierloginAuthority carrierloginAuthority = new CarrierloginAuthority();
                carrierloginAuthority.setRoleId(roleId);
                carrierloginAuthority.setMenuId(entry.getKey());
                carrierloginAuthority.setActions(entry.getValue());
                count = carrierloginAuthorityMapper.updateByPrimaryKey(carrierloginAuthority);
            }
        }
        if ( menuIds.size() == 0 && authActions.size() == 0) {
            count=1;
        }
        if (count > 0) {
            returnResult.setSuccess(true);
            returnResult.setMsg("权限信息已保存");
        } else {
            returnResult.setMsg("权限信息更新失败");
        }
        return returnResult;
    }

    /**
     * @Title: saveRolesAndRational
     * @Description: TODO(保存用户角色关联)
     * @param @param userId
     * @param @param roleIds
     * @param @return
     * @throws 备注
     *<p>
     *已检查测试:Green
     *<p>
     */
    @Transactional(readOnly = false)
//    @MethodLog(opera = "RoleList_assign")
    public Object saveRolesAndRational(String carrierMemberId, Set<String> roleIds) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject();//管理员类型用户只有所属创建者才能对其进行分配角色
        CarrierMember pricipalUser = (CarrierMember) pricipalSubject.getPrincipal();
        CarrierMember originalUser = carrierMemberMapper.selectByPrimaryKey(carrierMemberId);// 获取原用户相关信息
        // 管理员类型用户只有所属创建者才能进行修改
//        if (originalUser.getBuiltin().equals(CommonBuiltin.admin)) {
            if (!pricipalUser.getCarrierMemberId().equals(originalUser.getCreater())) {
                returnResult.setMsg("管理员类型用户只有所属创建者才能对其进行分配角色");
                return returnResult;
            }
//        }
        CarrierloginUserRoleExample carrierloginUserRoleExample = new CarrierloginUserRoleExample();
        carrierloginUserRoleExample.createCriteria().andUserIdEqualTo(carrierMemberId);
        count = carrierloginUserRoleMapper.deleteByExample(carrierloginUserRoleExample);
        if (null != roleIds && roleIds.size() > 0) {
            for (String roleId : roleIds) {
                CarrierloginUserRoleKey carrierloginUserRoleKey = new CarrierloginUserRoleKey();
                carrierloginUserRoleKey.setUserId(carrierMemberId);
                carrierloginUserRoleKey.setRoleId(roleId);
                count += carrierloginUserRoleMapper.insert(carrierloginUserRoleKey);// 插入用户和角色关联表数据
            }
        }
        if (count > 0) {
            returnResult.setSuccess(true);
            returnResult.setMsg("角色分配成功");
        } else {
            returnResult.setMsg("系统出现未知错误，角色分配失败");
        }
        return returnResult;
    }
}

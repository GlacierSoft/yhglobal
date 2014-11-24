/**
 * @Title: StorehouseTemplateService.java 
 * @Package com.glacier.global.service.StorehouseTemplate
 * @author wuting   
 * @email 920339213@qq.com
 * @date 2014-10-14
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.00          
 * @Review (审核人) ：wuting
 * 
 */
package com.glacier.frame.service.storehouse; 
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.storehouse.StorehouseStorageMapper;
import com.glacier.frame.dao.storehouse.StorehouseTemplateMapper;
import com.glacier.frame.dao.system.UserMapper;
import com.glacier.frame.entity.member.ShipperMember;
import com.glacier.frame.entity.storehouse.StorehouseTemplate;
import com.glacier.frame.entity.storehouse.StorehouseTemplateExample;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.system.UserExample;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
/*** 
 * @ClassName:  StorehouseTemplateService
 * @Description: TODO(发货模板表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-15
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class StorehouseStorageTemplateService {

	@Autowired
	private StorehouseTemplateMapper storehouseTemplateMapper;
	
	@Autowired
	private StorehouseStorageMapper storageMapper;
	
	@Autowired
    private UserMapper userMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有发货模板信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager,int p) {
        JqGridReturn returnResult = new JqGridReturn();
        Subject pricipalSubject = SecurityUtils.getSubject();
        ShipperMember shipperMember = (ShipperMember) pricipalSubject.getPrincipal();
        StorehouseTemplateExample storehouseTemplateExample = new StorehouseTemplateExample(); 
        storehouseTemplateExample.createCriteria().andMemberidEqualTo(shipperMember.getMemberId());
       
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	storehouseTemplateExample.setOrderByClause(jqPager.getOrderBy("temp_storehouse_template_"));
        }
        int startTemp = ((p-1)*10);//根据前台返回的页数进行设置
        storehouseTemplateExample.setLimitStart(startTemp);
        storehouseTemplateExample.setLimitEnd(10);
        List<StorehouseTemplate> storehouseTemplateTypeList = storehouseTemplateMapper.selectByExample(storehouseTemplateExample); // 查询所有发货模板列表
        int total = storehouseTemplateMapper.countByExample(storehouseTemplateExample); // 查询总页数
        returnResult.setRows(storehouseTemplateTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getStoragetype 
	 * @Description: TODO(根据发货模板Id获取发货模板信息) 
	 * @param @param storagetypeId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getStorehouseTemplate(String templateId) {
    	StorehouseTemplate carrierCarType = storehouseTemplateMapper.selectByPrimaryKey(templateId);
        return carrierCarType;
    }
    
    /**
     * @Title: addTemplate 
     * @Description: TODO(新增发货模板) 
     * @param @param template
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
   
    @Transactional(readOnly = false)
    public Object addTemplate(StorehouseTemplate template) {
    	UserExample userExample = new UserExample();//查找出超级管理员信息
        userExample.createCriteria().andUsernameEqualTo("admin");
        List<User> usersList = userMapper.selectByExample(userExample);
        User users=usersList.get(0);
        //取出当前登陆用户
        Subject pricipalSubject = SecurityUtils.getSubject();
        ShipperMember shipperMember = (ShipperMember) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        StorehouseTemplateExample storehouseTemplateExample = new StorehouseTemplateExample(); 
        int count = 0;
        // 防止发货模板名称重复
        storehouseTemplateExample.createCriteria().andTemplatenameEqualTo(template.getTemplatename());
        count = storehouseTemplateMapper.countByExample(storehouseTemplateExample);
        if (count > 0) {
            returnResult.setMsg("发货模板名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        template.setTemplateid(RandomGUID.getRandomGUID());
        template.setMemberid(shipperMember.getMemberId());
        template.setCreater(users.getUserId());
        template.setCreateTime(new Date());
        template.setUpdater(users.getUserId());
        template.setUpdateTime(new Date());
        count = storehouseTemplateMapper.insert(template);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + template.getTemplatename() + "] 发货模板信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，发货模板信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editTemplate 
     * @Description: TODO(修改发货模板信息) 
     * @param @param template
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editTemplate(StorehouseTemplate template) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        StorehouseTemplateExample storehouseTemplateExample = new StorehouseTemplateExample(); 
        int count = 0;
        // 防止发货模板名称重复
        storehouseTemplateExample.createCriteria().andTemplatenameEqualTo(template.getTemplatename()).andTemplateidNotEqualTo(template.getTemplateid());
        count = storehouseTemplateMapper.countByExample(storehouseTemplateExample);
        if (count > 0) {
            returnResult.setMsg("发货模板名称重复");
            return returnResult;
        }
        count = storehouseTemplateMapper.updateByPrimaryKeySelective(template);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + template.getTemplatename() + "] 发货模板信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，发货模板信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delTemplate
     * @Description: TODO(删除发货模板) 
     * @param @param templateId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object delTemplate(String templateId) {
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
        int count = storehouseTemplateMapper.deleteByPrimaryKey(templateId);
        if(count == 1){
        	returnResult.setSuccess(true);
            returnResult.setMsg("发货模板信息删除成功！");
        }else{
        	returnResult.setSuccess(false);
            returnResult.setMsg("发货模板信息删除失败");
        }
        return returnResult;
    }
}

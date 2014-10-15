/**
 * @Title: ShipperIntegralTypeService.java 
 * @Package com.glacier.frame.service.member 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2014-10-10 上午10:16:16 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-10-10
				修改人：song.jundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：song.jundong 
 * 
 */
package com.glacier.frame.service.member;
 
import java.util.Date;
import java.util.List; 
import org.apache.commons.lang3.StringUtils; 
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional; 

import com.glacier.basic.util.CollectionsUtil;
import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.member.ShipperIntegralTypeMapper;
import com.glacier.frame.dao.system.UserMapper;
import com.glacier.frame.entity.member.ShipperIntegralType;
import com.glacier.frame.entity.member.ShipperIntegralTypeExample; 
import com.glacier.frame.entity.system.User;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName:  ShipperIntegralTypeService
 * @Description: TODO(会员积分类型service)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-10-10  上午10:16:16
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ShipperIntegralTypeService { 

	@Autowired
    private ShipperIntegralTypeMapper shipperIntegralTypeMapper;
	
	@Autowired
    private UserMapper userMapper;

	/**
	 * @Title: getIntegralType 
	 * @Description: TODO(通过integarlTypeId获取积分类型信息) 
	 * @param  @param integralTypeId
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 */
    public Object getIntegralType(String integralTypeId) {
        return shipperIntegralTypeMapper.selectByPrimaryKey(integralTypeId);
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(展示积分类型列表) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager) {
        JqGridReturn returnResult = new JqGridReturn();
        ShipperIntegralTypeExample shipperIntegralTypeExample = new ShipperIntegralTypeExample();
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	shipperIntegralTypeExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	shipperIntegralTypeExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	shipperIntegralTypeExample.setOrderByClause(pager.getOrderBy("temp_shipper_integral_type_"));
        }
        List<ShipperIntegralType>  parameterIntegralTypes = shipperIntegralTypeMapper.selectByExample(shipperIntegralTypeExample); // 查询所有积分类型列表
        int total = shipperIntegralTypeMapper.countByExample(shipperIntegralTypeExample); // 查询总页数
        returnResult.setRows(parameterIntegralTypes);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: addIntegralType 
     * @Description: TODO(增加积分类型) 
     * @param @param shipperIntegralType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
    @Transactional(readOnly = false) 
    public Object addIntegralType(ShipperIntegralType shipperIntegralType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ShipperIntegralTypeExample shipperIntegralTypeExample = new ShipperIntegralTypeExample();
        int count = 0;
        // 防止积分类型名称重复
        shipperIntegralTypeExample.createCriteria().andIntegralTypeEqualTo(shipperIntegralType.getIntegralType());
        count = shipperIntegralTypeMapper.countByExample(shipperIntegralTypeExample);// 查找相同名称的积分类型数量
        if (count > 0) {
            returnResult.setMsg("积分类型重复");
            return returnResult;
        }
        shipperIntegralType.setIntegralTypeId(RandomGUID.getRandomGUID());
        shipperIntegralType.setCreater(pricipalUser.getUserId());
        shipperIntegralType.setCreateTime(new Date());
        shipperIntegralType.setUpdater(pricipalUser.getUserId());
        shipperIntegralType.setUpdateTime(new Date());
        count = shipperIntegralTypeMapper.insert(shipperIntegralType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + shipperIntegralType.getIntegralType() + "] 积分类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，积分类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editIntegralType 
     * @Description: TODO(修改积分类型) 
     * @param @param shipperIntegralType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
    @Transactional(readOnly = false) 
    public Object editIntegralType(ShipperIntegralType shipperIntegralType) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ShipperIntegralTypeExample parameterIntegralTypeExample = new ShipperIntegralTypeExample();
        int count = 0;
        // 防止积分类型名称重复
        parameterIntegralTypeExample.createCriteria().andIntegralTypeIdNotEqualTo(shipperIntegralType.getIntegralType()).andIntegralTypeEqualTo(shipperIntegralType.getIntegralType()).andIntegralTypeIdNotEqualTo(shipperIntegralType.getIntegralTypeId());
        count = shipperIntegralTypeMapper.countByExample(parameterIntegralTypeExample);// 查找相同名称的积分类型数量
        if (count > 0) {
            returnResult.setMsg("积分类型名称重复");
            return returnResult;
        }
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        shipperIntegralType.setUpdater(pricipalUser.getUserId());
        shipperIntegralType.setUpdateTime(new Date());
        count = shipperIntegralTypeMapper.updateByPrimaryKeySelective(shipperIntegralType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + shipperIntegralType.getIntegralType() + "] 积分类型信息已变更");
        } else {
            returnResult.setMsg("发生未知错误，积分类型信息修改失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delIntegralTypes 
     * @Description: TODO(删除积分类型) 
     * @param @param integralTypeIds 积分类型Id
     * @param @param integralTypes 积分类型名字
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
    @Transactional(readOnly = false) 
    public Object delIntegralTypes(List<String> integralTypeIds, List<String> integralTypes) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (integralTypeIds.size() > 0) {
        	ShipperIntegralTypeExample shipperIntegralTypeExample = new ShipperIntegralTypeExample();
        	shipperIntegralTypeExample.createCriteria().andIntegralTypeIdIn(integralTypeIds);
            count = shipperIntegralTypeMapper.deleteByExample(shipperIntegralTypeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(integralTypes, ",") + " ]积分类型");
            } else {
                returnResult.setMsg("发生未知错误，积分类型信息删除失败");
            }
        }
        return returnResult;
    } 

}

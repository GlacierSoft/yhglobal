/**
 * @Title: CarrierRouterService.java 
 * @Package com.glacier.frame.service.carrier 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2014-10-16 上午10:32:54 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-10-16
				修改人：song.jundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：song.jundong 
 * 
 */
package com.glacier.frame.service.carrier; 
import java.util.Date;
import java.util.List; 

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional; 
import com.glacier.frame.dao.carrier.CarrierRouteMapper;
import com.glacier.frame.entity.carrier.CarrierRoute;
import com.glacier.frame.entity.carrier.CarrierRouteExample; 
import com.glacier.frame.entity.system.User;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
/**
 * @ClassName:  CarrierRouterService
 * @Description: TODO(班线service)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-10-16  上午10:32:54
 */
@Service  
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class CarrierRouterService { 
	
	@Autowired
	private CarrierRouteMapper carrierRouteMapper;
	
	/*** 
	 * @Title: listAsGrid  
	 * @Description: TODO(获取班线list)  
	 * @param @param jqPager
	 * @param @param q
	 * @param @return    设定文件  
	 * @return Object    返回类型  
	 * @throws
	 */
    public Object listAsGrid(JqPager jqPager, String q) {
        JqGridReturn returnResult = new JqGridReturn();
        CarrierRouteExample carrierRouteExample = new CarrierRouteExample(); 
       // Criteria queryCriteria = carrierRouteExample.createCriteria(); 
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	carrierRouteExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	carrierRouteExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	carrierRouteExample.setOrderByClause(jqPager.getOrderBy("temp_carrier_route_"));
        }
        List<CarrierRoute>  shippermembers = carrierRouteMapper.selectByExample(carrierRouteExample); // 查询所有会员列表
        int total = carrierRouteMapper.countByExample(carrierRouteExample); // 查询总页数
        returnResult.setRows(shippermembers);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
     /*** 
      * @Title: getRoute  
      * @Description: TODO(获取班线详情)  
      * @param @param routeId
      * @param @return    设定文件  
      * @return Object    返回类型  
      * @throws
      */
    public CarrierRoute getRoute(String routeId) {  
    	return carrierRouteMapper.selectByPrimaryKey(routeId);
    } 
     
     /*** 
      * @Title: upStatus  
      * @Description: TODO(启用禁用班线)  
      * @param @param routeId
      * @param @return    设定文件  
      * @return Object    返回类型  
      * @throws
      */
    @Transactional(readOnly = false)
    public Object upStatus(String routeId){
    	 JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
         Subject pricipalSubject = SecurityUtils.getSubject(); 
    	 User pricipalUser = (User) pricipalSubject.getPrincipal();
    	 CarrierRoute carrierRoute= carrierRouteMapper.selectByPrimaryKey(routeId);
    	 if(carrierRoute.getStatus().equals("enable")){
    		 carrierRoute.setStatus("disable");
    	 }else{
    		 carrierRoute.setStatus("enable");
    	 } 
    	 carrierRoute.setUpdater(pricipalUser.getUserId());
    	 carrierRoute.setUpdateTime(new Date());
    	 int count = carrierRouteMapper.updateByPrimaryKeySelective(carrierRoute);
    	 if(count == 1){
    		 returnResult.setSuccess(true);
    		 returnResult.setMsg("更改状态成功!");
    	 }else{
    		 returnResult.setMsg("发生未知错误，状态修改失败");
    	 }
    	return returnResult; 
    } 
 
    /*** 
     * @Title: audit  
     * @Description: TODO(班线审核)  
     * @param @param carrierRoute
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */
    @Transactional(readOnly = false) 
    public Object audit(CarrierRoute carrierRoute) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        CarrierRoute route = carrierRouteMapper.selectByPrimaryKey(carrierRoute.getRouterId());
        if(route.getAuditState().equals("authstr")==false){
        	returnResult.setMsg("该班线已进行过审核，不可重复操作");
       	    return returnResult;
        }
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject(); 
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        carrierRoute.setAudit(pricipalUser.getUserId());
        carrierRoute.setAuditTime(new Date());
        carrierRoute.setUpdater(pricipalUser.getUserId()); 
        carrierRoute.setUpdateTime(new Date());
        count = carrierRouteMapper.updateByPrimaryKeySelective(carrierRoute);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("班线【"+carrierRoute.getRouteName()+"】审核操作成功");
        } else {
            returnResult.setMsg("发生未知错误，企业信息审核失败");
        }
        return returnResult;
    }
}

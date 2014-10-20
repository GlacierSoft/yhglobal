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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;  
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;  

import com.glacier.frame.dao.carrier.CarrierAmongRouteMapper;
import com.glacier.frame.dao.carrier.CarrierDeliverGoodsAreaMapper;
import com.glacier.frame.dao.carrier.CarrierMemberMapper;
import com.glacier.frame.dao.carrier.CarrierPickUpgoodsAreaMapper;
import com.glacier.frame.dao.carrier.CarrierRouteMapper;
import com.glacier.frame.dto.query.carrier.CarrierRouteQueryDTO; 
import com.glacier.frame.entity.carrier.CarrierAmongRoute;
import com.glacier.frame.entity.carrier.CarrierAmongRouteExample;
import com.glacier.frame.entity.carrier.CarrierDeliverGoodsArea;
import com.glacier.frame.entity.carrier.CarrierDeliverGoodsAreaExample;
import com.glacier.frame.entity.carrier.CarrierMember;
import com.glacier.frame.entity.carrier.CarrierMemberExample;
import com.glacier.frame.entity.carrier.CarrierPickUpgoodsArea;
import com.glacier.frame.entity.carrier.CarrierPickUpgoodsAreaExample;
import com.glacier.frame.entity.carrier.CarrierRoute;
import com.glacier.frame.entity.carrier.CarrierRouteExample; 
import com.glacier.frame.entity.carrier.CarrierRouteExample.Criteria;
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
	
	@Autowired
	private CarrierDeliverGoodsAreaMapper carrierDeliverGoodsAreaMapper;
	
	@Autowired
	private CarrierPickUpgoodsAreaMapper carrierPickUpgoodsAreaMapper;
	
	@Autowired
	private CarrierAmongRouteMapper carrierAmongRouteMapper;
	
	@Autowired
	private CarrierMemberMapper carrierMemberMapper;
	/*** 
	 * @Title: listAsGrid  
	 * @Description: TODO(获取班线list)  
	 * @param @param jqPager
	 * @param @param q
	 * @param @return    设定文件  
	 * @return Object    返回类型  
	 * @throws
	 */
     public Object listAsGrid(JqPager jqPager,CarrierRouteQueryDTO routeQueryDTO, String q) {
        JqGridReturn returnResult = new JqGridReturn();
        CarrierRouteExample carrierRouteExample = new CarrierRouteExample(); 
        Criteria queryCriteria = carrierRouteExample.createCriteria(); 
        routeQueryDTO.setQueryCondition(queryCriteria, q);
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
        System.out.println("route:"+route);
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
            returnResult.setMsg("班线【"+route.getRouteName()+"】审核操作成功");
        } else {
            returnResult.setMsg("发生未知错误，信息审核失败");
        }
        return returnResult;
    } 
    
    /*** 
     * @Title: selectArea  
     * @Description: TODO(查询班线的发货区域和收货区域)  
     * @param @param routeid
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */
    public Object selectArea(String routeid){
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        returnResult.setSuccess(true);
    	List<Object> listObject=new ArrayList<Object>(); 
    	CarrierDeliverGoodsAreaExample  carrierDeliverGoodsAreaExample =new CarrierDeliverGoodsAreaExample();
    	carrierDeliverGoodsAreaExample.createCriteria().andRouterIdEqualTo(routeid);
    	//查询发货区域
    	List<CarrierDeliverGoodsArea> celiverList=carrierDeliverGoodsAreaMapper.selectByExample(carrierDeliverGoodsAreaExample);
    	listObject.add(celiverList); 
    	CarrierPickUpgoodsAreaExample carrierPickUpgoodsAreaExample =new CarrierPickUpgoodsAreaExample();
    	carrierPickUpgoodsAreaExample.createCriteria().andRouterIdEqualTo(routeid);
    	//查询收货区域
    	List<CarrierPickUpgoodsArea>  pickUpList=carrierPickUpgoodsAreaMapper.selectByExample(carrierPickUpgoodsAreaExample);
    	listObject.add(pickUpList); 
    	returnResult.setObj(listObject);
    	return returnResult;
    } 
    
    /**
     * @Title: editRoute 
     * @Description: TODO(修改承运商班线) 
     * @param @param memberGrade
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
	@Transactional(readOnly = false)
    public Object editRoute(CarrierRoute carrierRoute) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        CarrierRouteExample carrierRouteExample = new CarrierRouteExample();
        int count = 0;
        // 防止班线编号重复
        carrierRouteExample.createCriteria().andRouteNumberEqualTo(carrierRoute.getRouteNumber()).andRouterIdNotEqualTo(carrierRoute.getRouterId());
        count = carrierRouteMapper.countByExample(carrierRouteExample);
        if (count > 0) {
            returnResult.setMsg("承运商班线编号重复");
            return returnResult;
        }
        String s = new String(carrierRoute.getOutTime());   
        String time[] = s.split(":");  
        String s2 = new String(carrierRoute.getIntTime());   
        String inTime[] = s2.split(":");  
        //根据ID获取班线信息  
        carrierRoute.setUpdater(pricipalUser.getUserId());
        carrierRoute.setUpdateTime(new Date());  
        //修改出发和截止收货时间 
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.set(Calendar.HOUR_OF_DAY, Integer.valueOf(time[0]));
        cal.set(Calendar.SECOND,Integer.valueOf(time[1]));
        cal.set(Calendar.MINUTE,0);
        Date date=cal.getTime();
        carrierRoute.setStartofTime(date);    
        cal.setTime(new Date());
        cal.set(Calendar.HOUR_OF_DAY, Integer.valueOf(inTime[0]));
        cal.set(Calendar.SECOND,Integer.valueOf(inTime[1]));
        cal.set(Calendar.MINUTE,0);
        Date dates=cal.getTime(); 
        carrierRoute.setCeaseTakeDeliveryTime(dates); 
        count = carrierRouteMapper.updateByPrimaryKey(carrierRoute);
        //取出详情表的信息，修改班线绑定的承运商
        CarrierAmongRouteExample carrierAmongRouteExample=new CarrierAmongRouteExample();
        carrierAmongRouteExample.createCriteria().andRouterIdEqualTo(carrierRoute.getRouterId());
        List<CarrierAmongRoute> carrierAmongRoute =carrierAmongRouteMapper.selectByExample(carrierAmongRouteExample);
        CarrierAmongRoute amongRoute=carrierAmongRoute.get(0); 
        CarrierMemberExample carrierMemberExample=new CarrierMemberExample();
        carrierMemberExample.createCriteria().andMemberNameEqualTo(carrierRoute.getCarrierDisplay());
        CarrierMember  carrierMember=   carrierMemberMapper.selectByExample(carrierMemberExample).get(0); 
        amongRoute.setCarrierMemberId(carrierMember.getCarrierMemberId());//赋值新的承运商信息 
        carrierAmongRouteMapper.updateByPrimaryKey(amongRoute);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("班线信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，班线信息修改失败");
        } 
        return returnResult;
    } 
}

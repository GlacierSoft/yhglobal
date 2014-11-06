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
import java.util.Iterator;
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
	  
	
    /**
     * @Title: listAsWebsite 
     * @Description: TODO(前台展示班线信息) 
     * @param @param pager
     * @param @param p
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsWebsite(JqPager pager, int p,String routeType,CarrierRouteQueryDTO routeQueryDTO) {
    	JqGridReturn returnResult = new JqGridReturn();
    	CarrierRouteExample carrierRouteExample = new CarrierRouteExample();
    	Criteria queryCriteria = carrierRouteExample.createCriteria(); 
        routeQueryDTO.setQueryCondition(queryCriteria);
    	carrierRouteExample.createCriteria().andStatusEqualTo("enable").andRouteTypeEqualTo(routeType); 
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	carrierRouteExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	carrierRouteExample.setLimitEnd(pager.getRows());
        }
        pager.setSort("createTime");// 定义排序字段
        pager.setOrder("DESC");// 升序还是降序
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	carrierRouteExample.setOrderByClause(pager.getOrderBy("temp_carrier_route_"));
        }
        int startTemp = ((p-1)*10);//根据前台返回的页数进行设置
        carrierRouteExample.setLimitStart(startTemp);
        carrierRouteExample.setLimitEnd(10);
        List<CarrierRoute>  carrierRoute = carrierRouteMapper.selectByExample(carrierRouteExample); // 查询所有班线列表
        int total = carrierRouteMapper.countByExample(carrierRouteExample); // 查询总页数
        returnResult.setRows(carrierRoute);
        //如果查询出总数小于1，则默认分页为第一页，不然前台页面会有错误信息
        if(total<1){
        	total=1;
        }
        returnResult.setTotal(total);
        returnResult.setP(p);
        return returnResult;// 返回ExtGrid表
    }
	  
	/*** 
	 * @Title: listAsGrid  
	 * @Description: TODO(获取班线list)  
	 * @param @param jqPager
	 * @param @param q
	 * @param @return    设定文件  
	 * @return Object    返回类型  
	 * @throws
	 */
     public Object listAsGrid(JqPager jqPager,CarrierRouteQueryDTO routeQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        CarrierRouteExample carrierRouteExample = new CarrierRouteExample(); 
        Criteria queryCriteria = carrierRouteExample.createCriteria(); 
        routeQueryDTO.setQueryCondition(queryCriteria);
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
		  CarrierRoute route=carrierRouteMapper.selectByPrimaryKey(routeId);
		  CarrierDeliverGoodsAreaExample  carrierDeliverGoodsAreaExample =new CarrierDeliverGoodsAreaExample();
	      carrierDeliverGoodsAreaExample.createCriteria().andRouterIdEqualTo(routeId);
	      //查询发货区域
	      List<CarrierDeliverGoodsArea> celiverList=carrierDeliverGoodsAreaMapper.selectByExample(carrierDeliverGoodsAreaExample);
	      route.setDeliverList(celiverList); 
	      CarrierPickUpgoodsAreaExample carrierPickUpgoodsAreaExample =new CarrierPickUpgoodsAreaExample();
	      carrierPickUpgoodsAreaExample.createCriteria().andRouterIdEqualTo(routeId);
	      //查询收货区域
	      List<CarrierPickUpgoodsArea>  pickUpList=carrierPickUpgoodsAreaMapper.selectByExample(carrierPickUpgoodsAreaExample);
	      route.setPickUpList(pickUpList);   
	      return route;
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
    	 if(carrierRoute.getAuditState().equals("pass")==false){
    		 returnResult.setMsg("该班线不是【审核通过】状态，不可进行启用禁用操作");
    		 return returnResult;
    	 } 
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
	    CarrierMember pricipalUser = (CarrierMember) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
        CarrierRoute  route=carrierRouteMapper.selectByPrimaryKey(carrierRoute.getRouterId());
        int count = 0; 
        if(route.getAuditState().equals("pass")){
        	 returnResult.setMsg("该班线已经进行过审核操作，不可修改！");
             return returnResult;
        }  
        //修改后默认审核状态为审核中
        carrierRoute.setAudit("authstr");
        String s = new String(carrierRoute.getOutTime().trim());  
        String time[] = s.split(":");  
        String s2 = new String(carrierRoute.getIntTime().trim());   
        String inTime[] = s2.split(":");   
        carrierRoute.setUpdater(pricipalUser.getCarrierMemberId());
        carrierRoute.setUpdateTime(new Date());  
        //修改出发和截止收货时间 
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.set(Calendar.HOUR_OF_DAY, Integer.valueOf(time[0]));
        cal.set(Calendar.SECOND,0);
        cal.set(Calendar.MINUTE,Integer.valueOf(time[1]));
        Date date=cal.getTime();
        carrierRoute.setStartofTime(date);     
        cal.setTime(new Date());
        cal.set(Calendar.HOUR_OF_DAY, Integer.valueOf(inTime[0]));
        cal.set(Calendar.SECOND,0);
        cal.set(Calendar.MINUTE,Integer.valueOf(inTime[1]));
        Date dates=cal.getTime(); 
        carrierRoute.setCeaseTakeDeliveryTime(dates);   
        carrierRoute.setAuditState(route.getAuditState());
        carrierRoute.setAudit(route.getAudit());
        carrierRoute.setAuditTime(route.getAuditTime());
        carrierRoute.setAuditOpinion(route.getAuditOpinion());
        carrierRoute.setCreater(route.getCreater());
        carrierRoute.setCreateTime(route.getCreateTime()); 
        count = carrierRouteMapper.updateByPrimaryKey(carrierRoute);
        //修改发货区域信息 
        for (CarrierDeliverGoodsArea str: carrierRoute.getDeliverList()) { 
        	 //是否存在该发货区域 
        	 if(str.getDeliverGoodsAreaId().trim().equals("")==false){
        		 if(str.getDeliverName().trim().equals("")==false){//存在区域就修改
           		  //如果不填写价格，则默认为起步价格
           		  if(str.getPrice()==null){
           			  str.setPrice(carrierRoute.getStartingPrice());//如果价格没写，那就默认按起步价来算
   				   }
           		  str.setRouterId(carrierRoute.getRouterId());
	           	  carrierDeliverGoodsAreaMapper.updateByPrimaryKeySelective(str);
	           	  }else{  //否则就把多余的记录清掉
	           		  carrierDeliverGoodsAreaMapper.deleteByPrimaryKey(str.getDeliverGoodsAreaId()); 
	           	  }
        	 }else{   //id不存在
        		  if(str.getDeliverName().trim().equals("")==false){//但存在区域，就添加区域数据
        			 str.setDeliverGoodsAreaId(RandomGUID.getRandomGUID());
        			 str.setRouterId(carrierRoute.getRouterId());
        			 //如果不填写价格，则默认为起步价格
               		 if(str.getPrice()==null){
               			  str.setPrice(carrierRoute.getStartingPrice());//如果价格没写，那就默认按起步价来算
       				   } 
    	           	carrierDeliverGoodsAreaMapper.insertSelective(str); 
        		  }
        	 } 
		} 
        //修改提货区域信息 
        for (CarrierPickUpgoodsArea pick: carrierRoute.getPickUpList()) { 
        	 //是否存在该提货区域  
        	 if(pick.getPickUpGoodsAreaId().equals("")==false){
        		 if(pick.getDeliverName().trim()!=""){//存在区域就修改
	           		  //如果不填写价格，则默认为起步价格
	           		  if(pick.getPrice()==null){ 
	           			  pick.setPrice(carrierRoute.getStartingPrice());//如果价格没写，那就默认按起步价来算
	   				   }
	           		   pick.setRouterId(carrierRoute.getRouterId());
		           	   carrierPickUpgoodsAreaMapper.updateByPrimaryKeySelective(pick);
		           }else{  //否则就把多余的记录清掉
		           		carrierPickUpgoodsAreaMapper.deleteByPrimaryKey(pick.getPickUpGoodsAreaId()); 
	           	  }
        	 }else{  //id不存在
        		  if(pick.getDeliverName().trim().equals("")==false){//但存在区域，就添加区域数据
        			  pick.setPickUpGoodsAreaId(RandomGUID.getRandomGUID());
        			  pick.setRouterId(carrierRoute.getRouterId());
        			  //如果不填写价格，则默认为起步价格
               		  if(pick.getPrice()==null){
               			  pick.setPrice(carrierRoute.getStartingPrice());//如果价格没写，那就默认按起步价来算
       				   }  
               		  carrierPickUpgoodsAreaMapper.insert(pick);
        		  }
        	 } 
		} 
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
	
	/** 
	 * @Title: GenerationRouteNumber  
	 * @Description: TODO(系统自动生成班线编号，不能重复)  
	 * @param @return    设定文件  
	 * @return Object    返回类型  
	 * @throws
	 */
   public String GenerationRouteNumber(){  
		String route=carrierRouteMapper.selectTop();   
		if(route==null){
			String number="YH-"+10000;
			return number;
		}
		String str = new String(route);   
        String strs[] = str.split("-");
        int num=Integer.parseInt(strs[1])+1;
        String number="YH-"+num;
		return number;
	} 
   
   /** 
    * @Title: addRoute  
    * @Description: TODO(添加班线)  
    * @param @param carrierRoute
    * @param @return    设定文件  
    * @return Object    返回类型  
    * @throws
    */
   @Transactional(readOnly = false)
   public Object addRoute(CarrierRoute carrierRoute){
	    Subject pricipalSubject = SecurityUtils.getSubject();
        CarrierMember pricipalUser = (CarrierMember) pricipalSubject.getPrincipal();
	    JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
	    carrierRoute.setRouterId(RandomGUID.getRandomGUID());  
	    carrierRoute.setCreater(pricipalUser.getCarrierMemberId());
	    carrierRoute.setCreateTime(new Date());
	    carrierRoute.setAuditState("authstr");   
	    //出发和截止收货时间 
		String s = new String(carrierRoute.getOutTime().trim());  
		String time[] = s.split(":");  
		String s2 = new String(carrierRoute.getIntTime().trim());   
		String inTime[] = s2.split(":");  
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.set(Calendar.HOUR_OF_DAY, Integer.valueOf(time[0]));
		cal.set(Calendar.SECOND,0);
		cal.set(Calendar.MINUTE,Integer.valueOf(time[1]));
		Date date=cal.getTime();
		carrierRoute.setStartofTime(date);     
		cal.setTime(new Date());
		cal.set(Calendar.HOUR_OF_DAY, Integer.valueOf(inTime[0]));
		cal.set(Calendar.SECOND,0);
		cal.set(Calendar.MINUTE,Integer.valueOf(inTime[1]));
		Date dates=cal.getTime(); 
		carrierRoute.setCeaseTakeDeliveryTime(dates);   
	    int count=carrierRouteMapper.insert(carrierRoute);
	    if (count == 1) {    
		 //添加发货区域
		   if(carrierRoute.getDeliverList()!=null){ 
			   for (CarrierDeliverGoodsArea deliver : carrierRoute.getDeliverList()) {
				   if(deliver.getDeliverName().trim()!=""){
					   deliver.setDeliverGoodsAreaId(RandomGUID.getRandomGUID());
					   if(deliver.getPrice()==null){
						   deliver.setPrice(carrierRoute.getStartingPrice());//如果价格没写，那就默认按起步价来算
					   }
					   deliver.setRouterId(carrierRoute.getRouterId());
					   carrierDeliverGoodsAreaMapper.insert(deliver);
				   }  
			   } 
		   } 
		   //提交提货区域
		   if(carrierRoute.getPickUpList()!=null){ 
			   for (CarrierPickUpgoodsArea pickUp : carrierRoute.getPickUpList()) {
				   if(pickUp.getDeliverName().trim()!=""){
					   pickUp.setPickUpGoodsAreaId(RandomGUID.getRandomGUID());
					   if(pickUp.getPrice()==null){
						   pickUp.setPrice(carrierRoute.getStartingPrice());//如果价格没写，那就默认按起步价来算
					   }
					   pickUp.setRouterId(carrierRoute.getRouterId());
					   carrierPickUpgoodsAreaMapper.insert(pickUp);
				   }  
			  } 
		 }   
		 //查询承运商的id
		 CarrierMemberExample carrierMemberExample=new CarrierMemberExample();
		 carrierMemberExample.createCriteria().andMemberNameEqualTo(carrierRoute.getCarrierDisplay());
		 CarrierMember  carrierMember=   carrierMemberMapper.selectByExample(carrierMemberExample).get(0); 
		 //添加详情表
		 CarrierAmongRoute carrierAmongRoute=new CarrierAmongRoute();
		 carrierAmongRoute.setAmongId(RandomGUID.getRandomGUID());
		 carrierAmongRoute.setRouterId(carrierRoute.getRouterId());
		 carrierAmongRoute.setCarrierMemberId(carrierMember.getCarrierMemberId());
		 carrierAmongRouteMapper.insert(carrierAmongRoute); 
		 returnResult.setSuccess(true);
		 returnResult.setMsg("[" + carrierRoute.getRouteName() + "]班线信息已提交，等待审核");
        } else {
           returnResult.setMsg("发生未知错误，班线信息保存失败");
        }  
	    return returnResult; 
    }
   
    /** 
     * @Title: delRoute  
     * @Description: TODO(删除班线)  
     * @param @param carrierRouteIds
     * @param @param carrierRouteNames
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */
   @Transactional(readOnly = false)
   public Object delRoute(List<String> carrierRouteIds, List<String> carrierRouteNames) {
       JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
       int count = 0;
       String str=null;
       if (carrierRouteIds.size() > 0) { 
    	    Iterator<String> iter = carrierRouteIds.iterator();  
    	    int i=0;
    	    while(iter.hasNext()){   
    	       String s = iter.next();  
    	       CarrierRoute  route=carrierRouteMapper.selectByPrimaryKey(s);
               if(route.getAuditState().equals("authstr")==false){
            	   iter.remove();  
            	   carrierRouteNames.remove(i);
            	   str="["+route.getRouteName()+"] ";
                   break;
               }  
               i++;
        	   CarrierAmongRouteExample carrierAmongRouteExample = new CarrierAmongRouteExample();
        	   carrierAmongRouteExample.createCriteria().andRouterIdEqualTo(s);
               carrierAmongRouteMapper.deleteByExample(carrierAmongRouteExample); 
    	    }     	   
    	    if(str!=null){
    	    	str=",其中班线"+str+"已进行审核操作，不可删除!";
    	    }else{
    	    	str="";
    	    }   
    	    //删除发货区域
    	    CarrierDeliverGoodsAreaExample carrierDeliverGoodsAreaExample=new CarrierDeliverGoodsAreaExample();
    	    carrierDeliverGoodsAreaExample.createCriteria().andRouterIdIn(carrierRouteIds);
    	    carrierDeliverGoodsAreaMapper.deleteByExample(carrierDeliverGoodsAreaExample);
    	    //删除收货区域
    	    CarrierPickUpgoodsAreaExample carrierPickUpgoodsAreaExample=new CarrierPickUpgoodsAreaExample();
    	    carrierPickUpgoodsAreaExample.createCriteria().andRouterIdIn(carrierRouteIds);
    	    carrierPickUpgoodsAreaMapper.deleteByExample(carrierPickUpgoodsAreaExample);
    	    //删除班线
    	    CarrierRouteExample carrierRouteExample=new CarrierRouteExample();
    	    carrierRouteExample.createCriteria().andRouterIdIn(carrierRouteIds);
    	    count= carrierRouteMapper.deleteByExample(carrierRouteExample);
    	    if(count>0){
    	        returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(carrierRouteNames, ",") + " ]班线"+str);
            }else{
        	    returnResult.setMsg("发生未知错误，班线信息删除失败");
            } 
          } else {
           returnResult.setMsg("没有可删除的数据");
        } 
        return returnResult;
   }
}

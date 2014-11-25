<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!-- 引入jstl解析标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 获取项目根path -->
<c:set var="ctx" value="${pageContext.request.contextPath}"/>  
 <form id="carrierAddRoute_form" method="post" style="padding:15px;width: 605px">
 <div title="基本信息" style="padding:15px">
   <fieldset style="padding:10px;" class="spinner">
			<legend>班线基本信息</legend>  
			<table class="formtable">
		<tr>
			<td>班次编号：</td>
			<td>
				<input type="hidden" name="routerId" value="${carrierRouteData.routerId}" />
			    <input type="text" class="easyui-validatebox spinner"  required="true" name="routeNumber" style="height:18px;width:180px" value="${carrierRouteData.routeNumber}" readonly="readonly" />
		 	</td>  
		 </tr>
		 <tr>
		    <td>班线名称：</td>
			<td><input class="easyui-validatebox spinner" required="true" 
			style="height:18px;width:180px"  name="routeName" value="${carrierRouteData.routeName}"/></td>
		    <td  style="padding-left:10px;">承运商：</td>
			<td>
				<input type="text" class="easyui-validatebox spinner" value="${carrierRouteData.carrierDisplay}" style="height:18px;width:180px" name="carrierDisplay"  readonly="readonly"/>
			</td> 
		</tr>
		<tr>
			<td>班线状态：</td>
			<td>
			 <input id="status" name="status" required="true"  style="height:18px;width:180px;" value="${carrierRouteData.status}"  style="height:18px;width:180px;"class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
			<td style="padding-left:10px;">班线类型：</td>
			<td>
				<input id="routeType" value="${carrierRouteData.routeType}" style="height:18px;width:180px;" name="routeType" required="true" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.routeType"/>
	    </tr>
			<tr>
			<td>班线起点：</td>
			<td>
			 	<input name="routeOrigin" onclick="getCoordinate(this)" style="height: 18px;border-color: #c3d9e0" value="${carrierRouteData.routeOrigin}"  autocomplete="off" type="text"
			 	  class="city_input  inputFocus proCityQueryAll proCitySelAll ">
         </td>
		    <td style="padding-left:10px;">发货站地址：</td>
			<td><input class="spinner" style="height:18px;width:180px" name="originAddress" value="${carrierRouteData.originAddress}"/></td>
		    
		</tr> 
		<tr>
		    <td >班线终点：</td>
			<td><input name="routeStop"  onclick="getCoordinate(this)"  style="height: 18px;border-color: #c3d9e0" autocomplete="off" type="text" value="${carrierRouteData.routeStop}"  class="city_input  inputFocus proCityQueryAll proCitySelAll ">
	      	</td>
		    <td style="padding-left:10px;">到货站地址：</td>
			<td><input class="spinner" style="height:18px;width:180px" name="stopAddress" value="${carrierRouteData.stopAddress}"/></td>
		 	
	    </tr>
	    <tr> <td> 联系电话：</td>
			<td>
				<input class="easyui-validatebox spinner" maxlength="11" value="${carrierRouteData.telephone}" required="true" style="height:18px;width:180px" name="telephone"  
			  	validType="customReg['(^(\d{3,4}-)?\d{7,8})$|(13[0-9]{9})','<fmt:message key="Route.telephone.illegal"/>']"
			  />
			</td>
			<td style="padding-left:10px;">发车时间：</td>
			<td> 
				<input class="easyui-validatebox spinner" required="true"
				 style="height:18px;width:100px" name="outTime" value="<fmt:formatDate value="${carrierRouteData.startofTime}" pattern="HH:mm"/>" 
				validType="customReg['^(20|21|22|23|[0-1]?\\d):[0-5]?\\d$','<fmt:message key="Route.outTime.illegal"/>']"
			 />格式:hh:mm
			</td>
		</tr>
	   	<tr>
	   	   <td>在途时间：</td>
			<td>
				<input class="easyui-validatebox spinner"  required="true"  maxlength="3"
				style="height:18px;width:155px" name="routeBytime" 
				 value="${carrierRouteData.routeBytime}"
				  	validType="customReg['^[0-9]+$','<fmt:message key="Route.routeBytime.illegal"/>']"
			 
				 />小时
			</td>
	   		<td style="padding-left:10px;">截止收货时间：</td>
			<td>
			   <input class="easyui-validatebox spinner" required="true" style="height:18px;width:100px"    value="<fmt:formatDate value="${carrierRouteData.ceaseTakeDeliveryTime}" pattern="HH:mm"/>" name="intTime" 
             validType="customReg['^(20|21|22|23|[0-1]?\\d):[0-5]?\\d$','<fmt:message key="Route.intTime.illegal"/>']"/>格式:hh:mm
			</td>  
	</tr>	
		<tr>
			<td>起步价：</td>
			<td>
			
				<input class=" easyui-validatebox spinner" required="true" style="height:18px;width:180px" name="startingPrice" 
				value="<fmt:formatNumber value="${carrierRouteData.startingPrice}" pattern="#,#00.00"/>"
				validType="customReg['^[0-9]+(\.[0-9]{2})?$','<fmt:message key="Route.startingPrice.illegal"/>']"
				 />
			</td>
			<td style="padding-left:10px;">重货价：</td>
			<td><input class="easyui-validatebox spinner" required="true" style="height:18px;width:140px" name="weightGoodsPrice" 
			value="<fmt:formatNumber value="${carrierRouteData.weightGoodsPrice}" pattern="#,#00.00"/>" 
			validType="customReg['^[0-9]+(\.[0-9]{2})?$','<fmt:message key="Route.weightGoodsPrice.illegal"/>']"
			/>元/公斤</td>
		</tr>
		<tr> 
			<td>车辆箱型：</td>
			<td><input id="boxType"  name="boxType" required="true" style="height:18px;width:180px"  value="${carrierRouteData.boxType}" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.boxType" /></td>
	        <td style="padding-left:10px;">轻货价：</td>
			<td>
				<input class="easyui-validatebox spinner" required="true" style="height:18px;width:140px" name="lightGoodsPrice"  
				value="<fmt:formatNumber value="${carrierRouteData.lightGoodsPrice}" pattern="#,#00.00"/>"
				validType="customReg['^[0-9]+(\.[0-9]{2})?$','<fmt:message key="Route.lightGoodsPrice.illegal"/>']"
				/>元/立方
			</td>
	   </tr>
		<tr>
			<td >班线里程：</td>
			<td><input class="easyui-validatebox spinner" required="true" style="height:18px;width:180px" name="mileage" value="${carrierRouteData.mileage}"  /></td>
		   <td style="padding-left:10px;">保险费：</td>
			<td><input class="  easyui-validatebox spinner" required="true" style="height:18px;width:165px" 
			name="premium" value="<fmt:formatNumber value="${carrierRouteData.premium}" pattern="#,#00.00"/>"
			validType="customReg['^[0-9]+(\.[0-9]{2})?$','<fmt:message key="Route.premium.illegal"/>']"
			 />元</td> 
		</tr>
		<tr>	
		    <td >预计提货时间：</td>
			<td>
				<input class="  easyui-validatebox spinner" required="true" style="height:18px;width:180px" name="extractGoodsTime" value="${carrierRouteData.extractGoodsTime}"/>
			</td>
			  <td style="padding-left:10px;">可定仓位(余)：</td>
			<td>
				<input class="easyui-validatebox spinner" required="true" style="height:18px;width:165px" name="availablePosition" 
				value="${carrierRouteData.availablePosition}"  validType="customReg['^[0-9]+(\.[0-9]{1})?$','<fmt:message key="Route.availablePosition.illegal"/>']"
				/>%
			</td>
	  </tr>  
		<tr>   
		     <td>备注：</td>
			 <td colspan="3"><textarea name="remark"  class=" easyui-validatebox spinner"  style="width:470px;height: 80px" >${carrierRouteData.remark}</textarea></td>
		</tr>  
	</table> 
		</fieldset> 
    </div>
   <div title="发货区域" style="padding:15px">
    	<fieldset id="user_mgr_user_form_connetGenfieldset" style="padding:20px;" class="spinner">
			<legend>发货物区域</legend>  
			<div id="tt" class="easyui-tabs" style="width:530px;height:350px;">   
			    <div title="区域1" style="padding:20px;">   
			     <input type="hidden" name="deliverList[0].deliverGoodsAreaId" value="${carrierRouteData.deliverList[0].deliverGoodsAreaId}" />
			     <font color="red">*区域1为默认区域，必填数据 </font>
			     <table  class="formtable"> 
						<tr>   
					     <td>发货区名：</td>
						 <td><input class="easyui-validatebox spinner"   required="true" 
						style="height:18px;width:150px"  name="deliverList[0].deliverName" value="${carrierRouteData.deliverList[0].deliverName}"/></td>
						   <td style="padding-left:20px;">价格(次)：</td>
						 <td >
						 	<input class="  easyui-validatebox spinner" required="true"   style="height:18px;width:150px" name="deliverList[0].price" value="<fmt:formatNumber value="${carrierRouteData.deliverList[0].price}" pattern="#,#00.00"/>"/>
						  </td>
					    </tr>  
					    <tr> 
					     <td >营业时间：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"  required="true"  style="height:18px;width:150px" name="deliverList[0].shopHours" value="${carrierRouteData.deliverList[0].shopHours}"/>
						  </td>  
					     <td style="padding-left:20px;">联系电话：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"  required="true"  style="height:18px;width:150px" name="deliverList[0].telephone" value="${carrierRouteData.deliverList[0].telephone}"/>
						  </td>
					    </tr>  
					    <tr>   
					     <td>站点经度：</td>
						 <td><input class="easyui-validatebox spinner"   required="true" 
					    	style="height:18px;width:150px"  name="deliverList[0].longitude" value="${carrierRouteData.deliverList[0].longitude}"/></td>
						   <td style="padding-left:20px;">站点纬度：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"  required="true"  style="height:18px;width:150px" name="deliverList[0].latitude" value="${carrierRouteData.deliverList[0].latitude}"/>
						  </td>
					    </tr> 
					     <tr>   
					        <td>业务内容：</td>
						    <td colspan="3">
						      <input class="easyui-validatebox spinner"  required="true"  style="height:18px;width:385px"  name="deliverList[0].serviceContent" value="${carrierRouteData.deliverList[0].serviceContent}"/>
						     </td>
						  </tr> 
					     <tr>   
					        <td>详细地址：</td>
						    <td colspan="3">
						       <input class="easyui-validatebox spinner"  required="true" style="height:18px;width:385px"  name="deliverList[0].address" value="${carrierRouteData.deliverList[0].address}"/>
						    </td>
						  </tr> 
					    <tr>   
						     <td>站点介绍：</td>
							 <td colspan="3"> 
						       <textarea class=" easyui-validatebox spinner"  style="width:385px;height: 120px;margin-top: 5px" name="deliverList[0].remark">${carrierRouteData.deliverList[0].remark}</textarea>
						     </td>
						</tr>  
					 </table>   
			    </div>   
			    <div title="区域2" style="padding:20px;">   
			     <input type="hidden" name="deliverList[1].deliverGoodsAreaId" value="${carrierRouteData.deliverList[1].deliverGoodsAreaId}" />
			     <table  class="formtable"> 
						<tr>   
					     <td>发货区名：</td>
						 <td><input class="easyui-validatebox spinner"   
						style="height:18px;width:150px"  name="deliverList[1].deliverName" value="${carrierRouteData.deliverList[1].deliverName}"/></td>
						   <td style="padding-left:20px;">价格(次)：</td>
						 <td >
						 	<input class="  easyui-validatebox spinner"  style="height:18px;width:150px" name="deliverList[1].price" value="<fmt:formatNumber value="${carrierRouteData.deliverList[1].price}" pattern="#,#00.00"/>"/>
						  </td>
					    </tr>  
					    <tr> 
					     <td >营业时间：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"   style="height:18px;width:150px" name="deliverList[1].shopHours" value="${carrierRouteData.deliverList[1].shopHours}"/>
						  </td>  
					     <td style="padding-left:20px;">联系电话：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"   style="height:18px;width:150px" name="deliverList[1].telephone" value="${carrierRouteData.deliverList[1].telephone}"/>
						  </td>
					    </tr>  
					    <tr>   
					     <td>站点经度：</td>
						 <td><input class="spinner"   
					    	style="height:18px;width:150px"  name="deliverList[1].longitude" value="${carrierRouteData.deliverList[1].longitude}"/></td>
						   <td style="padding-left:20px;">站点纬度：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"   style="height:18px;width:150px" name="deliverList[1].latitude" value="${carrierRouteData.deliverList[1].latitude}"/>
						  </td>
					    </tr> 
					     <tr>   
					        <td>业务内容：</td>
						    <td colspan="3">
						      <input class="spinner"  style="height:18px;width:385px"  name="deliverList[1].serviceContent" value="${carrierRouteData.deliverList[1].serviceContent}"/>
						     </td>
						  </tr> 
					     <tr>   
					        <td>详细地址：</td>
						    <td colspan="3">
						       <input class="spinner" style="height:18px;width:385px"  name="deliverList[1].address" value="${carrierRouteData.deliverList[1].address}"/>
						    </td>
						  </tr> 
					    <tr>   
						     <td>站点介绍：</td>
							 <td colspan="3"> 
						       <textarea class=" easyui-validatebox spinner"  style="width:385px;height: 120px;margin-top: 5px" name="deliverList[1].remark">${carrierRouteData.deliverList[1].remark}</textarea>
						     </td>
						</tr>  
					 </table>   
			    </div>   
			     <div title="区域3" style="padding:20px;">   
			     <input type="hidden" name="deliverList[2].deliverGoodsAreaId" value="${carrierRouteData.deliverList[2].deliverGoodsAreaId}" />
			     <table  class="formtable"> 
						<tr>   
					     <td>发货区名：</td>
						 <td><input class="easyui-validatebox spinner"   
						style="height:18px;width:150px"  name="deliverList[2].deliverName" value="${carrierRouteData.deliverList[2].deliverName}"/></td>
						   <td style="padding-left:20px;">价格(次)：</td>
						 <td >
						 	<input class="  easyui-validatebox spinner"  style="height:18px;width:150px" name="deliverList[2].price" value="<fmt:formatNumber value="${carrierRouteData.deliverList[2].price}" pattern="#,#00.00"/>"/>
						  </td>
					    </tr>  
					    <tr> 
					     <td >营业时间：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"   style="height:18px;width:150px" name="deliverList[2].shopHours" value="${carrierRouteData.deliverList[2].shopHours}"/>
						  </td>  
					     <td style="padding-left:20px;">联系电话：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"   style="height:18px;width:150px" name="deliverList[2].telephone" value="${carrierRouteData.deliverList[2].telephone}"/>
						  </td>
					    </tr>  
					    <tr>   
					     <td>站点经度：</td>
						 <td><input class="spinner"   
					    	style="height:18px;width:150px"  name="deliverList[2].longitude" value="${carrierRouteData.deliverList[2].longitude}"/></td>
						   <td style="padding-left:20px;">站点纬度：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"   style="height:18px;width:150px" name="deliverList[2].latitude" value="${carrierRouteData.deliverList[2].latitude}"/>
						  </td>
					    </tr> 
					     <tr>   
					        <td>业务内容：</td>
						    <td colspan="3">
						      <input class="spinner"  style="height:18px;width:385px"  name="deliverList[2].serviceContent" value="${carrierRouteData.deliverList[2].serviceContent}"/>
						     </td>
						  </tr> 
					     <tr>   
					        <td>详细地址：</td>
						    <td colspan="3">
						       <input class="spinner" style="height:18px;width:385px"  name="deliverList[2].address" value="${carrierRouteData.deliverList[2].address}"/>
						    </td>
						  </tr> 
					    <tr>   
						     <td>站点介绍：</td>
							 <td colspan="3"> 
						       <textarea class=" easyui-validatebox spinner"  style="width:385px;height: 120px;margin-top: 5px" name="deliverList[2].remark">${carrierRouteData.deliverList[2].remark}</textarea>
						     </td>
						</tr>  
					 </table>   
			    </div>   
			     <div title="区域4" style="padding:20px;">   
			     <input type="hidden" name="deliverList[3].deliverGoodsAreaId" value="${carrierRouteData.deliverList[3].deliverGoodsAreaId}" />
			     <table  class="formtable"> 
						<tr>   
					     <td>发货区名：</td>
						 <td><input class="easyui-validatebox spinner"   
						style="height:18px;width:150px"  name="deliverList[3].deliverName" value="${carrierRouteData.deliverList[3].deliverName}"/></td>
						   <td style="padding-left:20px;">价格(次)：</td>
						 <td >
						 	<input class="  easyui-validatebox spinner"  style="height:18px;width:150px" name="deliverList[3].price" value="<fmt:formatNumber value="${carrierRouteData.deliverList[3].price}" pattern="#,#00.00"/>"/>
						  </td>
					    </tr>  
					    <tr> 
					     <td >营业时间：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"   style="height:18px;width:150px" name="deliverList[3].shopHours" value="${carrierRouteData.deliverList[3].shopHours}"/>
						  </td>  
					     <td style="padding-left:20px;">联系电话：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"   style="height:18px;width:150px" name="deliverList[3].telephone" value="${carrierRouteData.deliverList[3].telephone}"/>
						  </td>
					    </tr>  
					    <tr>   
					     <td>站点经度：</td>
						 <td><input class="spinner"   
					    	style="height:18px;width:150px"  name="deliverList[3].longitude" value="${carrierRouteData.deliverList[3].longitude}"/></td>
						   <td style="padding-left:20px;">站点纬度：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"   style="height:18px;width:150px" name="deliverList[3].latitude" value="${carrierRouteData.deliverList[3].latitude}"/>
						  </td>
					    </tr> 
					     <tr>   
					        <td>业务内容：</td>
						    <td colspan="3">
						      <input class="spinner"  style="height:18px;width:385px"  name="deliverList[3].serviceContent" value="${carrierRouteData.deliverList[3].serviceContent}"/>
						     </td>
						  </tr> 
					     <tr>   
					        <td>详细地址：</td>
						    <td colspan="3">
						       <input class="spinner" style="height:18px;width:385px"  name="deliverList[3].address" value="${carrierRouteData.deliverList[3].address}"/>
						    </td>
						  </tr> 
					    <tr>   
						     <td>站点介绍：</td>
							 <td colspan="3"> 
						       <textarea class=" easyui-validatebox spinner"  style="width:385px;height: 120px;margin-top: 5px" name="deliverList[3].remark">${carrierRouteData.deliverList[3].remark}</textarea>
						     </td>
						</tr>  
					 </table>   
			    </div>  
			     <div title="区域5" style="padding:20px;">   
			     <input type="hidden" name="deliverList[4].deliverGoodsAreaId" value="${carrierRouteData.deliverList[4].deliverGoodsAreaId}" />
			     <table  class="formtable"> 
						<tr>   
					     <td>发货区名：</td>
						 <td><input class="easyui-validatebox spinner"   
						style="height:18px;width:150px"  name="deliverList[4].deliverName" value="${carrierRouteData.deliverList[4].deliverName}"/></td>
						   <td style="padding-left:20px;">价格(次)：</td>
						 <td >
						 	<input class="  easyui-validatebox spinner"  style="height:18px;width:150px" name="deliverList[4].price" value="<fmt:formatNumber value="${carrierRouteData.deliverList[4].price}" pattern="#,#00.00"/>"/>
						  </td>
					    </tr>   
					    <tr> 
					     <td >营业时间：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"   style="height:18px;width:150px" name="deliverList[4].shopHours" value="${carrierRouteData.deliverList[4].shopHours}"/>
						  </td>  
					     <td style="padding-left:20px;">联系电话：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"   style="height:18px;width:150px" name="deliverList[4].telephone" value="${carrierRouteData.deliverList[4].telephone}"/>
						  </td>
					    </tr>  
					    <tr>   
					     <td>站点经度：</td>
						 <td><input class="spinner"   
					    	style="height:18px;width:150px"  name="deliverList[4].longitude" value="${carrierRouteData.deliverList[4].longitude}"/></td>
						   <td style="padding-left:20px;">站点纬度：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"   style="height:18px;width:150px" name="deliverList[4].latitude" value="${carrierRouteData.deliverList[4].latitude}"/>
						  </td>
					    </tr> 
					     <tr>   
					        <td>业务内容：</td>
						    <td colspan="3">
						      <input class="spinner"  style="height:18px;width:385px"  name="deliverList[4].serviceContent" value="${carrierRouteData.deliverList[4].serviceContent}"/>
						     </td>
						  </tr> 
					     <tr>   
					        <td>详细地址：</td>
						    <td colspan="3">
						       <input class="spinner" style="height:18px;width:385px"  name="deliverList[4].address" value="${carrierRouteData.deliverList[4].address}"/>
						    </td>
						  </tr> 
					    <tr>   
						     <td>站点介绍：</td>
							 <td colspan="3"> 
						       <textarea class=" easyui-validatebox spinner"  style="width:385px;height: 120px;margin-top: 5px" name="deliverList[4].remark">${carrierRouteData.deliverList[4].remark}</textarea>
						     </td>
						</tr>  
					 </table>   
			    </div>  
		</div>   
		<a href="http://www.gpsspg.com/maps.htm" target=_blank style='color:blue'>查询经纬度</a>（注：请复制百度经纬度，正确填写站点的经度和纬度）
		</fieldset> 
		
    </div>
    
    <div title="提货区域" style="padding:15px"> 
		<fieldset id="user_mgr_user_form_connetGenfieldset" style="padding:20px;" class="spinner">
			<legend>提货物区域</legend> 
			<div id="tt" class="easyui-tabs" style="width:530px;height:350px;">   
			    <div title="区域1" style="padding:20px;">
			       <input type="hidden" name="pickUpList[0].pickUpGoodsAreaId" value="${carrierRouteData.pickUpList[0].pickUpGoodsAreaId}" />
			      <font color="red">*区域1为默认区域，必填数据 </font>
			       <table  class="formtable"> 
						<tr>   
					     <td>提货区名：</td>
						 <td>
						    <input class="easyui-validatebox spinner" required="true"   style="height:18px;width:150px"  name="pickUpList[0].deliverName" value="${carrierRouteData.pickUpList[0].deliverName}"/>
						 </td>
						   <td style="padding-left:20px;">价格(次)：</td>
						 <td >
						 	<input class="  easyui-validatebox spinner" required="true"   style="height:18px;width:150px" name="pickUpList[0].price"  value="<fmt:formatNumber value="${carrierRouteData.pickUpList[0].price}" pattern="#,#00.00"/>"/>
						  </td>
					    </tr>  
					    <tr> 
					     <td >营业时间：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"  required="true"   style="height:18px;width:150px" name="pickUpList[0].shopHours" value="${carrierRouteData.pickUpList[0].shopHours}"/>
						  </td>  
					     <td style="padding-left:20px;">联系电话：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"  required="true"   style="height:18px;width:150px" name="pickUpList[0].telephone" value="${carrierRouteData.pickUpList[0].telephone}"/>
						  </td>
					    </tr>  
					    <tr>   
					     <td>站点经度：</td>
						 <td><input class="easyui-validatebox spinner"   required="true"  
					    	style="height:18px;width:150px"  name="pickUpList[0].longitude" value="${carrierRouteData.pickUpList[0].longitude}"/></td>
						   <td style="padding-left:20px;">站点纬度：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"  required="true"    style="height:18px;width:150px" name="pickUpList[0].latitude"  value="${carrierRouteData.pickUpList[0].latitude}"/>
						  </td>
					    </tr> 
					     <tr>   
					        <td>业务内容：</td>
						    <td colspan="3">
						      <input class="easyui-validatebox spinner"   required="true"   style="height:18px;width:385px"  name="pickUpList[0].serviceContent" value="${carrierRouteData.pickUpList[0].serviceContent}"/>
						     </td>
						  </tr> 
					     <tr>   
					        <td>详细地址：</td>
						    <td colspan="3">
						       <input class="easyui-validatebox spinner"  required="true"   style="height:18px;width:385px"  name="pickUpList[0].address" value="${carrierRouteData.pickUpList[0].address}"/>
						    </td>
						  </tr> 
					    <tr>   
						     <td>站点介绍：</td>
							 <td colspan="3"> 
						       <textarea class=" easyui-validatebox spinner"  style="width:385px;height: 120px;margin-top: 5px" name="pickUpList[0].remark">${carrierRouteData.pickUpList[0].remark}</textarea>
						     </td>
						</tr>  
					 </table>  
			    </div>   
			     <div title="区域2" style="padding:20px;">
			       <input type="hidden" name="pickUpList[1].pickUpGoodsAreaId" value="${carrierRouteData.pickUpList[1].pickUpGoodsAreaId}" />
			       <table  class="formtable"> 
						<tr>   
					     <td>提货区名：</td>
						 <td>
						    <input class="easyui-validatebox spinner" style="height:18px;width:150px"  name="pickUpList[1].deliverName" value="${carrierRouteData.pickUpList[1].deliverName}"/>
						 </td>
						   <td style="padding-left:20px;">价格(次)：</td>
						 <td >
						 	<input class="  easyui-validatebox spinner"  style="height:18px;width:150px" name="pickUpList[1].price"  value="<fmt:formatNumber value="${carrierRouteData.pickUpList[1].price}" pattern="#,#00.00"/>"/>
						  </td>
					    </tr>  
					    <tr> 
					     <td >营业时间：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"   style="height:18px;width:150px" name="pickUpList[1].shopHours" value="${carrierRouteData.pickUpList[1].shopHours}"/>
						  </td>  
					     <td style="padding-left:20px;">联系电话：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"   style="height:18px;width:150px" name="pickUpList[1].telephone" value="${carrierRouteData.pickUpList[1].telephone}"/>
						  </td>
					    </tr>  
					    <tr>   
					     <td>站点经度：</td>
						 <td><input class="spinner"   
					    	style="height:18px;width:150px"  name="pickUpList[1].longitude" value="${carrierRouteData.pickUpList[1].longitude}"/></td>
						   <td style="padding-left:20px;">站点纬度：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"   style="height:18px;width:150px" name="pickUpList[1].latitude"  value="${carrierRouteData.pickUpList[1].latitude}"/>
						  </td>
					    </tr> 
					     <tr>   
					        <td>业务内容：</td>
						    <td colspan="3">
						      <input class="spinner"  style="height:18px;width:385px"  name="pickUpList[1].serviceContent" value="${carrierRouteData.pickUpList[1].serviceContent}"/>
						     </td>
						  </tr> 
					     <tr>   
					        <td>详细地址：</td>
						    <td colspan="3">
						       <input class="spinner" style="height:18px;width:385px"  name="pickUpList[1].address" value="${carrierRouteData.pickUpList[1].address}"/>
						    </td>
						  </tr> 
					    <tr>   
						     <td>站点介绍：</td>
							 <td colspan="3"> 
						       <textarea class=" easyui-validatebox spinner"  style="width:385px;height: 120px;margin-top: 5px" name="pickUpList[1].remark">${carrierRouteData.pickUpList[1].remark}</textarea>
						     </td>
						</tr>  
					 </table>  
			    </div>   
			    <div title="区域3" style="padding:20px;">
			       <input type="hidden" name="pickUpList[2].pickUpGoodsAreaId" value="${carrierRouteData.pickUpList[2].pickUpGoodsAreaId}" />
			       <table  class="formtable"> 
						<tr>   
					     <td>提货区名：</td>
						 <td>
						    <input class="easyui-validatebox spinner" style="height:18px;width:150px"  name="pickUpList[2].deliverName" value="${carrierRouteData.pickUpList[2].deliverName}"/>
						 </td>
						   <td style="padding-left:20px;">价格(次)：</td>
						 <td >
						 	<input class="  easyui-validatebox spinner"  style="height:18px;width:150px" name="pickUpList[2].price"  value="<fmt:formatNumber value="${carrierRouteData.pickUpList[2].price}" pattern="#,#00.00"/>"/>
						  </td>
					    </tr>  
					    <tr> 
					     <td >营业时间：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"   style="height:18px;width:150px" name="pickUpList[2].shopHours" value="${carrierRouteData.pickUpList[2].shopHours}"/>
						  </td>  
					     <td style="padding-left:20px;">联系电话：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"   style="height:18px;width:150px" name="pickUpList[2].telephone" value="${carrierRouteData.pickUpList[2].telephone}"/>
						  </td>
					    </tr>  
					    <tr>   
					     <td>站点经度：</td>
						 <td><input class="spinner"   
					    	style="height:18px;width:150px"  name="pickUpList[2].longitude" value="${carrierRouteData.pickUpList[2].longitude}"/></td>
						   <td style="padding-left:20px;">站点纬度：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"   style="height:18px;width:150px" name="pickUpList[2].latitude"  value="${carrierRouteData.pickUpList[2].latitude}"/>
						  </td>
					    </tr> 
					     <tr>   
					        <td>业务内容：</td>
						    <td colspan="3">
						      <input class="spinner"  style="height:18px;width:385px"  name="pickUpList[2].serviceContent" value="${carrierRouteData.pickUpList[2].serviceContent}"/>
						     </td>
						  </tr> 
					     <tr>   
					        <td>详细地址：</td>
						    <td colspan="3">
						       <input class="spinner" style="height:18px;width:385px"  name="pickUpList[2].address" value="${carrierRouteData.pickUpList[2].address}"/>
						    </td>
						  </tr> 
					    <tr>   
						     <td>站点介绍：</td>
							 <td colspan="3"> 
						       <textarea class=" easyui-validatebox spinner"  style="width:385px;height: 120px;margin-top: 5px" name="pickUpList[2].remark">${carrierRouteData.pickUpList[2].remark}</textarea>
						     </td>
						</tr>  
					 </table>  
			    </div> 
			    <div title="区域4" style="padding:20px;">
			       <input type="hidden" name="pickUpList[3].pickUpGoodsAreaId" value="${carrierRouteData.pickUpList[3].pickUpGoodsAreaId}" />
			       <table  class="formtable"> 
						<tr>   
					     <td>提货区名：</td>
						 <td>
						    <input class="easyui-validatebox spinner" style="height:18px;width:150px"  name="pickUpList[3].deliverName" value="${carrierRouteData.pickUpList[3].deliverName}"/>
						 </td>
						   <td style="padding-left:20px;">价格(次)：</td>
						 <td >
						 	<input class="  easyui-validatebox spinner"  style="height:18px;width:150px" name="pickUpList[3].price"  value="<fmt:formatNumber value="${carrierRouteData.pickUpList[3].price}" pattern="#,#00.00"/>"/>
						  </td>
					    </tr>  
					    <tr> 
					     <td >营业时间：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"   style="height:18px;width:150px" name="pickUpList[3].shopHours" value="${carrierRouteData.pickUpList[3].shopHours}"/>
						  </td>  
					     <td style="padding-left:20px;">联系电话：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"   style="height:18px;width:150px" name="pickUpList[3].telephone" value="${carrierRouteData.pickUpList[3].telephone}"/>
						  </td>
					    </tr>  
					    <tr>   
					     <td>站点经度：</td>
						 <td><input class="spinner"   
					    	style="height:18px;width:150px"  name="pickUpList[3].longitude" value="${carrierRouteData.pickUpList[3].longitude}"/></td>
						   <td style="padding-left:20px;">站点纬度：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"   style="height:18px;width:150px" name="pickUpList[3].latitude"  value="${carrierRouteData.pickUpList[3].latitude}"/>
						  </td>
					    </tr> 
					     <tr>   
					        <td>业务内容：</td>
						    <td colspan="3">
						      <input class="spinner"  style="height:18px;width:385px"  name="pickUpList[3].serviceContent" value="${carrierRouteData.pickUpList[3].serviceContent}"/>
						     </td>
						  </tr> 
					     <tr>   
					        <td>详细地址：</td>
						    <td colspan="3">
						       <input class="spinner" style="height:18px;width:385px"  name="pickUpList[3].address" value="${carrierRouteData.pickUpList[3].address}"/>
						    </td>
						  </tr> 
					    <tr>   
						     <td>站点介绍：</td>
							 <td colspan="3"> 
						       <textarea class=" easyui-validatebox spinner"  style="width:385px;height: 120px;margin-top: 5px" name="pickUpList[3].remark">${carrierRouteData.pickUpList[3].remark}</textarea>
						     </td>
						</tr>  
					 </table>  
			    </div> 
			    <div title="区域5" style="padding:20px;">
			       <input type="hidden" name="pickUpList[4].pickUpGoodsAreaId" value="${carrierRouteData.pickUpList[4].pickUpGoodsAreaId}" />
			       <table  class="formtable"> 
						<tr>   
					     <td>提货区名：</td>
						 <td>
						    <input class="easyui-validatebox spinner" style="height:18px;width:150px"  name="pickUpList[4].deliverName" value="${carrierRouteData.pickUpList[4].deliverName}"/>
						 </td>
						   <td style="padding-left:20px;">价格(次)：</td>
						 <td >
						 	<input class="  easyui-validatebox spinner"  style="height:18px;width:150px" name="pickUpList[4].price"  value="<fmt:formatNumber value="${carrierRouteData.pickUpList[4].price}" pattern="#,#00.00"/>"/>
						  </td>
					    </tr>  
					    <tr> 
					     <td >营业时间：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"   style="height:18px;width:150px" name="pickUpList[4].shopHours" value="${carrierRouteData.pickUpList[4].shopHours}"/>
						  </td>  
					     <td style="padding-left:20px;">联系电话：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"   style="height:18px;width:150px" name="pickUpList[4].telephone" value="${carrierRouteData.pickUpList[4].telephone}"/>
						  </td>
					    </tr>  
					    <tr>   
					     <td>站点经度：</td>
						 <td><input class="spinner"   
					    	style="height:18px;width:150px"  name="pickUpList[4].longitude" value="${carrierRouteData.pickUpList[4].longitude}"/></td>
						   <td style="padding-left:20px;">站点纬度：</td>
						  <td >
						 	<input class="  easyui-validatebox spinner"   style="height:18px;width:150px" name="pickUpList[4].latitude"  value="${carrierRouteData.pickUpList[4].latitude}"/>
						  </td>
					    </tr> 
					     <tr>   
					        <td>业务内容：</td>
						    <td colspan="3">
						      <input class="spinner"  style="height:18px;width:385px"  name="pickUpList[4].serviceContent" value="${carrierRouteData.pickUpList[4].serviceContent}"/>
						     </td>
						  </tr> 
					     <tr>   
					        <td>详细地址：</td>
						    <td colspan="3">
						       <input class="spinner" style="height:18px;width:385px"  name="pickUpList[4].address" value="${carrierRouteData.pickUpList[4].address}"/>
						    </td>
						  </tr> 
					    <tr>   
						     <td>站点介绍：</td>
							 <td colspan="3"> 
						       <textarea class=" easyui-validatebox spinner"  style="width:385px;height: 120px;margin-top: 5px" name="pickUpList[4].remark">${carrierRouteData.pickUpList[4].remark}</textarea>
						     </td>
						</tr>  
					 </table>  
			    </div>
			</div>  
		 <a href="http://www.gpsspg.com/maps.htm" target=_blank style='color:blue'>查询经纬度</a>（注：请复制百度经纬度，正确填写站点的经度和纬度）
	 	</fieldset>
    </div> 
</form>   


  <!--弹出省省市-->
	<div id="provinceCityAll" class="provinceCityAll" style="z-index:20;position:absolute;">
	  <div class="tabsArea clearfix">
	    <ul class="">
	      <li><a href="javascript:" class="current" tb="hotCityAll">热门城市</a></li>
	      <li><a href="javascript:" tb="provinceAll">省份</a></li>
	      <li><a href="javascript:" tb="cityAll" id="cityAll">城市</a></li>
	      <li><a href="javascript:" tb="countyAll" id="countyAll">区县</a></li>
	    </ul>
	  </div>
	  <div class="con">
	    <div class="hotCityAll invis">
	      <div class="pre"><a></a></div>
	      <div class="list">
	        <ul>
	          <!-- 					<li><a href="javascript:"  class="current">南京</a></li> -->
	        </ul>
	      </div>
	      <div class="next"><a class="can"></a></div>
	    </div>
	    <div class="provinceAll invis">
	      <div class="pre"><a></a></div>
	      <div class="list">
	        <ul>
	          <!-- 					<li><a href="javascript:"  class="current">江西省</a></li> -->
	        </ul>
	      </div>
	      <div class="next"><a class="can"></a></div>
	    </div>
	    <div class="cityAll invis">
	      <div class="pre"><a></a></div>
	      <div class="list">
	        <ul>
	          <!-- 					<li><a href="javascript:"  class="current">南京</a></li> -->
	        </ul>
	      </div>
	      <div class="next"><a class="can"></a></div>
	    </div>
	    <div class="countyAll invis">
	      <div class="pre"><a></a></div>
	      <div class="list">
	        <ul>
	        </ul>
	      </div>
	      <div class="next"><a class="can"></a></div>
	    </div>
	  </div>
	</div>  
	
<script src="${ctx}/resources/area/js/public.js"></script> 
<script type="text/javascript">  
	var l1;
	var t1;
	//获取输入框的坐标
	function getCoordinate(te){ 
	  	var start =$(te).position(); 
		l1 = start.left; 
		t1 = start.top;   
	 };  
	 //地区选择器的位置控制
	$(".proCitySelAll").click(function(event) { 
		 $("#provinceCityAll").css("top", t1+30).css("left", l1).toggle();
	}); 
 
	$('#carrierAddRoute_form').tabs({
		border:true,
		onSelect:function(){
			$("div").remove(".validatebox-tip");//解决关闭窗体偶尔出现验证条bug
		}
	});   
</script>  
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
				  <input type="text" class="easyui-validatebox spinner"  required="true" name="routeNumber" style="height:18px;width:180px" value="${routeNub}" readonly="readonly" />
			</td>  
		 </tr>
		 <tr>
		    <td>班线名称：</td>
			<td><input class="easyui-validatebox spinner" required="true" 
			style="height:18px;width:180px"  name="routeName"/></td>
		    <td  style="padding-left:10px;">承运商：</td>
			<td>
				<input type="text" class="easyui-validatebox spinner" value="${carrierMember}" style="height:18px;width:180px" name="carrierDisplay"  readonly="readonly"/>
			</td> 
		</tr>
		<tr>
			<td>班线状态：</td>
			<td>
			 <input id="status" name="status" required="true"  style="height:18px;width:180px;"class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
			<td style="padding-left:10px;">班线类型：</td>
			<td>
				<input id="routeType" style="height:18px;width:180px;" name="routeType" required="true" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.routeType"/>
	    </tr>
			<tr>
			<td>班线起点：</td>
			<td>
			 	<input name="routeOrigin" onclick="getCoordinate(this)" style="height: 18px;border-color: #c3d9e0" autocomplete="off" type="text"
			 	  class="city_input  inputFocus proCityQueryAll proCitySelAll ">
         </td>
		    <td style="padding-left:10px;">发货站地址：</td>
			<td><input class="spinner" style="height:18px;width:180px" name="originAddress"/></td>
		    
		</tr> 
		<tr>
		    <td >班线终点：</td>
			<td><input name="routeStop" onclick="getCoordinate(this)" style="height: 18px;border-color: #c3d9e0" autocomplete="off" type="text"  class="city_input  inputFocus proCityQueryAll proCitySelAll ">
	      	</td>
		    <td style="padding-left:10px;">到货站地址：</td>
			<td><input class="spinner" style="height:18px;width:180px" name="stopAddress"/></td>
		 	
	    </tr>
	    <tr> <td> 联系电话：</td>
			<td>
				<input class="easyui-validatebox spinner" maxlength="11" required="true" style="height:18px;width:180px" name="telephone"  
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
			<table  class="formtable"> 
			<tr>   
		     <td>发货区域1：</td>
			 <td><input class="spinner"   
			style="height:18px;width:180px"  name="deliverList[0].deliverName"/></td>
			   <td style="padding-left:20px;">价格(次)：</td>
			 <td >
			 	<input class="  easyui-validatebox spinner"   style="height:18px;width:180px" name="deliverList[0].price" />
			  </td>
		    </tr> 
		    <tr>   
		     <td>详细地址：</td>
			 <td><input class="spinner"   
			style="height:18px;width:180px"  name="deliverList[0].address"/></td>
			   <td style="padding-left:20px;">联系电话：</td>
			 <td >
			 	<input class="  easyui-validatebox spinner"   style="height:18px;width:180px" name="deliverList[0].telephone" />
			  </td>
		    </tr>  
			<tr>   
		     <td>发货区域2：</td>
			 <td><input class="easyui-validatebox spinner"   
			style="height:18px;width:180px"  name="deliverList[1].deliverName"/></td>
			   <td style="padding-left:20px;">价格(次)：</td>
			 <td >
			 	<input class="  easyui-validatebox spinner"   style="height:18px;width:180px" name="deliverList[1].price" />
			  </td>
		  </tr>
		  <tr>   
		     <td>详细地址：</td>
			 <td><input class="spinner"   
			style="height:18px;width:180px"  name="deliverList[1].address"/></td>
			   <td style="padding-left:20px;">联系电话：</td>
			 <td >
			 	<input class="  easyui-validatebox spinner"   style="height:18px;width:180px" name="deliverList[1].telephone" />
			  </td>
		    </tr> 
		  <tr>   
		     <td>发货区域3：</td>
			 <td><input class="easyui-validatebox spinner"  
			style="height:18px;width:180px"  name="deliverList[2].deliverName"/></td>
			   <td style="padding-left:20px;">价格(次)：</td>
			 <td >
			 	<input class="  easyui-validatebox spinner"   style="height:18px;width:180px" name="deliverList[2].price" />
			  </td>
		  </tr>
		  <tr>   
		     <td>详细地址：</td>
			 <td><input class="spinner"   
			style="height:18px;width:180px"  name="deliverList[2].address"/></td>
			   <td style="padding-left:20px;">联系电话：</td>
			 <td >
			 	<input class="  easyui-validatebox spinner"   style="height:18px;width:180px" name="deliverList[2].telephone" />
			  </td>
		    </tr> 
		  <tr>   
		     <td>发货区域4：</td>
			 <td><input class="easyui-validatebox spinner"  
			style="height:18px;width:180px"  name="deliverList[3].deliverName"/></td>
			   <td style="padding-left:20px;">价格(次)：</td>
			 <td >
			 	<input class="  easyui-validatebox spinner"   style="height:18px;width:180px" name="deliverList[3].price" />
			  </td>
		  </tr>
		  <tr>   
		     <td>详细地址：</td>
			 <td><input class="spinner"   
			style="height:18px;width:180px"  name="deliverList[3].address"/></td>
			   <td style="padding-left:20px;">联系电话：</td>
			 <td >
			 	<input class="  easyui-validatebox spinner"   style="height:18px;width:180px" name="deliverList[3].telephone" />
			  </td>
		    </tr> 
		  <tr>   
		     <td>发货区域5：</td>
			 <td><input class="easyui-validatebox spinner"   
			style="height:18px;width:180px"  name="deliverList[4].deliverName"/></td>
			   <td style="padding-left:20px;">价格(次)：</td>
			 <td >
			 	<input class="  easyui-validatebox spinner"   style="height:18px;width:180px" name="deliverList[4].price" />
			  </td>
		  </tr>
		  <tr>   
		     <td>详细地址：</td>
			 <td><input class="spinner"   
		    	style="height:18px;width:180px"  name="deliverList[4].address"/></td>
			   <td style="padding-left:20px;">联系电话：</td>
			  <td >
			 	<input class="  easyui-validatebox spinner"   style="height:18px;width:180px" name="deliverList[4].telephone" />
			  </td>
		    </tr> 
			</table>
		</fieldset>
		
    </div>
    
    <div title="提货区域" style="padding:15px"> 
		
		<fieldset id="user_mgr_user_form_connetGenfieldset" style="padding:20px;" class="spinner">
			<legend>提货物区域</legend>  
			<table  class="formtable"> 
			<tr>   
		     <td>提货区域1：</td>
			 <td><input class="easyui-validatebox spinner"   
			style="height:18px;width:180px"  name="pickUpList[0].deliverName"/></td>
			   <td style="padding-left:20px;">价格(次)：</td>
			 <td >
			 	<input class="  easyui-validatebox spinner"  style="height:18px;width:180px" name="pickUpList[0].price" />
			  </td>
		    </tr>  
		    <tr>   
		     <td>详细地址：</td>
			 <td><input class="spinner"   
		    	style="height:18px;width:180px"  name="pickUpList[0].address"/></td>
			   <td style="padding-left:20px;">联系电话：</td>
			  <td >
			 	<input class="  easyui-validatebox spinner"   style="height:18px;width:180px" name="pickUpList[0].telephone" />
			  </td>
		    </tr> 
			<tr>   
		     <td>提货区域2：</td>
			 <td><input class="easyui-validatebox spinner"  
			style="height:18px;width:180px"  name="pickUpList[1].deliverName"/></td>
			   <td style="padding-left:20px;">价格(次)：</td>
			 <td >
			 	<input class="  easyui-validatebox spinner"  style="height:18px;width:180px" name="pickUpList[1].price" />
			  </td>
		  </tr>
		  <tr>   
		     <td>详细地址：</td>
			 <td><input class="spinner"   
		    	style="height:18px;width:180px"  name="pickUpList[1].address"/></td>
			   <td style="padding-left:20px;">联系电话：</td>
			  <td >
			 	<input class="  easyui-validatebox spinner"   style="height:18px;width:180px" name="pickUpList[1].telephone" />
			  </td>
		    </tr> 
		  <tr>   
		     <td>提货区域3：</td>
			 <td><input class="easyui-validatebox spinner"  
			style="height:18px;width:180px"  name="pickUpList[2].deliverName"/></td>
			   <td style="padding-left:20px;">价格(次)：</td>
			 <td >
			 	<input class="  easyui-validatebox spinner" style="height:18px;width:180px" name="pickUpList[2].price" />
			  </td>
		  </tr>
		  <tr>   
		     <td>详细地址：</td>
			 <td><input class="spinner"   
		    	style="height:18px;width:180px"  name="pickUpList[2].address"/></td>
			   <td style="padding-left:20px;">联系电话：</td>
			  <td >
			 	<input class="  easyui-validatebox spinner"   style="height:18px;width:180px" name="pickUpList[2].telephone" />
			  </td>
		    </tr> 
		  <tr>   
		     <td>提货区域4：</td>
			 <td><input class="easyui-validatebox spinner" 
			style="height:18px;width:180px"  name="pickUpList[3].deliverName"/></td>
			   <td style="padding-left:20px;">价格(次)：</td>
			 <td >
			 	<input class="  easyui-validatebox spinner"  style="height:18px;width:180px" name="pickUpList[3].price" />
			  </td>
		  </tr>
		  <tr>   
		     <td>详细地址：</td>
			 <td><input class="spinner"   
		    	style="height:18px;width:180px"  name="pickUpList[3].address"/></td>
			   <td style="padding-left:20px;">联系电话：</td>
			  <td >
			 	<input class="  easyui-validatebox spinner"   style="height:18px;width:180px" name="pickUpList[3].telephone" />
			  </td>
		    </tr> 
		  <tr>   
		     <td>提货区域5：</td>
			 <td><input class="easyui-validatebox spinner"  
			style="height:18px;width:180px"  name="pickUpList[4].deliverName"/></td>
			   <td style="padding-left:20px;">价格(次)：</td>
			 <td >
			 	<input class="easyui-validatebox spinner"  style="height:18px;width:180px" name="pickUpList[4].price"/>
			  </td>
		  </tr>
		  <tr>   
		     <td>详细地址：</td>
			 <td><input class="spinner"   
		    	style="height:18px;width:180px"  name="pickUpList[4].address"/></td>
			   <td style="padding-left:20px;">联系电话：</td>
			  <td >
			 	<input class="  easyui-validatebox spinner"   style="height:18px;width:180px" name="pickUpList[4].telephone" />
			  </td>
		    </tr> 
			</table>
		</fieldset>
    </div>
    
    
    
</form>   


  <!--弹出省省市-->
	<div id="province" class="provinceCityAll" style="z-index:20;position:absolute;">
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
	//获取坐标
	function getCoordinate(te){ 
	  	var start =$(te).position(); 
		l1 = start.left; 
		t1 = start.top;   
	 };  
	 //地区选择器的位置控制
	$(".proCitySelAll").click(function(event) { 
		 $("#province").css("top", t1+30).css("left", l1).toggle(); 
	}); 
 
	$('#carrierAddRoute_form').tabs({
		border:true,
		onSelect:function(){
			$("div").remove(".validatebox-tip");//解决关闭窗体偶尔出现验证条bug
		}
	});   
</script>  
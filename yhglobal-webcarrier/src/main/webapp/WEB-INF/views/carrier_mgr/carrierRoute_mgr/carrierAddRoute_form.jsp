<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!-- 引入jstl解析标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 获取项目根path -->
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<style> 
.ark-poptip{ position: absolute; color: #db7c22; z-index: 101; line-height: 1.5; zoom: 1; }
.ark-poptip-shadow{ background-color: rgba(229,169,107,0.15); FILTER: progid:DXImageTransform.Microsoft.Gradient(startColorstr=#26e5a96b,endColorstr=#26e5a96b); border-radius: 2px; padding: 2px; zoom: 1; _display: inline; }
.ark-poptip-container{ position: relative; background-color: #fffcef; border: 1px solid #ffbb76; border-radius: 2px; padding: 5px 22px 5px 10px; zoom: 1; _display: inline; }
.ark-poptip:after,.ark-poptip-shadow:after,.ark-poptip-container:after{ visibility: hidden; display: block; font-size: 0; content: " "; clear: both; height: 0; }
.ark-poptip a.ark-poptip-close{ position: absolute; right: 3px; top: 3px; border: 1px solid #ffc891; text-decoration: none; border-radius: 3px; width: 12px; height: 12px; font-family: tahoma; color: #dd7e00; line-height: 10px; line-height: 10px\0; *line-height: 12px; text-align: center; font-size: 14px; background: #ffd7af; background: -webkit-gradient(linear,left top,left bottom,from(#fff0e1),to(#ffe7cd)); background: -moz-linear-gradient(top,#fff0e1,#ffe7cd); filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#FFF0E1',endColorstr='#FFE7CD'); background: -o-linear-gradient(top,#fff0e1,#ffe7cd); background: linear-gradient(top,#fff0e1,#ffe7cd); overflow: hidden; }
.ark-poptip a.ark-poptip-close:hover{ border: 1px solid #ffb24c; text-decoration: none; color: #dd7e00; background: #ffd7af; background: -webkit-gradient(linear,left top,left bottom,from(#ffe5ca),to(#ffcc98)); background: -moz-linear-gradient(top,#ffe5ca,#ffcc98); filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#FFE5CA',endColorstr='#FFCC98'); background: -o-linear-gradient(top,#ffe5ca,#ffcc98); background: linear-gradient(top,#ffe5ca,#ffcc98); }
.ark-poptip-arrow,.ark-poptip-arrow em,.ark-poptip-arrow span{ position: absolute; font-size: 14px; font-family: SimSun,Hiragino Sans GB; font-style: normal; line-height: 21px; z-index: 10; *zoom: 1; }
.ark-poptip-arrow em{ color: #ffbb76; }
.ark-poptip-arrow span{ color: #fffcef; top: 0; left: 0; }
.ark-poptip-arrow-a{ left: 14px; top: -10px; top: -9px\0; }
.ark-poptip-arrow-a em{ top: -1px; left: 0; } 
.ark-poptip-arrow-b{ right: 28px; top: -10px; top: -9px\0; }
.ark-poptip-arrow-b em{ top: -1px; left: 0; }
.ark-poptip-content{ float: none; display: inline; *zoom: 1; }
.ark-poptip-content:after{ visibility: hidden; display: block; font-size: 0; content: " "; clear: both; height: 0; }
:root .ark-poptip-shadow{ FILTER: none\9; }
</style>   
 <form id="carrierAddRoute_form" method="post" style="padding:15px;width: 605px">
<div title="基本信息" style="padding:15px">
    	<fieldset id="user_mgr_user_form_userGenfieldset" style="padding:10px;" class="spinner">
			<legend>班线基本信息</legend>  
			<table class="formtable">
		<tr>
			<td>班次编号：</td>
			<td>
				  <input type="text" class="easyui-validatebox spinner"  required="true" name="routeNumber" style="height:18px;width:180px" value="${routeNub}" readonly="readonly" />
			</td> 
		 	 <!--  <td colspan="3" style="padding-left:10px;">查看
		 	     <a href="#" style="color:blue; text-decoration:none;" onmouseover="showdiv(this)" onmouseout="hidediv()">[货物发/收区域]</a>
		 	  </td> -->
		 </tr>
		 <tr>
		    <td>班线名称：</td>
			<td><input class="easyui-validatebox spinner" required="true" 
			style="height:18px;width:180px"  name="routeName"/></td>
		    <td  style="padding-left:10px;">承运商：</td>
			<td>
				<input id="carrier_mgr_carInformation_form_carrierMemberId" required="true" class="easyui-validatebox spinner" style="height:18px;width:180px" name="carrierDisplay" value="${carrierRouteData.carrierDisplay}"/>
			</td>
		</tr>
		<tr>
			<td>班线状态：</td>
			<td>
			 <input id="status" name="status" required="true"  style="height:18px;width:180px;" value="${carrierRouteData.status}" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
			<td style="padding-left:10px;">班线类型：</td>
			<td>
				<input id="routeType" style="height:18px;width:180px;" name="routeType" value="${carrierRouteData.routeType}" required="true" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.routeType"/>
	    </tr>
		<tr>
			<td>班线起点：</td>
			<td>
			 <input name="routeOrigin" id="remark" style="height: 18px;border-color: #c3d9e0" autocomplete="off" type="text" value="请选择城市名称" class="city_input  inputFocus proCityQueryAll proCitySelAll ">
	        </td>
		    <td style="padding-left:10px;"> 联系电话：</td>
			<td>
				<input class="easyui-validatebox spinner" maxlength="11" required="true" style="height:18px;width:180px" name="telephone"  value="${carrierRouteData.telephone}"  
			  	validType="customReg['(^(\d{3,4}-)?\d{7,8})$|(13[0-9]{9})','<fmt:message key="Route.telephone.illegal"/>']"
			  />
			</td>
		</tr> 
		<tr>
		    <td >班线终点：</td>
			<td>
          <input name="routeOrigin" id="remark" style="height: 18px;border-color: #c3d9e0" autocomplete="off" type="text" value="请选择城市名称" class="city_input  inputFocus proCityQueryAll proCitySelAll ">
	       
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
    <div title="收/发区域" style="padding:15px">
    	<fieldset id="user_mgr_user_form_connetGenfieldset" style="padding:10px;" class="spinner">
			<legend>收/发货物区域</legend>  
			<table  class="detailtable"> 
			<tr>   
		     <td>发货区域1：</td>
			 <td><input class="easyui-validatebox spinner" required="true" 
			style="height:18px;width:180px"  name="routeName"/></td>
			   <td>收货区域1：</td>
			 <td >
			 	<input class="  easyui-validatebox spinner" required="true" style="height:18px;width:180px" name="extractGoodsTime" value="${carrierRouteData.extractGoodsTime}"/>
			  </td>
		  </tr>  
			<tr>   
		     <td>发货区域2：</td>
			 <td >
			 	<input class="  easyui-validatebox spinner" required="true" style="height:18px;width:180px" name="extractGoodsTime" value="${carrierRouteData.extractGoodsTime}"/>
			  </td>
			   <td>收货区域2：</td>
			 <td >
			 	<input class="  easyui-validatebox spinner" required="true" style="height:18px;width:180px" name="extractGoodsTime" value="${carrierRouteData.extractGoodsTime}"/>
			  </td>
		  </tr> 
			
			</table>
		</fieldset>
    </div> 
     
</form> 
    <!--  <div id="Prew" class="ark-poptip" style="top: 70px;margin-left: 320px;width: 234px;visibility:hidden;"  >
	<div class="ark-poptip-shadow">
		<div class="ark-poptip-container">
			<div class="ark-poptip-arrow ark-poptip-arrow-a">
				<em>◆</em><span>◆</span>
			</div>
			<div class="ark-poptip-content">
             <table >
              <tr id="outTable" style="background-color: #daeef5;text-align: center;">
              <td width="134px"><font color="black" style="text-align: center;">发货区域</font></td>
               <td width="60px"><font color="black">价格/次</font></td> 
              </tr> 
             </table> 
             <table>
              <tr id="inTable" style="background-color: #daeef5;text-align: center;">
              <td width="134px"><font color="black" style="text-align: center;">收货区域</font></td>
               <td width="60px"><font color="black">价格/次</font></td> 
              </tr> 
             </table> 
			</div>
		</div>
	</div>
</div> 
  -->
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 	<!--弹出省省市-->
	<div class="provinceCityAll" style="z-index:20;position:absolute;left:50%;margin-left:-350px;top:50%;margin-top:-35px;">
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

$('#carrierAddRoute_form').tabs({
	border:true,
	onSelect:function(){
		$("div").remove(".validatebox-tip");//解决关闭窗体偶尔出现验证条bug
	}
}); 
    //隐藏层
	function hidediv() {
	$(".te").remove(); 
	$("#Prew").css("visibility", "hidden");  
	} 
	//显示层
	function showdiv() {
		$(".te").remove(); 
	    var id=	$("#routeid").val();
	    $.post(ctx+"/do/carrierRoute/area.json", {routeid:id},
	    		   function(data){   
	    		     $.each(data.obj[0],function(key,value){  
	    		    	 $("#outTable").after("<tr class='te' style='text-align: center;'><td>"+value.deliverName+"</td><td>"+value.price+"元</td></tr>");
	    		     });  
	    		     $.each(data.obj[1],function(key,value){  
	    		    	 $("#inTable").after("<tr class='te' style='text-align: center;'><td>"+value.deliverName+"</td><td>"+value.price+"元</td></tr>");
	    		     }); 
	    		}); 
		$("#Prew").slideDown("slow");
		$("#Prew").css("visibility", "visible");   
	 } 

	//用于combogrid的客户信息绑定
	$('#carrier_mgr_carInformation_form_carrierMemberId').combogrid({
		panelWidth:450,
		fit:true,//控件自动resize占满窗口大小
		//iconCls:'icon-save',//图标样式
		border:false,//是否存在边框
		fitColumns:true,//自动填充行
		nowrap: true,//禁止单元格中的文字自动换行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
		singleSelect:true,//限制单选
		checkOnSelect:false,//选择复选框的时候选择该行
		selectOnCheck:false,//选择的时候复选框打勾
	    //value:'${messageNoticeData.addresseeDisplay}',    
	    idField:'memberName',    
	    textField:'memberName',    
	    url: ctx + '/do/carrierMember/list.json',
	    sortName: 'createTime',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
	    columns : [ [ 
			{
				field:'carrierMemberId',
				title:'ID',
				checkbox:true
			},{
				field : 'memberName',
				title : '承运商姓名',
				width : 80,
				sortable:true
			}, {
				field : 'memberType',
				title : '承运商类型',
				width : 60,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如man显示是，woman显示女
					return renderGridValue(value,fields.memberType);
				}  
			}, {
				field : 'creditworthiness',
				title : '信誉度',
				width : 100,
				sortable:true
			} ] ],
			pagination : true,//True 就会在 datagrid 的底部显示分页栏
			pageSize : 10,//注意，pageSize必须在pageList存在
			pageList : [2,10,50,100],//从session中获取
			rownumbers : true,//True 就会显示行号的列
		loadMsg : '数据加载中....',
		mode : 'remote',
		delay : 200
	});
</script> 
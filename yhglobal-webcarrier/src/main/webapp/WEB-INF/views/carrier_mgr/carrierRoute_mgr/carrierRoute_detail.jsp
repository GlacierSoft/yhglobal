<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
.ark-poptip-content{ float: none; display: inline; *zoom: 1; }
.ark-poptip-content:after{ visibility: hidden; display: block; font-size: 0; content: " "; clear: both; height: 0; }
:root .ark-poptip-shadow{ FILTER: none\9; }
</style>
<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>班次编号：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" value="${carrierRouteData.routeNumber}"  readonly="readonly"/>
			</td> 
		 	     <td colspan="3" style="padding-left:10px;">查看
		 	     <a href="#" style="color:blue; text-decoration:none;" onmouseover="showdiv(this)" onmouseout="hidediv()">[货物发/收区域]</a></td>
		 </tr>
		 <tr>
		    <td>班线名称：</td>
			<td><input class="spinner" style="width:180px" value="${carrierRouteData.routeName}" readonly="readonly"/></td>
		    <td  style="padding-left:10px;">承运商：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px"  value="${carrierRouteData.carrierDisplay}" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>班线状态：</td>
			<td>
				<input class="spinner" id="status" style="height:18px;width:180px" readonly="readonly"/>
			</td>
			<td style="padding-left:10px;">班线类型：</td>
			<td><input id="routeType" class="spinner" style="width:180px"  value="${carrierRouteData.routeType}" readonly="readonly"/></td>
	   </tr>
		<tr>
			<td>班线起点：</td>
			<td><input class="spinner" style="width:180px"  value="${carrierRouteData.routeOrigin}" readonly="readonly"/></td>
		    <td style="padding-left:10px;">班线终点：</td>
			<td><input class="spinner" style="width:180px"  value="${carrierRouteData.routeStop}" readonly="readonly"/></td>
		</tr> 
		<tr>
			<td>发车时间：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" readonly="readonly"  value="<fmt:formatDate value="${carrierRouteData.startofTime}" pattern="HH:mm"/>"/>
			</td>
			<td style="padding-left:10px;">在途时间：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" readonly="readonly" value="${carrierRouteData.routeBytime}小时"/>
			</td>
	    </tr>
	   	<tr>
			<td>可定仓位(余)：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" readonly="readonly" value="${carrierRouteData.availablePosition}%"/>
			</td>
			<td style="padding-left:10px;">截止收货时间：</td>
			<td><input class="spinner" style="width:180px"    value="<fmt:formatDate value="${carrierRouteData.ceaseTakeDeliveryTime}" pattern="HH:mm"/>" readonly="readonly"/></td>
		</tr>	
		<tr>
			<td>起步价：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" readonly="readonly" value="<fmt:formatNumber value="${carrierRouteData.startingPrice}" pattern="#,#00.00"/>" />
			</td>
			<td style="padding-left:10px;">重货价：</td>
			<td><input class="spinner" style="width:180px"  value="<fmt:formatNumber value="${carrierRouteData.weightGoodsPrice}" pattern="#,#00.00"/>元/公斤"  readonly="readonly"/></td>
		</tr>
		<tr>
			<td>轻货价：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" readonly="readonly" value="<fmt:formatNumber value="${carrierRouteData.lightGoodsPrice}" pattern="#,#00.00"/>元/立方"/>
			</td>
			<td style="padding-left:10px;">箱型：</td>
			<td><input id="boxType" class="spinner" style="width:180px"  value="${carrierRouteData.boxType}" readonly="readonly"/></td>
	   </tr>
		<tr>
			<td >里程：</td>
			<td><input class="spinner" style="width:180px"  value="${carrierRouteData.mileage}" readonly="readonly"/></td>
		
			<td style="padding-left:10px;">预计可提货时间：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" readonly="readonly" value="${carrierRouteData.extractGoodsTime}"/>
			</td>
		</tr>
		<tr>
			<td >保险费：</td>
			<td><input class="spinner" style="width:180px" value="<fmt:formatNumber value="${carrierRouteData.premium}" pattern="#,#00.00"/>元" readonly="readonly"/></td>
		    <td style="padding-left:10px;"> 联系电话：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" readonly="readonly" value="${carrierRouteData.telephone}"/>
			</td>
	  </tr>
		<tr>
			<td >审核状态：</td>
			<td><input id="auditState" class="spinner" style="width:180px"  value="${carrierRouteData.auditState}" readonly="readonly"/></td>
		    <td style="padding-left:10px;">审核人：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" readonly="readonly" value="${carrierRouteData.auditDisplay}"/>
			</td>
		</tr>
		<tr> 
			<td>审核备注：</td>
			<td><input class="spinner" style="width:180px"  value="${carrierRouteData.auditOpinion}" readonly="readonly"/></td>
			<td style="padding-left:10px;">审核时间：</td>
			<td><input class="spinner" style="width:180px" value="<fmt:formatDate value="${carrierRouteData.auditTime}"  pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		
		</tr>
		<tr>
		    <td>创建人：</td>
			<td><input class="spinner" style="width:180px"   value="${carrierRouteData.createrDisplay}" readonly="readonly"/></td>
		     <td style="padding-left:10px;">录入时间：</td>
			 <td><input class="spinner" style="width:180px" value="<fmt:formatDate value="${carrierRouteData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		 </tr>
		 <tr>   
		     <td>更新人：</td>
			 <td><input class="spinner" style="width:180px"   value="${carrierRouteData.updaterDisplay}" readonly="readonly"/></td>
		     <td style="padding-left:10px;">更新时间：</td>
			 <td><input class="spinner" style="width:180px"  value="<fmt:formatDate value="${carrierRouteData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		</tr>
		<tr>   
		     <td>备注：</td>
			 <td colspan="3"><textarea name="remark" class="spinner"  style="width:470px;"   readonly="readonly">${carrierRouteData.remark}</textarea></td>
		</tr> 
	</table> 
<div id="Prew" class="ark-poptip" style="top: 70px;margin-left: 320px;width: 234px;visibility:hidden;"  >
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
 <input id="routeid" value="${carrierRouteData.routerId }" type="hidden">
</form>


<script type="text/javascript">
	$('#routeType').val(renderGridValue('${carrierRouteData.routeType}',fields.routeType));
	$('#status').val(renderGridValue('${carrierRouteData.status}',fields.status));
	$('#boxType').val(renderGridValue('${carrierRouteData.boxType}',fields.boxType)); 
	$('#auditState').val(renderGridValue('${carrierRouteData.auditState}',fields.auditState)); 
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
</script>
	

 
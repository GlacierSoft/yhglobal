<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>
<%    
String path = request.getContextPath();    
// 获得本项目的地址(例如: http://localhost:8080/MyApp/)赋值给basePath变量    
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";    
// 将 "项目路径basePath" 放入pageContext中，待以后用EL表达式读出。    
pageContext.setAttribute("basePath",basePath);    
%> 

<script type="text/javascript">

//panel切换
function  doClick(str,url){
    $("#layout_center_panel").panel("setTitle",str);
	$('#layout_center_panel').panel('refresh',ctx +url);
}
	
</script>
<div style="margin:10px 10px 40px 20px;">
	<div id="newsDataGridPanel" class="easyui-panel" title="提醒管理"    
	        style="width:1000%;height:300px;background:#fafafa; "> 
	<!-- 站内信消息 -->
	<div style="float:left;margin:20px 10px 15px 40px;">
		<div id="newsDataGridPanel" class="easyui-panel" title="我的消息"    
		        style="width:220px;height:220px;background:#fafafa;">  
			<table>
				<tr>
					<td style="padding-left: 20px">未读消息： </td>
					<td>( <span style="color:red;cursor: pointer;" onclick="doClick('未读消息信息','/do/carrierMemberMessageNotice/index.htm');">${countWithout}</span> ) 条</td>
				</tr>
				<tr>
					<td style="padding-left: 20px">已读消息： </td>
					<td>( <span style="color:red;cursor: pointer;" onclick="doClick('已读消息信息','/do/carrierMemberMessageNotice/index.htm');">${countAlready}</span> ) 条</td>
				</tr>
				<!-- <tr>
					<td style="padding-left: 20px">总消息： </td>
					<td>( <span style="color:red;cursor: pointer;" onclick="doClick('借款等待资料的审核','/do/borrowingLoan/borrowingLoanFirstAudit.htm');">5</span> ) 条</td>
				</tr> -->
			</table>
		</div>
	</div>
	<!-- 分配订单 -->
	<div style="float:left;margin:20px 25px 25px 20px;">
		<div id="newsDataGridPanel" class="easyui-panel" title="我的订单"    
		        style="width:280px;height:220px;background:#fafafa;">  
			<table>
				<tr>
					<td style="padding-left: 20px">未分配订单：</td>
					<td style="padding-left: 30px">( <span style="color:red; cursor: pointer; " onclick="doClick('未分配订单','/do/order/index.htm');">${waitdistribute }</span> ) 条</td>
				</tr>
				<tr>
					<td style="padding-left: 20px">已分配订单：</td>
					<td style="padding-left: 30px">( <span style="color:red; cursor: pointer; " onclick="doClick('已分配订单','/do/orderHistory/index.htm');">${hasdistribute }</span> ) 条</td>
				</tr>
			</table>
		</div>
	</div>
	<!-- 签收配送 -->
	<div style="float:left;margin:20px 25px 25px 20px;">
		<div id="newsDataGridPanel" class="easyui-panel" title="我的配送"    
		        style="width:280px;height:220px;background:#fafafa;">  
			<table>
				<tr>
					<td style="padding-left: 20px">未签收配送记录：</td>
					<td style="padding-left: 30px">( <span style="color:red; cursor: pointer; " onclick="doClick('未签收配送记录','/do/ordersDispatching/index.htm');">${notsigned }</span> ) 条</td>
				</tr>
				<tr>
					<td style="padding-left: 20px">已签收配送记录：</td>
					<td style="padding-left: 30px">( <span style="color:red; cursor: pointer; " onclick="doClick('已签收配送记录','/do/ordersDispatchingSign/index.htm');">${havesigned }</span> ) 条</td>
				</tr>
			</table>
		</div>
	</div>
</div>


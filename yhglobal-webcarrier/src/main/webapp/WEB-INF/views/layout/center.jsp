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

	
	
</script>
<div style="margin:10px 10px 40px 20px;">
	<div id="newsDataGridPanel" class="easyui-panel" title="提醒管理"    
	        style="width:1000%;height:300px;background:#fafafa; "> 
	<!-- 我的消息 -->
	<div style="float:left;margin:20px 10px 15px 40px;">
		<div id="newsDataGridPanel" class="easyui-panel" title="我的消息"    
		        style="width:220px;height:220px;background:#fafafa;">  
			<table>
				<tr>
					<td style="padding-left: 20px">未读消息： </td>
					<td>( <span style="color:red;cursor: pointer;" onclick="doClick('借款等待资料的审核','/do/borrowingLoan/borrowingLoanFirstAudit.htm');">2</span> ) 条</td>
				</tr>
				<tr>
					<td style="padding-left: 20px">已读消息： </td>
					<td>( <span style="color:red;cursor: pointer;" onclick="doClick('借款等待资料的审核','/do/borrowingLoan/borrowingLoanFirstAudit.htm');">3</span> ) 条</td>
				</tr>
				<tr>
					<td style="padding-left: 20px">总消息： </td>
					<td>( <span style="color:red;cursor: pointer;" onclick="doClick('借款等待资料的审核','/do/borrowingLoan/borrowingLoanFirstAudit.htm');">5</span> ) 条</td>
				</tr>
			</table>
		</div>
	</div>
	<!-- 资金管理 -->
	<div style="float:left;margin:20px 25px 25px 20px;">
		<div id="newsDataGridPanel" class="easyui-panel" title="我的备忘"    
		        style="width:280px;height:220px;background:#fafafa;">  
			<table>
				<tr>
					<td style="padding-left: 20px">未完成备忘：</td>
					<td style="padding-left: 30px">( <span style="color:red; cursor: pointer; " onclick="doClick('等待审核的充值(审核中)','/do/withdraw/index.htm');">3</span> ) 条</td>
				</tr>
				<tr>
					<td style="padding-left: 20px">已完成备忘：</td>
					<td style="padding-left: 30px">( <span style="color:red; cursor: pointer; " onclick="doClick('等待审核的充值(审核中)','/do/withdraw/index.htm');">3</span> ) 条</td>
				</tr>
			</table>
		</div>
	</div>
</div>


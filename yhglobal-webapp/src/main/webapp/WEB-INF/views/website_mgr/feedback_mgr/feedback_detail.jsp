<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>发表人：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input class="spinner" style="width:250px"  value="${feedbackData.webFdbName}" readonly="readonly"/>
			</td>
			<td>联系号码：</td>
			<td><input class="spinner" style="width:270px"  value="${feedbackData.webFdbPhone}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>常用邮箱：</td>
			<td colspan="3"><input class="spinner" style="width:270px"  value="${feedbackData.webFdbEmail}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:250px" value="${feedbackData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:270px" value="<fmt:formatDate value="${feedbackData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:250px" value="${feedbackData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:270px" value="<fmt:formatDate value="${feedbackData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>意见内容：</td>
			<td colspan="3"><textarea id="announcement_mgr_announcement_detail_webAnnContent" name="webAnnContent" class="spinner" style="width:600px;height:280px;" readonly="readonly">${feedbackData.remark}</textarea></td>
		</tr>

	</table>
</form>
<script>
	KindEditor.ready(function(Detail) {
		Detail.create('#announcement_mgr_announcement_detail_webAnnContent', {
			themeType : 'qq',
			items : [],
			minWidth : "600px",
			readonlyMode : true
		});
	});
</script>
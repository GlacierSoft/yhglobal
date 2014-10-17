<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>维修标题：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="repairId" value="${storageRepairDate.repairId}" />
				<input class="spinner"  style="width:250px" value="${storageRepairDate.repairTitle}" readonly="readonly"/>
			</td>
			<td>仓库名称：</td>
			<td><input id="news_mgr_news_detail_storageDisplay" class="spinner" style="width:270px"  value="${storageRepairDate.storageDisplay}"  readonly="readonly"/></td>
			
		</tr>
		<tr>
			<td>严重程度：</td>
			<td><input id="news_mgr_news_detail_repairGrade" value="${storageRepairDate.repairGrade}" class="spinner" style="width:250px"  readonly="readonly"/></td>
			<td>维修状态：</td>
			<td><input id="news_mgr_news_detail_repairStauts" class="spinner" style="width:270px"  value="${storageRepairDate.repairStauts}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:250px" value="${storageRepairDate.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:270px" value="<fmt:formatDate value="${storageRepairDate.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:250px" value="${storageRepairDate.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:270px" value="<fmt:formatDate value="${storageRepairDate.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>维修内容：</td>
			<td colspan="3"><textarea id="news_mgr_news_detail_remark" name="remark" class="spinner" style="width:600px;height:280px;" readonly="readonly">${storageRepairDate.remark}</textarea></td>
		</tr>

	</table>
</form>
<script>
	KindEditor.ready(function(Detail) {
		Detail.create('#news_mgr_news_detail_remark', {
			themeType : 'qq',
			items : [],
			minWidth : "600px",//设置最小宽度为600px
			readonlyMode : false
		});
	});
</script>
<script type="text/javascript">
    $('#news_mgr_news_detail_repairGrade').val(renderGridValue('${storageRepairDate.repairGrade}',fields.grade));
	$('#news_mgr_news_detail_repairStauts').val(renderGridValue('${storageRepairDate.repairStauts}',fields.repairStauts));
</script>
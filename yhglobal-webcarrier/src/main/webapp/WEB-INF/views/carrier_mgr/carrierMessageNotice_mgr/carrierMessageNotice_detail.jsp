<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>发送者：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" value="${carrierrMessageNoticeData.senderDisplay}"  readonly="readonly"/>
			</td>
			<td>接收者：</td>
			<td><input class="spinner" style="width:168px" value="${carrierrMessageNoticeData.receiverDisplay}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>类型：</td>
			<td>
				<input class="spinner" id="carrierMessageNoticeLettertype" style="width:168px" value="${carrierrMessageNoticeData.lettertype}" readonly="readonly"/>
			</td>
			<td>状态：</td>
			<td><input class="spinner" id="carrierMessageNoticeLetterstatuse" style="width:168px"   value="${carrierrMessageNoticeData.letterstatus }" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>发送时间：</td>
			<td>
			   <input class="spinner" style="width:168px" value="<fmt:formatDate value="${carrierrMessageNoticeData.sendtime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/>
			</td>
			<td>备注：</td>
			<td><input class="spinner" style="width:168px"   value="${carrierrMessageNoticeData.remark }" readonly="readonly"/></td>
		</tr>
		<tr>
		    <td>创建人：</td>
			<td><input class="spinner" style="width:168px"   value="${carrierrMessageNoticeData.createrDisplay}" readonly="readonly"/></td>
		     <td>录入时间：</td>
			 <td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${carrierrMessageNoticeData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		 </tr>
		 <tr>   
		     <td>更新人：</td>
			 <td><input class="spinner" style="width:168px"   value="${carrierrMessageNoticeData.updaterDisplay}" readonly="readonly"/></td>
		     <td>更新时间：</td>
			 <td><input class="spinner" style="width:168px"  value="<fmt:formatDate value="${carrierrMessageNoticeData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		</tr>
		<tr>
			<td style="vertical-align: top;">正文：</td>
			<td colspan="3">
			   <textarea name="remark" style="width:420px;height: 50px;" maxlength="255" class="spinner formta" >${carrierrMessageNoticeData.content}</textarea>
			</td>
		</tr>
	</table>
</form>
<script>
	$('#carrierMessageNoticeLettertype').val(renderGridValue('${carrierrMessageNoticeData.lettertype}',fields.letterType));
	$('#carrierMessageNoticeLetterstatuse').val(renderGridValue('${carrierrMessageNoticeData.letterstatus}',fields.letterStatus));
</script>


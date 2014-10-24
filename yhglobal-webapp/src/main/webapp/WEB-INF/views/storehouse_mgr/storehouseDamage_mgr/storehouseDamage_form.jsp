<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<form method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>损坏货物：</td>
			<td>
			    <input type="hidden" name="belaidupId" value="${belaidupDate.belaidupId}">
				<input type="text" class="easyui-validatebox spinner"  name="auditOpinion" required="true" style="height:18px;width:180px" value="${belaidupDate.belaidupProdName}" readonly="readonly" />
			</td>
			<td style="padding-left:20px;">是否退货：</td> 
		 	<td>
				<input id="yesOrNo" name="yesOrNo" required="true"  value="yes" style="height:18px;width:180px;" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.yesOrNo" disabled="disabled" readonly="readonly"/>
			</td> 
		 </tr>
		 <tr>
		    <td valign="top">损坏说明：</td>
		    <td colspan="3"><textarea name="remark" style="width:450px;" maxlength="255" class="spinner formta" ></textarea></td>
		 </tr>
	</table> 
</form>
 

 
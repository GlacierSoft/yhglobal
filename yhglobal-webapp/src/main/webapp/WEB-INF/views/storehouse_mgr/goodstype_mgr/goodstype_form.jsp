<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="goodstype_mgr_goodsType_form" method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>类型名称：</td>
			<td>
				<input type="hidden" id="goodstype_mgr_goodsType_form_goodstypeId" name="goodstypeId" value="${goodstypeDate.goodstypeId}" />
				<input id="goodstype_mgr_goodsType_form_goodstypeName" style="width:268px;height: 20px;" name="goodstypeName" value="${goodstypeDate.goodstypeName}" class="easyui-validatebox spinner"  required="true"/>
			</td>
		</tr>
		<tr>
			<td>类型状态：</td>
			<td>
			<input id="goodstype_mgr_goodsType_form_status" name="status"  style="width:268px;" value="${goodstypeDate.status}" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
		</tr>
		<tr>
			<td>备注：</td>
			<td>
				<textarea id="goodstype_mgr_goodsType_form_remark" name="remark" style="width:268px;" class="spinner formta">${goodstypeDate.remark}</textarea>
			</td>
		</tr>
	</table>
</form>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>货物名称：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" value="${storehouseStorageGoodsrunData.belaidupId}"  readonly="readonly"/>
			</td>
			<td>流动次数：</td>
			<td><input class="spinner" style="width:168px" value="${storehouseStorageGoodsrunData.goodsrunNum}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>货物状态：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" id="storageGoodsrun_mgr_goodsrunStatus"  readonly="readonly"/>
			</td>
			<td>流动状态：</td>
			<td>
				<input class="spinner" id="storageGoodsrun_mgr_status" style="height:18px;width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>流动时间：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" readonly="readonly" value="<fmt:formatDate value="${storehouseStorageGoodsrunData.goodsrunDate}" pattern="yyyy-MM-dd HH:mm:ss"/>"/>
			</td>
			<td>流动详情：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" readonly="readonly" value="${storehouseStorageGoodsrunData.remark}" />
			</td>
			
		</tr>
		<tr>
		    <td>创建人：</td>
			<td><input class="spinner" style="width:168px"   value="${storehouseStorageGoodsrunData.createrDisplay}" readonly="readonly"/></td>
		     <td>录入时间：</td>
			 <td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${storehouseStorageGoodsrunData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		 </tr>
		 <tr>   
		     <td>更新人：</td>
			 <td><input class="spinner" style="width:168px"   value="${storehouseStorageGoodsrunData.updaterDisplay}" readonly="readonly"/></td>
		     <td>更新时间：</td>
			 <td><input class="spinner" style="width:168px"  value="<fmt:formatDate value="${storehouseStorageGoodsrunData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		</tr>
		<tr>   
		     <td valign="top">记录备注：</td>
			 <td colspan="3"><textarea name="remark" style="width:420px;" maxlength="255" class="spinner formta" readonly="readonly">${storehouseStorageGoodsrunData.remark}</textarea></td>
		</tr>
	</table>
</form>


<script type="text/javascript">
	$('#storageGoodsrun_mgr_goodsrunStatus').val(renderGridValue('${storehouseStorageGoodsrunData.goodsrunStatus}',fields.goodsrunStatus));
	$('#storageGoodsrun_mgr_status').val(renderGridValue('${storehouseStorageGoodsrunData.status}',fields.status));
</script>
	


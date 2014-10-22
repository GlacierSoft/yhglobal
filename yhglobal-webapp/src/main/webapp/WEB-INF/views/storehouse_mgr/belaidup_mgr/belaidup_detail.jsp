<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable" width="800">
		<tr>
			<td>货物名称：</td>
			<td>
				<input type="hidden" id="memberGrade_mgr_memberGrade_detail_belaidupId" name="belaidupId" value="${belaidupDate.belaidupId}" />
				<input id="memberGrade_mgr_memberGrade_detail_belaidupProdName" style="width:268px;height: 20px;" name="belaidupName" value="${belaidupDate.belaidupProdName}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
			<td>货物条形码：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_belaidupBarCode" name="belaidupBarCode"  style="width:268px;" readonly="readonly" value="${belaidupDate.belaidupBarCode}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>货物单价：</td>
			<td>
				<input id="memberGrade_mgr_memberGrade_detail_belaidupUnitprice" style="width:268px;height: 20px;" name="belaidupUnitprice" value="<fmt:formatNumber value='${belaidupDate.belaidupUnitprice}' pattern="#,#00.00元"/>" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
			<td>货物类型：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_goodsTypeDisplay" name="goodsTypeDisplay"  style="width:268px;" readonly="readonly" value="${belaidupDate.goodsTypeDisplay}" class="easyui-validatebox spinner" />
			</td>
		</tr>
		<tr>
			<td>包装类型：</td>
			<td>
				<input id="memberGrade_mgr_memberGrade_detail_packageDisplay" style="width:268px;height: 20px;" name="packageDisplay" value="${belaidupDate.packageDisplay}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
			<td>包装条形码：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_packageCode" name="packageCode"  style="width:268px;" readonly="readonly" value="${belaidupDate.packageCode}" class="easyui-validatebox spinner" />
			</td>
		</tr>
		<tr>
			<td>入库物品重量：</td>
			<td>
				<input id="memberGrade_mgr_memberGrade_detail_belaidupWeight" style="width:268px;height: 20px;" name="belaidupWeight" value="${belaidupDate.belaidupWeight}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
			<td>入库物品体重：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_belaidupBulk" name="belaidupBulk"  style="width:268px;" readonly="readonly" value="${belaidupDate.belaidupBulk}" class="easyui-validatebox spinner" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>货物仓库费：</td>
			<td>
				<input id="memberGrade_mgr_memberGrade_detail_repertoryPrice" style="width:268px;height: 20px;" name="repertoryPrice" value="<fmt:formatNumber value='${belaidupDate.repertoryPrice}' pattern="#,#00.00元"/>" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
			<td>货物存货费：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_stockPrice" name="stockPrice"  style="width:268px;" readonly="readonly" value="<fmt:formatNumber value='${belaidupDate.stockPrice}' pattern="#,#00.00元"/>" class="easyui-validatebox spinner"/>
			</td>
		</tr>
		<tr>
			<td>货物包装费：</td>
			<td>
				<input id="memberGrade_mgr_memberGrade_detail_packPrice" style="width:268px;height: 20px;" name="packPrice" value="<fmt:formatNumber value='${belaidupDate.packPrice}' pattern="#,#00.00元"/>" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
			<td>物品运输费：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_freightPrice" name="freightPrice"  style="width:268px;" readonly="readonly" value="<fmt:formatNumber value='${belaidupDate.freightPrice}' pattern="#,#00.00元"/>" class="easyui-validatebox spinner" />
			</td>
		</tr>
		<tr>
			<td>货物状态：</td>
			<td>
				<input id="memberGrade_mgr_memberGrade_detail_belaidupStatus" style="width:268px;height: 20px;" name="belaidupStatus" value="${belaidupDate.belaidupStatus}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
			<td>加急配送：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_yesOrNo" name="yesOrNo"  style="width:268px;" readonly="readonly" value="${belaidupDate.yesOrNo}" class="easyui-validatebox spinner" />
			</td>
		</tr>
		<tr>
			<td>取货方式：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_replenishment" name="replenishment" readonly="readonly" style="width:268px;" value="${belaidupDate.replenishment}" class="easyui-validatebox spinner"/>
			</td>
			<td>分拣状态：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_sortingStauts" name="sortingStauts" readonly="readonly" style="width:268px;" value="${belaidupDate.sortingStauts}" class="easyui-validatebox spinner"/>
			</td>
		</tr>
		<tr>
			<td>货主名称：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_shipperMemberDisplay" name="shipperMemberDisplay" readonly="readonly" style="width:268px;" value="${belaidupDate.shipperMemberDisplay}" class="easyui-validatebox spinner"/>
			</td>
			<td>起始站：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_belaidupInitiatin" name="belaidupInitiatin" readonly="readonly" style="width:268px;" value="${belaidupDate.belaidupInitiatin}" class="easyui-validatebox spinner"/>
			</td>
		</tr>
		<tr>
			<td>终点站：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_belaidupTerminu" name="belaidupTerminu" readonly="readonly" style="width:268px;" value="${belaidupDate.belaidupTerminu}" class="easyui-validatebox spinner"/>
			</td>
			<td>收货人名称：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_orderConsignee" name="orderConsignee" readonly="readonly" style="width:268px;" value="${belaidupDate.orderConsignee}" class="easyui-validatebox spinner"/>
			</td>
		</tr>
		<tr>
			<td>收货人手机：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_orderPhone" name="orderPhone" readonly="readonly" style="width:268px;" value="${belaidupDate.orderPhone}" class="easyui-validatebox spinner"/>
			</td>
			<td>收货人地址：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_orderAddress" name="orderAddress" readonly="readonly" style="width:268px;" value="${belaidupDate.orderAddress}" class="easyui-validatebox spinner"/>
			</td>
		</tr>
		<tr>
			<td>收货人手机：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_orderPhone" name="orderPhone" readonly="readonly" style="width:268px;" value="${belaidupDate.orderPhone}" class="easyui-validatebox spinner"/>
			</td>
			<td>收货人地址：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_orderAddress" name="orderAddress" readonly="readonly" style="width:268px;" value="${belaidupDate.orderAddress}" class="easyui-validatebox spinner"/>
			</td>
		</tr>
		<tr>
			<td>货物退货时间：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_belaidupReturnTime" name="belaidupReturnTime" readonly="readonly" style="width:268px;" value="<fmt:formatDate value="${belaidupDate.belaidupReturnTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" class="easyui-validatebox spinner"/>
			</td>
			<td>货物退货手续费：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_belaidupReturnPoundage" name="belaidupReturnPoundage" readonly="readonly" style="width:268px;" value="<fmt:formatNumber value='${belaidupDate.belaidupReturnPoundage}' pattern="#,#00.00元"/>" class="easyui-validatebox spinner"/>
			</td>
		</tr>
		<tr>
			<td>货物启禁状态：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_stauts" name="stauts" readonly="readonly" style="width:268px;" value="${belaidupDate.stauts}" class="easyui-validatebox spinner"/>
			</td>
			<td>仓库名称：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_storageDisplay" name="storageDisplay" readonly="readonly" style="width:268px;" value="${belaidupDate.storageDisplay}" class="easyui-validatebox spinner"/>
			</td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_createrDisplay" name="createrDisplay" readonly="readonly" style="width:268px;" value="${belaidupDate.createrDisplay}" class="easyui-validatebox spinner"/>
			</td>
			<td>创建时间：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_createTime" name="gradeDestination" readonly="readonly" style="width:268px;" value="<fmt:formatDate value="${belaidupDate.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" class="easyui-validatebox spinner"/>
			</td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_updaterDisplay" name="gradeCashpayment" readonly="readonly" style="width:268px;" value="${belaidupDate.updaterDisplay}" class="easyui-validatebox spinner"/>
			</td>
			<td>更新时间：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_updateTime" name="updateTime" readonly="readonly" style="width:268px;" value="<fmt:formatDate value="${belaidupDate.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" class="easyui-validatebox spinner"/>
			</td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3">
				<textarea id="memberGrade_mgr_memberGrade_detail_remark" name="remark" readonly="readonly" style="width:670px;" class="spinner formta">${belaidupDate.remark}</textarea>
			</td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#memberGrade_mgr_memberGrade_detail_belaidupStatus').val(renderGridValue('${belaidupDate.belaidupStatus}',fields.goodsrunStatus));
	$('#memberGrade_mgr_memberGrade_detail_yesOrNo').val(renderGridValue('${belaidupDate.yesOrNo}',fields.yesOrNo));
	$('#memberGrade_mgr_memberGrade_detail_replenishment').val(renderGridValue('${belaidupDate.replenishment}',fields.replenishment));
	$('#memberGrade_mgr_memberGrade_detail_stauts').val(renderGridValue('${belaidupDate.stauts}',fields.status));
	$('#memberGrade_mgr_memberGrade_detail_sortingStauts').val(renderGridValue('${belaidupDate.sortingStauts}',fields.sortingStauts));
</script>

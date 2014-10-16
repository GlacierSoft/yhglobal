<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable" width="800">
		<tr>
			<td>仓库名称：</td>
			<td>
				<input type="hidden" id="memberGrade_mgr_memberGrade_detail_storageId" name="storageId" value="${storageDate.storageId}" />
				<input id="memberGrade_mgr_memberGrade_detail_storageName" style="width:268px;height: 20px;" name="storageName" value="${storageDate.storageName}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
			<td>仓库编号：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_storageCode" name="storageCode"  style="width:268px;" readonly="readonly" value="${storageDate.storageCode}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>仓库类型：</td>
			<td>
				<input id="memberGrade_mgr_memberGrade_detail_storageTyperDisplay" style="width:268px;height: 20px;" name="storageTyperDisplay" value="${storageDate.storageTyperDisplay}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
			<td>仓库检修状态状态：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_yesOrNo" name="yesOrNo"  style="width:268px;" readonly="readonly" value="${storageDate.yesOrNo}" class="easyui-validatebox spinner" />
			</td>
		</tr>
		<tr>
			<td>仓库必检修次数：</td>
			<td>
				<input id="memberGrade_mgr_memberGrade_detail_mustOverhaulNum" style="width:268px;height: 20px;" name="mustOverhaulNum" value="${storageDate.mustOverhaulNum}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
			<td>仓库已检修次数：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_alreadyOverhaulNum" name="yesOrNo"  style="width:268px;" readonly="readonly" value="${storageDate.alreadyOverhaulNum}" class="easyui-validatebox spinner" />
			</td>
		</tr>
		<tr>
			<td>下次检修时间：</td>
			<td>
				<input id="memberGrade_mgr_memberGrade_detail_nextOverhaulDate" style="width:268px;height: 20px;" name="nextOverhaulDate" value="<fmt:formatDate value="${storageDate.nextOverhaulDate}" pattern="yyyy-MM-dd"/>" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
			<td>仓库建造时间：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_buildDate" name="buildDate"  style="width:268px;" readonly="readonly" value="<fmt:formatDate value="${storageDate.buildDate}" pattern="yyyy-MM-dd"/>" class="easyui-validatebox spinner" />
			</td>
		</tr>
		<tr>
			<td>体重上限：</td>
			<td>
				<input id="memberGrade_mgr_memberGrade_detail_weightUpperBound" style="width:268px;height: 20px;" name="weightUpperBound" value="${storageDate.weightUpperBound}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
			<td>可用体重：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_usableWeight" name="usableWeight"  style="width:268px;" readonly="readonly" value="${storageDate.usableWeight}" class="easyui-validatebox spinner" />
			</td>
		</tr>
		<tr>
			<td>体积上限：</td>
			<td>
				<input id="memberGrade_mgr_memberGrade_detail_bulkUpperBound" style="width:268px;height: 20px;" name="bulkUpperBound" value="${storageDate.bulkUpperBound}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
			<td>可用体积：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_usableBulk" name="usableBulk"  style="width:268px;" readonly="readonly" value="${storageDate.usableBulk}" class="easyui-validatebox spinner" />
			</td>
		</tr>
		<tr>
			<td>仓库电话：</td>
			<td>
				<input id="memberGrade_mgr_memberGrade_detail_storageTel" style="width:268px;height: 20px;" name="storageTel" value="${storageDate.storageTel}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
			<td>仓库地址：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_storageAddress" name="storageAddress"  style="width:268px;" readonly="readonly" value="${storageDate.storageAddress}" class="easyui-validatebox spinner" />
			</td>
		</tr>
		<tr>
			<td>负责人：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_userDisplay" name="userDisplay" readonly="readonly" style="width:268px;" value="${storageDate.userDisplay}" class="easyui-validatebox spinner"/>
			</td>
			
		</tr>
		<tr>
			<td>创建人：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_createrDisplay" name="createrDisplay" readonly="readonly" style="width:268px;" value="${storageDate.createrDisplay}" class="easyui-validatebox spinner"/>
			</td>
			<td>创建时间：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_createTime" name="gradeDestination" readonly="readonly" style="width:268px;" value="<fmt:formatDate value="${storageDate.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" class="easyui-validatebox spinner"/>
			</td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_updaterDisplay" name="gradeCashpayment" readonly="readonly" style="width:268px;" value="${storageDate.updaterDisplay}" class="easyui-validatebox spinner"/>
			</td>
			<td>更新时间：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_detail_updateTime" name="updateTime" readonly="readonly" style="width:268px;" value="<fmt:formatDate value="${storageDate.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" class="easyui-validatebox spinner"/>
			</td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3">
				<textarea id="memberGrade_mgr_memberGrade_detail_remark" name="remark" readonly="readonly" style="width:670px;" class="spinner formta">${storageDate.remark}</textarea>
			</td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#memberGrade_mgr_memberGrade_detail_status').val(renderGridValue('${storageDate.status}',fields.status));
	$('#memberGrade_mgr_memberGrade_detail_yesOrNo').val(renderGridValue('${storageDate.yesOrNo}',fields.yesOrNo));
</script>

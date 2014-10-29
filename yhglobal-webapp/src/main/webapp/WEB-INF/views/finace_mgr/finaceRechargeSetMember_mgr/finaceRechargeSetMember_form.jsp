<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="carrierCarInformation_mgr_grade_form" method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>充值名称：</td>
			<td>
				<input type="hidden" id="finace_mgr_rechargeSetCarrier_form_rechargeSetId" name="rechargeSetId" value="${finaceRechargeSetMemberData.rechargeSetId}" />
				<input id="finace_mgr_rechargeSetCarrier_form_rechargeName" style="width:268px;height: 20px;" name="rechargeSetName" value="${finaceRechargeSetMemberData.rechargeSetName}" class="easyui-validatebox spinner"  required="true"/>
			</td>
			<td>充值类型:</td>
	    	<td>
	    	<input id="finace_mgr_rechargeSetCarrier_form_rechargeSetType" style="width:268px;height: 20px;" type="text" name="rechargeSetType" value="${finaceRechargeSetMemberData.rechargeSetType}" required="true" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.rechargeType"/>
	    	</td>
		</tr>
		<tr>
			<td>会员等级：</td>
			<td>
			    <input  type="hidden" name="memberGradeid" id="finace_mgr_rechargeSetMember_form_gradeId_hidden" value="${finaceRechargeSetMemberData.memberGradeid }" >
				<input id="finace_mgr_rechargeSetMember_form_gradeId" style="width:268px;height: 20px;" disabled="disabled"  value="${finaceRechargeSetMemberData.gradeDisplay}" required="true"/>
			</td>
			<td>取费方式:</td>
	    	<td>
	    	<input id="finace_mgr_rechargeSetMember_form_feeWay" style="width:268px;height: 20px;" type="text" name="feeWay"  value="${finaceRechargeSetMemberData.feeWay}" required="true" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.feeWay"/>
	    	</td>
		</tr>
			<tr>
			<td>手续费率:</td>
	    	<td>
	    	<input id="finace_mgr_rechargeSetMember_form_rechargeRate" style="width:268px;height: 20px;" value="${finaceRechargeSetMemberData.rechargeRate}" name="rechargeRate" class="easyui-numberbox" disabled="disabled" required="true" data-options="min:0,precision:4"/>
	    	</td>
	    	<td>固定金额收取 ：</td>
			<td>
				<input id="finace_mgr_rechargeSetMember_form_rechargeMoney" style="width:268px;height: 20px;" name="rechargeMoney" value="${finaceRechargeSetMemberData.rechargeMoney}" class="easyui-numberbox" disabled="disabled" required="true" data-options="min:0,precision:4"/>
			</td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3">
				<textarea id="finace_mgr_rechargeSetMember_form_remark" name="remark" style="width:660px;" class="spinner formta">${finaceRechargeSetMemberData.remark}</textarea>
			</td>
		</tr>
	</table>
</form>
<script type="text/javascript">
      
		var record = $("#finace_mgr_rechargeSetMember_form_feeWay").val();
		if(record != ""){
			if("proportion" == record){
				$("#finace_mgr_rechargeSetMember_form_rechargeRate").attr("disabled",false);
				$("#finace_mgr_rechargeSetMember_form_rechargeMoney").attr("disabled",true);
			}else{
				$("#finace_mgr_rechargeSetMember_form_rechargeMoney").attr("disabled",false);
				$("#finace_mgr_rechargeSetMember_form_rechargeRate").attr("disabled",true);
			}
		}
		
		$("#finace_mgr_rechargeSetMember_form_feeWay").combobox({
		onSelect:function(record){
			if("proportion" == record.value){
				$("#finace_mgr_rechargeSetMember_form_rechargeRate").attr("disabled",false);
				$("#finace_mgr_rechargeSetMember_form_rechargeMoney").attr("disabled",true);
				$('#finace_mgr_rechargeSetMember_form_rechargeMoney').numberbox('setValue', 0);
			}else{
				$("#finace_mgr_rechargeSetMember_form_rechargeMoney").attr("disabled",false);
				$("#finace_mgr_rechargeSetMember_form_rechargeRate").attr("disabled",true);
				$('#finace_mgr_rechargeSetMember_form_rechargeRate').numberbox('setValue', 0);
			}
		}
		});


	//用于combogrid的客户信息绑定
	$('#finace_mgr_rechargeSetMember_form_gradeId').combogrid({
		panelWidth:450,
		fit:true,//控件自动resize占满窗口大小
		//iconCls:'icon-save',//图标样式
		border:false,//是否存在边框
		fitColumns:true,//自动填充行
		nowrap: true,//禁止单元格中的文字自动换行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
		singleSelect:true,//限制单选
		checkOnSelect:false,//选择复选框的时候选择该行
		selectOnCheck:false,//选择的时候复选框打勾
	    //value:'${messageNoticeData.addresseeDisplay}',    
	    idField:'gradeId',    
	    textField:'gradeName',    
	    url: ctx + '/do/shipperMemberGrade/list.json',
	    sortName: 'createTime',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
	    columns : [ [ 
			{
				field:'gradeId',
				title:'ID',
				checkbox:true
			},{
				field : 'gradeName',
				title : '等级名称',
				width : 80,
				sortable:true
			}, {
				field : 'scopeStart',
				title : '信誉开始值',
				width : 60,
				sortable:true
			}, {
				field : 'scopeStop',
				title : '信誉结束值',
				width : 100,
				sortable:true
			} ] ],
			pagination : true,//True 就会在 datagrid 的底部显示分页栏
			pageSize : 10,//注意，pageSize必须在pageList存在
			pageList : [2,10,50,100],//从session中获取
			rownumbers : true,//True 就会显示行号的列
		loadMsg : '数据加载中....',
		mode : 'remote',
		delay : 200,
		onSelect: function (rowIndex, rowData){
			var data=$('#finace_mgr_rechargeSetMember_form_gradeId').combogrid('grid').datagrid('getSelected');
			$("#finace_mgr_rechargeSetMember_form_gradeId_hidden").val(data.gradeId);
		}
	});
</script>
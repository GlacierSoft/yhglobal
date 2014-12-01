<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px" id="carrierMessageNoticeForm">
	<table class="formtable">
		<tr>
			<td>发件人：</td>
			<td >
				<input id="messageNotice_mgr_messageNotice_form_sender" style="width:268px;" name="sender" value="${userCnName}" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>收件人：</td>
			<td>
				<input id="messageNotice_mgr_messageNotice_form_addressee" style="width:268px;" name="receiver"/>
			</td>
		</tr>
		<tr>
			<td>标题：</td>
			<td>
			<input id="messageNotice_mgr_messageNotice_form_title" name="title"  style="width:268px;height: 18px" class="easyui-validatebox spinner"  required="true"  validType="length[1,12]" invalidMessage="标题必须在1到12个字符之间"/>
			</td>
		</tr>
		<tr>
			<td>内容：</td>
			<td>
				<textarea id="messageNotice_mgr_messageNotice_form_content" name="content" style="width:268px;" class="spinner formta"></textarea>
			</td>
		</tr>
	</table>
</form>

<script type="text/javascript">
	//初始化新闻状态下拉框
	$('#messageNotice_mgr_messageNotice_form_letterstatus').combobox({  
		valueField : 'value',
		height:21,
		width:268,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		required:true,
		data : fields.letterStatus
	});
	//用于combogrid的客户信息绑定
	$('#messageNotice_mgr_messageNotice_form_addressee').combogrid({
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
	    idField:'carrierMemberId',    
	    textField:'memberName',    
	    url: ctx + '/do/carrierMember/list.json?status=enable',
	    sortName: 'createTime',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		required : true,
	    columns : [ [ 
   		{
   			field:'carrierMemberId',
   			title:'ID',
   			checkbox:true
   		},{
   			field : 'memberName',
   			title : '会员姓名',
   			width : 80,
   			sortable:true
   		}, {
   			field : 'status',
   			title : '会员状态',
   			width : 60,
   			sortable:true,
   			formatter: function(value,row,index){//数据格式化，例如man显示是，woman显示女
   				return renderGridValue(value,fields.status);
   			}
   		}] ],
   		pagination : true,//True 就会在 datagrid 的底部显示分页栏
   		pageSize : 10,//注意，pageSize必须在pageList存在
   		pageList : [2,10,50,100],//从session中获取
   		rownumbers : true,//True 就会显示行号的列
		loadMsg : '数据加载中....',
		mode : 'remote',
		delay : 200
	});
</script>

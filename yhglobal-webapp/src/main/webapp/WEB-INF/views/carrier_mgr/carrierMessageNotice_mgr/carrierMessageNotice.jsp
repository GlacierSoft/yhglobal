<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui"
	uri="http://com.glacier.permissions.com.cn/tag/easyui"%>
<%    
String path = request.getContextPath();    
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";    
%>

<script type="text/javascript"> 
	$.util.namespace('glacier.carrier_mgr.carrierMessageNotice_mgr.carrierMessageNotice');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

	//定义toolbar的操作，对操作进行控制
	glacier.carrier_mgr.carrierMessageNotice_mgr.carrierMessageNotice.param = {
		toolbarId : 'carrierMessageNoticeDataGrid_toolbar',
		actions : {
             edit:{flag:'edit',controlType:'single'},
             del:{flag:'del',controlType:'multiple'},
             print:{flag:'print',controlType:'single'}
          }
     };

	//初始化承运商合同记录DataGrid
	glacier.carrier_mgr.carrierMessageNotice_mgr.carrierMessageNotice.carrierMessageNoticeDataGrid = $('#carrierMessageNoticeDataGrid').datagrid({
						fit : true,//控件自动resize占满窗口大小
						iconCls : 'icon-save',//图标样式
						border : false,//是否存在边框
						fitColumns : false,//自动填充行
						nowrap : true,//禁止单元格中的文字自动换行
						autoRowHeight : false,//禁止设置自动行高以适应内容
						striped : true,//true就是把行条纹化。（即奇偶行使用不同背景色）
						singleSelect : true,//限制单选
						checkOnSelect : false,//选择复选框的时候选择该行
						selectOnCheck : false,//选择的时候复选框打勾
						url : ctx + '/do/carrierMemberMessageNotice/list.json',
						sortName : 'createTime',//排序字段名称
						sortOrder : 'DESC',//升序还是降序
						remoteSort : true,//开启远程排序，默认为false
						idField : 'transactionMemberId',
						columns : [ [ {
							field : 'transactionMemberId',
							title : 'ID',
							checkbox : true
						}, {
							field : 'senderDisplay',
							title : '发送者',
							width : 120,
							sortable : true
						},{
							field : 'receiverDisplay',
							title : '接收者',
							width : 120,
							sortable : true
						},{
							field : 'sendtime',
							title : '发送时间',
							width : 120,
							sortable : true
						},{
							field : 'title',
							title : '标题',
							width : 120,
							sortable : true,
						}, {
							field : 'content',
							title : '内容',
							width : 120,
							sortable : true,
						}, {
							field : 'letterstatus',
							title : '状态',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {//数据格式化
								return renderGridValue(value, fields.letterStatus);
							}
						},{
							field : 'lettertype',
							title : '类型',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {//数据格式化
								return renderGridValue(value, fields.letterType);
							}
						},{
							field : 'createrDisplay',
							title : '创建人',
							sortable : true,
							width : 120
						}, {
							field : 'createTime',
							title : '创建时间',
							sortable : true,
							width : 200
						}, {
							field : 'updaterDisplay',
							title : '更新人',
							sortable : true,
							width : 120
						}, {
							field : 'updateTime',
							title : '更新时间',
							sortable : true,
							width : 200
						} , {
							field : 'remark',
							title : '备注',
							sortable : true,
							width : 120
						}] ],
						pagination : true,//True 就会在 datagrid 的底部显示分页栏
						pmemberSize : 10,//注意，pmemberSize必须在pmemberList存在
						pmemberList : [ 2, 10, 50, 100 ],//从session中获取
						rownumbers : true,//True 就会显示行号的列
						toolbar : '#carrierMessageNoticeDataGrid_toolbar',
						onCheck : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.carrier_mgr.carrierMessageNotice_mgr.carrierMessageNotice.param ,this).check();
						},
						onCheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.carrier_mgr.carrierMessageNotice_mgr.carrierMessageNotice.param ,this).check();
						},
						onUncheck : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.carrier_mgr.carrierMessageNotice_mgr.carrierMessageNotice.param ,this).unCheck();
						},
						onUncheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.carrier_mgr.carrierMessageNotice_mgr.carrierMessageNotice.param ,this).unCheck();
						},
						onSelect : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.carrier_mgr.carrierMessageNotice_mgr.carrierMessageNotice.param ,this).select();
						},
						onUnselectAll : function(rows) {
							action_controller(
									glacier.carrier_mgr.carrierMessageNotice_mgr.carrierMessageNotice.param ,this).unSelect();
						},
						onLoadSuccess : function(index, record) {//加载数据成功触发事件
							$(this).datagrid('clearSelections');
							$(this).datagrid('clearChecked');
							var rows=$(this).datagrid("getRows");
							if(rows.length==0){   
								var body = $(this).data().datagrid.dc.body2;
								body.find('table tbody').append('<tr><td width="' + body.width() + '" style="height: 25px; text-align: center;color:red">暂时没有记录</td></tr>');
							}
						},
						onDblClickRow : function(rowIndex, rowData){
                        $.easyui.showDialog({
								title : '【' + rowData.receiverDisplay + '】资金交易详细信息',
								href : ctx+ '/do/carrierMemberMessageNotice/intoDetail.htm?messageNoticeId='+ rowData.messageNoticeId,//从controller请求jsp页面进行渲染
								width : 530,
								height : 340,
								resizable : false,
								enableApplyButton : false,
								enableSaveButton : false
							});
						}
					});
	
	
	   //站内信息添加
	  glacier.carrier_mgr.carrierMessageNotice_mgr.carrierMessageNotice.addMessageNotice=function(){
		  $("#carrierMessageDailog").dialog({
			  title:"邮件发送",
			  width: 370,    
			  height: 270,
			  href :  ctx + '/do/carrierMemberMessageNotice/intoForm.htm',//从controller请求jsp页面进行渲染
			  modal: true,
		      closed: false   
		});
	  };
	
	
	//状态下拉项
	  $('#messageLetterstatus').combobox({
			valueField : 'value',
			//height:18,
			width : 80,
			textField : 'label',
			panelHeight : 'auto',
			editable : false,
			//required:true,
			data : fields.letterStatus
		});
	
	  $('#messageLettertype').combobox({
			valueField : 'value',
			//height:18,
			width : 80,
			textField : 'label',
			panelHeight : 'auto',
			editable : false,
			//required:true,
			data : fields.letterType
		});
	  
	  //邮件发送
	  function sendMessage(){
		 $('#carrierMessageDailog').dialog('close');
		 $.messager.progress({title : "短信提示",text : "短信正在发送中..."});  
         $.ajax({
			   type: "POST",
			   url: ctx + '/do/carrierMemberMessageNotice/add.json',
			   data:$("#carrierMessageNoticeForm").serialize(),
			   dataType:'json',
			   success: function(r){
				   $.messager.progress('close');
                   if(r.success){
				    	$.messager.alert('我的消息','邮件发送成功','info');
                      }else{
                    	$.messager.alert('我的消息','邮件发送失败，请联系管理员！','info');
                    }
			   },
		});
	  }
	  
</script>
<!--自定义对话款  -->
<div id="carrierMessageDailog" class="easyui-dialog"  buttons="#carrierMessageDailogButton" closed="true"></div>

<div id="carrierMessageDailogButton">   
    <table cellpadding="0" cellspacing="0" style="width:100%">   
        <tr>   
            <td style="text-align:right">   
                <a href="#" class="easyui-linkbutton" iconCls="icon-save" onclick="sendMessage();">发送</a>   
                <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#carrierMessageDailog').dialog('close');">关闭</a>   
            </td>   
        </tr>   
    </table>   
</div>

<!-- 所有承运商合同记录表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="carrierMessageNoticeGridPanel" data-options="region:'center',border:true">
		<table id="carrierMessageNoticeDataGrid">
              <!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
              <glacierui:toolbar panelEnName="carrierMessageNoticeList"
				toolbarId="carrierMessageNoticeDataGrid_toolbar" menuEnName="carrierMessageNotice" />
		</table>
	</div>
	<div data-options="region:'north',split:true"
		style="height: 40px; padding-left: 10px;">
		<form id="carrierMessageNoticeSearchForm">
			<table>
				<tr>
				    <td>接收者：</td>
					<td><input  name="receiverDisplay" style="width: 80px;"
						class="spinner" /></td>
				    <td>状态：</td>
					<td><input id="messageLetterstatus" name="letterstatus" style="width: 80px;"
						class="spinner" /></td>
					<td>类型：</td>
					<td><input name="lettertype" id="messageLettertype" style="width: 80px;"
						class="spinner" /></td>
					<td>发送时间：</td>
					<td><input name="createStartTime" class="easyui-datetimebox"
						style="width: 100px;" /> - <input name="createEndTime"
						class="easyui-datetimebox" style="width: 100px;" /></td>
					<td><a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-in',plain:true"
						onclick="glacier.carrier_mgr.carrierMessageNotice_mgr.carrierMessageNotice.carrierMessageNoticeDataGrid.datagrid('load',glacier.serializeObject($('#carrierMessageNoticeSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-out',plain:true"
						onclick="$('#carrierMessageNoticeSearchForm input').val('');glacier.carrier_mgr.carrierMessageNotice_mgr.carrierMessageNotice.carrierMessageNoticeDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>
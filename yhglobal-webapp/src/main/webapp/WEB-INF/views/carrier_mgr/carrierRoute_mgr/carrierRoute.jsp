<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui"
	uri="http://com.glacier.permissions.com.cn/tag/easyui"%>
<!-- 引入jstl解析标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 获取项目根path -->
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<script type="text/javascript">
	$.util.namespace('glacier.carrier_mgr.carrierRoute_mgr.route');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

	//定义toolbar的操作，对操作进行控制
	glacier.carrier_mgr.carrierRoute_mgr.route.param = {
		toolbarId : 'routeDataGrid_toolbar',
		actions : {
             status:{flag:'status',controlType:'single'},
             audit:{flag:'audit',controlType:'single'},
             edit:{flag:'edit',controlType:'single'}
          }
     };

	//初始化班线DataGrid
	glacier.carrier_mgr.carrierRoute_mgr.route.routeDataGrid = $('#routeDataGrid').datagrid({
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
						url : ctx + '/do/carrierRoute/list.json',
						sortName : 'createTime',//排序字段名称
						sortOrder : 'DESC',//升序还是降序
						remoteSort : true,//开启远程排序，默认为false
						idField : 'routerId',
						columns : [ [ {
							field : 'routerId',
							title : 'ID',
							checkbox : true
						},{
							field : 'routeNumber',
							title : '班次编号',
							width : 120,
							sortable : true
						},{
							field : 'routeName',
							title : '班线名称',
							width : 120,
							sortable : true
						},{
							field : 'carrierDisplay',
							title : '承运商',
							width : 120,
							sortable : true
						},{
							field : 'routeType',
							title : '班线类型',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {//数据格式化，例如man显示是，woman显示女
								return renderGridValue(value, fields.routeType);
							}
						},{
							field : 'status',
							title : '班线状态',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {//数据格式化，例如man显示是，woman显示女
								return renderGridValue(value, fields.status);
							}
						},{
							field : 'routeOrigin',
							title : '班线起点',
							width : 120,
							sortable : true
						},{
							field : 'originAddress',
							title : '发货站地址',
							width : 120,
							sortable : true
						},{
							field : 'routeBytime',
							title : '在途时间(小时)',
							width : 120,
							sortable : true
						},{
							field : 'routeStop',
							title : '班线终点',
							width : 120,
							sortable : true
						},{
							field : 'stopAddress',
							title : '到货站地址',
							width : 120,
							sortable : true
						},{
							field : 'startofTime',
							title : '发车时间',
							width : 120,
							sortable : true
						},{
							field : 'ceaseTakeDeliveryTime',
							title : '截止收货时间',
							width : 120,
							sortable : true
						},{
							field : 'availablePosition',
							title : '可定仓位(剩/%)',
							width : 120,
							sortable : true
						},{
							field : 'boxType',
							title : '车辆箱型',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {//数据格式化，例如man显示是，woman显示女
								return renderGridValue(value, fields.boxType);
							}
						},{
							field : 'startingPrice',
							title : '起步价',
							width : 120,
							sortable : true
						},{
							field : 'weightGoodsPrice',
							title : '重货价(元/公斤)',
							width : 120,
							sortable : true
						},{
							field : 'lightGoodsPrice',
							title : '轻货价(元/立方)',
							width : 120,
							sortable : true
						},{
							field : 'mileage',
							title : '里程(公里)',
							width : 120,
							sortable : true
						},{
							field : 'extractGoodsTime',
							title : '预计可提货时间',
							width : 120,
							sortable : true
						},{
							field : 'premium',
							title : '保险费',
							width : 120,
							sortable : true
						},{
							field : 'telephone',
							title : '联系电话',
							width : 120,
							sortable : true
						},{
							field : 'auditState',
							title : '审核状态',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {//数据格式化，例如man显示是，woman显示女
								return renderGridValue(value, fields.auditState);
							}
						},{
							field : 'auditDisplay',
							title : '审核人',
							width : 120,
							sortable : true
						},{
							field : 'auditTime',
							title : '审核时间',
							width : 120,
							sortable : true
						},{
							field : 'auditOpinion',
							title : '审核备注',
							width : 120,
							sortable : true
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
						} ,{
							field : 'remark',
							title : '备注',
							sortable : true,
							width : 120
						} ] ],
						pagination : true,//True 就会在 datagrid 的底部显示分页栏
						pmemberSize : 10,//注意，pmemberSize必须在pmemberList存在
						pmemberList : [ 2, 10, 50, 100 ],//从session中获取
						rownumbers : true,//True 就会显示行号的列
						toolbar : '#routeDataGrid_toolbar',
						onCheck : function(rowIndex, rowData) {//选择行事件触发 
							action_controller( 
									glacier.carrier_mgr.carrierRoute_mgr.route.param,this).check();
						},
						onCheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.carrier_mgr.carrierRoute_mgr.route.param,this).check();
						},
						onUncheck : function(rowIndex, rowData) {//选择行事件触发 
							action_controller(
									glacier.carrier_mgr.carrierRoute_mgr.route.param,this).unCheck();
						},
						onUncheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.carrier_mgr.carrierRoute_mgr.route.param,this).unCheck();
						},
						onSelect : function(rowIndex, rowData) {//选择行事件触发
						  	action_controller(
										glacier.carrier_mgr.carrierRoute_mgr.route.param,this).select();
							 
						},
						onUnselectAll : function(rows) {
							action_controller(
									glacier.carrier_mgr.carrierRoute_mgr.route.param,this).unSelect();
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
								title : '【' + rowData.routeName + '】班线详细信息',
								href : ctx+ '/do/carrierRoute/intoDetail.htm?routerId='+ rowData.routerId,//从controller请求jsp页面进行渲染
								height : 570,
								width:630,
								resizable : false,
								enableApplyButton : false,
								enableSaveButton : false
							});  
						}
					});
 
	
	
	//点击审核按钮触发方法 
	glacier.carrier_mgr.carrierRoute_mgr.route.audit= function(){
		var row = glacier.carrier_mgr.carrierRoute_mgr.route.routeDataGrid.datagrid("getSelected");
	  	glacier.basicAddOrEditDialog({
				title : '【'+row.routeName+'】-班线审核',
				width : 630,
				height : 580,
				queryUrl : ctx + '/do/carrierRoute/intoAudit.htm',
				submitUrl : ctx + '/do/carrierRoute/audit.json',
				queryParams : {
					routerId : row.routerId
				},
				successFun : function (){
					glacier.carrier_mgr.carrierRoute_mgr.route.routeDataGrid.datagrid('reload'); 
				}
			});  
	};
	  
	
	//点击编辑按钮触发方法
     glacier.carrier_mgr.carrierRoute_mgr.route.editRoute = function(){
		var row =glacier.carrier_mgr.carrierRoute_mgr.route.routeDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '【'+row.routeName+'】-班线编辑',
			width : 610,
			height : 480,
			queryUrl : ctx + '/do/carrierRoute/intoForm.htm',
			submitUrl : ctx + '/do/carrierRoute/edit.json',
			queryParams : {
				routerId : row.routerId
			},
			successFun : function (){
				glacier.carrier_mgr.carrierRoute_mgr.route.routeDataGrid.datagrid('reload');
			}
		});
	};
	
	
	//点击启用禁用按钮触发方法
	glacier.carrier_mgr.carrierRoute_mgr.route.editRouteStatus = function(){
      var row = glacier.carrier_mgr.carrierRoute_mgr.route.routeDataGrid.datagrid("getSelected");
      $.messager.confirm('请确认', '是否要启用/禁用该班线?', function(r){
		if (r){ 
		    $.ajax({
				   type: "POST",
				   url: ctx + '/do/carrierRoute/status.json',
				   data: {routerId:row.routerId}, 
				   dataType:'json',
				   success: function(r){
					   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
						   $.messager.show({
								title:'提示',
								timeout:3000,
								msg:r.msg
							});
						   glacier.carrier_mgr.carrierRoute_mgr.route.routeDataGrid.datagrid('reload');
					   }else{
							$.messager.show({//后台验证弹出错误提示信息框
								title:'错误提示',
								width:380,
								height:120,
								msg: '<span style="color:red">'+r.msg+'<span>',
								timeout:4500
							});
						}
				   }
			 });  
          }
		});
	}; 
	//班线资料模糊查询
	glacier.carrier_mgr.carrierRoute_mgr.route.quickquery = function(value, name) {
		var obj = $.parseJSON('{"' + name + '":"' + value + '"}');//将值和对象封装成obj作为参数传递给后台
		glacier.carrier_mgr.carrierRoute_mgr.route.routeDataGrid.datagrid('load',obj);
	};
	//下拉项的值
	$('#routeSearchForm_status').combobox({
		valueField : 'value',
		//height:18,
		width : 80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.status
	}); 
	//下拉项的值
	$('#routeSearchForm_routeType').combobox({
		valueField : 'value',
		//height:18,
		width : 80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.routeType
	});
</script>

<!-- 所有班线列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="routeGridPanel" data-options="region:'center',border:true">
		<table id="routeDataGrid">
			<glacierui:toolbar panelEnName="routeList"
				toolbarId="routeDataGrid_toolbar" menuEnName="carrierRoute" />
			<!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true"
		style="height: 40px; padding-left: 10px;">
		<form id="routeSearchForm">
			<table>
				<tr>
				<td>班线编号：</td>
					<td><input name="routeNumber" style="width: 80px;"
						class="spinner" /></td> 
					<td>班线名称：</td>
					<td><input name="routeName" style="width: 80px;"
						class="spinner" /></td> 
				    <td>班线类型：</td>
					<td><input id="routeSearchForm_routeType" name="routeType" style="width: 80px;"
						class="spinner" /></td> 
					<td>状态：</td>
					<td><input id="routeSearchForm_status" name="status"
						style="width: 80px;" class="spinner" /></td> 
						<td>始发站：</td>
					<td>
					  <input name="routeOrigin" id="remark" style="height: 23px;border-color: #c3d9e0" autocomplete="off" type="text" value="请选择/输入城市名称" class="city_input  inputFocus proCityQueryAll proCitySelAll ">
	             </td> <td>终点站：</td>
					<td>
					  <input name="routeStop" id="remark" style="height: 23px;border-color: #c3d9e0" autocomplete="off" type="text" value="请选择/输入城市名称" class="city_input  inputFocus proCityQueryAll proCitySelAll ">
	               </td>  
					<td><a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-in',plain:true"
						onclick="glacier.carrier_mgr.carrierRoute_mgr.route.routeDataGrid.datagrid('load',glacier.serializeObject($('#routeSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-out',plain:true"
						onclick="$('#routeSearchForm input').val('');glacier.carrier_mgr.carrierRoute_mgr.route.routeDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>

									<!--弹出省省市-->
	<div class="provinceCityAll" style="z-index:20;position:absolute;left:50%;margin-left:-170px;top:50%;margin-top:-55px;">
	  <div class="tabsArea clearfix">
	    <ul class="">
	      <li><a href="javascript:" class="current" tb="hotCityAll">热门城市</a></li>
	      <li><a href="javascript:" tb="provinceAll">省份</a></li>
	      <li><a href="javascript:" tb="cityAll" id="cityAll">城市</a></li>
	      <li><a href="javascript:" tb="countyAll" id="countyAll">区县</a></li>
	    </ul>
	  </div>
	  <div class="con">
	    <div class="hotCityAll invis">
	      <div class="pre"><a></a></div>
	      <div class="list">
	        <ul>
	          <!-- 					<li><a href="javascript:"  class="current">南京</a></li> -->
	        </ul>
	      </div>
	      <div class="next"><a class="can"></a></div>
	    </div>
	    <div class="provinceAll invis">
	      <div class="pre"><a></a></div>
	      <div class="list">
	        <ul>
	          <!-- 					<li><a href="javascript:"  class="current">江西省</a></li> -->
	        </ul>
	      </div>
	      <div class="next"><a class="can"></a></div>
	    </div>
	    <div class="cityAll invis">
	      <div class="pre"><a></a></div>
	      <div class="list">
	        <ul>
	          <!-- 					<li><a href="javascript:"  class="current">南京</a></li> -->
	        </ul>
	      </div>
	      <div class="next"><a class="can"></a></div>
	    </div>
	    <div class="countyAll invis">
	      <div class="pre"><a></a></div>
	      <div class="list">
	        <ul>
	        </ul>
	      </div>
	      <div class="next"><a class="can"></a></div>
	    </div>
	  </div>
	</div> 
<script src="${ctx}/resources/area/js/public.js"></script> 
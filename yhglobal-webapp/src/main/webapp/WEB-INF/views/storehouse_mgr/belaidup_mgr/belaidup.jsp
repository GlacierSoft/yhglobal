<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui"
	uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">
	$.util.namespace('glacier.belaidup_mgr.belaidup_mgr.belaidup');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

	//定义toolbar的操作，对操作进行控制
	glacier.belaidup_mgr.belaidup_mgr.belaidup.param = {
		toolbarId : 'belaidupDataGrid_toolbar',
		actions : {
	            edit:{flag:'edit',controlType:'single'},
	            del:{flag:'del',controlType:'multiple'},
	            create:{flag:'create',controlType:'multiple'},
	            dispatching:{flag:'dispatching',controlType:'single'},
	            damage:{flag:'damage',controlType:'single'},
	         }
     };

	//初始化DataGrid
	glacier.belaidup_mgr.belaidup_mgr.belaidup.belaidupDataGrid = $('#belaidupDataGrid').datagrid({
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
		url : ctx + '/do/belaidup/list.json',
		sortName : 'createTime',//排序字段名称
		sortOrder : 'DESC',//升序还是降序
		remoteSort : true,//开启远程排序，默认为false
		idField : 'belaidupId',
		columns : [ [ {
			field : 'belaidupId',
			title : 'ID',
			checkbox : true
		},{
			field : 'belaidupProdName',
			title : '货物名称',
			width : 120,
			sortable : true
		},{
			field : 'shipperMemberDisplay',
			title : '货主会员名称',
			width : 120,
			sortable : true
		},{
			field : 'belaidupUnitprice',
			title : '货物单价',
			width : 120,
			sortable : true
		},{
			field : 'goodsTypeDisplay',
			title : '货物类型',
			width : 120,
			sortable : true
		},{
			field : 'yesOrNo',
			title : '加急配送',
			width : 120,
			sortable : true,
			formatter : function(value, row, index) {
				return renderGridValue(value, fields.yesOrNo);
			}
		},{
			field : 'belaidupInitiatin',
			title : '起始站',
			width : 120,
			sortable : true
		},{
			field : 'belaidupTerminu',
			title : '终点站',
			width : 120,
			sortable : true
		},{
			field : 'replenishment',
			title : '取货方式',
			width : 120,
			sortable : true,
			formatter : function(value, row, index) {
				return renderGridValue(value, fields.replenishment);
			}
		},{
			field : 'orderConsignee',
			title : '收货人名称',
			width : 120,
			sortable : true
		},{
			field : 'sortingStauts',
			title : '分拣状态',
			width : 120,
			sortable : true,
			formatter : function(value, row, index) {
				return renderGridValue(value, fields.sortingStauts);
			}
		},{
			field : 'storageDisplay',
			title : '货物库房',
			width : 120,
			sortable : true
		},{
			field : 'createrDisplay',
			title : '创建人',
			sortable : true,
			width : 120
		},{
			field : 'createTime',
			title : '创建时间',
			sortable : true,
			width : 200
		},{
			field : 'updaterDisplay',
			title : '更新人',
			sortable : true,
			width : 120
		}, {
			field : 'updateTime',
			title : '更新时间',
			sortable : true,
			width : 200
		},{
			field : 'remark',
			title : '备注',
			sortable : true
		} ] ],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pbelaidupSize : 10,//注意，pbelaidupSize必须在pbelaidupList存在
		pbelaidupList : [ 2, 10, 50, 100 ],//从session中获取
		rownumbers : true,//True 就会显示行号的列
		toolbar : '#belaidupDataGrid_toolbar',
		onCheck : function(rowIndex, rowData) {//选择行事件触发
			action_controller(
					glacier.belaidup_mgr.belaidup_mgr.belaidup.param,this).check();
		},
		onCheckAll : function(rows) {//取消勾选行状态触发事件
			action_controller(
					glacier.belaidup_mgr.belaidup_mgr.belaidup.param,this).check();
		},
		onUncheck : function(rowIndex, rowData) {//选择行事件触发
			action_controller(
					glacier.belaidup_mgr.belaidup_mgr.belaidup.param,this).unCheck();
		},
		onUncheckAll : function(rows) {//取消勾选行状态触发事件
			action_controller(
					glacier.belaidup_mgr.belaidup_mgr.belaidup.param,this).unCheck();
		},
		onSelect : function(rowIndex, rowData) {//选择行事件触发
			action_controller(
					glacier.belaidup_mgr.belaidup_mgr.belaidup.param,this).select();
		},
		onUnselectAll : function(rows) {
			action_controller(
					glacier.belaidup_mgr.belaidup_mgr.belaidup.param,this).unSelect();
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
				title : '货物详细信息',
				href : ctx+ '/do/belaidup/intoDetail.htm?belaidupId='+ rowData.belaidupId,//从controller请求jsp页面进行渲染
				width : 830,
				height : 630,
				resizable : false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	
	//点击增加按钮触发方法
	glacier.belaidup_mgr.belaidup_mgr.belaidup.addBelaidup = function(){
		glacier.basicAddOrEditDialog({
			title : '【货物】- 增加',
			width : 840,
			height : 560,
			queryUrl : ctx + '/do/belaidup/intoForm.htm',
			submitUrl : ctx + '/do/belaidup/add.json',
			successFun : function (){
				glacier.belaidup_mgr.belaidup_mgr.belaidup.belaidupDataGrid.datagrid('reload');
			}
		});
	};
	//点击编辑按钮触发方法
	glacier.belaidup_mgr.belaidup_mgr.belaidup.editBelaidup = function(){
		var row = glacier.belaidup_mgr.belaidup_mgr.belaidup.belaidupDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '【货物】- 编辑',
			width : 840,
			height : 560,
			queryUrl : ctx + '/do/belaidup/intoForm.htm',
			submitUrl : ctx + '/do/belaidup/edit.json',
			queryParams : {
				belaidupId : row.belaidupId
			},
			successFun : function (){
				glacier.belaidup_mgr.belaidup_mgr.belaidup.belaidupDataGrid.datagrid('reload');
			}
		});
	};
	
	//点击删除按钮触发方法
	glacier.belaidup_mgr.belaidup_mgr.belaidup.delBelaidup = function() {
		var rows = glacier.belaidup_mgr.belaidup_mgr.belaidup.belaidupDataGrid.datagrid("getChecked");
		var belaidupIds = [];//删除的id标识
		var belaidupName = [];
		for ( var i = 0; i < rows.length; i++) {
			belaidupIds.push(rows[i].belaidupId);
			belaidupName.push(rows[i].belaidupProdName);
		}
		if (belaidupIds.length > 0) {
			$.messager.confirm('请确认','是否要删除该记录',function(r){
                   if (r){
                   	 $.ajax({ 
                   		type: "POST",
                   	    url : ctx+ '/do/belaidup/del.json',
						data : {
							belaidupIds : belaidupIds.join(','),
							belaidupName : belaidupName.join(',')
						},
						dataType : 'json',
						success : function(r) {
							if (r.success) {//因为失败成功的方法都一样操作，这里故未做处理
								$.messager.show({
									title : '提示',
									timeout : 3000,
									msg : r.msg
								});
                                            glacier.belaidup_mgr.belaidup_mgr.belaidup.belaidupDataGrid.datagrid('reload');
							} else {
								$.messager.show({//后台验证弹出错误提示信息框
											title : '错误提示',
											width : 380,
											height : 120,
											msg : '<span style="color:red">'+ r.msg+ '<span>',
											timeout : 4500
										});
							}
						}
					});
				}
			});
		}
	};
	
	//点击生成订单按钮触发方法
	glacier.belaidup_mgr.belaidup_mgr.belaidup.orderBelaidup = function() {
		var rows = glacier.belaidup_mgr.belaidup_mgr.belaidup.belaidupDataGrid.datagrid("getChecked");
		var belaidupIds = [];//id标识
		var belaidupName = [];
		for ( var i = 0; i < rows.length; i++) {
			belaidupIds.push(rows[i].belaidupId);
			belaidupName.push(rows[i].belaidupProdName);
		}
		if (belaidupIds.length > 0) {
			$.messager.confirm('请确认','是否将【'+rows.length+'】条货物记录合成订单',function(r){
                   if (r){
                   	 $.ajax({ 
                   		type: "POST",
                   	    url : ctx+ '/do/order/add.json',
						data : {
							belaidupIds : belaidupIds.join(','),
							belaidupName : belaidupName.join(',')
						},
						dataType : 'json',
						success : function(r) {
							if (r.success) {//因为失败成功的方法都一样操作，这里故未做处理
								$.messager.show({
									title : '提示',
									width : 480,
									height : 120,
									timeout : 3000,
									msg : r.msg
								});
                                            glacier.belaidup_mgr.belaidup_mgr.belaidup.belaidupDataGrid.datagrid('reload');
							} else {
								$.messager.show({//后台验证弹出错误提示信息框
											title : '错误提示',
											width : 480,
											height : 120,
											msg : '<span style="color:red">'+ r.msg+ '<span>',
											timeout : 4500
										});
							}
						}
					});
				}
			});
		}
	};
	
	
	
	//配送
	glacier.belaidup_mgr.belaidup_mgr.belaidup.dispatchingBelaidup=function(){
		var row = glacier.belaidup_mgr.belaidup_mgr.belaidup.belaidupDataGrid.datagrid("getSelected");
		if(row.sortingStauts=="hassorting"){
			$.ajax({
    	    	type:"post",
    	    	url:ctx+'/do/ordersDispatching/checkNumb.json',
    	    	data:{"belaidupId":row.belaidupId},
    	    	dataType:"json",
    	    	success:function(data){
    	    		 if(data.success){
    	    			 glacier.basicAddOrEditDialog({
    	    					title : '【'+row.belaidupProdName+'】- 配送',
    	    					width : 560,
    	    					height : 200,
    	    					queryUrl : ctx + '/do/belaidup/intoDispatchingForm.htm',
    	    					submitUrl : ctx + '/do/belaidup/edit.json',
    	    					queryParams : {
    	    						belaidupId : row.belaidupId
    	    					},
    	    					successFun : function (){
    	    						glacier.belaidup_mgr.belaidup_mgr.belaidup.belaidupDataGrid.datagrid('reload');
    	    					}
    	    				});
    	    		 }else{
    	    			 $.messager.alert("操作提示", "【"+row.belaidupProdName+"】配送记录中已存在!","info");
    	    		 }
    	    	  }
    	    	});
			}else{
			$.messager.alert("操作提示", "【"+row.belaidupProdName+"】未分拣，请选择其他数据!","info");
		}
		
	} 
	
	//损坏
	glacier.belaidup_mgr.belaidup_mgr.belaidup.damageBelaidup=function(){
		var row = glacier.belaidup_mgr.belaidup_mgr.belaidup.belaidupDataGrid.datagrid("getSelected");
		if(row.sortingStauts=="waitsorting"){
			$.ajax({
	    	    	type:"post",
	    	    	url:ctx+'/do/storehouseDamage/checkNumb.json',
	    	    	data:{"belaidupId":row.belaidupId},
	    	    	dataType:"json",
	    	    	success:function(data){
	    	    	   if(data.success){
	    	    		   glacier.basicAddOrEditDialog({
	    	   				title : '【'+row.belaidupProdName+'】- 添加损坏',
	    	   				width : 600,
	    	   				height : 240,
	    	   				queryUrl : ctx + '/do/belaidup/intoStorehouseDamage_form.htm',
	    	   				submitUrl : ctx + '/do/storehouseDamage/add.json',
	    	   				queryParams : {
	    	   					belaidupId : row.belaidupId
	    	   				},
	    	   				successFun : function (){
	    	   					glacier.belaidup_mgr.belaidup_mgr.belaidup.belaidupDataGrid.datagrid('reload');
	    	   				}
	    	   			});
	    	    	   }else{
	    	    		   $.messager.alert("操作提示", "【"+row.belaidupProdName+"】损坏记录中已存在!","info");
	    	    	   }
	    	    	}
	    	    });
			
		}else{
			$.messager.alert("操作提示", "【"+row.belaidupProdName+"】已分拣，请选择其他数据!","info");
		}
	}
	
	//模糊查询
	glacier.belaidup_mgr.belaidup_mgr.belaidup.quickquery = function(value, name) {
		var obj = $.parseJSON('{"' + name + '":"' + value + '"}');//将值和对象封装成obj作为参数传递给后台
		glacier.belaidup_mgr.belaidup_mgr.belaidup.belaidupDataGrid.datagrid('load',obj);
	};
	//下拉项的值
	$('#belaidupSearchForm_status').combobox({
		valueField : 'value',
		//height:18,
		width : 80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.belaidupStatus
	});
	$('#belaidup_mgr_belaidup_yesOrNo').combobox({
		valueField : 'value',
		//height:18,
		width : 80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.yesOrNo
	});
	
	$('#belaidupSearchForm_sortingStauts').combobox({
		valueField : 'value',
		//height:18,
		width : 80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.sortingStauts
	});
	
</script>

<!-- 所有列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="belaidupGridPanel" data-options="region:'center',border:true">
		<table id="belaidupDataGrid">
			<glacierui:toolbar panelEnName="BelaidupList"
				toolbarId="belaidupDataGrid_toolbar" menuEnName="belaidup" />
			<!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true"
		style="height: 40px; padding-left: 10px;">
		<form id="belaidupSearchForm">
			<table>
				<tr>
					<td>货物条形码：</td>
					<td><input name="belaidupBarCode" style="width: 80px;"
						class="spinner" /></td> 
					<td>包装条形码：</td>
					<td><input id="belaidup_mgr_belaidup_belaiduptypeId" name="packageCode" style="width: 80px;"
						class="spinner" /></td> 
					<td>起始站：</td>
					<td><input id="belaidup_mgr_belaidup_belaiduptypeId" name="packageCode" style="width: 80px;"
						class="spinner" /></td> 
					<td>货物状态：</td>
					<td><input id="belaidupSearchForm_status" name="belaidupStatus" style="width: 80px;"/></td>
					<td>分拣状态：</td>
					<td><input id="belaidupSearchForm_sortingStauts" name="sortingStauts" style="width: 60px;"/></td>
					<td>创建时间：</td>
					<td><input name="createStartTime" class="easyui-datetimebox"
						style="width: 100px;" /> - <input name="createEndTime"
						class="easyui-datetimebox" style="width: 100px;" /></td>
					<td><a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-in',plain:true"
						onclick="glacier.belaidup_mgr.belaidup_mgr.belaidup.belaidupDataGrid.datagrid('load',glacier.serializeObject($('#belaidupSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-out',plain:true"
						onclick="$('#belaidupSearchForm input').val('');glacier.belaidup_mgr.belaidup_mgr.belaidup.belaidupDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>
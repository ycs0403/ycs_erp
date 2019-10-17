var isEditingRowIndex=-1;//当前正在编辑的行索引

$(function() {
	$('#grid')
	.datagrid(
			{
				columns : [ [
					{
						field : 'goodsuuid',
						title : '商品编号',
						width : 100,
						editor:{
							type:'numberbox',
							options:{
								disabled:true//禁止编辑
							}
						}
					},
					{
						field : 'goodsname',
						title : '商品名称',
						width : 100,
						editor:{
							type:'combobox',
							options:{
								url:'goods_getList',
								textField:'name',
								valueField:'name',
								onSelect:function(goods){
									//获取商品编号的编辑器
									var goodsUuidEditor=$('#grid').datagrid('getEditor',{index:isEditingRowIndex,field:'goodsuuid'});
									$(goodsUuidEditor.target).val(goods.uuid);

									//获取商品价格的编辑器
									var priceEditorvar=$('#grid').datagrid('getEditor',{index:isEditingRowIndex,field:'price'});
									$(priceEditorvar.target).val(goods.inprice);

									cal();//计算金额
									sum();//统计合计数

								}
							}
						}
					},
					{
						field : 'price',
						title : '价格',
						width : 100,
						editor:'numberbox'
					},
					{
						field : 'num',
						title : '数量',
						width : 100,
						editor:'numberbox'
					},
					{
						field : 'money',
						title : '金额',
						width : 100,
						editor:{
							type:'numberbox',
							options:{
								disabled:true//禁止编辑
							}
						}
					},
					{
						field : '-',
						title : '操作',
						width : 100,
						formatter : function(value, row, index) {
							if(row.num!='总金额'){
								return "<a href='javascript:void(0)' onclick='edit("
								+ row.uuid
								+ ")'>修改</a><a href='javascript:void(0)' onclick='deleteRow("
								+ index + ")'>删除</a>";
							}
						}
					}
					] ],
					singleSelect : true,
					//显示编辑
					rownumbers: true,
					//显示行脚
					showFooter: true,
					toolbar : [ {
						iconCls : 'icon-add',
						text : '增加',
						handler : function() {
							//如果当前存在可编辑行，则关闭它的编辑状态
							if(isEditingRowIndex >-1){
								$('#grid').datagrid('endEdit',isEditingRowIndex);
							}
							//增加一行
							$('#grid').datagrid('appendRow',{'num':0,'money':0});
							//关闭编辑行
							$('#grid').datagrid('endEdit',isEditingRowIndex);
							//得到表格最后一行的索引
							isEditingRowIndex=$('#grid').datagrid('getRows').length-1;
							//开始编辑行
							$('#grid').datagrid('beginEdit',isEditingRowIndex);

							bindGridEvent();
						}
					},
					{
						iconCls : 'icon-save',
						text : '保存',
						handler : function() {}
					}
					],
					//点击某一行的时候进入编辑状态
					onClickRow:function index(rowIndex,rowData){
						//上次编辑行的索引
						$('#grid').datagrid('endEdit',isEditingRowIndex);
						//得到当前点击的索引
						isEditingRowIndex=rowIndex;
						//开启编辑行
						$('#grid').datagrid('beginEdit',isEditingRowIndex);

						bindGridEvent();
					}
			});
});


/* 
	计算
 */
function cal(){
	//得到数量编辑框
	var numEdt=$('#grid').datagrid('getEditor',{index:isEditingRowIndex,field:'num'});
	//得到编辑框的值
	var num=$(numEdt.target).val();
	//获取价格的编辑框
	var priceEdt=$('#grid').datagrid('getEditor',{index:isEditingRowIndex,field:'price'});
	//得到价格编辑框里的值
	var price=$(priceEdt.target).val();
	//计算金额
	var money=(price * num).toFixed(2);
	//获取金额
	var moneyEdt = $('#grid').datagrid('getEditor',{index:isEditingRowIndex,field:'money'});
	//对金额编辑框赋值
	$(moneyEdt.target).val(money);

	//更新表格中的数据,设置row json对象里的key对应的值
	$('#grid').datagrid('getRows')[isEditingRowIndex].money = money;
}

/* 
	绑定表格内的编辑框的键盘输入事件
 */
function bindGridEvent(){
	//得到价格编辑框
	var priceEdt=$('#grid').datagrid('getEditor',{index:isEditingRowIndex,field:'price'});
	//绑定价格编辑框的键盘输入事件
	$(priceEdt.target).bind('keyup',function(){
		cal();//计算

		sum();//统计合计数
	});

	//得到数量编辑框
	var numEdt=$('#grid').datagrid('getEditor',{index:isEditingRowIndex,field:'num'});
	//绑定数量编辑框的键盘输入事件
	$(numEdt.target).bind('keyup',function(){
		cal();//计算

		sum();//统计合计数
	});
}

/*
 * 移除行
 * */
function deleteRow(index){
	//结束编辑行
	$('#grid').datagrid('endEdit',isEditingRowIndex);
	//删除一行
	$('#grid').datagrid('deleteRow',index);

	//获取表格数据
	var data=$('#grid').datagrid('getData');
	//向表格加载数据
	$('#grid').datagrid('loadData',data);

	sum();//统计合计数
}

/*
 * 计算合计、总金额
 * */
function sum(){
	//获取所有行
	var rows = $('#grid').datagrid('getRows');
	var total = 0;
	//循环累计
	$.each(rows, function(i, row){
		total += parseFloat(row.money);
	});
	total = total.toFixed(2);

	//设置合计金额到行脚里去
	$('#grid').datagrid('reloadFooter',[{num: '总金额', money: total}]);
}

/**
 * 供应商下拉列表
 * */
/*	$('#supplier').combogrid({
		url:'supplier_getList.action',
		idField:'uuid',
		textField:'name',
		columns:[[
			{field:'uuid',titld:'ID',width:100},
			{field:'name',titld:'名称',width:100},
			{field:'address',titld:'地址',width:100},
			{field:'contact',titld:'联系人',width:100},
			{field:'tele',titld:'电话',width:100},
			{field:'type',titld:'类型',width:100}
		]]
	});*/


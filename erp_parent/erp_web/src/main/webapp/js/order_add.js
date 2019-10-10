var isEditingRowIndex;//当前正在编辑的行索引

$(function() {
	$('#grid')
	.datagrid(
			{
				columns : [ [
					{
						field : 'goodsuuid',
						title : '商品编号',
						width : 100,
						editor:{type:'numbernum',options:{disabled:true}}
					},
					{
						field : 'goodsname',
						title : '商品名称',
						width : 100,
						editor:{type:'combobox',options:{url:'goods_getList.action',valueField:'name',textField:'name',
							onSelect:function(record){
								//显示价格
								var priceEdt=$('#grid').datagrid('getEditor',{index:isEditingRowIndex,field:'price'});
								$(priceEdt.target).val(record.inprice);

								//商品ID
								var goodsuuidEdt = $('#grid').datagrid('getEditor',{index:isEditingRowIndex,field:'goodsuuid'});
								alert(goodsuuidEdt);
								$(goodsuuidEdt.target).val(record.uuid);

								cal();//自动计算金额
							}}}
					},
					{
						field : 'price',
						title : '价格',
						width : 100,
						editor:{type:'numberbox',options:{precision:2}}
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
						editor:{type:'numberbox',options:{precision:2,disabled:true}}
					},

					{
						field : '-',
						title : '操作',
						width : 100,
						formatter : function(value, row, index) {
							return "<a href='javascript:void(0)' onclick='edit("
							+ row.uuid
							+ ")'>修改</a><a href='javascript:void(0)' onclick='deleteRow("
							+ index + ")'>删除</a>";
						}
					}
					] ],
					singleSelect : true,
					toolbar : [ {
						iconCls : 'icon-add',
						text : '增加',
						handler : function() {
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
					} ]
			});
});

onClickRow:function index(rowIndex,rowData){
	//上次编辑行的索引
	$('#grid').datagrid('endEdit',isEditingRowIndex);
	//得到当前点击的索引
	isEditingRowIndex=rowIndex;
	//开启编辑行
	$('#grid').datagrid('beginEdit',isEditingRowIndex);

	bindGridEvent();
}

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
	});

	//得到数量编辑框
	var numEdt=$('#grid').datagrid('getEditor',{index:isEditingRowIndex,field:'num'});
	//绑定数量编辑框的键盘输入事件
	$(numEdt.target).bind('keyup',function(){
		cal();//计算
	});

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
}

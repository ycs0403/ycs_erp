var isEditingRowIndex=-1;//当前正在编辑的行索引

$(function() {
	$('#ordersGrid')
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
									var goodsUuidEditor=$('#ordersGrid').datagrid('getEditor',{index:isEditingRowIndex,field:'goodsuuid'});
									$(goodsUuidEditor.target).val(goods.uuid);

									//获取商品价格的编辑器
									var priceEditorvar=$('#ordersGrid').datagrid('getEditor',{index:isEditingRowIndex,field:'price'});
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
								return "<a href='javascript:void(0)' onclick='deleteRow("
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
								$('#ordersGrid').datagrid('endEdit',isEditingRowIndex);
							}
							//增加一行
							$('#ordersGrid').datagrid('appendRow',{'num':0,'money':0});
							//关闭编辑行
							$('#ordersGrid').datagrid('endEdit',isEditingRowIndex);
							//得到表格最后一行的索引
							isEditingRowIndex=$('#ordersGrid').datagrid('getRows').length-1;
							//开始编辑行
							$('#ordersGrid').datagrid('beginEdit',isEditingRowIndex);

							bindGridEvent();
						}
					},
					{
						iconCls : 'icon-save',
						text : '提交',
						handler : function() {
							if(isEditingRowIndex >= -1){
								//如果存在编辑行，则关闭编辑状态
								$('#ordersGrid').datagrid('endEdit',isEditingRowIndex);
							}
							//获取所有行的明细
							var rows=$('#ordersGrid').datagrid('getRows');
							if(rows.lenght==0){
								return ;
							}
							//转换为Json字符串
							var formdata=$('#orderFrom').serializeJSON();
							if(formdata['t.supplieruuid']==''){
								$.messager.alert('提示',"请选择供应商",'info');
								return ;
							}

							//将表格数据转换为json字符串
							formdata.json=JSON.stringify(rows);
							//formdata['json']=JSON.stringify($('#grid').datagrid('getRows'));上面代替，这里废弃
							$.ajax({
								type:'post',
								url:'orders_add',
								dataType:'json',
								data:formdata,
								success:function(value){
									$.messager.alert('提示',value.message,'info',function(){
										if(value.success){
											//清空供应商
											$('#supplier').combogrid('clear');
											//清空表格的行脚
											$('#ordersGrid').datagrid('loadData',{total:0,rows:[],footer:[{num: '总金额', money: 0}]});
										}
									});
								}
							});
						}
					}
					],
					//点击某一行的时候进入编辑状态
					onClickRow:function index(rowIndex,rowData){
						//上次编辑行的索引
						$('#ordersGrid').datagrid('endEdit',isEditingRowIndex);
						//得到当前点击的索引
						isEditingRowIndex=rowIndex;
						//开启编辑行
						$('#ordersGrid').datagrid('beginEdit',isEditingRowIndex);

						bindGridEvent();
					}
			});

	/**
	 * 供应商下拉列表
	 * */
	$('#supplier').combogrid({
		url:'supplier_getList?t1.type=1',
		idField:'uuid',
		textField:'name',
		panelWidth:605,
		columns:[[
			{field:'uuid',title:'ID',width:50},
			{field:'name',title:'名称',width:100},
			{field:'address',title:'地址',width:100},
			{field:'contact',title:'联系人',width:100},
			{field:'tele',title:'电话',width:100},
			{field:'email',title:'邮件地址',width:100},
			{field:'type',title:'类型',width:100}
			]]
	});
});

/* 
	计算
 */
function cal(){
	//得到数量编辑框
	var numEdt=$('#ordersGrid').datagrid('getEditor',{index:isEditingRowIndex,field:'num'});
	//得到编辑框的值
	var num=$(numEdt.target).val();
	//获取价格的编辑框
	var priceEdt=$('#ordersGrid').datagrid('getEditor',{index:isEditingRowIndex,field:'price'});
	//得到价格编辑框里的值
	var price=$(priceEdt.target).val();
	//计算金额
	var money=(price * num).toFixed(2);
	//获取金额
	var moneyEdt = $('#ordersGrid').datagrid('getEditor',{index:isEditingRowIndex,field:'money'});
	//对金额编辑框赋值
	$(moneyEdt.target).val(money);

	//更新表格中的数据,设置row json对象里的key对应的值
	$('#ordersGrid').datagrid('getRows')[isEditingRowIndex].money = money;
}

/* 
	绑定表格内的编辑框的键盘输入事件
 */
function bindGridEvent(){
	//得到价格编辑框
	var priceEdt=$('#ordersGrid').datagrid('getEditor',{index:isEditingRowIndex,field:'price'});
	//绑定价格编辑框的键盘输入事件
	$(priceEdt.target).bind('keyup',function(){
		cal();//计算

		sum();//统计合计数
	});

	//得到数量编辑框
	var numEdt=$('#ordersGrid').datagrid('getEditor',{index:isEditingRowIndex,field:'num'});
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
	$('#ordersGrid').datagrid('endEdit',isEditingRowIndex);
	//删除一行
	$('#ordersGrid').datagrid('deleteRow',index);

	//获取表格数据
	var data=$('#ordersGrid').datagrid('getData');
	//向表格加载数据
	$('#ordersGrid').datagrid('loadData',data);

	sum();//统计合计数
}

/*
 * 计算合计、总金额
 * */
function sum(){
	//获取所有行
	var rows = $('#ordersGrid').datagrid('getRows');
	var total = 0;
	//循环累计
	$.each(rows, function(i, row){
		total += parseFloat(row.money);
	});
	total = total.toFixed(2);

	//设置合计金额到行脚里去
	$('#ordersGrid').datagrid('reloadFooter',[{num: '总金额', money: total}]);
}

//仓库详细管理

$(function(){
	$('#grid').datagrid({
		columns:[[    
			{field:'uuid',title:'编号',width:100},    
			{field:'empuuid',title:'操作员工编号',width:100},    
			{field:'opertime',title:'操作日期',width:100},
			{field:'storeuuid',title:'仓库编号',width:100},    
			{field:'goodsuuid',title:'商品编号',width:100},    
			{field:'num',title:'数量',width:100},
			{field:'type',title:'出入库状态',width:100}
			]]
	});
});
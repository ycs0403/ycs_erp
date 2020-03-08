//仓库

$(function(){
	$('#grid').datagrid({
		columns:[[    
			{field:'uuid',title:'编号',width:100},    
			{field:'name',title:'名称',width:100},    
			{field:'empuuid',title:'员工编号',width:100}    
			]]
	});
});
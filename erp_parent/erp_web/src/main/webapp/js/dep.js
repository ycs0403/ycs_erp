$(function() {
	$("#grid").datagrid({
		columns: [ [
			{
				field : 'uuid',
				title : '部门编号',
				width : 100
			},
			{
				field : 'name',
				title : '部门名称',
				width : 100
			},
			{
				field : 'tele',
				title : '部门电话',
				width : 100
			},
			{
				field : '-',
				title : '操作',
				width : 100,
				formatter : function(value, row, index) {
					return "<a href='javascript:void(0)' onclick='edit("
					+ row.uuid
					+ ")'>修改</a><a href='javascript:void(0)' onclick='dele("
					+ row.uuid + ")'>删除</a>";
				}
			} ] ]
	});
});
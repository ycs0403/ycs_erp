if (Request['type'] == 1) {
	document.title = "供应商管理";
	listParam = "?t1.type=1";
	saveParam = "?t.type=1";
}
if (Request['type'] == 2) {
	document.title = "客户管理";
	listParam = "?t1.type=2";
	saveParam = "?t.type=2";
} 

$(function() {
	$('#grid')
	.datagrid(
			{
				columns : [ [
					{
						field : 'uuid',
						title : '编号',
						width : 100
					},
					{
						field : 'name',
						title : '名称',
						width : 200
					},
					{
						field : 'address',
						title : '地址',
						width : 200
					},
					{
						field : 'contact',
						title : '联系人',
						width : 100
					},
					{
						field : 'tele',
						title : '电话',
						width : 100
					},
					{
						field : 'email',
						title : 'E-MAIL',
						width : 150
					},
					{
						field : 'type',
						title : '类型',
						width : 150
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
$(function() {
	$('#grid')
	.datagrid(
			{
				columns : [ [
					{
						field : 'uuid',
						title : '员工编号',
						width : 40
					},
					{
						field : 'username',
						title : '登录名称',
						width : 100
					},
					{
						field : 'name',
						title : '真实姓名',
						width : 100
					},
					{
						field : 'email',
						title : 'E-mail',
						width : 100
					},
					{
						field : 'tele',
						title : '电话',
						width : 100
					},
					{
						field : 'gender',
						title : '性别',
						width : 40,
						formatter : function(value) {
							if (value == 1) {
								return '男';
							}
							if (value == 0) {
								return '女';
							}
						}
					},
					{
						field : 'address',
						title : '地址',
						width : 170
					},
					{
						field : 'birthday',
						title : '出生日期',
						width : 100,
						formatter : function(value) {
							return new Date(value)
							.Format('yyyy-MM-dd');//数字转日期
						}
					},
					{
						field : 'dep',
						title : '部门编号',
						width : 100,
						formatter : function(value) {
							if (value != null) {
								return value.name;
							} else {
								return '';
							}
						}
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
					}
					] ]
			});
});
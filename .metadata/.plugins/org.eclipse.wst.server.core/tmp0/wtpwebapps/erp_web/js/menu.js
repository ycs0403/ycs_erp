/*$(function() {
	$('#grid')
	.datagrid(
			{
				title:'菜单管理列表',
				url:'menu_getPageList',
				columns : [ [
					{
						field : 'menuid',
						title : '菜单ID',
						width : 100
					},
					{
						field : 'menuname',
						title : '菜单名称',
						width : 150
					},
					{
						field : 'icon',
						title : '图标',
						width : 100
					},
					{
						field : 'url',
						title : 'URL',
						width : 200
					},
					{
						field : 'pid',
						title : '下级菜单',
						width : 80
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
});*/

$(function() {
	$("#grid").datagrid({
		columns: [ [
			{
				field : 'menuid',
				title : '菜单ID',
				width : 100
			},
			{
				field : 'menuname',
				title : '菜单名称',
				width : 150
			},
			{
				field : 'icon',
				title : '图标',
				width : 100
			},
			{
				field : 'url',
				title : 'URL',
				width : 200
			},
			{
				field : 'pid',
				title : '上级菜单',
				width : 80
			},
			{
				field : '-',
				title : '操作',
				width : 100,
				formatter : function(value, row, index) {
					return "<a href='javascript:void(0)' onclick='edit("
					+ row.menuid
					+ ")'>修改</a><a href='javascript:void(0)' onclick='dele("
					+ row.menuid + ")'>删除</a>";
				}
			}
			] ]
	});
});
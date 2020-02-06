$(function() {
	$('#grid')
	.datagrid(
			{
				columns : [ [
					{
						field : 'uuid',
						title : '商品编号',
						width : 50
					},
					{
						field : 'name',
						title : '商品名称',
						width : 100
					},
					{
						field : 'origin',
						title : '地址',
						width : 100
					},
					{
						field : 'producer',
						title : '厂家',
						width : 200
					},
					{
						field : 'unit',
						title : '计量单位',
						width : 100
					},
					{
						field : 'inprice',
						title : '进货价格',
						width : 100
					},
					{
						field : 'outprice',
						title : '出货价格',
						width : 100
					},
					{
						field : 'goodstypeuuid',
						title : '商品类型',
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
					} ] ]
			});
});
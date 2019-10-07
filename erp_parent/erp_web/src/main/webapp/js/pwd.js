$(function() {
	$('#grid')
	.datagrid(
			{
				url:'emp_getPageList.action',
				columns : [ [
					{
						field : 'uuid',
						title : '员工编号',
						width : 50
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
						width : 200
					},
					{
						field : 'tele',
						title : '电话',
						width : 100
					},
					{
						field : 'gender',
						title : '性别',
						width : 50,
						formatter : function(value) {
							if (value == 1) {
								return '男';
							}
							if (value == 0) {
								return '女';
							}
							return '';
						}
					},
					{
						field : 'address',
						title : '地址',
						width : 200
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
						width : 200,
						formatter : function(value, row, index) {
							return "<a href='javascript:void(0)' onclick='update_reset("
							+ row.uuid
							+ ")'>重置密码</a>"
						}
					} ] ],
					pagination:true,
					singleSelect:true
			});

//	保存Ajax
	$("#btnSave").bind('click', function() {
		//表单editForm的数据转换为JSON
		var formdata = $('#updatePwdForm').serializeJSON();
		$.ajax({
			url : 'emp_update_reset.action',
			data : formdata,
			dataType : 'json',
			type : 'post',
			success : function(value) {
				if (value.success) {
					$('#updatePwdWindow').window('close');
					$('#grid').datagrid('reload');
				}
				$.messager.alert('提示', value.message);
			}
		});
	});

	function updatePwd_reset(id){
		$('#updatePwdWindow').window('open');
		$('#updatePwdForm').form('load',{'id':id,'newPwd':''});
	}
});
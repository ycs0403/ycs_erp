$(function() {
	$('#grid')
	.datagrid(
			{
				title:'员工信息列表',
				url:'emp_getPageList',
				columns : [ [
					{
						checkbox:true
					},
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
						formatter : function(gender) {
							/*if (value == 1) {
								return '男';
							}
							if (value == 0) {
								return '女';
							}*/
							switch(gender){
							case 0:return '女';
							case 1:return '男';
							default: return '未知';
							}
						}
					},
					{
						field : 'address',
						title : '联系地址',
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
							return "<a href='javascript:void(0)' onclick='updatePwd_reset("
							+ row.uuid
							+ ")'>重置密码</a>"
						}
					} ] ],
					rownumbers:true,
					pagination:true,
					singleSelect:true
			});

	//重置密码的窗口
	$('#updatePwdWindow').dialog({
		title:'重置员工密码',
		width:260,
		height:120,
		iconCls:'icon-save',
		modal:true,
		closed:true,
		buttons:[
			{
				text:'保存',
				iconCls:'icon-save',
				handler:function(){
					var formdata=$('#updatePwdForm').serializeJSON();
					$.ajax({
						url : 'emp_update_reset',
						data : formdata,
						dataType : 'json',
						type : 'post',
						success : function(value) {

							$.messager.alert("提示信息","重置密码成功",'info',function(){
								if (value.success) {
									//关闭窗口
									$('#updatePwdWindow').window('close');
									//刷新列表
									$('#grid').datagrid('reload');

								}else{
									$.messager.alert('提示信息','重置密码失败！<br>'+value.message,'info');
								}
							});
						}
					});
				}
			}
			]
	});



//	保存Ajax
	$("#btnSave").bind('click', function() {
		if($('#updatePwdForm').form('validate')==false){
			return ;
		}
		//表单editForm的数据转换为JSON
		var formdata = $('#updatePwdForm').serializeJSON();
		$.ajax({
			url : 'emp_update_reset',
			data : formdata,
			dataType : 'json',
			type : 'post',
			success : function(value) {
				if (value.success) {
					$.messager.alert("提示信息","重置密码成功",'info',function(){
						//关闭窗口
						$('#updatePwdWindow').window('close');
						//刷新列表
						$('#grid').datagrid('reload');
					});
				}else{
					$.messager.alert('提示信息','重置密码失败！<br>'+value.message,'info');
				}
			}
		});
	});
});

//打开重置密码窗口
function updatePwd_reset(uuid){
	//弹出窗口
	$('#updatePwdWindow').window('open');
	//清除表单数据
	$('#updatePwdForm').form('load',{'id':uuid,'newPwd':''});
}
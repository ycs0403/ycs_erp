
$(function() {
	//权限列表
	$("#tree").tree({
		url:'role_readRoleMenus?id=' + 2,//数据来源
		animate:true,//是否显示为动画效果
		checkbox:true//是否显示复选框
	});
	
	

	//角色列表
	$("#grid").datagrid({
		url:'role_getList',
		columns:[[
			{field:'uuid',title:'编号',width:100},
			{field:'name',title:'名称',width:200}
			]],
			singleSelect:true,
			onClickRow:function(rowIndex,rowData){
				alert(rowData.uuid);
				$('#tree').tree({
					url:'role_readRoleMenus?id='+rowData.uuid,
					animate:true,//是否显示动画效果
					checkbox:true//是否显示复选框
				});
				alert(rowData.uuid);
			}
	});

	$("#btnSave").bind('click',function(){
		
		//得到所有勾选中的节点
		var nodes=$('#tree').tree('getChecked');
		//拼接每个节点的ID，即为menuid
		var checked=new Array();
		$.each(nodes,function(i,node){
			checked.push(node.id);
		});
		//把数组转成以逗号分割的字符串
		checked=checked.join(',');
		//提交的数据
		var formdata={};
		formdata.id=$('#grid').datagrid('getSelected').uuid;
		formdata.checked=checked;
		alert("进入"+formdata.id);
		$.ajax({
			url:'role_updateRoleMenus',
			data:formdata,
			type:'post',
			dataType:'json',
			success:function(rtn){
				$.messager.alert('提示',rtn.message,'info');
			}
		});
	});
});


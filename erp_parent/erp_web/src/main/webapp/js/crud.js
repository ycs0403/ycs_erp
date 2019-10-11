/*datagrid常用属性
1、url：远程action地址
2、columns：列定义
3、singleSelect:为true表示单行选中*/

var method = "";//方法名
var listParam="";//查询参数追加
var saveParam="";//保存参数追加

$(function() {
	
	if(typeof(listParam)=='undefined'){
		listParam="";
	}
	if(typeof(saveParam)=='undefined'){
		saveParam="";
	}
	
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
	
	$('#grid').datagrid(
			{
				url : name + "_getPageList.action" + listParam,
				singleSelect : true,
				pagination : true, //开启分页
				toolbar : [ {
					iconCls : 'icon-edit',
					text : '增加',
					handler : function() {
						method = "add";//方法为添加
						$('#editForm').form('clear');//清空表单
						$('#editWindow').window('open');//打开窗口
					}
				} ]
			});

//	条件查询
	$("#btnSearch").bind('click', function() {
		//将From对象转换为JSON对象
		var formdata = $("#searchForm").serializeJSON();
		//将表单的对象提交到后台做条件查询
		$("#grid").datagrid('load', formdata);
	});

//	保存Ajax
	$("#btnSave").bind('click', function() {
		//表单editForm的数据转换为JSON
		var formdata = $('#editForm').serializeJSON();
		$.ajax({
			url : name+'_' + method + '.action' + saveParam,
			data : formdata,
			dataType : 'json',
			type : 'post',
			success : function(value) {
				if (value.success) {
					$('#editWindow').window('close');
					$('#grid').datagrid('reload');
				}
				$.messager.alert('提示', value.message);
			}
		});
	});
});

//删除Ajax
function dele(id) {
	alert(id);
	$.messager.confirm("提示", "确定要删除吗？", function(value) {
		if (value) {
			$.ajax({
				url : name+'_delete.action?id=' + id,
				dataType : 'json',
				type : 'post',
				success : function(value) {
					$.messager.alert('提示', value.message);
					if (value.success) {
						$('#grid').datagrid('reload');
					}
				}
			});
		}
	});
}

//修改Ajax
//验证表单是否都通过验证
/*var isvalidate=$("#editForm").form('validate');
if(isvalidate==false){
	return "";
}*/
function edit(id) {
	//打开编辑窗口
	$("#editWindow").window('open');
	//清空表单操作
	$("#editForm").form('clear');
	//加载表单数据
	$("#editForm").form('load', name+'_getPrimaryId.action?id=' + id);
	method = 'update';
}
//测试
/* 	function test() {
	 //获取grid表单数据
	 var data = $('#grid').datagrid('getData');
	 alert(JSON.stringify(data));
	 } */
/*datagrid常用属性
1、url：远程action地址
2、columns：列定义
3、singleSelect:为true表示单行选中*/

var method = "";//方法名
var listParam = "";//查询追加参数
var saveParam = "";//新增追加参数

var columns;//列参数

$(function() {

	//加载表格数据
	$('#grid').datagrid(
			{
				url : name + "_getPageList" + listParam ,
				columns:columns,
				singleSelect : true,
				pagination : true, //开启分页
				toolbar : [ {
					iconCls : 'icon-add',
					text : '增加',
					handler : function() {
						method = "add";//方法为添加
						$('#editForm').form('clear');//清空表单
						$('#editWindow').window('open');//打开窗口
					}
				} ,'-',{
					iconCls : 'icon-excel_out',
					text : '导出',
					handler : function() {
						var formData=$("#searchForm").serializeJSON();
						$.download(name +'_exportout'+listParam,formData);
					}
				} ,'-',{
					iconCls : 'icon-excel_in',
					text : '导入',
					handler : function() {
						var importDlg=document.getElementById('importDlg');
						$("#importDlg").dialog('open');
					}}
				]});

	//点击条件查询按钮
	$("#btnSearch").bind('click', function() {
		//将From对象转换为JSON对象
		var formdata = $("#searchForm").serializeJSON();
		//将表单的对象提交到后台做条件查询
		alert(JSON.stringify(formdata));
		$("#grid").datagrid('load', formdata);
	});

	//点击保存Ajax按钮
	$("#btnSave").bind('click', function() {
		//表单editForm的数据转换为JSON
		var formdata = $('#editForm').serializeJSON();
		$.ajax({
			url : name + '_' + method + '.action' + saveParam,
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

	//判断是否存在导入窗口
	var importDlg=document.getElementById('importDlg');
	if(importDlg){
		$('#importDlg').dialog({
			title:'导入数据',
			width:330,
			height:150,
			modal:true,
			closed:true,
			buttons:[{
				text:'导入',
				handler:function(){
					checkform(o);
					$.ajax({
						//异步上传文件
						url:name+"_excelin",
						type:'post',
						data:new FormData($('#importForm')[0]),
						dataType:'json',
						processData:false,
						contentType:false,
						success:function(rtn){
							$.messager.alert('提示信息',rtn.message,'info',function(){
								if(rtn.success){
									//关闭上传窗口
									$('#importDlg').dialog('close');
									//清空表格
									$('#importForm').form('clear');
									//刷新表格内容
									$('#grid').datagrid('reload');
								}
							});

						}
					});
				}
			}]
		});
	}
});

//判断excel格式
var o;
function checkform(o){
	var f_content = importFrom.file.value;
	var fileext=f_content.substring(f_content.lastIndexOf("."),f_content.length)
	fileext=fileext.toLowerCase()
	if (fileext!='.xls'){
		alert("对不起，导入数据格式必须是xls格式文件哦，请您调整格式后重新上传，谢谢 ！");
		o.file.focus();
		return false;
	}
	return true;
}

//删除Ajax
function dele(id) {
	alert(id);
	$.messager.confirm("提示", "确定要删除吗？", function(value) {
		if (value) {
			$.ajax({
				url : name + '_delete.action?id=' + id,
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
	$("#editForm").form('load', name + '_getPrimaryId.action?id=' + id);

	method = 'update';
}
//测试
/* 	function test() {
	 //获取grid表单数据
	 var data = $('#grid').datagrid('getData');
	 alert(JSON.stringify(data));
	 } */
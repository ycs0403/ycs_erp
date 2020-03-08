function login(){	
	var formdata=$('#loginform').serializeJSON();
	
	$.ajax({
		url:'login_Login.action',
		dataType:'json',
		data:formdata,
		success:function(value){
			if(value.success){
				location.href="index.html";//跳转到主页面
			}else{
				$.messager.alert("提示信息",value.message,'info');
			}
		}
	});
}

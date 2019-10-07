function login(){
	/*var userName=document.getElementById("signup_name").value;
	var pwd=document.getElementById("signup_password").value;*/
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

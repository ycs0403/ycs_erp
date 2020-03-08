//用于异步获取数据
function ajax(url,value,id,key){
	if(value!=null){
		$.ajax({
			url:url+value,
			dataType:'json',
			success:function(val){
				$('#'+id).html(val[key]);
			}
		});
	}
	return "<span id='"+id+"'></span>";
}
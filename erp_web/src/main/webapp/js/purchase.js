$(function(){
	/**
	 * 数据表格
	 * */
	$("#grid").datagrid({
		url:"purchase_orderPurchase",
		columns:[[
			{field:'name',title:'商品类型',width:100},
			{field:'y',title:'采购额',width:100}
			]],
			singleSelect:true,
			onLoadSuccess:function(data){
				//当表格数据加载成功时，进行画图
				showChart(data.rows)
			}
	});

	/**
	 * 查询按钮
	 * */
	$("#btnSearch").bind('click',function(){
		var formdata =$('#searchForm').serializeJSON();
		if(formdata.endDate != ''){
			formdata.endDate += " 23:59:59";
		}
		alert(JSON.stringify(formdata.endDate));
		$('#grid').datagrid('load',formdata);
	});

	/**
	 * 饼状图
	 * */
	function showChart(data){
		$("#pieChart").highcharts({
			/*chart ：图表基本属性
			  plotBackgroundColor 区域背景颜色
			  plotBorderWidth 区域边框宽度
			  plotShadow 区域阴影
			  type 图表类型*/
			chart:{
				plotBackgroundColor:null,
				plotBorderWidth:null,
				plotShadow:false,
				type:'pie'
			},
			/*title ：图表标题
		      text 标题文本*/
			title:{
				text:'采购统计'
			},
			/*tooltip ：工具提示
		    pointFormat 工具提示显示格式*/
			tooltip:{
				pointFormat:'{series.name}:<b>{point.percentage:.1f}%</b>'
			},
			/*plotOptions：区域选项
		      allowPointSelect 点击区域后选择
		      cursor 光标类型
		      dataLabels 数据标签
		      showInLegend 是否显示图例*/
			plotOptions:{
				pie:{
					allowPointSelect:true,
					cursor:'pointer',
					dataLables:{
						enabled:true,
						format:'<b>{point.name}</b>:{point.percentage:.1f} %'
					},
					showInLegend:true
				}
			},
			/* series： 数据组
		       name 名称
		       colorByPoint 点的颜色
		       data 数据 */
			series:[{
				name:"比例",
				colorByPoint:true,
				data:data
			}]
		});
	}
	
});


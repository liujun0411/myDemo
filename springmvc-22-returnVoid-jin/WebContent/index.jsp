<%@ page language="java" 
	import="java.util.*"
    pageEncoding="utf-8"%>
    
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>My jsp</title>
		
		<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
	
		<script type="text/javascript">
			$(function () {
				$("button").click(function () {
					$.ajax({
						url:"myAjax.do",
						data:{
							"name":"加深的金卡刚",
							"age":"31"
						},
						type:'POST',
						success:function(data){
							alert(data);
						}
					});
				});
			});
	</script>
		
	</head>
	

	
	<body>
		<button>提交Ajax请求</button>
	</body>
</html>
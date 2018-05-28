<%@ page language="java" contentType="text/html; charset=utf-8"
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
						url:"liujun/myAjax.do",
						success:function(data){
							$(data).each(function(index){
								alert(data[index].name + "  " +data[index].age)
							});
						}
					});	
				});	
			});
		</script>
		
	</head>
	
	<body>
		<button>提交ajax请求</button>		
	</body>
</html>
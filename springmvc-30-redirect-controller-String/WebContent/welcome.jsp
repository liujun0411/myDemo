<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>welcome page</title>
</head>
<body>
	${message }  <br>
	
	<!-- 
		param.age的底层执行的是 request.getParameter("age");   这个获取的是String 
		requestScope.age的底层执行的是request.getAttribute("age");   这个获取的是int
	 -->
	
	name: ${param.name } <br>
	age: ${param.age } 

</body>
</html>
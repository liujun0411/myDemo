<%@ page language="java" contentType="text/html; charset=utf-8"
	import="java.util.*"
    pageEncoding="utf-8"%>
    
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName()
					+":"+request.getServerPort()+path+"/";
%> 
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<base href = "<%=basePath%>">
		<title>My jsp</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="this is my page">
	</head>
	
	<body>
		this is my jsp. project 2<br>
	</body>
</html>
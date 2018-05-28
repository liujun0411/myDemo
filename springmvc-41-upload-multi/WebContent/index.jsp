<%@ page language="java" contentType="text/html; charset=utf-8"
	import="java.util.*"
    pageEncoding="utf-8"%>
    
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>My jsp</title>
	</head>
	
	<body>
		<form action="${pageContext.request.contextPath }/liujun/upload.do" method="POST" enctype="multipart/form-data">
			
			<!-- 当使用类作为请求接收参数的时候  需要保证对应的类的属性名 与 表单参数名一致 -->
			文件1：<input type = "file" name="images"/> <br>
			文件2：<input type = "file" name="images"/> <br>
			文件3：<input type = "file" name="images"/> <br>
			
			<input type= "submit" value="上传"/>
		</form>
	</body>
</html>
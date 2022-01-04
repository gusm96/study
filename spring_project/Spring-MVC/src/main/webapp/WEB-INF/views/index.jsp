<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

	li{
		font-size: 1.5em;
	}

</style>
</head>
<body>
	<h1>Home</h1>
	<ul>
		<li><a href="${pageContext.request.contextPath}/hello">Hello</a></li>
		<li><a href="${pageContext.request.contextPath}/form">Form</a></li>
		<li><a href="${pageContext.request.contextPath}/param">/Param</a></li>
	</ul>
</body>
</html>
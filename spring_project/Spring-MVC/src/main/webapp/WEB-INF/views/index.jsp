<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
li {
	font-size: 1.5em;
}
</style>
</head>
<body>
	<h1>Home</h1>
	<ul>
		<li><a href="${pageContext.request.contextPath}/hello">Hello</a></li>
		<li><a href="${pageContext.request.contextPath}/form">Form</a></li>
		<li><a href="${pageContext.request.contextPath}/param">Param</a></li>
		<li><a href="${pageContext.request.contextPath}/member/reg">Reg</a></li>
		<li><a href="${pageContext.request.contextPath}/order/order">Order</a></li>
		<li><a href="${pageContext.request.contextPath}/cookie/make">Cookie</a></li>
		<li><a href="${pageContext.request.contextPath}/header/check">Check</a></li>
		<li><a href="${pageContext.request.contextPath}/report/form">Report</a></li>
		<li><a href="${pageContext.request.contextPath}/names/0">Name0</a></li>
		<li><a href="${pageContext.request.contextPath}/names/1">Name1</a></li>
		<li><a href="${pageContext.request.contextPath}/names/2">Name2</a></li>
		<li><a href="${pageContext.request.contextPath}/mypage/mypage1">Mypage1</a></li>
		<li><a href="${pageContext.request.contextPath}/mypage/mypage2">Mypage2</a></li>
		<li><a href="${pageContext.request.contextPath}/mypage/mypage3">Mypage3</a></li>
		<li><a href="${pageContext.request.contextPath}/mypage/help/intro">Help</a></li>
	</ul>
</body>
</html>
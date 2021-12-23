<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서관리 프로그램</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/default.css">
<style>
	#content{
		padding:20px;
		
	}
	#content>hr{
		border:0px;
		border-top:1px soild #aaa;
		margin:10px 0;
	}
	
</style>
</head>
<body>
	<%@ include file="/WEB-INF/views/frame/header.jsp" %>
	<%@ include file="/WEB-INF/views/frame/nav.jsp" %>
	<div id="content">
		<h3>부서정보</h3>
		<hr>
		
	</div>
</body>
</html>
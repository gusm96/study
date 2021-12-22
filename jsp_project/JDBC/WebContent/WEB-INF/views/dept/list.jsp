<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서관리 프로그램</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/default.css">
</head>
<body>
	<%@ include file="/WEB-INF/views/frame/header.jsp" %>
	<%@ include file="/WEB-INF/views/frame/nav.jsp" %>
	<div id="content">
		${deptList}
		<table border=1>
			<tr>
				<th>부서번호</th>
				<th>부서이름</th>
				<th>부서위치</th>
				<th>관리</th>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td>수정 | 삭제</td>
			</tr>
		</table>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css"
	href="../../resources/static/common.css" />
<style>
a.btn {
	float: right;
	margin-top: -40px;
}
</style>
</head>
<body>
	<div class="container">
		<h1>글목록</h1>
		<a href="save" class="btn">글등록</a>
		<table class="list">
			<thead>
				<tr>
					<th>id</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
				</tr>
			</thead>
			<tbody>
				<!-- Assuming 'boards' is a list of objects -->
				<c:forEach items="${boards}" var="board">
					<tr>
						<td><c:out value="${board.id}" /></td>
						<td><a href="<c:out value='${board.id}' />"><c:out
									value="${board.boardTitle}" /></a></td>
						<td><c:out value="${board.boardWriter}" /></td>
						<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm"
								value="${board.createdTime}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
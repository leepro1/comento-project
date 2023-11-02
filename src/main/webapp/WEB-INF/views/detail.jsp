<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../../resources/static/common.css" />
    <title>detail</title>
</head>
<body>
    <table>
        <tr>
            <th>id</th>
            <td>${board.id}</td>
        </tr>
        <tr>
            <th>제목</th>
            <td>${board.boardTitle}</td>
        </tr>
        <tr>
            <th>작성자</th>
            <td>${board.boardWriter}</td>
        </tr>
        <tr>
            <th>날짜</th>
            	<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm"
								value="${board.createdTime}" /></td>
        </tr>
        <tr>
            <th>내용</th>
            <td>${board.boardContents}</td>
        </tr>
    </table>
    <a href="/" class="btn">목록</a>
    <a href="/edit/${board.id}" class="btn">수정</a>
    <a href="/delete/${board.id}" class="btn">삭제</a>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="../../resources/static/common.css" />
<style>
form {
	width: 600px;
	margin: auto;
	padding: 5px 20px;
	box-shadow: 2px 2px 5px gray;
}

td {
	min-width: 100px;
	padding: 5px;
}

td:nth-child(1) {
	text-align: right;
}

button {
	margin: 5px 0 20px 20px;
}
</style>
</head>
<body>
	<div class="container">
		<form action="/save" method="post" name="updateForm">
			<h1>글 수정</h1>
			<table>
				<tr>
					<td>제목:</td>
					<td><input type="text" name="boardTitle"
						value="${board.boardTitle}"></td>
				</tr>
				<tr>
					<td>작성자:</td>
					<td><input type="text" name="boardWriter"
						value="${board.boardWriter}" readonly></td>
				</tr>
				<tr>
					<td>비밀번호:</td>
					<td><input type="text" name="boardPassword" id="boardPassword"></td>
				</tr>
				<tr>
					<td>내용:</td>
					<td><textarea name="boardContents" cols="40" rows="15">${board.boardContents}</textarea></td>
				</tr>
			</table>
			<hr />
			<div>
				<input type="button" value="글 수정" onclick="boardUpdate()"> 
				<a href="/" class="btn">목록으로</a>
			</div>
		</form>
	</div>

	<script>
    function boardUpdate() {
        var pass = '${board.boardPassword}';
        var inputPass = document.getElementById("boardPassword").value;
        if (pass === inputPass) {
            document.updateForm.submit();
        } else {
            alert("비밀번호가 일치하지 않습니다!");
        }
    }
</script>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
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
    <form action="/save" method="post">
        <h1>글 등록</h1>
        <table>
            <tr>
                <td>제목:</td>
                <td><input type="text" name="boardTitle"></td>
            </tr>
            <tr>
                <td>작성자:</td>
                <td><input type="text" name="boardWriter"></td>
            </tr>
            <tr>
                <td>비밀번호:</td>
                <td><input type="text" name="boardPassword"></td>
            </tr>
            <tr>
                <td>내용:</td>
                <td><textarea name="boardContents" cols="40" rows="15"></textarea></td>
            </tr>
        </table>
        <hr />
        <div>
            <button type="submit" class="btn">저장</button>
        </div>
    </form>
</div>
</body>
</html>
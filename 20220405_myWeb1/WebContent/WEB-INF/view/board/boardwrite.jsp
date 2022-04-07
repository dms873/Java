<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글쓰기</title>
</head>
<body>
게시글쓰기
	<!-- 
	private String bTitle;
	private String bContent;
	// 로그인 정보로 부터 전달
	private String bWriter;
	private String mId;
	 -->
	<form action="boardwrite.do" method="post">
		<input type="text" name="bTitle" required="required">
		<textarea rows="5" cols="50" name="bContent" required="required" id="bContent"></textarea>
		<button type="submit">글등록</button>
	</form>
	<script>
	// 유효성 체크
	// 공백으로만 내용을 체운 경우
	</script>
</body>
</html>
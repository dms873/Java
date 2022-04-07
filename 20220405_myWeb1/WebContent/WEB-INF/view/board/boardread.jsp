<%@page import="kh.test.first.board.model.vo.ReCommentVo"%>
<%@page import="kh.test.first.board.model.vo.BoardVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
BoardVo vo = (BoardVo)request.getAttribute("bVo");
if(vo.getbNo() == 0){
%>
	<p>해당 글이 없습니다.</p>
	<button onclick="location.href='boardlist';">게시글목록</button>
	
<%
} else {
%>
<p>글번호:<%=vo.getbNo() %></p>
<p>글제목:<%=vo.getbTitle() %></p>
<p>글내용:<%=vo.getbContent() %></p>
<hr>
<form action="boardcomment" method="post">
	<input type="hidden" name="bNo" value="<%=vo.getbNo() %>">
	<input type="text" name="rContent">
	<button type="submit">댓글등록</button>
</form>
<hr>
<%
	if(vo.getReCommentCnt()>0){
		for( ReCommentVo rvo: vo.getReVolist()) {
%>
			<p><%=rvo.getrContent() %></p>
			<p><%=rvo.getrWriteDate() %></p>
			<hr>
<%
		}
	}
}
%>

</body>
</html>
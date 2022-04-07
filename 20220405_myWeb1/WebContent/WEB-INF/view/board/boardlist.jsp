<%@page import="kh.test.first.board.model.vo.BoardVo"%>
<%@page import="java.util.ArrayList"%>
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
ArrayList<BoardVo> volist = (ArrayList<BoardVo>)request.getAttribute("boardVolist");
%>
<%-- <%=volist.size()%> --%>
	<div><button onclick="location.href='boardwrite';">글쓰기</button></div>
	<div>
		<table border="1">
			<tr>
				<td>번호</td>
				<td>제목 [댓글수]</td>
				<td>작성자</td>
				<td>작성일</td>
				<td>조회수</td>
			</tr>
<% for(BoardVo vo : volist) { %>
			<tr>
				<td><%=vo.getbNo() %></td>
				<td><a href="boardread?bno=<%=vo.getbNo() %>"><%=vo.getbTitle() %> [<%=vo.getReCommentCnt() %>]</a></td>
				<td><%=vo.getbWriter() %></td>
				<td><%=vo.getbWriteDate() %></td>
				<td><%=vo.getbCount() %></td>
			</tr>
<% } %>
		</table>
		<p>
<%  %>
		</p>
	</div>
</body>
</html>
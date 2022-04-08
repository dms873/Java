<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>


</head>
<body>
	<form>
		<input type="text" id="id" required="required">
		<input type="password" id="pwd" required="required">
		<br>
		<button type="button" id="btnAjax">ajax실행</button>
	</form>
	
<script>
	// $("#btnAjax").click(function() {
		$.ajax({
			url: "AjaxSampleController.ax",
			type: "post",
			dataType: "json",
			data: {
				id: $("#id").val(),
				pwd: $("#pwd").val()
			},
			// function을 밖으로 빼서 함수명 적어도 됨.
			// success: aaa
			// 함수명 내에 data이름을 쓴다면 key3의 data와 무관함.
			success: function(result) { // ArrayList<~vo>의 모양을 띄우고 있음.
				console.log(result);
			// 예시1) 의 예시
			/* 	if(result == "성공") {
					// 글 등록 예시
					alert("글 등록 성공! 목록 페이지로 이동 슝~");
					location.href = "boardlist";
				} else if(result == "실패") {
					// 로그인 예시
					alert("로그인 실패! 다시 시도하기");
					$("#pwd").val("").focus();
				} */
				// 예시2)의 예시
				// for
				// console.log(result[0].bno);
	
				// 예시3)의 예시
				// console.log(result.currentPage);
				// console.log(result.boardVolist[0].bNo);
			
				// 예시4)의 예시
				console.log(result[0].currentPage);
				console.log(result[1].boardVolist[0].bNo);
			},
			error : function(request,status,error) {
				console.log(request);
				alert("code:"+request.status+"\n"+"message:"+request.responseText+
				"\n"+"error:"+error);
				}
		});
		// function aaa() {}
	// });
</script>
</body>
</html>
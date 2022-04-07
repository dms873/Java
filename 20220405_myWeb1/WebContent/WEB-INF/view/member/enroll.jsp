<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
	<form name="frmRegister">
	<!--  action="enroll.do" method="post" -->
		아이디:<input type="text" name="mId" id="mId" required="required" placeholder="영문자, 숫자를 사용한 6자이상 20자이하"> <button type="button" id="idCheck">중복체크</button><br>
		패스워드:<input type="password" name="password" id="password" required="required" placeholder="영문자, 숫자, 특수문자가 적어도 1개이상, 8~16글자"><br>
		패스워드확인:<input type="password" name="password_re" id="password_re" required="required"><br>
<!-- 		닉네임:<input type="text" name="nickname" id="nickname" required="required"><br>
		이메일:<input type="email" name="email" id="email" required="required"><br> -->
		전화번호:<input type="tel" name="phone" id="phone" required="required"><br>  
 		<button type="button" id="btn_enroll">회원가입</button>
	</form>
	<script>
		//유효성체크
		//$("#mId").focusout(function(){});
		
		$("#btn_enroll").click(function(){
			var mId = $("#mId").val().trim();
			var regExpId = /[A-Za-z0-9]{6,20}$/; 
			//var regExpId = /^[A-Za-z][A-Za-z0-9!_]{2,4}$/;   // 첫글자는 영문자, 영문자숫자!_으로 3-5자 입력가능
			if(!regExpId.test(mId)){
				alert("아이디 입력란에는 영문자, 숫자를 사용한 6자이상 20자이하");
				$("#mId").focus();
				return false;
			}
			
			var password = $("#password").val().trim();
			if(!password || password != $("#password_re").val().trim()){
				alert("패스워드 입력란과 확인란이 같지 않습니다.");
				$("#password").val("");
				$("#password_re").val("");
				$("#password").focus();
				return false;
			}
			var regExpPassword = /^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[^A-Za-z0-9]).{8,16}$/; // 영문자, 숫자, 특수문자가 적어도 1개이상, 8~16글자
			if(!regExpPassword.test(password)){
				alert("패스워드 입력란에는 영문자, 숫자, 특수문자가 적어도 1개이상, 8~16글자");
				$("#password").focus();
				return false;
			}
			
			var phone = $("#phone").val().trim();
			var regExpPhone = /^[0-9]{3}-[0-9]{3,4}-[0-9]{4}$/; // 숫자3-숫자3,4-숫자4
			if(!regExpPhone.test(phone)){
				alert("전화번호 입력란에는 000-0000-0000 형식");
				$("#phone").focus();
				return false;
			}
			
			var frm = document.frmRegister;
			frm.action = "enroll.do";
			frm.method = "post";
			frm.submit();
		});
	</script>
</body>
</html>
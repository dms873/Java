package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		//	실습문제 1 : 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 "OO메뉴입니다"를, 종료 번호를 누르면 "프로그램이 종료됩니다."를 출력하세요.
		//	ex) 1. 입력 2. 수정 3. 조회 4. 삭제 7. 종료

		//	메뉴 번호를 입력받을 Scanner 선언
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입력" + "\n" + "2. 수정" + "\n" + "3. 조회" + "\n" + "4. 삭제" + "\n" + "7. 종료");
		System.out.print("메뉴 번호를 입력해주세요 : ");
		//	입력받은 번호를 담아줄 num 변수 선언
		int num = sc.nextInt();
		//	메뉴 이름 담아줄 menu 변수 선언
		String menu = "";

		if(num == 1) {
			menu = "입력";
		} else if(num == 2) {
			menu = "수정";
		} else if(num == 3) {
			menu = "조회";
		} else if(num == 4) {
			menu = "삭제";
		} else if(num == 7) {
			menu = "종료";
		}
		System.out.println(menu + " 메뉴입니다.");
		sc.close();
	}

	public void practice2() {
		//	실습문제 2 : 키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 "짝수다"를 출력하고 짝수가 아니면 "홀수다"를 출력하세요.
		//	양수가 아니면 "양수만 입력해주세요."를 출력하세요.

		//	숫자를 입력받을 Scanner 선언
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		//	입력받은 숫자를 담아줄 num 변수 선언
		int num = sc.nextInt();

		if(num % 2 == 0 && num > 0) { // num을 2로 나눴을때 나머지가 0이고 num이 양수면
			System.out.println("짝수다.");
		} else if(num % 2 == 1) { // num을 2로 나눴을때 나머지가 1이면
			System.out.println("홀수다.");
		} else if(num < 0) { // num이 음수면
			System.out.println("양수만 입력해주세요.");
		}
		sc.close();
	}
	
	public void practice3() {
		//	실습문제 3 : 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고 합계와 평균을 이용하여
		//	합격 / 불합격 처리하는 기능을 구현하세요. (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
		//	합격 했을 경우 : 과목 별 점수와 합계, 평균, "축하합니다, 합격입니다!"를 출력
		//	불합격인 경우 : "불합격입니다."를 출력하세요.

		//	점수를 입력받을 Scanner 선언
		Scanner sc = new Scanner(System.in);
		//	합계를 담아줄 sum 변수 선언
		int sum = 0;
		//	평균을 담아줄 avg 변수 선언
		double avg = 0;

		System.out.print("국어 점수 : ");
		// 국어점수를 담아줄 kor 변수 선언
		int kor = sc.nextInt();
		System.out.print("수학 점수 : ");
		// 수학점수를 담아줄 math 변수 선언
		int math = sc.nextInt();
		System.out.print("영어 점수 : ");
		// 영어점수를 담아줄 eng 변수 선언
		int eng = sc.nextInt();

		// 합계 값 sum 변수에 넣어주기
		sum = kor + eng + math;
		// 평균 값 avg 변수에 넣어주기
		avg = sum / 3;

		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) { // 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우
			System.out.println("국어 : " + kor + "\n" + "수학 : " + math + "\n" + "영어 : " + eng + "\n" 
					+ "합계 : " + sum + "\n" + "평균 : " + avg + "\n" + "축하합니다, 합격입니다!");
		} else { // 그 외
			System.out.println("불합격입니다.");
		}
		sc.close();
	}

	public void practice4() {
		//	실습문제 4 : 수업 자료(7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요.

		//	월을 입력받을 Scanner 선언
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");

		//	입력받은 월을 담아줄 month 변수 선언
		int month = sc.nextInt();
		//	무슨 계절인지 담아줄 season 변수 선언
		String season = "";

		switch (month) {
		case 1:
		case 2:
		case 12:
			season = "겨울";
			System.out.println(month + "월은 " + season + "입니다.");
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			System.out.println(month + "월은 " + season + "입니다.");
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			System.out.println(month + "월은 " + season + "입니다.");
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			System.out.println(month + "월은 " + season + "입니다.");
			break;

		default:
			System.out.println(month + "월은 잘못 입력된 달입니다.");
			break;
		}
		sc.close();
	}
	
	public void practice5() {
		//	실습문제5 : 아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
		//	로그인 성공 시 "로그인 성공", 아이디가 틀렸을 시 "아이디가 틀렸습니다.", 비밀번호가 틀렸을 시 "비밀번호가 틀렸습니다."를 출력하세요.

		//	아이디, 비밀번호 입력받을 Scanner 선언
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		//	입력받은 아이디를 담아 줄 id 선언
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		//	입력받은 비밀번호를 담아 줄 pw 선언
		String pw = sc.nextLine();

		//	비교할 진짜 아이디, 비밀번호 변수 선언
		String realId = "myId";
		String realPw = "myPassword12";

		//	문자열 비교를 위해 equals메소드 사용
		if(id.equals(realId) && pw.equals(realPw)) { // 입력받은 id가 realId와 같고 입력받은 pw가 realPw와 같으면
			System.out.println("로그인 성공");
		} else if(id.equals(realId) && !pw.equals(realPw)) { // 입력받은 id가 realId와 같고 입력받은 pw가 realPw와 다르면
			System.out.println("비밀번호가 틀렸습니다.");
		} else if(!id.equals(realId) && pw.equals(realPw)) { // 입력받은 id가 realId와 다르고 입력받은 pw가 realPw와 같으면
			System.out.println("아이디가 틀렸습니다.");
		} else {
			System.out.println("아이디와 비밀번호를 다시 확인해주세요.");
		}
		sc.close();
	}
	
	public void practice6() {
		//	실습문제 6 : 사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
		//	단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		//	회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고 비회원은 게시글 조회만 가능합니다.

		//	관리자, 회원, 비회원 입력받을 Scanner 선언
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		//	어느 등급인지 담을 level 선언
		String level = sc.nextLine();

		if(level.equals("관리자")) {
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
		} else if(level.equals("회원")) {
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		} else if(level.equals("비회원")) {
			System.out.println("게시글 조회");
		} else {
			System.out.println("권한이 없습니다.");
		}
		sc.close();
	}

	public void practice7() {
		//	실습문제 7 : 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라 저체중/정상체중/과체중/비만을 출력하세요.
		//	BMI = 몸무게 / (키(m) * 키(m))
		//	BMI가 18.5 미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
		//	BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
		//	BMI가 30이상일 경우 고도 비만

		//	키와 몸무게를 입력받을 Scanner 선언
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요 : ");
		//	입력받은 키를 담을 height 변수 선언
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		//	입력받은 몸무게를 담을 weight 변수 선언
		double weight = sc.nextDouble();
		//	BMI 계산 결과를 담을 bmi 변수 선언
		double bmi = weight / (height * height);

		if(bmi < 18.5) { // BMI가 18.5 미만일 경우
			System.out.println("BMI 지수 : " + bmi + "\n" + "저체중");
		} else if(bmi >= 18.5 && bmi < 23) { // BMI가 18.5이상 23미만일 경우
			System.out.println("BMI 지수 : " + bmi + "\n" + "정상체중");
		} else if(bmi >= 23 && bmi < 25) { // BMI가 23이상 25미만일 경우
			System.out.println("BMI 지수 : " + bmi + "\n" + "과체중");
		} else if(bmi >= 25 && bmi < 30) { // BMI가 25이상 30미만일 경우
			System.out.println("BMI 지수 : " + bmi + "\n" + "비만");
		} else if(bmi >= 30) { // BMI가 30이상일 경우
			System.out.println("BMI 지수 : " + bmi + "\n" + "고도 비만");
		}
		sc.close();
	}
	
	public void practice8() {
		//	실습문제 8 : 키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
		//	(단, 두 개의 정수 모두 양수일 때만 작동하며 없는 연산 기호를 입력 했을 시 "잘못 입력하셨습니다. 프로그램을 종료합니다" 출력)


		//	
		Scanner sc = new Scanner(System.in);
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력(+, -, *, /, %) : ");
		String op = sc.next();

		if(op.equals("+") && num1 > 0 && num2 > 0) { // 연산자가 "+"가 입력되었을 때, 두 수 모두 양수일 때
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		} else if(op.equals("-") && num1 > 0 && num2 > 0) { // 연산자가 "-"가 입력되었을 때, 두 수 모두 양수일 때
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		} else if(op.equals("*") && num1 > 0 && num2 > 0) { // 연산자가 "*"가 입력되었을 때, 두 수 모두 양수일 때
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		} else if(op.equals("/") && num1 > 0 && num2 > 0) { // 연산자가 "/"가 입력되었을 때, 두 수 모두 양수일 때
			//			System.out.println("num1" + " / " + "num2" + " = " + ((double)num1 / num2));
			// 예제처럼 소수점 6자리 표시하기 위해 String.format() 사용
			System.out.println(num1 + " / " + num2 + " = " + String.format("%.6f", (double)num1 / num2)); 
		} else if(op.equals("%") && num1 > 0 && num2 > 0) { // 연산자가 "%"가 입력되었을 때, 두 수 모두 양수일 때
			System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
		} else { // 없는 연산 기호 입력 했을 때, 음수 일 때
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
		sc.close();

	}
	
	public void practice9() {
		// 실습문제 9 : 중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력하세요.
		// 평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
		// 이 때, 출석 비율은 출석 횟수의 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
		// 70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
		
		// 중간, 기말, 과제 점수와 출석 횟수 입력받을 Scanner 선언
		Scanner sc = new Scanner(System.in);
		System.out.print("중간고사 점수 : ");
		// 입력받은 중간고사 점수 담을 midSco 변수 선언
		double midSco = sc.nextDouble();
		System.out.print("기말고사 점수 : ");
		// 입력받은 기말고사 점수 담을 finSco 변수 선언
		double finSco = sc.nextDouble();
		System.out.print("과제 점수 : ");
		// 입력받은 과제 점수 담을 test 변수 선언
		double test = sc.nextDouble();
		System.out.print("출석 횟수 : ");
		// 입력받은 출석 횟수 담을 ad 변수 선언
		double ad = sc.nextDouble();
		
		// 각 점수 평가비율 계산(출석 20%지만 전체가 20회라서 따로 변수 선언 하지 않고 ad 변수 사용 예정)
		double midRes = midSco * 0.2;
		double finRes = finSco * 0.3;
		double testRes = test * 0.3;
		
		// 총점 담을 total 변수 선언
		double total = midRes + finRes + testRes + ad;
		
		
		System.out.println("============= 결 과 =============");
		if(total >= 70 && ad > 14) { // 총점이 70점 이상이고 전체 강의(20)의 30% 이상 결석을 안했을 경우(출석 14일 이상)
			System.out.println("중간고사 점수(20) : " + midRes);
			System.out.println("기말고사 점수(30) : " + finRes);
			System.out.println("과제 점수   (30) : " + testRes);
			System.out.println("출석 점수   (20) : " + ad);
			System.out.println("총점 : " + total);
			System.out.println("Pass");
		} else if(total < 70 && ad > 14) { // 총점이 70점 미만이고 전체 강의(20)의 30% 이상 결석을 안했을 경우(출석 14일 이상)
			System.out.println("중간고사 점수(20) : " + midRes);
			System.out.println("기말고사 점수(30) : " + finRes);
			System.out.println("과제 점수   (30) : " + testRes);
			System.out.println("출석 점수   (20) : " + ad);
			System.out.println("총점 : " + total);
			System.out.println("Fail [점수 미달]");
		} else if(ad < 14) { // 전체 강의(20)의 30% 이상 결석 시(출석 14일 미만)
			System.out.println("Fail [출석 횟수 부족 (" + (int)ad + "/20)]");
		}
		sc.close();
	}
	
	public void practice10() {
		// 실습문제 10 : 앞에 구현한 실습문제를 선택하여 실행할 수 있는 메뉴화면을 구현하세요.
		
		// 번호 입력받을 Scanner 선언
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력" + "\n" + "2. 짝수/홀수" + "\n" + "3. 합격/불합격" + "\n" + "4. 계절" + "\n" 
						+ "5. 로그인" + "\n" + "6. 권환 확인" + "\n" + "7. BMI" + "\n" + "8. 계산기" + "\n" + "9. P/F");
		System.out.print("선택 : ");
		// 입력받은 번호를 담아줄 num 변수 선언
		int num = sc.nextInt();
		if(num == 1) { // num이 1이면 practice1() 실행
			practice1();
		} else if(num == 2) { // num이 2이면 practice2() 실행
			practice2();
		} else if(num == 3) { // num이 3이면 practice3() 실행
			practice3();
		} else if(num == 4) { // num이 4이면 practice4() 실행
			practice4();
		} else if(num == 5) { // num이 5이면 practice5() 실행
			practice5();
		} else if(num == 6) { // num이 6이면 practice6() 실행
			practice6();
		} else if(num == 7) { // num이 7이면 practice7() 실행
			practice7();
		} else if(num == 8) { // num이 8이면 practice8() 실행
			practice8();
		} else if(num == 9) { // num이 9이면 practice9() 실행
			practice9();
		}
		sc.close();
	}
}

package com.kh.practice.chap01;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
//		실습문제 1 : 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
//		만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요."를 출력하세요.

//		숫자 입력받을 Scanner 선언
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
//		입력한 숫자를 담아줄 num 변수 선언
		int num = sc.nextInt();

		if(num <= 0) { // num이 0이거나 음수면
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		for(int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
		sc.close();
	}

	public void practice2() {
		//	실습문제 2 : 위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		//	"1 이상의 숫자를 입력해주세요"가 출력되면서 다시 사용자가 값을 입력하도록 하세요.

//		숫자 입력받을 Scanner 선언
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
//		입력한 숫자를 담아줄 num 변수 선언
		int num = sc.nextInt();

		if(num <= 0) { // num이 0이거나 음수면
			System.out.println("1 이상의 숫자를 입력해주세요.");
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
		}
		if(num != 0) { // num이 0이 아니면
			for(int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}	
		sc.close();
	}

	public void practice3() {
		//	실습문제 3 : 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		//	단, 입력한 수는 1보다 크거나 같아야 합니다.
		
//		숫자를 입력받을 Scanner 선언
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
//		입력받은 숫자를 담을 num 변수 선언
		int num = sc.nextInt();

		if(num <= 0) { // num이 0이거나 음수면
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		for(int i = num; i >= 1; i--) { // 차례대로 숫자가 작아지게 i--
			System.out.print(i + " ");
		}
		sc.close();
	}

	public void practice4() {
		//	실습문제 4 : 위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		//	"1 이상의 숫자를 입력해주세요."가 출력되면서 다시 사용자가 값을 입력하도록 하세요.

//		숫자를 입력받을 Scanner 선언
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
//		입력받은 숫자를 담을 num 변수 선언
		int num = sc.nextInt();

		if(num <= 0) { // num이 0이거나 음수면
			System.out.println("1 이상의 숫자를 입력해주세요.");
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
		}
		for(int i = num; i >= 1; i--) { // 차례대로 숫자가 작아지게 i--
			System.out.print(i + " ");
		}
		sc.close();
	}

	public void practice5() {
		//		실습문제 5 : 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.

//		정수 입력받을 Scanner 선언
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
//		입력받은 정수를 담아줄 num 변수 선언
		int num = sc.nextInt();

		int i = 1; // i 변수 선언
		int sum = 0; // 정수들의 총합을 담아줄 sum 변수 선언
		do {
			if(i == num) { // i가 num이랑 같으면
				System.out.print(i); // i 출력
			} else { // 아니면
				System.out.print(i + " + "); // i + 출력
			}
			sum += i; // i를 sum에 더해주기
			i++; // 증감식
		} while (i <= num); // 조건식
		System.out.print(" = " + sum);
		sc.close();
	}

	public void practice6() {
		//		실습문제 6 : 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		//		만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"를 출력하세요.

//		숫자들을 입력받을 Scanner 선언
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
//		입력받은 첫 번째 숫자를 담아줄 num1 변수 선언
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
//		입력받은 두 번째 숫자를 담아줄 num2 변수 선언
		int num2 = sc.nextInt();
//		둘 중 큰 수를 담아줄 max 변수 선언
		int max = 0;
//		둘 중 작은 수를 담아줄 min 변수 선언
		int min = 0;

		if(num1 > num2) { // num1이 num2보다 크면
			max = num1;
			min = num2;
		} else { // num2가 num1보다 크면
			max = num2;
			min = num1;
		}
		if(num1 > 0 && num2 > 0) { // 두 수 모두 양수일 때
			for(int i = min; i <= max; i++) {
				System.out.print(i + " ");
			}
		} else { // 0또는 음수일 때
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}	
		sc.close();
	}

	public void practice7() {
		//		실습문제 7 : 위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		//		"1 이상의 숫자를 입력해주세요"가 출력되면서 다시 사용자가 값을 입력하도록 하세요.

//		숫자들을 입력받을 Scanner 선언
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
//		입력받은 첫 번째 숫자를 담아줄 num1 변수 선언
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
//		입력받은 두 번째 숫자를 담아줄 num2 변수 선언
		int num2 = sc.nextInt();
//		둘 중 큰 수를 담아줄 max 변수 선언
		int max = 0;
//		둘 중 작은 수를 담아줄 min 변수 선언
		int min = 0;

		if(num1 <= 0 || num2 <= 0) { // num1이나 num2가 0보다 작거나 같으면
			System.out.println("1 이상의 숫자를 입력해주세요.");
			System.out.print("첫 번째 숫자 : ");
			num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			num2 = sc.nextInt();
		}

		if(num1 > num2) { // num1이 num2보다 크면
			max = num1;
			min = num2;
		} else { // num2가 num1보다 크면
			max = num2;
			min = num1;
		}

		if(num1 > 0 && num2 > 0) { // num1, num2가 양수일 때
			for(int i = min; i <= max; i++) { // 작은수부터 큰수까지 반복
				System.out.print(i + " ");
			}
		}
		sc.close();
	}

	public void practice8() {
		//		실습문제 8 : 사용자로부터 입력 받은 숫자의 단을 출력하세요.

//		숫자를 입력받을 Scanner 선언
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
//		입력받은 숫자를 담아줄 num1 변수 선언
		int num1 = sc.nextInt();

		System.out.println("==== " + num1 + "단" + " ===="); // 몇 단인지 표시
		for(int i = 1; i < 10; i++) { // for문을 이용해 i가 9될때까지 반복하여 수행
			System.out.println(num1 + " * " + i + " = " + num1*i);
		}

	}

	public void practice9() {
		//		실습문제 9 : 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		//		단, 9를 초과하는 숫자가 들어오면 "9 이하의 숫자만 입력해주세요."를 출력하세요.

//		숫자 입력받을 Scanner 선언
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
//		입력받은 숫자를 담아줄 num1 변수 선언
		int num1 = sc.nextInt();

		if(num1 <= 9) { // num1이 9보다 작거나 같으면
			for(int i = num1; i < 10; i++) {
				System.out.println("==== " + i + "단" + " ====");
				for(int j = 1; j < 10; j++) {
					System.out.println(i + " * " + j + " = " + i*j);
				}
			}
		} else { 
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}
		sc.close();
	}

	public void practice10() {
		//		실습문제 10 : 위 문제와 모든 것이 동일하나, 9를 초과하는 숫자가 입력됐다면
		//		"9 이하의 숫자를 입력해주세요"가 출력되면서 다시 사용자가 값을 입력하도록 하세요.

//		숫자를 입력받을 Scanner 선언
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
//		입력받은 숫자를 담아줄 num1 변수 선언
		int num1 = sc.nextInt();

		if(num1 > 9) { // num1이 9보다 크면
			System.out.println("9 이하의 숫자만 입력해주세요.");
			System.out.print("숫자 : ");
			num1 = sc.nextInt();
		}
		if(num1 <= 9) { // num1이 9보다 작거나 같으면
			for(int i = num1; i < 10; i++) {
				System.out.println("==== " + i + "단" + " ====");
				for(int j = 1; j < 10; j++) {
					System.out.println(i + " * " + j + " = " + i*j);
				}
			}
		} 
		sc.close();
	}

	public void practice11() {
		//		실습문제 11 : 사용자로부터 시작 숫자와 공차를 입력 받아 일정한 값으로
		//		숫자가 커지거나 작아지는 프로그램을 구현하세요. 단, 출력되는 숫자는 총 10개입니다.

//		숫자, 공차를 입력받을 Scanner 선언
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
//		입력받은 시작 숫자를 담아줄 startNum 변수 선언
		int startNum = sc.nextInt();
		System.out.print("공차 : ");
//		입력받은 공차를 담아줄 num 변수 선언
		int num = sc.nextInt();
//		출력되는 숫자가 10개라 카운트해줄 변수 선언
		int cnt = 0;

		for(int i = startNum; ; i += num) { // 조건 없음, for문 한 번 돌때마다 num을 i에 더해주기
			System.out.print(i + " "); // i 출력
			cnt++; // 1개 출력할때마다 cnt++;
			if(cnt == 10) { // cnt가 10개면 break;
				break;
			}
		}
		sc.close();
	}

	public void practice12() {
		//		실습문제 12 : 정수 두 개와 연산자를 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.
		//		단, 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며
		//		exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다.
		//		또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
		//		“0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며,
		//		없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력하고
		//		두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.

//		연산자, 정수 2개를 입력받기위해 Scanner 선언
		Scanner sc = new Scanner(System.in);
		
//		입력받은 연산자를 담아줄 op 변수 선언
		String op = "";
//		입력받은 정수1을 담아줄 num1 변수 선언
		int num1 = 0;
//		입력받은 정수2를 담아줄 num2 변수 선언
		int num2 = 0;

		while(true) { // 무한 반복
			System.out.print("연산자(+, -, *, /, %) : ");
			op = sc.next();
			if(op.equals("exit")) { // op가 "exit"면 break로 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print("정수1 : ");
			num1 = sc.nextInt();
			System.out.print("정수2 : ");
			num2 = sc.nextInt();
			
//			연산자 +,-,*,/,% 를 제외한 글이 작성되면 없는 연산자입니다. 다시 입력해주세요 출력
			if(!(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("%"))) {
				System.out.println("없는 연산자입니다. 다시 입력해주세요");
				System.out.println();
				continue;
			}
			if(op.equals("/") && num2 == 0) { // 연산자가 나누기면서 두 번째 정수가 0으로 들어오면
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				System.out.println();
				continue;
			}
				if(op.equals("+")) {
					System.out.printf("%d + %d = %2d \n\n", num1, num2, (num1 + num2));
				} else if(op.equals("-")) {
					System.out.printf("%d - %d = %2d \n\n", num1, num2, (num1 - num2));
				} else if(op.equals("*")) {
					System.out.printf("%d * %d = %2d \n\n", num1, num2, (num1 * num2));
				} else if(op.equals("/")) {
					System.out.printf("%d / %d = %2d \n\n", num1, num2, (num1 / num2));
				} else if(op.equals("%")) {
					System.out.printf("%d % %d = %2d \n\n", num1, num2, (num1 % num2));
				}
		}  
		sc.close();
	}
	
	public void practice13() {
//		실습문제13 : 다음과 같은 실행 예제를 구현하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i <= num; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
	
	public void practice14() {
//		실습문제14 : 다음과 같은 실행 예제를 구현하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = num; i > 0; i--) { 
			for(int j = 0; j < i; j++) { 
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}

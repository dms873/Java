package example.repetitive;

import java.util.Scanner;

import javax.print.CancelablePrintJob;

public class Repetitive {
	public void testFor() {
		// for(초기식; 조건식; 증감식) {}
		for(int i = 0; i < 10; i++) {
			System.out.println(i + "번째 출력");
		}
		// i를 감소
		for(int i = 10; i > 0; i--) {
			System.out.println(i + "번째 출력");
		}
		// 증감식은 반드시 1씩 증감할 필요가 없다
		for(int i = 0; i < 10; i += 2) {
			System.out.println(i + "번째 출력");
		}
		// int가 아닌 char를 입력하면?
		for(char ch = 'a'; ch <= 'e'; ch++) {
			System.out.println(ch);
		}
	}

	public void testWhile() {
		// 초기식
		int i = 0;
		while(i < 10) { // 조건식
			System.out.println(i + "번째 i 출력");
			i++; // 증감식
		}

		// 감소
		int j = 10;
		while(j > 0) {
			System.out.println(j + "번째 j 출력");
			j--;
		}

		// 무한 루프 : 조건 값을 항상 true
		//		int k = 0;
		//		while(true) {
		//			System.out.println(k++ + "번째 k 출력");
		//			
		//		}
	}

	public void testDowhile() {
		// 초기식
		int i = 0;
		do {
			System.out.println(i + "번째 i 출력");
			i++; // 증감식
		} while (i < 10); // 조건식 + 세미콜론

		// 감소
		int j = 10;
		do {
			System.out.println(j + "번째 j 출력");
			j--;
		} while (j > 0);

		// do-while문 무한루프
		//		int k = 0;
		//		do {
		//			System.out.println(k++ + "번째 k 출력");			
		//		} while (true);
	}

	public void testGugudan() {
		// 중첩 반복문 구구단
		// for문
		for(int i = 2; i < 10; i++) {
			System.out.println("==== " + i + "단 ====");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
		}

		// while문
		int i = 2;
		while(i < 10) {
			System.out.println("==== " + i + "단 ====");
			int j = 1;
			while(j < 10) {
				System.out.println(i + " X " + j + " = " + i*j);
				j++;
			}
			i++;
		}
	}

	public void testBreak() {
		// 숫자를 입력 받아 입력 받은 숫자만큼만 반복적으로 출력 후 종료
		Scanner sc = new Scanner(System.in);
		System.out.print("반복할 횟수 입력 : ");
		int num = sc.nextInt();

		int i = 1;
		while(true) {
			System.out.println(i + "번째 i 출력");
			if(i== num) {
				break;
			}
			i++;
		}
	}

	public void testFor2() {
		// 초기식 생략 for문
		int i = 0;
		for(; i < 10; i++) {
			System.out.println(i + "번째 i 출력");
		}
		// 조건식 생략 for문
		for(int j = 0; ; j++) {
			if(j < 10) {
				System.out.println(j + "번째 j 출력");
			} else {
				break;
			}
		}
		// 증감식 생략 for문
		for(int k = 0; k < 10;) {
			System.out.println(k + "번째 k 출력");
			k++;
		}
		// 모두 생략
		int l = 0;
		for(;;) {
			if(l < 10) {
				System.out.println(l + "번째 l 출력");
			} else {
				break;
			}
			l++;
		}
	}
	public void testContinue() {
		// 1~100까지의 합(3과 5의 배수는 제외)을 출력
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("sum : " + sum);
	}

	public void testGugudan2() {
		// 분기문을 이용한 중첩 반복문 구구단

		// for문으로 구구단 짝수단(2단, 4단, 6단, 8단)만 구현 
		for(int i = 2; i < 10; i += 2) { // 분기문 구현하지 않고도 가능
			//			if(i % 2 == 1) continue;
			System.out.println("==== " + i + "단 ====");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
		}
		
		
		
		// while문으로 구구단 홀수곱만 구현
		int i = 2;
		while(i < 10) {
			System.out.println("==== " + i + "단 ====");
			// int j = 0;
			int j = 1;
			while(j < 10) {
				// j++; 증감식이 continue 뒤에 있다면 j의 값이 변화가 없어서 무한 루프가 됨
//				if(j % 2 == 0) continue;
				System.out.println(i + " X " + j + " = " + i*j);
				j += 2;
			}
			i++;
		}
		
		
		
		
		
	}
}

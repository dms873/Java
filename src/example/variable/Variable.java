package example.variable;

import java.io.LineNumberInputStream;
import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수 선언과 동시에 초기화
		
		// 논리형 : 1byte
		// 2단어 이상의 변수명 : 낙타등 표기법
		
		boolean isTrue = true;
		boolean isFalse = false;
		
		// 문자 : 2byte
		char ch = 'a'; // '' 싱글 쿼테이션 사용
		// char ch2 = 'bc'; // 하나의 문자만 대입 가능
		
		// 문자열 : 참조형(주소값 저장)
		String str = "안녕하세요"; // "" 더블 쿼테이션 사용
		
		// 숫자형
		// 정수
		byte bnum = 1; // 1byte
		short snum = 2; // 2byte
		int inum = 4; // 4byte
		long lnum = 8L; // 8byte
		
		// 실수
		float fnum = 4.0f; // 4byte
		double dnum = 8.0; // 8byte
		
		// 변수에 저장된 값 출력하기
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("isFalse의 값 : " + isFalse);

		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);

		System.out.println("bnum의 값 : " + bnum);
		System.out.println("snum의 값 : " + snum);
		System.out.println("inum의 값 : " + inum);
		System.out.println("lnum의 값 : " + lnum);

		System.out.println("fnum의 값 : " + fnum);
		System.out.println("dnum의 값 : " + dnum);
		
		
		
	}
	
	public void changeValue() {
		// 변수값 변경 테스트
		String name;
		char gender;
		int age;
		double height;

		name = "김영희";
		gender = 'F';
		age = 20;
		height = 171.5;

		System.out.println(name + "님의 개인정보");
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		System.out.println("height : " + height);

		// 키보드로 값을 입력받아 변수에 저장된 값 변경
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.println("성별을 입력하세요 : ");
		gender = sc.next().charAt(0); // 문자를 읽어오는 메소드는 제공하지 않기 때문
		System.out.println("나이를 입력하세요 : ");
		age = sc.nextInt();
		System.out.println("키를 입력하세요 : ");
		height = sc.nextDouble();

	}
	public void testFinal() {
		// 상수 테스트
		int size; // 변수
		final int SIZE; // 상수
		
		size = 10;
		SIZE = 10;
		
		System.out.println("=== 값 변경 전 ===");
		System.out.println("size : " + size);
		System.out.println("SIZE : " + SIZE);
		
		// 변수의 값 변경
		size = 20;
		// SIZE = 20; // 상수는 초기화 이후 다른 데이터 대입 불가
		
		System.out.println("=== 값 변경 후 ===");
		System.out.println("size : " + size);
		System.out.println("SIZE : " + SIZE);
	}
	public void testOverflow() {
		// 데이터 오버플로우 테스트
		System.out.println("byte의 최대값 : " + Byte.MAX_VALUE);
		System.out.println("byte의 최소값 : " + Byte.MIN_VALUE);
		
		// byte bnum = 128; // 저장 가능 범위를 벗어나므로 에러 발생
		byte bnum = 127;
		bnum += 1;
		System.out.println("byte의 최대값 + 1 : " + bnum);
		
		bnum = -128;
		bnum -= 1;
		System.out.println("byte의 최소값 - 1 : " + bnum);
		
		int num1 = 100000;
		int num2 = 30000;
		
		// int의 저장 가능범위는 약 21억이므로 30억이라는 값을 대입하면 오버플로우 발생
		// int result = num1*num2;
		
		long result = (long)num1*num2;
		System.out.println("계산 결과 : " + result);
		
	}
	
	public void testCasting() {
		// 형변환 테스트
		boolean bool = true;
		// bool = 1; // 형변환 불가
		
		// char -> int : 자동 형변환
		int num = 'A';
		System.out.println("num : " + num);
		
		// char에 정수값 저장 가능(숫자에 해당하는 유니코드 문자)
		char ch = 66;
		System.out.println("ch : " + ch);
		// ch = -66; // 음수는 불가능
		
		// int -> char : 강제 형변환
		char ch2 = (char)num;
		System.out.println("ch2 : " + ch2);
	}
	public void testCasting2() {
		// int와 long의 연산
		int inum = 4;
		long lnum = 8L;
		
		// 1. int 결과
		int isum = (int)(inum + lnum);
		isum = inum + (int)lnum;
		System.out.println("isum : " + isum);
		
		// 2. long 결과
		long lsum = inum + lnum;
		System.out.println("lsum : " + lsum);
		
		// byte, short의 연산 결과 : int
		byte bnum = 1;
		short snum = 2;
		
		int sum1 = bnum + snum;
		System.out.println("sum1 : " + sum1);
		
		// byte or short의 결과를 얻기 위해 강제 형변환
		short sum2 = (short)(bnum + snum);
		System.out.println("sum2 : " + sum2);
	}
	public void testDataLoss() {
		// 데이터 손실 테스트
		
		// 정수 -> 실수 : 자동 형변환
		long lnum = 100;
		float fnum = lnum;
		System.out.println("fnum : " + fnum);
		
		// 실수 -> 정수 : 강제 형변환
		// 소수점 이하를 절삭하기 때문에 데이터 손실
		double dnum = 10.5;
		int inum = (int)dnum;
		System.out.println("inum : " + inum);
		
		// 강제 형변환으로 인해 예상치 못한 데이터 손실 발생에 주의
		int num = 290;
		System.out.println("num : " + num);
		
		byte bnum = (byte)num;
		System.out.println("bnum : " + bnum);
	}
}

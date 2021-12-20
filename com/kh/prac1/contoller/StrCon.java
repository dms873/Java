package com.kh.prac1.contoller;
/* API1 실습문제1
 * 
 * 패키지명 :
 * com.kh.prac1.controller.StrCon
 * com.kh.prac1.run.Run
 * 
 * Run 클래스에서 StrCon 클래스의 메소드 strMethod()를 실행
 * strMethod 내용 :
 * String str1에 리터럴 방식으로 "무궁화 꽃이 피었습니다." 문자열을 생성
 * String str2에 new 연산자 방식으로 "무궁화 꽃이 피었습니다." 문자열을 생성
 * String str3에 new 연산자 방식으로 "동해물과 백두산이" 문자열을 생성
 * 
 * 각각의 String을 hashCode 및 identityHashCode 메소드로 주소값 출력
 * System.out.println("====== hashCode 비교 ======");
 * 3가지 String 변수의 hashCode 출력
 * 
 * System.out.println("====== identityHashCode 비교 ======");
 * 3가지 String 변수의 identityhashCode 출력
 * 
 * 출력 답 :
 * ====== hashCode 비교 ======
 * str1 : 313772671
 * str2 : 313772671
 * str3 : 282595592
 * ====== identityHashCode 비교 ======
 * str1 : 118352462
 * str2 : 1550089733
 * str3 : 865113938
 * 
 */
public class StrCon {
	public void strMethod() {
		String str1 = "무궁화 꽃이 피었습니다."; // 리터럴1
		String str2 = new String("무궁화 꽃이 피었습니다.");	// new 연산자 활용1
		String str3 = new String("동해물과 백두산이");		// new 연산자 활용2
		String str4 = "무궁화 꽃이 피었습니다."; // 리터럴2
		
		System.out.println("====== hashCode 비교 ======"); // 주소값이 아니다(String)
		System.out.println("str1 : " + str1.hashCode());
		System.out.println("str2 : " + str2.hashCode());
		System.out.println("str3 : " + str3.hashCode());
		
		System.out.println("====== identityHashCode 비교 ======");
		System.out.println("str1 : " + System.identityHashCode(str1));
		System.out.println("str2 : " + System.identityHashCode(str2));
		System.out.println("str3 : " + System.identityHashCode(str3));
		System.out.println("str4 : " + System.identityHashCode(str4));
	}
}

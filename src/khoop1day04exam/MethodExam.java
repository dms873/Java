package khoop1day04exam;

public class MethodExam {
	// 1. 매개변수가 없고, 리턴값도 없을 때

	/*
	 * [접근제한자] [예약어] void 메소드명() {
	 * 
	 * }
	 * 
	 */

	public void method() {
		System.out.println("매개변수가 없고, 리턴값도 없을 때");
	}

	// 2. 매개변수가 있고, 리턴값이 없을 때

	/*
	 * [접근제한자] [예약어] void 메소드명(매개변수) {
	 * 
	 * }
	 * 
	 * 매개변수의 값의 타입은 기본자료형, 배열, 클래스, 가변인자
	 * 매개변수의 수는 여러개일 수 있다. ,(콤마)로 구분한다.
	 */

	public void method2(int x) {
		System.out.println("매개변수는" + x + " 리턴값은 없을 때 메소드");
	}

	public void method2(int x,String s) {
		System.out.println("매개변수가 한 개 이상이고 리턴값이 없을 때 메소드");
	}

	public void method2(int[] x, String[] s) {
		System.out.println("매개변수가 배열형태이고 리턴값은 없을 때 메소드");
	}

	// 3. 매개변수가 없고, 리턴값이 있을 때
	/*
	 * [접근제한자] [예약어] 반환형 메소드명() {
	 * 
	 * }
	 */
	
	public int method3() {
		System.out.println("매개변수가 없고, 리턴값이 있을 때 메소드");
		return 10;
	}
	
	// 4. 매개변수가 있고, 리턴값이 있을 때
	/*
	 * [접근제한자] [예약어] 반환형 메소드명(매개변수) {
	 * 
	 * }
	 */

	public String method4(int x) {
		return "매개변수가 있고, 리턴값이 있을 때 메소드";
	}
}

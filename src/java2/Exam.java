package java2;

// 실행용 클래스 : 클래스 안에 main메소드가 존재하여 실행하는 클래스
// 기능제공 클래스 : 클래스 안에 메소드를 추가하여 필요한 기능이 구현되어 있는 클래스
public class Exam {
	// 변수(속성값 설정)
	// [ 접근제한자 ] [ 예약어 ] 자료형 변수명;
	// 접근제한자 : public protected, (default), private
	// 예약어 : static, final
	private static int age;
	public static String name;
	
	// 생성자
	public Exam() {}
	
	// 메소드(기능정의 설정)
	// [ 접근제한자 ] 반환형 메소드명(매개변수){기능정의}
	// 1. 매개변수가 없는 메소드
	public void printName() {
		// 기능정의
	}
		
	// 2. 매개변수가 있는 메소드
	public void printAge(int age) {
		// 기능정의
	}
}

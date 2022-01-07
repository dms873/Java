package access.test;

public class TestPrivate {
	
	public static void main(String[] args) {
		System.out.println("OOP 첫 프로그램");
		
		// 다른 패키지인데 Class 이름이 같다면 이렇게 불러오면 됨.
		access.sample.TestPrivate tp = new access.sample.TestPrivate();
//		// 선언된 변수가 public 일 때는 읽기, 쓰기 가능
//		System.out.println("num field를 통한 값 : " + tp.num);
//		tp.num = 30; // num field에 바로 값을 저장
//		System.out.println("num field를 통한 값 : " + tp.num);
		
//		System.out.println("num set 하기 전 값 : " + tp.getNum());
//		tp.setNum(50);
//		System.out.println("num set 한 후 값 : " + tp.getNum());
		
	}
}

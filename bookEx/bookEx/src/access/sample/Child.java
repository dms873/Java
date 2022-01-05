package access.sample;

public class Child extends Parent {
	// 상속 extends 하게 되면 부모클래스 멤버변수, 메소드 중에서 public + protected 인 것이 내 것처럼 사용 가능
	// private int num; (X)
	
	public void insert() {
		this.num = 10; // protected 멤버는 상속된 후손 내에서만 사용 가능함.
		// this는 내 필드에 선언된 변수 num이 있으면 내 필드에서 선언된 num을 사용한다는 뜻.
		// 그치만 좋지 않은 코드로 부모에 있는 필드명을 똑같이 작성하지 않길 바람!! 
	}
	
	public void out() {
		System.out.println(super.num); // super은 부모 것을 내거에서도 사용 가능.
	}
}

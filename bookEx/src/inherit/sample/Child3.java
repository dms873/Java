package inherit.sample;

public class Child3 extends Parent3 {
//	public int age = 3;
	
	public Child3() {
		// super();은 생략해도 JVM이 알아서 넣어준다. 
		// 생성자를 여러개 만들면 적어줘야 함! 매개변수가 들어가있으면 매개변수도 타입, 개수 맞춰서 적어주기
		// ex) 부모에 public Parent3(int a) { 실행될 코드 } 라고 적혀있으면 => super(5); 으로 적어줘야됨
		
		super(); // 부모 기본 생성자 호출, 항상 첫 줄!
		System.out.println("자식 기본 생성자");
	}
	
	@Override
	// Override하는 경우는 부모 메소드의 수행기능 중 일부 수정되어 수행하기를 원할 때
	public void out() {
		// 부모기능 안쓰고 싶으면 super호출 안함!
		System.out.println("age : " + age); // 자식 것(자식 age가 없으면 부모 것 호출됨)
		System.out.println("this.age : " + this.age); // 자식 것(자식 age가 없으면 부모 것 호출됨)
		System.out.println("super.age : " + super.age); // 부모 것
		super.out(); // 부모 메소드 out() 호출, 첫 줄이 꼭 아니어도 됨
		System.out.println("자식 out() 메소드");
	}
}

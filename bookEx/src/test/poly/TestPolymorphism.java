package test.poly;

import poly.sample.Child4;
import poly.sample.Parent4;

public class TestPolymorphism {
	public static void main(String[] args) {
		// 변수
		int a = 30;
		int b = 50;
		int result = a + b;
		System.out.println(result);
		
		// 한 번만 사용할 거면 굳이 15-16 코드 처럼 변수 사용해서 2줄인데, 아래 코드는 1줄로 작성 가능하다.
//		Parent4 p1 = new Parent4();
//		p1.display();
		new Parent4().display();
		
		
		
		Child4 c = new Child4();
		c.display(); // "상속받아 재정의한 메소드"
		c.out(); // 0인데 Child4 기본생성자에 num = x;를 넣어주면 100의 값을 가져올 수 있다.
		System.out.println();
		
		// heap에 생성되는 것은 Child 모양으로 생성되고 그 주소를 p에게 전달함.
		// p의 자료형은 Parent이므로 p. 으로 접근가능한 범위는 Parent에 있는 field / method 만 가능함
		// (접근제한자에 따른 접근도 Parent의 설정에 따름).
		Parent4 p = new Child4(); 
		
		p.display(); // Overriding 된 parent 멤버이므로 접근 가능
//		p.out(); 컴파일에러. Parent 타입으로 Child 멤버에 접근할 수 없음.
	}
}

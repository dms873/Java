package access.test;

import access.sample.Child;
import access.sample.Parent;

public class TestProtected {
	public static void main(String[] args) {
		Parent pa = new Parent();
		Child ch = new Child();
		
//		pa.num = 10; // protected 멤버는 다른 패키지의 클래스 밖에서는 접근 불가
		ch.insert();
		ch.out();
	}
}

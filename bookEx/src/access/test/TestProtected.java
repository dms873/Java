package access.test;

import access.sample.Child2;
import access.sample.Parent2;

public class TestProtected {
	public static void main(String[] args) {
		Parent2 pa = new Parent2();
		Child2 ch = new Child2();
		
//		pa.num = 10; // protected 멤버는 다른 패키지의 클래스 밖에서는 접근 불가
		ch.insert();
		ch.out();
	}
}

package test.inherit;

import inherit.sample.Child;
import inherit.sample.Parent;

public class TestOverriding {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.display();
		// p.out()	// 부모객체는 자식객체의 멤버에 접근할 수 없다.
		
		Child c = new Child();
		c.out();
		c.display();
	}
}

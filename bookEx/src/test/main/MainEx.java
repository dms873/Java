package test.main;

import test.clone.CloneEx;
import test.equals.EqualsEx;

public class MainEx {
	public static void main(String[] args) {
		new CloneEx().testClone();
		// Point 객체의 참조값은 컴퓨터에 따라 다를 수 있다.
		
		new EqualsEx().testEquals();
	}
}

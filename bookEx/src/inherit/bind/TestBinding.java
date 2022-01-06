package inherit.bind;

import inherit.sample.Child;
import inherit.sample.Parent;

public class TestBinding {
	public static void main(String[] args) {
		Parent p = new Child();
		
		p.display(); // 컴파일시에는 정적 바인딩, 실행시에는 동적 바인딩됨
		// 실행 전에는 Parent에 있는 display()에 해당되는데 실행 후에는 Child에 있는 display()를 실행함.
	}
}

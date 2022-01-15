package test.collection;

import java.util.TreeSet;

public class TestTreeSet {
	public void testTreeSet() {
		TreeSet<String> test = new TreeSet<String>();
		
		test.add("3. Mybatis");
		test.add("1. Java");
		test.add("5. HTML5");
		test.add("4. Oracle");
		test.add("2. JDBC");
		
		for(String text : test) { // 앞의 번호 알파벳 순으로 자동 정렬되어 출력된다.
			System.out.println(text);
		}
		
	}
}

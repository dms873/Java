package test.collection;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {
	public void testLinkedHashSet() {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		set.add("Java");
		set.add("Oracle");
		set.add("JDBC");
		set.add("HTML5");
		
		for(String text : set) { // HashSet과 다르게 값이 들어간 순서대로 출력된다.
			System.out.println(text);
		}
	}
}

package test.collection;

import java.util.*;

public class TestArrayList {
	private List<String> l = new ArrayList<String>(); // 개수 제한 없음
	// String[] listA = new String[3]; // 개수 3개까지


	//	Collection<String> list1 = new ArrayList<String>();
	//	List<String> list2 = new ArrayList<String>();
	//	ArrayList<String> list3 = new ArrayList<String>();
	//  LinkedList<String> list4 = new LinkedList<String>();

	public void testArrayList() {
		// listA[0] = "Red";
		l.add("Red");	// [Red]
		l.add("Orange"); // [Red, Orange]
		l.add(1, "Yellow"); // [Red, Yellow, Orange]
		// 배열 읽기(배열명.get(index))
		// System.out.println(l.get(1)); // Orange
		// 배열 전체 읽기
		// System.out.println(l); / [Red, Yellow, Orange]
		printList();

		l.remove(2); // [Red, Yellow]
		printList();

		l.clear(); // []
		System.out.println("List가 비었나요? : " + l.isEmpty()); // true
	}

	public void printList() {
		System.out.println(l);
	}
}

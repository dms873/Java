package test.collection;

import java.util.LinkedList;

public class TestLinkedList {
	public TestLinkedList() {}
	
	public void testLinkedList() {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("포도"); // [포도]
		list.add("딸기"); // [포도, 딸기]
		list.add("복숭아"); // [포도, 딸기, 복숭아]
		list.add("키위"); // [포도, 딸기, 복숭아, 키위]
		printList(list);
		
		list.set(0, "오렌지"); // [오렌지, 딸기, 복숭아, 키위] -> set으로 0번째 인덱스 변경
		printList(list);
		
		list.remove(1); // [오렌지, 복숭아, 키위] -> remove로 1번째 인덱스 삭제
		list.remove("키위"); // "키위" 데이터 삭제
		printList(list);
	}
	
	public void printList(LinkedList<String>list) {
		// 반복문을 이용한 LinkedList 출력
		int num = list.size();
		for(int cnt = 0; cnt < num; cnt++) {
			String str = "[" + list.get(cnt) + "]";
			System.out.print(str);
		}
		System.out.println();
	}
}

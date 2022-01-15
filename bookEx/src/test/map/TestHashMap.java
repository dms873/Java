package test.map;

import java.util.HashMap;
import java.util.Iterator;

public class TestHashMap {
	public void testMap() {
		// <꼭 두 개 넣어야함.(key, value)>
		// key 위치에는 String을 보통 넣고, Integer를 넣는 일은 극히 드물다.(시리얼 넘버정도 쓸 때 사용)
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		// put = 입력
		map.put(1, "Apple");
		map.put(4, "Dandelion");
		map.put(3, "Corn");
		map.put(2, "BlackBerry");
		
//		key값을 알면 while문 굳이 안쓰고 바로 출력할 수 있음. 어떤 모양을 써도 오류 안남(ex:'c', 35, "35", ...)
//		System.out.println(map.get(3)); // Corn
		
		// 배열 : indexOutOfBounds.. 오류가 날 수 있기 때문에 Iterator을 사용하는 것을 권장.
		Object[] keyArr = map.keySet().toArray();
		System.out.println(keyArr[0]); // 1
		
//		Iterator : 반복자 interface
//		Set(중복이 없는 데이터들이 있는 리스트 - 배열)의 값들을 쭉 읽어들일 때 사용.
//		map 자료형이 HashMap모양인데, keySet()이 Key를 Set형태로 강제형변환을 해준다. 그리고 iterator()를 통해 Iterator모양으로 바꿔줌.
		Iterator<Integer> iterKey = map.keySet().iterator();
//		iterKey.hasNext(); // 읽어올 데이터(요소)가 있는지 확인
//		iterKey.next();    // 데이터(요소)를 꺼내서 읽음.
//		iterKey.remove();
		
		while(iterKey.hasNext()) { // 작성한 map 객체를 목록화하여 각각 출력한다.
			int key = iterKey.next();
			// get = 출력
			System.out.println("key " + key + " : " + map.get(key));
		}
	}
}

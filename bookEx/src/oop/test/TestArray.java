package oop.test;

import oop.sample.Person;

public class TestArray {
	public static void main(String[] args) {
		// 방법 1)
		Person[] list = new Person[3]; // 3명을 보관할 수 있는 객체배열 선언
		list[0] = new Person("김개똥", 19, '남');
		list[1] = new Person("김말똥", 20, '남');
		list[2] = new Person("김소똥", 22, '여');

		// 각 객체의 멤버에 접근 이름 출력
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i].getName());
		}

		// 방법 2)
		Person[] members = { 
				new Person("김개똥", 19, '남'), 
				new Person("김말똥", 20, '남'), 
				new Person("김소똥", 22, '여') 
		};

		// 각 객체의 멤버에 접근 이름 출력
		for(int i = 0; i < members.length; i++) {
			System.out.println(members[i].getName());
		}
	}
}

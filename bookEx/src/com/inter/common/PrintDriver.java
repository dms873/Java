package com.inter.common;

import java.io.Serializable;

// 인터페이스 상속은 다중상속이 가능!
public interface PrintDriver extends Serializable, Runnable {
	void print();
	void scan();
	
	// 예외적인 상황에서 추가메소드를 구현하는 방식
	default public void test() {
		System.out.println("안녕하세요.");
	}
}

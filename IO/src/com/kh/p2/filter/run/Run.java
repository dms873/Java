package com.kh.p2.filter.run;

import com.kh.p2.filter.controller.Filter;

public class Run {

	public static void main(String[] args) {
		Filter f = new Filter();
		
//		콘솔 입출력(표준 입출력)
//		f.consoleInOut();
		
//		Buffered 보조 스트림
//		f.buf();
		
//		 Data 보조 스트림 & try with resource문
//		f.data();
		
//		Buffered & Data 보조 스트림
//		f.bufData();
		
//		Reader와 Writer
		f.reWri();
	}

}

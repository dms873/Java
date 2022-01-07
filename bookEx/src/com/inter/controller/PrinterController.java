package com.inter.controller;

import com.inter.common.PrintDriver;

public class PrinterController {
	private PrintDriver print; // 인터페이스등록 참조형으로 등록

	public PrinterController(PrintDriver print) {
		super();
		this.print = print;
	}
	
	public void print() {
		// 연결된 프린터기를 이용한 인쇄하는 기능
		// print.printHp();
		// print.lgPrint();
		print.print();
		print.test();
	}
}

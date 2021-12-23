package com.kh.p3.poly.model.vo;

import java.security.PublicKey;

public class ReadingBook extends Hobby {
	private int bookNo; // ���� å�� ��(��)
	
	public ReadingBook() {
	}
	
	public ReadingBook(int bookNo) {
		super();
		this.bookNo = bookNo;
	}
	
	public ReadingBook(int spendTime, int spendMoney, int bookNo) {
		super(spendTime, spendMoney);
		this.bookNo = bookNo;
	}
	
	public int getBookNo() {
		return bookNo;
	}
	
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	
	public void reMethod() {
		System.out.println(super.toString() + "���� �Ѵ޿� �д� å�� " + bookNo + "(��)�̴�.");
	}
	
	@Override
	public void print() {
		System.out.println(super.toString() + "���� �Ѵ޿� �д� å�� " + bookNo + "(��)�̴�.");
	}
}

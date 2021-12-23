package com.kh.prac5.model.vo;

import javax.print.attribute.PrintJobAttribute;

public class Book implements Cloneable {
	private String title;	// 책 제목
	private int price;		// 가격
	private String writer;	// 저자
	private String publisher; // 출판사
	
	public Book() {}
	
	public Book(String title, int price, String writer, String publisher) {
		this.title = title;
		this.price = price;
		this.writer = writer;
		this.publisher = publisher;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		return "제목 : " + title + ", 가격 : " + price + ", 저자 : " + writer + ", 출판사 : " + publisher;
	}
	
//	1. new 연산자
//	@Override
//	public Book clone() {
//		return new Book(title, 0, writer, publisher);
//	}
	
//	2. Object의 clone()를 활용(Cloneable 구현 및 CloneNotSupportedException 예외처리)
	@Override
	public Book clone() {
		Book result = null;
		try {
			result = (Book)super.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return result;
	}

}

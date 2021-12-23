package com.kh.prac5.model.vo;

import javax.print.attribute.PrintJobAttribute;

public class Book implements Cloneable {
	private String title;	// å ����
	private int price;		// ����
	private String writer;	// ����
	private String publisher; // ���ǻ�
	
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
		return "���� : " + title + ", ���� : " + price + ", ���� : " + writer + ", ���ǻ� : " + publisher;
	}
	
//	1. new ������
//	@Override
//	public Book clone() {
//		return new Book(title, 0, writer, publisher);
//	}
	
//	2. Object�� clone()�� Ȱ��(Cloneable ���� �� CloneNotSupportedException ����ó��)
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

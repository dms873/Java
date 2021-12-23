package com.kh.p3.object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7295264842955722735L;
	
	private String maker;	// ������
	private int price;		// ����
	public Phone() {
		super();
	}
	public Phone(String maker, int price) {
		super();
		this.maker = maker;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Phone [maker=" + maker + ", price=" + price + "]";
	}

}

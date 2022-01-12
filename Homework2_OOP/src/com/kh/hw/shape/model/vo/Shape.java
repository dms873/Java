package com.kh.hw.shape.model.vo;


public class Shape {
	private int type;
	private double height;
	private double width;
	private String color = "white";
	
	// 기본생성자
	public Shape() {
		super();
	}
	
	// 매개변수 있는 생성자
	public Shape(int type, double height, double width) {
		super();
		this.type = type;
		this.height = height;
		this.width = width;
	}
	
	// 높이, 너비, 색깔을 반환하는 메소드
	public String information() {
		double he = getHeight();
		double wi = getWidth();
		String co = getColor();
		String result = he + " " + wi + " " + co;
		return result;
	}
	
	
	// getter, setter
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}

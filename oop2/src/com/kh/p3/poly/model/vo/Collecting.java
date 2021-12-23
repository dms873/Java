package com.kh.p3.poly.model.vo;

public class Collecting extends Hobby {
	private String stuff; // 수집 물품
	
	public Collecting() {
		
	}
	
	public Collecting(String stuff) {
		this.stuff = stuff;
	}
	
	public Collecting(int spendTime, int spendMoney, String stuff) {
		super(spendTime, spendMoney);
		this.stuff = stuff;
	}
	
	public void colMethod() {
		System.out.println(super.toString() + "내가 취미로 모으는 물품은 " + stuff + "이다.");
	}
	
	@Override
	public void print() {
		System.out.println(super.toString() + "내가 취미로 모으는 물품은 " + stuff + "이다.");
	}
}

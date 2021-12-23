package com.kh.p3.poly.model.vo;

public class Hobby {
	private int spendTime;	// 투자 시간(년)
	private int spendMoney; // 투자 금액(만원)
	
	public Hobby() {
		
	}
	
	public Hobby(int spendTime, int spendMoney) {
		this.spendTime = spendTime;
		this.spendMoney = spendMoney;
	}
	
	@Override
	public String toString() {
		return "이 취미를 위해 투자한 시간은 " + spendTime + "년, 투자한 금액은 " + spendMoney + "만원이다."; 
	}
	
	public void print() {
		System.out.println("이 취미를 위해 투자한 시간은 " + spendTime + "년, 투자한 금액은 " + spendMoney + "만원이다.");
	}
}

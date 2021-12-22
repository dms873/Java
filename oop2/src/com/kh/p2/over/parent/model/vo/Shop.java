package com.kh.p2.over.parent.model.vo;

public class Shop {
	private String owner;	// 가게주인
	private String address; // 주소
	public Shop() {
		super();
	}
	public Shop(String owner, String address) {
		super();
		this.owner = owner;
		this.address = address;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "주인 : " + owner + ", 주소 : " + address;
	}
	
	public void order(String str) {
		System.out.println(str + address + "에 있는 " + owner + " 가게에서 주문한다.");
	}
}

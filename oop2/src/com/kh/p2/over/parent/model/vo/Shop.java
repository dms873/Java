package com.kh.p2.over.parent.model.vo;

public class Shop {
	private String owner;	// ��������
	private String address; // �ּ�
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
		return "���� : " + owner + ", �ּ� : " + address;
	}
	
	public void order(String str) {
		System.out.println(str + address + "�� �ִ� " + owner + " ���Կ��� �ֹ��Ѵ�.");
	}
}

package com.kh.p3.poly.model.vo;

public class Hobby {
	private int spendTime;	// ���� �ð�(��)
	private int spendMoney; // ���� �ݾ�(����)
	
	public Hobby() {
		
	}
	
	public Hobby(int spendTime, int spendMoney) {
		this.spendTime = spendTime;
		this.spendMoney = spendMoney;
	}
	
	@Override
	public String toString() {
		return "�� ��̸� ���� ������ �ð��� " + spendTime + "��, ������ �ݾ��� " + spendMoney + "�����̴�."; 
	}
	
	public void print() {
		System.out.println("�� ��̸� ���� ������ �ð��� " + spendTime + "��, ������ �ݾ��� " + spendMoney + "�����̴�.");
	}
}

package com.kh.prac9.model.vo;

public class Member {
	private String name;	// �̸�
	private int age;		// ����
	private String addr;	// �ּ�
	private char gender;	// ����
	
	public Member() {
		super();
	}
	public Member(String name, int age, String addr, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return name + "," + age + "," + addr + "," + gender;
	}
}

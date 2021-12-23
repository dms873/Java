package com.kh.prac9.model.vo;

public class Member {
	private String name;	// 이름
	private int age;		// 나이
	private String addr;	// 주소
	private char gender;	// 성별
	
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

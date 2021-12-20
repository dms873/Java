package com.kh.p1.inherit.child.model.vo;

import com.kh.p1.inherit.parent.model.vo.Person;

public class Student extends Person {
	private int grade;		// 학년
	private String major;	// 전공
	
	private Computer com;	// 컴퓨터(포함관계)
	
	public Student() {
//		super();
	}
	
	public Student(int grade, String major) {
//		super();
		this.grade = grade;
		this.major = major;
	}
	
	public Student(String name, int age, char gender, String addr, int grade, String major) {
		super(name, age, gender, addr);
		this.grade = grade;
		this.major = major;
	}
	
	public Student(String name, int age, char gender, String addr, int grade, String major, Computer com) {
		super(name, age, gender, addr);
		this.grade = grade;
		this.major = major;
		this.com = com;
	}
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String information() {
		// 방법 1
		// this. 또는 super. 은 protected라서 가능(생략도 가능)
//		return "이름 : " + name + ", 나이 : " + age 
//				+ ", 성별 : " + gender + ", 주소 : " + addr + "학년 : " + grade + ", 전공 : " + major;
		// 방법 2
		return super.information() + ", 학년 : " + grade + ", 전공 : " + major + com.information();
	
	}
}

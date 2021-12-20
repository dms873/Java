package com.kh.p1.inherit.child.model.vo;

import com.kh.p1.inherit.parent.model.vo.Person;

public class Student extends Person {
	private int grade;		// �г�
	private String major;	// ����
	
	private Computer com;	// ��ǻ��(���԰���)
	
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
		// ��� 1
		// this. �Ǵ� super. �� protected�� ����(������ ����)
//		return "�̸� : " + name + ", ���� : " + age 
//				+ ", ���� : " + gender + ", �ּ� : " + addr + "�г� : " + grade + ", ���� : " + major;
		// ��� 2
		return super.information() + ", �г� : " + grade + ", ���� : " + major + com.information();
	
	}
}

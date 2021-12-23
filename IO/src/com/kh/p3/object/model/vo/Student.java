package com.kh.p3.object.model.vo;

import java.io.Serializable;

public class Student implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1017614499143728535L;
	
	private String name;	// 이름
	private int age;		// 나이
	private char gender;	// 성별
	private Phone ph;		// 소유 Phone
	public Student() {
		
	}
	public Student(String name, int age, char gender, Phone ph) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.ph = ph;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + 
				", gender=" + gender + ", ph=" + ph	+ "]";
		}

}

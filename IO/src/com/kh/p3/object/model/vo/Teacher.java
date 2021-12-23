package com.kh.p3.object.model.vo;

import java.io.Serializable;

public class Teacher implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6558933456832725567L;
	
	private String classR;	// ��� ��
	private String name;	// �����
	
	public Teacher() {
		super();
	}
	public Teacher(String classR, String name) {
		super();
		this.classR = classR;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Teacher [classR=" + classR + ", name=" + name + "]";
	}
}

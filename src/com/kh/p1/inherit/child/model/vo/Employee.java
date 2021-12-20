package com.kh.p1.inherit.child.model.vo;

import com.kh.p1.inherit.parent.model.vo.Person;

public class Employee extends Person {
	private int salary;		// 월급(만원)
	private String dept;	// 부서
	
	public Employee() {}
	
	public Employee(int salary, String dept) {
		this.salary = salary;
		this.dept = dept;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String information() {
		return "봉급 : " + salary + ", 부서 : " + dept;
	}
}

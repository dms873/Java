package com.kh.hw.employee.model.vo;

import com.kh.hw.employee.controller.EmployeeController;

public class Employee {
	private int empNo;
	private String name;
	private char gender;
	private String phone;
	private String dept;
	private int salary;
	private double bonus;
	
	// 기본 생성자
	public Employee() {
		super();
	}
	
	// 4개의 초기 값을 받는 생성자
	public Employee(int empNo, String name, char gender, String phone) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
	}
	
	// 7개의 초기 값을 받는 생성자
	public Employee(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.dept = dept;
		this.salary = salary;
		this.bonus = bonus;
	}
	
	// 직원 정보 반환
	public String printEmployee() {
		EmployeeController ec = new EmployeeController();
		String printEm = "" + getEmpNo();
		printEm += " " + getName();
		printEm += " " + getGender();
		printEm += " " + getPhone();
		printEm += " " + getDept();
		printEm += " " + getSalary();
		printEm += " " + getBonus();
		return printEm;
	}
	
	// getter, setter
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
}

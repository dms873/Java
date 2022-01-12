package com.kh.hw.employee.controller;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController {
	private Employee e = new Employee();

	// 매개변수 있는 생성자를 이용하여 데이터 저장하는 메소드
	public void add(int empNo, String name, char gender, String phone) {
		e = new Employee(empNo, name, gender, phone);
	}

	// 매개변수 있는 생성자를 이용하여 데이터 저장하는 메소드
	public void add(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		e = new Employee(empNo, name, gender, phone, dept, salary, bonus);
	}

	// setter로 정보 수정
	public void modify(String phone) {
		e.setPhone(phone);
	}

	// setter로 정보 수정
	public void modify(int salary) {
		e.setSalary(salary);
	}

	// setter로 정보 수정
	public void modify(double bonus) {
		e.setBonus(bonus);
	}

	// 객체를 삭제하는 메소드
	public Employee remove() {
		// 객체 e에 null을 저장하여 객체 삭제
		e = null;
		System.out.println("데이터 삭제에 성공하였습니다.\n");
		return e;
	}

	// 객체에 저장된 데이터를 가져와 반환하는 메소드
	public String inform() {
		String inform;
		// 객체 e가 null이라면 null 반환, 아니라면 사원 정보 반환
		if(e != null) {
			// inform = e.printEmployee();
			inform = e.getEmpNo() + " " + e.getName() + " " + e.getGender() + " "
					+ e.getPhone()  + " " + e.getDept() + " " + e.getSalary()
					+ " " + e.getBonus();
		} else {
			return inform = "사원 데이터가 없습니다.";
		}
		return inform;
	}
}

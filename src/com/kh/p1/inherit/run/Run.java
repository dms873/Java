package com.kh.p1.inherit.run;

import com.kh.p1.inherit.child.model.vo.Computer;
import com.kh.p1.inherit.child.model.vo.Employee;
import com.kh.p1.inherit.child.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("�达");
		emp.setAge(17);
		emp.setSalary(2000);
//		
//		System.out.println(emp.getName());
//		System.out.println(emp.getAge());
//		System.out.println(emp.getSalary());
		
		System.out.println("==========================");
		
		Student stu = new Student(3, "��ǻ�� ���а�");
//		System.out.println(stu.information());
		
		Employee emp1 = new Employee(2000, "������");
		System.out.println(emp1.information());
		
		Student stu1 = new Student("ȫ�浿", 21, '��', "����� ������", 3, "��ǻ�� ���а�");
//		System.out.println(stu1.information());
		
		System.out.println("==========================");
		
		Computer com = new Computer("i7-1234", "KH", 1800);
		Student stu2 = new Student("ȫ�浿", 21, '��', "����� ������", 3, "��ǻ�� ���а�", com);
		System.out.println(stu2.information());
	}

}

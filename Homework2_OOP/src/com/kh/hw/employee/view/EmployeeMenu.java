package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;
import com.kh.hw.employee.model.vo.Employee;

public class EmployeeMenu {
	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();

	// 메인 메뉴를 출력하는 기본 생성자
	public EmployeeMenu() {

		while(true) {
			System.out.print("1. 사원 추가\n2. 사원 수정\n3. 사원 삭제\n4. 사원 출력\n9. 프로그램 종료\n");
			
			System.out.print("메뉴 번호를 누르세요 : ");
			int menuNum = sc.nextInt();
			// 1. 사원 추가
			if(menuNum == 1)
				inserEmp();
			
			// 2. 사원 수정
			if(menuNum == 2)
				updateEmp();

			// 3. 사원 삭제
			if(menuNum == 3)
				deleteEmp();

			// 4. 사원 출력
			if(menuNum == 4)
				printEmp();
			
			// 9. 프로그램 종료
			if(menuNum == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			if(!(menuNum == 1 || menuNum == 2 || menuNum == 3 || menuNum == 4 || menuNum == 9))
				System.out.println("잘못 입력하셨습니다.");
		}
//		// 1. 사원 추가
//		if(menuNum == 1)
//			inserEmp();
//
//		// 2. 사원 수정
//		if(menuNum == 2)
//			updateEmp();
//
//		// 3. 사원 삭제
//		if(menuNum == 3)
//			deleteEmp();
//
//		// 4. 사원 출력
//		if(menuNum == 4)
//			printEmp();
//
//		// 9. 프로그램 종료
//		if(menuNum == 9)
//			System.out.println("프로그램을 종료합니다.");
//
//		if(!(menuNum == 1 || menuNum == 2 || menuNum == 3 || menuNum == 4 || menuNum == 9))
//			System.out.println("잘못 입력하셨습니다.");
//		System.out.println();
	}

	// 저장할 데이터를 사용자에게 받는 메소드
	public void inserEmp() {
		System.out.print("사원 번호 : ");
		int empNum = sc.nextInt();
		System.out.print("사원 이름 : ");
		String empName = sc.next();
		System.out.print("사원 성별 : ");
		char empGender = sc.next().charAt(0);
		System.out.print("전화 번호 : ");
		String empPhone = sc.next();
		System.out.print("추가 정보를 더 입력하시겠습니까? (y/n) : ");
		String printAnswer = sc.next();

		if(printAnswer.equalsIgnoreCase("y")) {
			// y 또는 Y(대소문자 구별X)시 사원 부서, 사원 연봉, 보너스 율을 추가로 더 받고 
			// 모든 데이터를 EmployeeController의 add메소드 인자로 보냄
			System.out.print("사원 부서 : ");
			String empDepartment = sc.next();
			System.out.print("사원 연봉 : ");
			int empSalary = sc.nextInt();
			System.out.print("보너스 율 : ");
			double empBonus = sc.nextDouble();
			ec.add(empNum, empName, empGender, empPhone, empDepartment, empSalary, empBonus);
		} else if(printAnswer.equalsIgnoreCase("n")) {
			// n 또는 N(대소문자 구별X)면 기본정보만 add메소드 인자로 보냄
			ec.add(empNum, empName, empGender, empPhone);
		}
		System.out.println();
	}

	// 수정할 데이터를 사용자에게 받는 메소드
	public void updateEmp() {
		System.out.println("\n가장 최신의 사원 정보를 수정하게 됩니다.\n사원의 어떤 정보를 수정하시겠습니까?");
		System.out.println("1. 전화 번호\n2. 사원 연봉\n3. 보너스 율\n9. 돌아가기");
		System.out.print("메뉴 번호를 누르세요 : ");
		int menuNum = sc.nextInt();

		if(menuNum == 1) {
			System.out.print("수정할 전화 번호 : ");
			String editPhone = sc.next();
			ec.modify(editPhone);
		}
		
		if(menuNum == 2) {
			System.out.print("수정할 사원 연봉 : ");
			int editSalary = sc.nextInt();
			ec.modify(editSalary);
		}
		
		if(menuNum == 3) {
			System.out.print("수정할 보너스 율 : ");
			double editBonus = sc.nextDouble();
			ec.modify(editBonus);
		}

		if(menuNum == 9) {
			System.out.println("메인메뉴로 돌아갑니다.");
		}
		
		if(!(menuNum == 1 || menuNum == 2 || menuNum == 3 || menuNum == 9)) {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		System.out.println();


	}

	// 데이터 삭제하는 메소드
	public void deleteEmp() {
		// 정말 삭제할 것인지 물어본 후 삭제하겠다고 하면
		// EmployeeController의 remove()메소드를 호출하여 반환 값에 따라
		// 데이터 삭제에 실패하였는지 성공하였는지 출력
		
		System.out.print("정말 삭제하시겠습니까? (y/n) : ");
		String deleteAnswer = sc.next();
		
		if("y".equalsIgnoreCase(deleteAnswer)) {
			ec.remove();
		}
		
	}

	// 데이터 출력하는 메소드
	public void printEmp() {
		// 사원정보가 있다면 사원정보 출력, 없다면 “사원 데이터가 없습니다”출력
		Employee e = new Employee();

		String inform = ec.inform();
		System.out.println(inform);			

		
		System.out.println();
	}
}

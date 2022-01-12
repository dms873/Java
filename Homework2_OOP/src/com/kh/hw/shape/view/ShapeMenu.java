package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();

	public void inputMenu() {
		// 삼각형과 사각형을 선택하게 하는 메소드
		System.out.println("===== 도형 프로그램 =====");
		System.out.print("3. 삼각형\n4. 사각형\n9. 프로그램 종료\n");

		while(true) {
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			System.out.println();

			if(!(num == 3 || num == 4 || num == 9)) {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				System.out.println();
			}

			if(num == 3) {
				triangleMenu();
				break;
			} else if(num == 4) {
				squareMenu();
				break;
			} else if(num == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}

	public void triangleMenu() {
		// 삼각형 메뉴 출력 메소드
		System.out.println("===== 삼각형 =====");
		System.out.print("1. 삼각형 면적\n2. 삼각형 색칠\n3. 삼각형 정보\n9. 메인으로\n");

		while(true) {
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			System.out.println();

			if(!(num == 1 || num == 2 || num == 3 || num == 9)) {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.\n");
			}

			if(num == 1 || num == 2) {
				inputSize(3, num);
				break;
			} else if(num == 3) {
				printlnformation(num);
				break;
			} else if(num == 9) {
				System.out.println("메인으로 돌아갑니다.\n");
				inputMenu();
				break;
			}
		}
	}

	public void squareMenu() {
		// 사각형 메뉴 출력 메소드
		System.out.println("===== 사각형 =====");
		System.out.print("1. 사각형 둘레\n2. 사각형 면적\n3. 사각형 색칠\n4. 사각형 정보\n9. 메인으로\n");

		while(true) {
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			System.out.println();

			if(!(num == 1 || num == 2 || num == 3 || num == 4 || num == 9)) {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.\n");
			}

			if(num == 1 || num == 2 || num == 3 ) {
				inputSize(4, num);
				break;
			} else if(num == 4) {
				printlnformation(num);
				break;
			} else if(num == 9) {
				System.out.println("메인으로 돌아갑니다.\n");
				inputMenu();
				break;
			}
		}
	}

	// 삼각형 메뉴, 사각형 메뉴의 세부 메뉴에서 모두 같은 메소드로 이동하기 때문에
	// 삼각형인지 사각형인지, 몇 번 메뉴인지 구분하기 위해 매개변수로 넘겨줌

	public void inputSize(int type, int menuNum) {
		// 너비와 높이를 받아 요청 사항을 처리하거나 색깔을 받아 요청사항을 처리하는 메소드

		// 매개변수로 들어온 type과 menuNum의 숫자에 따라 출력이 달라짐

		// int type이 '삼각형'이면서 menuNum이 1번일 경우
		if(type == 3 && menuNum == 1) {
			System.out.print("높이 : ");
			double triHeight = sc.nextDouble();
			System.out.print("너비 : ");
			double triWidth = sc.nextDouble();
			double triCalArea = tc.calcArea(triHeight, triWidth);
			System.out.println("삼각형 면적 : " + triCalArea + "\n");
			triangleMenu();
		}

		// int type이 '삼각형'이면서 menuNum이 2번일 경우
		if(type == 3 && menuNum == 2) {
			System.out.print("색깔을 입력하세요 : ");
			String triColor = sc.next();
			tc.paintColor(triColor);
			System.out.println("색이 수정되었습니다.\n");
			triangleMenu();
		}

		// int type이 '사각형'이면서 menuNum이 1번이나 2번일 경우
		if(type == 4 && menuNum == 1 || type == 4 && menuNum == 2) {
			System.out.print("높이 : ");
			double squHeight = sc.nextDouble();
			System.out.print("너비 : ");
			double squWidth = sc.nextDouble();

			// menuNum이 1번일 경우
			if(menuNum == 1) {
				double squCalArea = scr.calcPerimeter(squHeight, squWidth);
				System.out.println("사각형 둘레 : " + squCalArea + "\n");
			}

			// menuNum이 2번일 경우
			if(menuNum == 2) {
				double squCalPerimeter = scr.calcArea(squHeight, squWidth);
				System.out.println("사각형 면적 : " + squCalPerimeter);
			}
			System.out.println();
			squareMenu();
		}


		// int type이 '사각형'이면서 menuNum이 3번일 경우
		if(type == 4 && menuNum == 3) {
			System.out.print("색깔을 입력하세요 : ");
			String color = sc.next();
			scr.paintColor(color);
			System.out.println("색이 수정되었습니다.\n");
			squareMenu();
		}
	}

	public void printlnformation(int type) {
		// 매개변수에 따라 삼각형/사각형의 정보를 출력하는 메소드

		// int type에 따라 print() 메소드를 불러오는 controller가 다름

		// int type이 '삼각형'일 경우 tc.print() 출력
		if(type == 3) {
			String triPrint = tc.print();
			System.out.println(triPrint + "\n");
			triangleMenu();
		}
		// int type이 '사각형'일 경우 scr.print() 출력
		if(type == 4) {
			String squPrint = scr.print();
			System.out.println(squPrint + "\n");
			squareMenu();
		}

	}



}

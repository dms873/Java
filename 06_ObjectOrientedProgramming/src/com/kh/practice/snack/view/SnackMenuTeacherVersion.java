
package com.kh.practice.snack.view;
import com.kh.practice.snack.controller.SnackController;
import com.kh.practice.snack.exception.EventException;

import java.util.Scanner;

public class SnackMenuTeacherVersion {
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();

	
	private boolean checkNumOf(int numOf) {
		final int MAX_NUM_OF = 9999999;
		if(numOf < 0) {
			return false;
		} else if(numOf > MAX_NUM_OF) {
			return false;
		} else {
			return true;
		}
	}
	
	public void menu() {
		// 사용자가 Snack객체에 데이터를 저장할 수 있도록 값을 받고 저장한 값을 출력하는 메소드 스낵류를 입력하세요.
		// 종류 : 빵
		// 이름 : 케이크
		// 맛 : 블루베리
		// 개수 : 1
		// 가격 : 15000
		// 저장 완료되었습니다.
		// 저장한 정보를 확인하시겠습니까?(y/n) : y
		// 빵(케이크 - 블루베리) 1개 15000원
		String[] category = {"종류", "이름", "맛", "개수", "가격"};
		int[] maxLength = {50, 100, 50, Integer.MAX_VALUE, Integer.MAX_VALUE};
		String[] inputValue = new String[category.length];
//		String[] category2 = {"kind", "name", "flavor", "flavor", "numOf", "price"};
//		String kind = null;
//		String name = null;
//		String flavor = null;
//		String numOfStr = null;
//		String priceStr = null;
		int numOf = 0;
		int price =0;
			System.out.println("스낵류를 입력하세요.");

			for(int i=0; i<category.length; ) {
				try {
					System.out.print(category[i]+" : ");
					inputValue[i] = sc.nextLine();
					if(inputValue[i] == null || inputValue[i].equals("")) {
						System.out.println("입력된 값이 없습니다. 다시 입력해주세요.");
						continue;
					} else if (inputValue[i].length() > maxLength[i]) {
						System.out.println(maxLength[i]+"자까지 입력가능");
						continue;
					}
					if(category[i].equals("개수")) {
						numOf = Integer.parseInt(inputValue[i]);
						if(checkNumOf(numOf) == false) {
							throw new EventException();
//							System.out.println("범위를 벗어나는 숫자를 입력했습니다. 다시 입력해주세요.");
//							continue;
						}
					}
					else if(category[i].equals("가격")) {
						price = Integer.parseInt(inputValue[i]);
					}
					i++;
				} catch(ArrayIndexOutOfBoundsException e) {
					e.printStackTrace();
					System.out.println("죄송합니다. 시스템 점검 중입니다. 빠른시일내에 다시 서비스를 개시하겠습니다.");
					// for문을 더 돌려도 방법이 없음.
					break;
				} catch (NumberFormatException e) {
					e.printStackTrace();
					System.out.println("숫자만 입력해주세요.");
					// continue;는 굳이 적지 않음.
				} catch(EventException e) {
					System.out.println("1~999999범위의 숫자를 입력해주세요.");
				} catch(Exception e) {
					e.printStackTrace();
					System.out.println("예기치 못한 오류가 발생했습니다. 다시 시도해 주세요.");
				} 
				
			}
//			int i=0;
//			while(i<category.length) {
//				System.out.print(category[i]+" : ");
//				inputValue[i] = sc.nextLine();
//				if(inputValue[i] == null || inputValue[i].equals("")) {
//					System.out.println("입력된 값이 없습니다. 다시 입력해주세요.");
//					continue;
//				} else if (inputValue[i].length() > maxLength[i]) {
//					System.out.println(maxLength[i]+"자까지 입력가능");
//				}
//				if(category[i].equals("개수")) {
//					numOf = Integer.parseInt(inputValue[i]);
//				}
//				else if(category[i].equals("가격")) {
//					price = Integer.parseInt(inputValue[i]);
//				}
//				i++;
//			}

//			for(String s : inputValue) {
//				System.out.println(s);
//			}
		
		// 저장을 하고
		String result = scr.saveData(inputValue[0], inputValue[1], inputValue[2], numOf, price);
		if(result == null) {
			// 저장 실패
			System.out.println("저장 실패");
			return; // menu()를 끝내고 main()으로 돌아감.
		}
		System.out.println("저장 완료되었습니다.");


		while(true) {
			System.out.print("저장한 정보를 확인하시겠습니까?(y/n) : ");
			String confirmVal = sc.nextLine();
			if(confirmVal.equals("y")) {
				String data = scr.confirmData();
				System.out.println(data);
				break;
			} else if(confirmVal.equals("n")) {
				break;
			} else {
				System.out.println("y 또는 n을 입력해주세요.");
			}
		}
		System.out.println("메뉴 끝");
		
	}
}

package com.kh.prac6.run;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ranNum = 0;
		int inputNum = 0;
		int count = 0;
		
		while(true) {
			ranNum = (int)(Math.random() * 10) + 1;
			System.out.println("0~10 사이의 랜덤수가 생성되었습니다.");
			count = 0;
			while(true) {
				System.out.print("정수를 하나 입력하시오 : ");
				inputNum = sc.nextInt();
				count++;
				if(ranNum == inputNum) {
					System.out.println(count + "번만에 맞추셨습니다.");
					break;
				} else {
					System.out.println(count + "번 실패하셨습니다.");
				}
			}
		}

	}

}

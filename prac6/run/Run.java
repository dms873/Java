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
			System.out.println("0~10 ������ �������� �����Ǿ����ϴ�.");
			count = 0;
			while(true) {
				System.out.print("������ �ϳ� �Է��Ͻÿ� : ");
				inputNum = sc.nextInt();
				count++;
				if(ranNum == inputNum) {
					System.out.println(count + "������ ���߼̽��ϴ�.");
					break;
				} else {
					System.out.println(count + "�� �����ϼ̽��ϴ�.");
				}
			}
		}

	}

}

package practice.demensionArray;

import java.util.Scanner;

public class DemensionArrayPractice {
	public void method1() {
		// �����迭 �ʱ�ȭ �� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ũ�� �Է� : ");
		char[][] arr = new char[sc.nextInt()][];
		
		// �� �Ҵ�
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "���� ���� ũ�� �Է� : ");
			arr[i] = new char[sc.nextInt()];
		}
		
		// �ʱ�ȭ�� ���
		char ch = 'a';
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ch++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); // ����
		}
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		char[][] arr = new char[5][5];
		int row;
		int column;
		
		while(true) {
			System.out.print("�� �ε��� �Է� >> ");
			row = sc.nextInt();
			System.out.print("�� �ε��� �Է� >> ");
			column = sc.nextInt();
			
			if(row < 0 || row > 4 || column < 0 || column > 4) {
				break;
			}
			
			arr[row][column] = 'X';
			System.out.println("\t0\t1\t2\t3\t4");
			for(int i = 0; i < arr.length; i++) {
				System.out.print(i+"\t");
				for(int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("���α׷��� �����մϴ�.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


}

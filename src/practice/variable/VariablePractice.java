package practice.variable;

import java.util.Scanner;

public class VariablePractice {
	public void method1() {
		// ����1 �ʱ�ȭ �� �� ����
		int inum = 100;
		double dnum = 234.567;
		char ch = 'A';
		String str = "Hello world";
		boolean bool = true;

		System.out.println("�ʱ�ȭ �� : " + inum + ", " + dnum + ", " + ch + ", " + str + ", " + bool);
		inum = 10000;
		dnum = 567.123456789;
		ch = 'B';
		str = "Welcome to JAVA";
		bool = false;

		System.out.println("�� ���� �� : " + inum + ", " + dnum + ", " + ch + ", " + str + ", " + bool);
	}

	
	public void method2() {
		// ����2 ���� �ѷ��� ���� ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ �Է� : ");
		int rad = sc.nextInt();
		double pi = 3.14;
		
//		System.out.println("�������� " + rad + "�� ���� �ѷ� : " + 2*rad*pi);
//		System.out.println("�������� " + rad + "�� ���� ���� : " + rad*rad*pi);
		
		// �Ҽ��� �Ʒ� ���ڸ�����
		System.out.printf("�������� %d�� ���� �ѷ� : %.1f\n", rad, 2*rad*pi);
		System.out.printf("�������� %d�� ���� ���� : %.1f\n", rad, rad*rad*pi);
	}
	
	public void method3() {
		// �л����� Ű(�Ǽ�)�� ���(����) ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° �л��� Ű �Է� : ");
		double height1 = sc.nextDouble();
		System.out.print("�� ��° �л��� Ű �Է� : ");
		double height2 = sc.nextDouble();
		System.out.print("�� ��° �л��� Ű �Է� : ");
		double height3 = sc.nextDouble();
		
		int avg = (int)(height1 + height2 + height3) / 3;
		System.out.println("Ű�� ��� : " + avg);
	}
	public void method4() {
		// ���ڿ� �Է¹޾� ������ ������ �����ڵ� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		
		char ch = str.charAt(0);
		int num = ch; // char -> int�� �ڵ� ����ȯ
//		System.out.println(ch + " : " + num);
		
		// �ѹ��� ���
		System.out.println(str.charAt(0) + " : " + (int)str.charAt(0));
		System.out.println(str.charAt(1) + " : " + (int)str.charAt(1));
		System.out.println(str.charAt(2) + " : " + (int)str.charAt(2));
		System.out.println(str.charAt(3) + " : " + (int)str.charAt(3));
		System.out.println(str.charAt(4) + " : " + (int)str.charAt(4));
		
	}

}

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

}

package example.variable;

import java.io.LineNumberInputStream;
import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� ����� ���ÿ� �ʱ�ȭ
		
		// ���� : 1byte
		// 2�ܾ� �̻��� ������ : ��Ÿ�� ǥ���
		
		boolean isTrue = true;
		boolean isFalse = false;
		
		// ���� : 2byte
		char ch = 'a'; // '' �̱� �����̼� ���
		// char ch2 = 'bc'; // �ϳ��� ���ڸ� ���� ����
		
		// ���ڿ� : ������(�ּҰ� ����)
		String str = "�ȳ��ϼ���"; // "" ���� �����̼� ���
		
		// ������
		// ����
		byte bnum = 1; // 1byte
		short snum = 2; // 2byte
		int inum = 4; // 4byte
		long lnum = 8L; // 8byte
		
		// �Ǽ�
		float fnum = 4.0f; // 4byte
		double dnum = 8.0; // 8byte
		
		// ������ ����� �� ����ϱ�
		System.out.println("isTrue�� �� : " + isTrue);
		System.out.println("isFalse�� �� : " + isFalse);

		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);

		System.out.println("bnum�� �� : " + bnum);
		System.out.println("snum�� �� : " + snum);
		System.out.println("inum�� �� : " + inum);
		System.out.println("lnum�� �� : " + lnum);

		System.out.println("fnum�� �� : " + fnum);
		System.out.println("dnum�� �� : " + dnum);
		
		
		
	}
	
	public void changeValue() {
		// ������ ���� �׽�Ʈ
		String name;
		char gender;
		int age;
		double height;

		name = "�迵��";
		gender = 'F';
		age = 20;
		height = 171.5;

		System.out.println(name + "���� ��������");
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		System.out.println("height : " + height);

		// Ű����� ���� �Է¹޾� ������ ����� �� ����
		Scanner sc = new Scanner(System.in);

		System.out.println("�̸��� �Է��ϼ��� : ");
		name = sc.nextLine();
		System.out.println("������ �Է��ϼ��� : ");
		gender = sc.next().charAt(0); // ���ڸ� �о���� �޼ҵ�� �������� �ʱ� ����
		System.out.println("���̸� �Է��ϼ��� : ");
		age = sc.nextInt();
		System.out.println("Ű�� �Է��ϼ��� : ");
		height = sc.nextDouble();

	}
	public void testFinal() {
		// ��� �׽�Ʈ
		int size; // ����
		final int SIZE; // ���
		
		size = 10;
		SIZE = 10;
		
		System.out.println("=== �� ���� �� ===");
		System.out.println("size : " + size);
		System.out.println("SIZE : " + SIZE);
		
		// ������ �� ����
		size = 20;
		// SIZE = 20; // ����� �ʱ�ȭ ���� �ٸ� ������ ���� �Ұ�
		
		System.out.println("=== �� ���� �� ===");
		System.out.println("size : " + size);
		System.out.println("SIZE : " + SIZE);
	}
	public void testOverflow() {
		// ������ �����÷ο� �׽�Ʈ
		System.out.println("byte�� �ִ밪 : " + Byte.MAX_VALUE);
		System.out.println("byte�� �ּҰ� : " + Byte.MIN_VALUE);
		
		// byte bnum = 128; // ���� ���� ������ ����Ƿ� ���� �߻�
		byte bnum = 127;
		bnum += 1;
		System.out.println("byte�� �ִ밪 + 1 : " + bnum);
		
		bnum = -128;
		bnum -= 1;
		System.out.println("byte�� �ּҰ� - 1 : " + bnum);
		
		int num1 = 100000;
		int num2 = 30000;
		
		// int�� ���� ���ɹ����� �� 21���̹Ƿ� 30���̶�� ���� �����ϸ� �����÷ο� �߻�
		// int result = num1*num2;
		
		long result = (long)num1*num2;
		System.out.println("��� ��� : " + result);
		
	}
	
	public void testCasting() {
		// ����ȯ �׽�Ʈ
		boolean bool = true;
		// bool = 1; // ����ȯ �Ұ�
		
		// char -> int : �ڵ� ����ȯ
		int num = 'A';
		System.out.println("num : " + num);
		
		// char�� ������ ���� ����(���ڿ� �ش��ϴ� �����ڵ� ����)
		char ch = 66;
		System.out.println("ch : " + ch);
		// ch = -66; // ������ �Ұ���
		
		// int -> char : ���� ����ȯ
		char ch2 = (char)num;
		System.out.println("ch2 : " + ch2);
	}
	public void testCasting2() {
		// int�� long�� ����
		int inum = 4;
		long lnum = 8L;
		
		// 1. int ���
		int isum = (int)(inum + lnum);
		isum = inum + (int)lnum;
		System.out.println("isum : " + isum);
		
		// 2. long ���
		long lsum = inum + lnum;
		System.out.println("lsum : " + lsum);
		
		// byte, short�� ���� ��� : int
		byte bnum = 1;
		short snum = 2;
		
		int sum1 = bnum + snum;
		System.out.println("sum1 : " + sum1);
		
		// byte or short�� ����� ��� ���� ���� ����ȯ
		short sum2 = (short)(bnum + snum);
		System.out.println("sum2 : " + sum2);
	}
	public void testDataLoss() {
		// ������ �ս� �׽�Ʈ
		
		// ���� -> �Ǽ� : �ڵ� ����ȯ
		long lnum = 100;
		float fnum = lnum;
		System.out.println("fnum : " + fnum);
		
		// �Ǽ� -> ���� : ���� ����ȯ
		// �Ҽ��� ���ϸ� �����ϱ� ������ ������ �ս�
		double dnum = 10.5;
		int inum = (int)dnum;
		System.out.println("inum : " + inum);
		
		// ���� ����ȯ���� ���� ����ġ ���� ������ �ս� �߻��� ����
		int num = 290;
		System.out.println("num : " + num);
		
		byte bnum = (byte)num;
		System.out.println("bnum : " + bnum);
	}
}

package example.variable;

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

}

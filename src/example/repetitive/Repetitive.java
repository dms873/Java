package example.repetitive;

import java.util.Scanner;

import javax.print.CancelablePrintJob;

public class Repetitive {
	public void testFor() {
		// for(�ʱ��; ���ǽ�; ������) {}
		for(int i = 0; i < 10; i++) {
			System.out.println(i + "��° ���");
		}
		// i�� ����
		for(int i = 10; i > 0; i--) {
			System.out.println(i + "��° ���");
		}
		// �������� �ݵ�� 1�� ������ �ʿ䰡 ����
		for(int i = 0; i < 10; i += 2) {
			System.out.println(i + "��° ���");
		}
		// int�� �ƴ� char�� �Է��ϸ�?
		for(char ch = 'a'; ch <= 'e'; ch++) {
			System.out.println(ch);
		}
	}

	public void testWhile() {
		// �ʱ��
		int i = 0;
		while(i < 10) { // ���ǽ�
			System.out.println(i + "��° i ���");
			i++; // ������
		}

		// ����
		int j = 10;
		while(j > 0) {
			System.out.println(j + "��° j ���");
			j--;
		}

		// ���� ���� : ���� ���� �׻� true
		//		int k = 0;
		//		while(true) {
		//			System.out.println(k++ + "��° k ���");
		//			
		//		}
	}

	public void testDowhile() {
		// �ʱ��
		int i = 0;
		do {
			System.out.println(i + "��° i ���");
			i++; // ������
		} while (i < 10); // ���ǽ� + �����ݷ�

		// ����
		int j = 10;
		do {
			System.out.println(j + "��° j ���");
			j--;
		} while (j > 0);

		// do-while�� ���ѷ���
		//		int k = 0;
		//		do {
		//			System.out.println(k++ + "��° k ���");			
		//		} while (true);
	}

	public void testGugudan() {
		// ��ø �ݺ��� ������
		// for��
		for(int i = 2; i < 10; i++) {
			System.out.println("==== " + i + "�� ====");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
		}

		// while��
		int i = 2;
		while(i < 10) {
			System.out.println("==== " + i + "�� ====");
			int j = 1;
			while(j < 10) {
				System.out.println(i + " X " + j + " = " + i*j);
				j++;
			}
			i++;
		}
	}

	public void testBreak() {
		// ���ڸ� �Է� �޾� �Է� ���� ���ڸ�ŭ�� �ݺ������� ��� �� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݺ��� Ƚ�� �Է� : ");
		int num = sc.nextInt();

		int i = 1;
		while(true) {
			System.out.println(i + "��° i ���");
			if(i== num) {
				break;
			}
			i++;
		}
	}

	public void testFor2() {
		// �ʱ�� ���� for��
		int i = 0;
		for(; i < 10; i++) {
			System.out.println(i + "��° i ���");
		}
		// ���ǽ� ���� for��
		for(int j = 0; ; j++) {
			if(j < 10) {
				System.out.println(j + "��° j ���");
			} else {
				break;
			}
		}
		// ������ ���� for��
		for(int k = 0; k < 10;) {
			System.out.println(k + "��° k ���");
			k++;
		}
		// ��� ����
		int l = 0;
		for(;;) {
			if(l < 10) {
				System.out.println(l + "��° l ���");
			} else {
				break;
			}
			l++;
		}
	}
	public void testContinue() {
		// 1~100������ ��(3�� 5�� ����� ����)�� ���
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("sum : " + sum);
	}

	public void testGugudan2() {
		// �б⹮�� �̿��� ��ø �ݺ��� ������

		// for������ ������ ¦����(2��, 4��, 6��, 8��)�� ���� 
		for(int i = 2; i < 10; i += 2) { // �б⹮ �������� �ʰ� ����
			//			if(i % 2 == 1) continue;
			System.out.println("==== " + i + "�� ====");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
		}
		
		
		
		// while������ ������ Ȧ������ ����
		int i = 2;
		while(i < 10) {
			System.out.println("==== " + i + "�� ====");
			// int j = 0;
			int j = 1;
			while(j < 10) {
				// j++; �������� continue �ڿ� �ִٸ� j�� ���� ��ȭ�� ��� ���� ������ ��
//				if(j % 2 == 0) continue;
				System.out.println(i + " X " + j + " = " + i*j);
				j += 2;
			}
			i++;
		}
		
		
		
		
		
	}
}

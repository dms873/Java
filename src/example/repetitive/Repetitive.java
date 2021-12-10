package example.repetitive;

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
}

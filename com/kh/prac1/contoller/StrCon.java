package com.kh.prac1.contoller;
/* API1 �ǽ�����1
 * 
 * ��Ű���� :
 * com.kh.prac1.controller.StrCon
 * com.kh.prac1.run.Run
 * 
 * Run Ŭ�������� StrCon Ŭ������ �޼ҵ� strMethod()�� ����
 * strMethod ���� :
 * String str1�� ���ͷ� ������� "����ȭ ���� �Ǿ����ϴ�." ���ڿ��� ����
 * String str2�� new ������ ������� "����ȭ ���� �Ǿ����ϴ�." ���ڿ��� ����
 * String str3�� new ������ ������� "���ع��� ��λ���" ���ڿ��� ����
 * 
 * ������ String�� hashCode �� identityHashCode �޼ҵ�� �ּҰ� ���
 * System.out.println("====== hashCode �� ======");
 * 3���� String ������ hashCode ���
 * 
 * System.out.println("====== identityHashCode �� ======");
 * 3���� String ������ identityhashCode ���
 * 
 * ��� �� :
 * ====== hashCode �� ======
 * str1 : 313772671
 * str2 : 313772671
 * str3 : 282595592
 * ====== identityHashCode �� ======
 * str1 : 118352462
 * str2 : 1550089733
 * str3 : 865113938
 * 
 */
public class StrCon {
	public void strMethod() {
		String str1 = "����ȭ ���� �Ǿ����ϴ�."; // ���ͷ�1
		String str2 = new String("����ȭ ���� �Ǿ����ϴ�.");	// new ������ Ȱ��1
		String str3 = new String("���ع��� ��λ���");		// new ������ Ȱ��2
		String str4 = "����ȭ ���� �Ǿ����ϴ�."; // ���ͷ�2
		
		System.out.println("====== hashCode �� ======"); // �ּҰ��� �ƴϴ�(String)
		System.out.println("str1 : " + str1.hashCode());
		System.out.println("str2 : " + str2.hashCode());
		System.out.println("str3 : " + str3.hashCode());
		
		System.out.println("====== identityHashCode �� ======");
		System.out.println("str1 : " + System.identityHashCode(str1));
		System.out.println("str2 : " + System.identityHashCode(str2));
		System.out.println("str3 : " + System.identityHashCode(str3));
		System.out.println("str4 : " + System.identityHashCode(str4));
	}
}

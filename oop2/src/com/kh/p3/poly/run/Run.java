package com.kh.p3.poly.run;

import com.kh.p3.poly.model.vo.Collecting;
import com.kh.p3.poly.model.vo.Hobby;
import com.kh.p3.poly.model.vo.ReadingBook;

public class Run {

	public static void main(String[] args) {
		Hobby h = new Hobby();
		Hobby upH = (Hobby)(new Collecting()); // �� ĳ���� (Hobby)�� ��� �ڵ����� ��.
//		ReadingBook downRb = (ReadingBook)(upH); // �ٿ� ĳ����(���� : �θ� Ŭ������ ǥ���ϰ� �ִ� �ڽ� Ŭ���� �ڷ������� �ؾ���)
		
		// ������ ����
		Hobby polyH = new Collecting();
		Hobby polyH1 = new Collecting(3, 100, "��ǥ");
		Hobby polyRb1 = new ReadingBook(4, 200, 100);
		Hobby polyRb2 = new ReadingBook(5, 300, 200);
		Hobby PolyH2 = new Collecting(6, 400, "���ڱ�");
		
//		System.out.println();
		
		// ������+�迭 ����
		Hobby[] polyArr = new Hobby[4];
		polyArr[0] = new Collecting(3, 100, "��ǥ");
		polyArr[1] = new ReadingBook(4, 200, 100);
		polyArr[2] = new ReadingBook(5, 300, 200);
		polyArr[3] = new Collecting(6, 400, "���ڱ�");
		
//		System.out.println();
//		
//		((Collecting)polyArr[0]).colMethod();
//		((ReadingBook)polyArr[1]).reMethod();
//		((ReadingBook)polyArr[2]).reMethod();
//		((Collecting)polyArr[3]).colMethod();
		
//		System.out.println();
		
		// for�� ���(instanceOf + if�� ���)
//		for(int i = 0; i < polyArr.length; i++) {
//			if(polyArr[i] instanceof Collecting) {
//				((Collecting)polyArr[i]).colMethod();
//			} else {
//				((ReadingBook)polyArr[i]).reMethod();
//			}
//		}
		
		// ���� ���ε� ����(�������̵� ����)
		for(int i = 0; i < polyArr.length; i++) {
			polyArr[i].print();
		}
		
	}

}

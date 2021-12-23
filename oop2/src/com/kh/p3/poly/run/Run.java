package com.kh.p3.poly.run;

import com.kh.p3.poly.model.vo.Collecting;
import com.kh.p3.poly.model.vo.Hobby;
import com.kh.p3.poly.model.vo.ReadingBook;

public class Run {

	public static void main(String[] args) {
		Hobby h = new Hobby();
		Hobby upH = (Hobby)(new Collecting()); // 업 캐스팅 (Hobby)가 없어도 자동으로 됨.
//		ReadingBook downRb = (ReadingBook)(upH); // 다운 캐스팅(주의 : 부모 클래스가 표현하고 있는 자식 클래스 자료형으로 해야함)
		
		// 다형성 적용
		Hobby polyH = new Collecting();
		Hobby polyH1 = new Collecting(3, 100, "우표");
		Hobby polyRb1 = new ReadingBook(4, 200, 100);
		Hobby polyRb2 = new ReadingBook(5, 300, 200);
		Hobby PolyH2 = new Collecting(6, 400, "도자기");
		
//		System.out.println();
		
		// 다형성+배열 적용
		Hobby[] polyArr = new Hobby[4];
		polyArr[0] = new Collecting(3, 100, "우표");
		polyArr[1] = new ReadingBook(4, 200, 100);
		polyArr[2] = new ReadingBook(5, 300, 200);
		polyArr[3] = new Collecting(6, 400, "도자기");
		
//		System.out.println();
//		
//		((Collecting)polyArr[0]).colMethod();
//		((ReadingBook)polyArr[1]).reMethod();
//		((ReadingBook)polyArr[2]).reMethod();
//		((Collecting)polyArr[3]).colMethod();
		
//		System.out.println();
		
		// for문 사용(instanceOf + if문 사용)
//		for(int i = 0; i < polyArr.length; i++) {
//			if(polyArr[i] instanceof Collecting) {
//				((Collecting)polyArr[i]).colMethod();
//			} else {
//				((ReadingBook)polyArr[i]).reMethod();
//			}
//		}
		
		// 동적 바인딩 적용(오버라이딩 적용)
		for(int i = 0; i < polyArr.length; i++) {
			polyArr[i].print();
		}
		
	}

}

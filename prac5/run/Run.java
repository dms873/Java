package com.kh.prac5.run;

import java.util.Scanner;

import com.kh.prac5.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book bk = new Book("KH자바강의", 12000, "api마스터", "KH");
		Book copyBk = bk.clone();
		System.out.println("바뀌기 전 : " + copyBk);
		
		System.out.println("책의 가격을 입력하시오 : ");
		copyBk.setPrice(sc.nextInt());
		System.out.println("바뀐 후 : " + copyBk);
	}

}

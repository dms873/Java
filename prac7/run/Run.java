package com.kh.prac7.run;

import java.util.Calendar;

import com.kh.prac7.controller.DateCalculator;

public class Run {

	public static void main(String[] args) {
		DateCalculator cd = new DateCalculator();
		Calendar cal = Calendar.getInstance();
		if(cd.isLeapYear(cal.get(Calendar.YEAR)))
			System.out.println("올해는 윤년입니다.");
		else System.out.println("올해는 평년입니다.");
		System.out.println("0년 1월 1일부터 오늘까지 일수 : " + cd.leapDate());

	}

}

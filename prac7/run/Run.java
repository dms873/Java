package com.kh.prac7.run;

import java.util.Calendar;

import com.kh.prac7.controller.DateCalculator;

public class Run {

	public static void main(String[] args) {
		DateCalculator cd = new DateCalculator();
		Calendar cal = Calendar.getInstance();
		if(cd.isLeapYear(cal.get(Calendar.YEAR)))
			System.out.println("���ش� �����Դϴ�.");
		else System.out.println("���ش� ����Դϴ�.");
		System.out.println("0�� 1�� 1�Ϻ��� ���ñ��� �ϼ� : " + cd.leapDate());

	}

}

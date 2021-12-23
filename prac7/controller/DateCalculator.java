package com.kh.prac7.controller;

import java.util.Calendar;

public class DateCalculator {

	public long leapDate() {
		Calendar today = Calendar.getInstance();
		long sumDays = 0L;
		for(int i = 0; i <= today.get(Calendar.YEAR); i++) { // �ذ� �ٲ�(�⵵�� �ٲ��)
			if(i == today.get(Calendar.YEAR)) {			   // ������ ��¥�� ���
				for(int j = 1; j <= (today.get(Calendar.MONTH)+1); j++) { // ���� �ٲ�
					
					if(j == (today.get(Calendar.MONTH)+1)) { // �̹���
						for(int n = 1; n <= today.get(Calendar.DATE); n++) {
							sumDays += 1;
						}
					} else if(j == 2) {			// ���� 1������ �����ޱ���
						if(isLeapYear(i)) sumDays += 29;
						else sumDays += 28;
					} else if(j == 4 || j == 6 || j == 9 || j == 11) {
						sumDays += 30;
					} else sumDays += 31;
					
				}
			} else {			// 0����� �۳����
				if(isLeapYear(i)) sumDays += 366;
				else sumDays += 365; 
			}
		}
		
		return sumDays;
	}
	
	public boolean isLeapYear(int year) {
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) return true;
		else return false;
	}

}

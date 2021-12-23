package com.kh.prac7.controller;

import java.util.Calendar;

public class DateCalculator {

	public long leapDate() {
		Calendar today = Calendar.getInstance();
		long sumDays = 0L;
		for(int i = 0; i <= today.get(Calendar.YEAR); i++) { // 해가 바뀜(년도가 바뀌는)
			if(i == today.get(Calendar.YEAR)) {			   // 올해의 날짜만 계산
				for(int j = 1; j <= (today.get(Calendar.MONTH)+1); j++) { // 달이 바뀜
					
					if(j == (today.get(Calendar.MONTH)+1)) { // 이번달
						for(int n = 1; n <= today.get(Calendar.DATE); n++) {
							sumDays += 1;
						}
					} else if(j == 2) {			// 올해 1월부터 저번달까지
						if(isLeapYear(i)) sumDays += 29;
						else sumDays += 28;
					} else if(j == 4 || j == 6 || j == 9 || j == 11) {
						sumDays += 30;
					} else sumDays += 31;
					
				}
			} else {			// 0년부터 작년까지
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

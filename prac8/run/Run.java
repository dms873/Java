package com.kh.prac8.run;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("날짜를 입력하시오(ex: 2019-03-03) : ");
		String str = sc.next();
		StringTokenizer st = new StringTokenizer(str, "-");
		
		int year = Integer.valueOf(st.nextToken()); 	// 년도
		int month = Integer.valueOf(st.nextToken()); 	// 월
		int day = Integer.valueOf(st.nextToken()); 		// 일
		
		GregorianCalendar cl = new GregorianCalendar(year, month-1, day);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.E");
		
		System.out.println(sdf.format(cl.getTime()));

	}

}

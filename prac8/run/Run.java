package com.kh.prac8.run;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��¥�� �Է��Ͻÿ�(ex: 2019-03-03) : ");
		String str = sc.next();
		StringTokenizer st = new StringTokenizer(str, "-");
		
		int year = Integer.valueOf(st.nextToken()); 	// �⵵
		int month = Integer.valueOf(st.nextToken()); 	// ��
		int day = Integer.valueOf(st.nextToken()); 		// ��
		
		GregorianCalendar cl = new GregorianCalendar(year, month-1, day);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.E");
		
		System.out.println(sdf.format(cl.getTime()));

	}

}

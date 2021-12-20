package com.kh.prac2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {

	public void spaceToUpper() {
		Scanner sc = new Scanner(System.in);
		System.out.print("영어를 입력하시요(띄어쓰기 포함): ");
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		StringBuilder sb = new StringBuilder(); 
		String str1 = "";
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			for(int i = 0; i < token.length(); i++) {
				if(i==0) {
					sb.append(token.toUpperCase().charAt(i));
					// str1 = token.toUpperCase();
					// sb.append(str1.charAt(i)); 와 같음
				} else {
					sb.append(token.charAt(i));
				}
			}
			sb.append(" ");
		}
		System.out.println(sb);
		
	}

}

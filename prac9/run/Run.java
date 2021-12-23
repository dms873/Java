package com.kh.prac9.run;

import java.util.StringTokenizer;
import java.util.jar.Attributes.Name;

import com.kh.prac9.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		Member m = new Member("마스터", 24, "경남 마산시", '남');
		StringTokenizer st = new StringTokenizer(m.toString(), ",");

		int i = 0;
		String name = "", addr = "";
		int age = 0;
		char gender = ' ';

		while(st.hasMoreTokens()) {
			switch(i) {
			case 0 : 
				name = st.nextToken();
				break;
			case 1 : 
				age = Integer.parseInt(st.nextToken());
				break;
			case 2 :
				addr = st.nextToken();
				break;
			case 3 :
				gender = st.nextToken().charAt(0);
				break;
			}
			i++;
		}
		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);
		System.out.println(gender);
	}

}

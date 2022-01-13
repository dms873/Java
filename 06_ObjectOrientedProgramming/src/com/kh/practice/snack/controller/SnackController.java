package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	private Snack s = new Snack(); 
	public SnackController() {
		
	}
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		String result = null;
		try {
			s.setKind(kind);
			s.setName(name);
			s.setFlavor(flavor);
			s.setNumOf(numOf);
			s.setPrice(price);
			
			result = "저장 완료되었습니다.";
		} catch (Exception e) {
			e.printStackTrace();
			// 오류 발생시 result는 초기값 null로 return될 것임.
		}
		
		return result;
	}
	
	public String confirmData() {
		String result = s.information();
//		return s.getKind() + "(" + s.getName() + " - "  +  s.getFlavor() + ") " + s.getNumOf() + "개 " + s.getPrice() + "원";
		return result;
	}
}

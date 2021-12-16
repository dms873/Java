package java2;

public class Coffee {
	// 커피판매점
	// 1. 메뉴종류 Hot 아메리카노/ Iced 아메리카노
	// 2. 주문 수량
	// [ 속성값 ]
	// private String hotAmericano; // Hot 아메리카노
	// private String icedAmericano; // Iced 아메리카노
	
	private String americano; // 아메리카노
	// 카페라떼
	private char temperatureType; // Y : hot, N : Iced
	private String size; // 음료의 사이즈
	
	// [ 생성자 ]
	public Coffee() {}
	
	// getter
	public String getAmericano() {
		return americano;
	}
	
	public char getTemperatureType() {
		return temperatureType;
	}
	
	public String getSize() {
		return size;
	}
	
	// setter
	public void setAmericano(String americano) {
		this.americano = americano;
	}
	
	public void setTemperatureType(char temperatureType) {
		this.temperatureType = temperatureType;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	// [ 기능 정의 ]
	public void orderCoffee() {
		System.out.println("커피 주문");
	}
}

class CoffeeMachine {
	public String str1;
	
	public void machine() {
		
	}
}




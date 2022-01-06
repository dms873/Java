package oop.sample;

public class Point {
	private int posX; // 멤버필드
	// !! 안됨 !! posX = 10;
	// 초기화 됨 { posX = 10;}
	private int posY; // 멤버필드
	// 초기화 됨 { posX = 10; posY = 20; }
	// final일 경우에도 {} 안에서 초기화 가능!
	
	// static이라면 static {} 안에서 초기화 가능!
	private static final int FINAL_VAL; // final 변수 선언
	static {
		FINAL_VAL = 10;
	}
	
	// 메소드
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	
	public int getPosY() {
		return posY;
	}
	
	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	// 생성자
	public Point() {
		// 서로 결과는 같음!
		this(15, 15);
		
//		this.posX = 15;
//		this.posY = 15; // 보통 직접 값을 넣지 않고 변수를 만들어서 그 변수를 사용함.
//		// 만약 이런 예외코드가 발생하면 예외 값이 변동될 수 있으니까 this(15, 15);를 사용하는게 더 간단하다.
//		if(posX > 1280) posX = 1280;
//		if(posY > 968) posY = 968;
	}
	
	public Point(int posX, int posY) {
		// 만약 이런 예외코드가 발생하면 
		if(posX > 1280) posX = 1280;
		if(posY > 968) posY = 968;
		this.posX = posX;
		this.posY = posY;
		return;
	}
}

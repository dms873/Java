package oop.sample;

public class Point {
	private int posX; // 멤버필드
	private int posY; // 멤버필드
	
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
	public Point() {}
	public Point(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}
}

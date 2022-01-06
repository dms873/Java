package inherit.sample;

public class Parent {
	private int num;
	
	// public 안붙여주면 default : inherit.sample 안에 든 java 파일에서 가능함.
	public void display() {
		System.out.println("부모 클래스 메소드");
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}

package access.sample;

public class PrivateSample {
	private int num; // 선언된 클래스 안에서만 접근 가능

	public int getNum() { // 값 호출을 위한 Getter
		return num;
	}

	public void setNum(int num) { // 값 대입을 위한 Setter
		this.num = num;
	}
}

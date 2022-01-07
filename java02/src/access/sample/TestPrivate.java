package access.sample;

public class TestPrivate {
	private int num; // num은 TestPrivate 클래스 안에서만 접근 가능

//	private라서 필드 활용 작성될 수 없음! * 메소드 정의 안에서 사용 가능
//	num = 10; 안된다.
//	num++; 안된다.
//	setNum(5); 메소드 호출도 작성될 수 없음! * 메소드 정의 안에서 사용 가능
	
//	메소드 getter / setter를 이용하면 읽기, 쓰기 기능마다 접근을 제한할 수 있음.
	public int getNum() { // getter 메소드
		return num;
	}
	
	public void setNum(int a) { // setter 메소드
		this.num = a;
	}
	
	
	
	
}

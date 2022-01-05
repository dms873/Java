package access.test;

public class RunMethodTest {
	// 메소드 연습
	public static void main(String[] args) {
		
		// 입력받은 두 수
		int inputNum1 = 30;
		int inputNum2 = 50;
		int sumResult = sum(inputNum1, inputNum2);
		
		System.out.println(sumResult);
		System.out.println(sum(123124314,234234234));
		
		
		// 입력받은 두 수
		int a = 20;
		int b = 40;
		
	}
	
	// 두 수의 합을 구해주는 기능
	static int sum(int a, int b) { // 여기서 int a, b는 새로 선언함
		return a+b;
	}
	
	// 두 수의 곱을 구해주는 기능
	void multi() {
		
	}
}

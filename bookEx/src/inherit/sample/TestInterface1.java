package inherit.sample;

public interface TestInterface1 {
	public final int MAX_CNT = 5;
	public int m1(); // {} 쓰면 오류난다.
	public String m2();
	public void m3(int a, String b);
	
}
// interface를 안쓰면 abstract 붙이면 모든 곳에 abstract를 붙여줘야 한다. 그래서 interface를 사용한다.

//  public abstract class TestInterface1 {
//	public final int MAX_CNT = 5;
//	public abstract int m1();
//	public abstract String m2();
//	public abstract void m3(int a, String b);
//}

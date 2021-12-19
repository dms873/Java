package khoop1day03exam;

public class BlockExam {
	public static String name = "홍길동";
	
	public BlockExam() {
		System.out.println("생성자 영역");
	}
	
	int age = 19;
	static {
		System.out.println("static block 영역");
		name = "박길동";
	}
	
	{
		System.out.println(age);
		System.out.println("인스턴스 블럭1");
		this.age = 22;
		System.out.println(age);
	}
	{
		System.out.println("인스턴스 블럭2");
	}
}

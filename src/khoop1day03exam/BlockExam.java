package khoop1day03exam;

public class BlockExam {
	public static String name = "ȫ�浿";
	
	public BlockExam() {
		System.out.println("������ ����");
	}
	
	int age = 19;
	static {
		System.out.println("static block ����");
		name = "�ڱ浿";
	}
	
	{
		System.out.println(age);
		System.out.println("�ν��Ͻ� ��1");
		this.age = 22;
		System.out.println(age);
	}
	{
		System.out.println("�ν��Ͻ� ��2");
	}
}

package khoop1day03exam;


public class Run {
	public static void main(String[] args) {
		// Ŭ���� ������ ����Ϸ����ϸ� Ŭ�������� ���ְ�
		// .�� �Է� �Ŀ� �ش� Ŭ���� ����, �޼ҵ带 ����� �� �ִ�.
		System.out.println(FieldExam.var1);
		System.out.println(FieldExam.method1());
		
		System.out.println("===================");
		
		// ��� ������ ��ü�� �����ؼ� heap�޸� ������
		// ������ �Ŀ� ������ �����ϴ�.
		// ��ü�� ������ �Ŀ� ������ �޼ҵ忡 ������ �� �� �ִ�.
		FieldExam fe = new FieldExam();
		System.out.println(fe.var2);
		System.out.println(fe.method());
		
		System.out.println("===================");
		
		BlockExam be = new BlockExam();
		System.out.println(be.name);
		
		System.out.println("===================");
		
		// JVM �⺻�� Ȯ��
		System.out.println("Bool: " + BasicVariable.bool);
		System.out.println("Byte: " + BasicVariable.by);
		System.out.println("Character: " + BasicVariable.ch); // \u000000
		System.out.println("Double: " + BasicVariable.d);
		System.out.println("Float: " + BasicVariable.f);
		System.out.println("Integer: " + BasicVariable.i);
		System.out.println("Long: " + BasicVariable.l);
		System.out.println("Short: " + BasicVariable.sh);
		System.out.println("String: " + BasicVariable.str);
		
		
		
		
	}
}

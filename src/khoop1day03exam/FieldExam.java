package khoop1day03exam;

public class FieldExam {
	// [����������] [�����] �ڷ��� ������ [=�ʱⰪ];
	// Ŭ���� ����(��� ��ü�� ���������� �Ӽ��� ���� ��)
	// ����� �ϰ� ������ �� �޸� ������ ���� �����Ǳ� ������
	// �� �ʿ��� �������� �Ӽ��� ���� ������ ����� �ؾ��մϴ�.
	
	public static int var1;
	
	// �������(�ν��Ͻ� ����)
	// ������ ��ü(�ν��Ͻ�)���� �������� �Ӽ��� �������� ��
	// �������(�ν��Ͻ� ����)�� ����ϰ� �˴ϴ�.
	
	public int var2;
	private int var3; // ĸ��ȭ ��Ģ���� private���
	int var4; // ���������� ������ default ����������
	
	// ������
	public FieldExam() {
		String var5 = "������ ��������"; // ��������
		System.out.println(var5);
	}
	
	// �ʱ�ȭ ��
	{
		String var6 = "�ʱ�ȭ�� ��������"; // ��������
		System.out.println(var6);
	}
	
	// �޼ҵ�
	public String method() {
		String var7 = "�޼ҵ� ���� ��������"; // ��������
		return var7;
	}
	
	public static String method1() {
		String var8 = "static ���� ��������"; // ��������
		return var8;
	}
}

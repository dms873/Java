package khoop1day03exam;

public class OverloadingExam {
	// �����ε��� ����
	// 1. �޼ҵ��� �̸��� �����ؾ� �Ѵ�.
	int intI;
	int intII;
	String strS;
	public void method() {
		
	}
	
	// 2. �Ű������� Ÿ���� �޶�� �Ѵ�.
	public void method(int intI) {
		
	}
	
//	public void method(int intII) {
//		
//	}
//	=> Ÿ���� ���Ƽ� ������
	
	public void method(String strS) {
		
	}
	
	// 3. �Ű������� ������ �޶�� �Ѵ�.
	public void method(int intI, String strS) {
		
	}
	
	// 4. [����] �Ű������� ��ġ�� �޶� �ٸ� �޼ҵ�� �ν�
	public void method(String strS, int intI) {
		
	}
}

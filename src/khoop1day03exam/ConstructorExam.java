package khoop1day03exam;

public class ConstructorExam {
	private int no;
	private String name;
	
	// ������ ǥ����
	// �⺻ ������ : [����������] Ŭ������() {}
	// �Ű������� �ִ� ������ :
	// [����������] Ŭ������(�Ű�����){(this).�ʵ庯�� = �Ű�����;}

	// �⺻ ������
	public ConstructorExam() {
		
	}
	
	// �Ű������� �ִ� ������
	public ConstructorExam(int no, String name) {
		this.no = no;
		this.name = name;
	}
}

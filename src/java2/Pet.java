package java2;

public class Pet {
	private String petType;	// ���� ����
	private String petName;	// ���� �̸�
	private int petAge; 		// ���� ����
	// public�� �ƴ϶� private�� �ٸ� class���� Run�� �� ����
	// getter�� setter�� �̿��ؼ� �ҷ��� �� ����
	
	
	// ������
	public Pet() {}
	
	// �Ű������� �ִ� ������
	public Pet(String petType, String petName, int petAge) {
		this.petType = petType;
		this.petName = petName;
		this.petAge = petAge;
	}
	
	
	// getter
	public String getPetType() {
		return petType;
	}
	
	public String getPetName() {
		return petName;
	}
	
	public int getPetAge() {
		return petAge;
	}
	
	// setter
	public void setPetType(String petType) {
		this.petType = petType;
	}
	
	public void setPetName(String petName) {
		this.petName = petName;
	}
	
	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}
}

package java2;

public class Run {

	public static void main(String[] args) {
//		Pet p = new Pet();
		Pet p1 = new Pet("�ú������㽺Ű", "�̹�", 1);
		Pet p2 = new Pet("Ǫ��", "Ǫ��", 2);
		Pet p3 = new Pet("������", "�屺", 2);
		
		System.out.println("�� ���� : " + p1.getPetType() +
							"�� �̸� : " + p1.getPetName() +
							"�� ���� : " + p1.getPetAge());	
		
		System.out.println("�� ���� : " + p2.getPetType() +
				"�� �̸� : " + p2.getPetName() +
				"�� ���� : " + p2.getPetAge());	
		
		System.out.println("�� ���� : " + p3.getPetType() +
				"�� �̸� : " + p3.getPetName() +
				"�� ���� : " + p3.getPetAge());	
	}

}

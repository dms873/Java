package test.main;

import test.map.PropertiesStudent;
import test.map.StudentManager;

public class PropertiesMain {
	public static void main(String[] args) {
		StudentManager stm = new StudentManager();
		
		// properties 데이터 삽입
		stm.propertyInsert(new PropertiesStudent("1", "홍길동", 80));
		stm.propertyInsert(new PropertiesStudent("2", "김유신", 60));
		stm.propertyInsert(new PropertiesStudent("3", "신사임당", 95));
		
		// properties 데이터 저장
		stm.propertyStore();
		
		// properties 데이터 입출력
		stm.propertyPrint();
	}
}

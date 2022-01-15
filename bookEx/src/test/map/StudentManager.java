package test.map;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Properties;

public class StudentManager {
	private ArrayList<PropertiesStudent> list = new ArrayList<PropertiesStudent>();
	private Properties prop = new Properties();
	public StudentManager() {
		super();
	}
	
	public void propertyInsert(PropertiesStudent ps) {
		prop.setProperty(ps.getNo(), ps.toString());
		System.out.println(ps.getName() + "학생의 데이터 삽입 성공!");
	}
	
	public void propertyStore() {
		try { // 설정 파일 저장 시..
			prop.store(new FileWriter("prop.properties"), "PropertiesStudent.properties");
			System.out.println("학생 데이터 저장 성공!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void propertyPrint() {
		try { // 설정 파일 불러올 시..
			prop.load(new FileReader(new File("prop.properties")));
			for(int i = 1; i <= prop.size(); i++) {
				String index = String.valueOf(i); // String 형변환을 통한 key 값 도출
				list.add(parseStudent(prop.getProperty(index)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(PropertiesStudent ps : list) {
			System.out.println(ps);
		}
		System.out.println("학생 데이터 출력이 완료되었습니다.");
	}
	
	public PropertiesStudent parseStudent(String str) { // 넘겨 받은 데이터를 학생 객체로 변환
		String tmp[] = str.split(", "); 
		return new PropertiesStudent(tmp[0], tmp[1], Integer.parseInt(tmp[2]));
	}
}

package com.kh.p3.object.run;

import java.io.*;

import com.kh.p3.object.model.vo.*;

public class Run {
	
//	직렬화, 역직렬화
	public static void main(String[] args) {
		Phone[] ph = {new Phone("삼성", 70), new Phone("LG", 65), new Phone("화웨이", 40)};
		Student[] st = {new Student("학생1", 18, '남', ph[0]),
						new Student("학생2", 17, '여', ph[1]),
						new Student("학생3", 19, '남', ph[2])};
		Teacher tc = new Teacher("S", "김용승");
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"));
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"))) {
			
			for(int i = 0; i < st.length; i++) {
				oos.writeObject(st[i]);
			}
			oos.writeObject(tc);
//			Student형 다음 Teacher형
			
			for(int i = 0; i < st.length; i++) {
				System.out.println((Student)ois.readObject());
			}
			System.out.println((Teacher)ois.readObject());
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}

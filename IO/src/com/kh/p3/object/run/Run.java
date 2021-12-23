package com.kh.p3.object.run;

import java.io.*;

import com.kh.p3.object.model.vo.*;

public class Run {
	
//	����ȭ, ������ȭ
	public static void main(String[] args) {
		Phone[] ph = {new Phone("�Ｚ", 70), new Phone("LG", 65), new Phone("ȭ����", 40)};
		Student[] st = {new Student("�л�1", 18, '��', ph[0]),
						new Student("�л�2", 17, '��', ph[1]),
						new Student("�л�3", 19, '��', ph[2])};
		Teacher tc = new Teacher("S", "����");
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"));
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"))) {
			
			for(int i = 0; i < st.length; i++) {
				oos.writeObject(st[i]);
			}
			oos.writeObject(tc);
//			Student�� ���� Teacher��
			
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

package khoop1day04run;

import khoop1day04exam.Student;

public class Run {
	public static void main(String[] args) {
		Student st = new Student();
		st.setStudentNo(1);
		st.setStudentName("ȫ�浿");
		
		System.out.println(st.getStudentNo());
		System.out.println(st.getStudentName());
	}
}

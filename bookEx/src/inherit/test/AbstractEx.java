package inherit.test;

import inherit.sample.Professor;
import inherit.sample.Student;

public class AbstractEx {
	public static void main(String[] args) {
		Student stu = new Student("홍길동", "자바");
		Professor prof = new Professor("김춘추", "컴퓨터과학");
		stu.out();
		prof.out();
	}
}

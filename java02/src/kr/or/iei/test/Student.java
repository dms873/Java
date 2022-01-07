package kr.or.iei.test;

public class Student {
	private String name; // 이름
	private int score; // 점수
	public static final String SCHOOL_NAME = "서울대"; // 학교명
	
	public Student(String name) {
		this.name = name;
	}
	
	public int sumScore() { // 점수 합계
		return 0;
	}; 
	
	public double avgScore() { // 점수 평균
		return 0.0;
	}; 
	
	public void goToSchool() { // 등교 방법
		return;
	}
}

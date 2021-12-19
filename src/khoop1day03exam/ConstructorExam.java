package khoop1day03exam;

public class ConstructorExam {
	private int no;
	private String name;
	
	// 생성자 표현식
	// 기본 생성자 : [접근제한자] 클래스명() {}
	// 매개변수가 있는 생성자 :
	// [접근제한자] 클래스명(매개변수){(this).필드변수 = 매개변수;}

	// 기본 생성자
	public ConstructorExam() {
		
	}
	
	// 매개변수가 있는 생성자
	public ConstructorExam(int no, String name) {
		this.no = no;
		this.name = name;
	}
}

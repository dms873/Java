package access.test;

import access.sample.PrivateSample;

public class TestPrivate {
	public static void main(String[] args) {
		PrivateSample psamp = new PrivateSample();
		
//		psamp.num = 10; // private 이므로 접근 제한 에러 발생
		
		psamp.setNum(10); // public 이므로 접근 가능
		System.out.println(psamp.getNum()); // public 이므로 접근 가능
	}
}

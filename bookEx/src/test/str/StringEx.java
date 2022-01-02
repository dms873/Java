package test.str;

public class StringEx {
	public void testString() {
		String str = "Hello Java"; // 공백도 하나의 문자로 취급
		String concat, upperCase, replace, subString;
		
		System.out.println("기본 String : " + str);
		System.out.println("기본 String 길이 : " + str.length()); // 문자열 길이 출력
		
		concat = str.concat(", Hi Java"); // 문자열 연결
		upperCase = concat.toUpperCase(); // 문자열 대문자로 변환
		replace = upperCase.replace('J', 'L'); // 문자 J를 L로 변환
		subString = replace.substring(3, 10); // 3~9번째 위치의 문자열 잘라내기
		
		System.out.println("Concat String : " + concat);
		System.out.println("upperCase String : " + upperCase);
		System.out.println("replace String : " + replace);
		System.out.println("subString : " + subString);
	}

}

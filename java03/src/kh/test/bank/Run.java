package kh.test.bank;

public class Run {
	public static void main(String[] args) {
		// TODO
		// 1. 통장개설
		// 2. 잔액조회
		// 3. 입금
		// 4. 출금
		
		
		// 무명 게좌개설
//		BankAccount a = new BankAccount(); // 오류난다. => 매개인자 안넣어줘서!

		
		// 박자민 계좌개설
		BankAccount jm = new BankAccount("1111", "박자민"); // BankAccount.totalCnt++;
		// BankAccount.totalCnt;와 jm.totalCnt, ej.totalCnt와 결과는 같다.
		// jm.totalCnt이 아니라 클래스 이름을 적어주는게 올바르다.(안그러면 경고뜸) => 클래스 변수
		
//		System.out.println("totalCnt : " + BankAccount.totalCnt);
		System.out.println("jm's 계좌번호 : " + jm.getNo());
//		System.out.println("jm.DEFAULT_NO); private라서 다른 class파일에서 읽을 수 없음.(접근 X) static을 붙여도 private때문에 안 됨!
		System.out.println();
		
		// => 1000원 입금
//		jm.balance = 1000;  // balance를 private로 변경해서 setter메소드를 사용
		jm.setBalance(1000);
		
		// 이제이 계좌개설 
		BankAccount ej = new BankAccount("1111", "김은주", "2345678");
//		System.out.println("totalCnt : " + BankAccount.totalCnt); => private때문에 이렇게하면 오류!
//		System.out.println("totalCnt : " + ej.getTotalCnt()); 		 으로 불러올 수 있다.
		System.out.println("ej's 계좌번호 : " + ej.getNo());
//		BankAccount.totalCnt++;
		// ej.totalCnt++;을 했는데 jm.totalCnt도 함께 올라간 걸 알 수 있다.
		// totalCnt가 static 예약어가 붙어있어서 static 영역에 있기때문에!
		// 공통적으로 관리해야 될 부분만 static을 붙여줘야한다.

		//=> 10000원 입금
//		ej.balance = 10000;  // balance를 private로 변경해서 setter메소드를 사용
		ej.setBalance(10000);
		
		System.out.println();
		
		// 박자민 잔액조회 - 출금 500원
		int balance = jm.checkBalance();
		System.out.println("jm's balance : " + balance); // 변수 balance를 쓴 것과 jm.checkBalance() 메소드를 쓴 것과 결과는 동일
		jm.withdraw(500);
		System.out.println("jm's balance : " + jm.checkBalance());
		System.out.println();
		
		// 박자민 잔액조회 - 입금 2000원
		balance = ej.checkBalance();
		System.out.println("ej's balance : " + ej.checkBalance());
		ej.deposit(2000);
		System.out.println("ej's balance : " + ej.checkBalance());
		
		ej.setPassword("dfdff");
		jm.setPassword("fjsdfksjsdfdsfsdfdfk");
		
		// 디버깅 Debugging
		// 1. breakpoint 잡는다. / 푼다. (라인번호에 더블클릭)
			// 하던 일(작업)을 잠시 멈춰서야 하는데, 주석은 하는 일이 없으므로 breakpoint가 안잡힌다. => 코드가 적혀있어야 잡힘.
		// 2. f11 누른다.
			// switch 모드 변경할건지?
			// java -> debug 모드 상태로 바뀜
		// 3. f6 / f7(잘 안씀) / f8 다음 동작 수행
			// 수행 중 각종 변수들의 값을 확인할 수 있음.
				// 수행 중 호출되는 메소드들을 확인할 수 있음.
		
		
		
		
	}
}

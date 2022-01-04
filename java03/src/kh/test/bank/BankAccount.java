package kh.test.bank;

public class BankAccount {
	// 추상화를 통한 class 만드는 행위
	
	//static 넣기도, 빼기도 함.
	private static final String DEFAULT_NO = "9999999999";
	private String no;	 // 계좌번호
	private String password; 	 // 비밀번호
	private String name;		 // 예금주
	private int balance;		 // 잔액
	// static 꼭 필요함.
	static int totalCnt; // 이 통장이 개설된 수
	
	// 생성자(heap에 공간 마련)
	// 생략가능 - compile 시 javac가 넣어준다. 하고싶은 행동이 있다면 생략하지 않고 그 안에 실행될 코드 넣기
//	public BankAccount() {}
	
	
	// overloading : 매개변수의 자료형과 개수가 달라서 
	// 				 호출하는 시점에 전달되는 매개인자 값의 자료형과 개수에 따라 
	// 				 각각의 메소드 정의 부분이 수행됨.
	
	// 통장 개설을 하기 위해서는 계좌번호, 비밀번호, 예금주를 알려줘야 함.
	public BankAccount(String password, String name, String no) {
		this.no = no;
		this.password = password;
		this.name = name;
		if(totalCnt > 10) {
			System.out.println("통장개설 개수가 한계에 도달하고 있습니다.");
		}
		System.out.println("현재 개설 된 통장 개수 : " + totalCnt);
		totalCnt++;
	}
	
	//  비밀번호, 예금주를 알려주고 통장개설을 원한 경우
	public BankAccount(String password, String name) {
		this.no = DEFAULT_NO + totalCnt;
		this.password = password;
		this.name = name;
		if(totalCnt > 10) {
			System.out.println("통장개설 개수가 한계에 도달하고 있습니다.");
		}
		System.out.println("현재 개설 된 통장 개수 : " + totalCnt);
		totalCnt++;
	}
	
	// 잔액조회 : 잔액을 리턴
	int checkBalance() {
		return balance;
	}
	
	// 입금 : 입금금액 받아서(매개인자) 잔액에서 더해서 대입.
	void deposit(int account) {
		balance += account;
	}
	
	// 출금 : 출금금액 받아서(매개인자) 잔액에서 빼서 대입.
	void withdraw(int account) {
		balance -= account;
	}
	
	// 계좌번호(getter, setter)
	public String getNo() {
		return no;
	}

	private void setNo(String no) {
		this.no = no;
	}
	
	// 비밀번호(getter, setter)
	// field에 값을 변경하거나 읽게 되면 누가 언제 바꿨는지 읽었는지 알 수 없음.
	// 그래서 field 변수에는 private를 선언해주고 메소드를 이용해서 읽고 바꾸게 되면 누가 언제 바꿨는지 알 수 있다.
	// 값을 읽고 쓰는 것(변경하는 것) 이외의 일들을 수행할 수도 있다.
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		// 기존 password 입력받은 후 맞다면 패스워드 변경해줌.
		// 패스워드는 20자까지만 가능하다고 할 때, 전달되어온 패스워드 길이를 확인해서 알려줄 수 있다.
		if(password.length() < 20) {			
			this.password = password;
		} else {
			System.out.println("비밀번호 변경에 실패했습니다. 20자리 미만으로 입력해주세요.");
		}
	}

	// 예금주(getter, setter)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 잔액(getter, setter)
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// totalCnt(getter)
	public int getTotalCnt() {
		return totalCnt;
	}
	
	
	
}

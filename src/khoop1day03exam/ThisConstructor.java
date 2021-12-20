package khoop1day03exam;


public class ThisConstructor {
	private String bookName; // 책이름
	private int bookPrice; // 책가격
	private String bookpublisher; // 출판사
	private int bookId; // 책아이디
	
	public ThisConstructor() {
		System.out.println("기본 생성자입니다.");
	}
	
	public ThisConstructor(String bookpublisher) {
		this.bookpublisher = bookpublisher;
		System.out.println("매개변수 하나");
	}
	
	public ThisConstructor(String bookName, int bookPrice, int bookId) {
		this("KH정보교육원"); // 항상 맨 첫 줄에 있어야 됨
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookId = bookId;
	}
	
	// getter
	public String getBookName() {
		return bookName;
	}
	
	public int getBookPrice() {
		return bookPrice;
	}
	
	public String getBookpublisher() {
		return bookpublisher;
	}
	
	public int getBookId() {
		return bookId;
	}
}

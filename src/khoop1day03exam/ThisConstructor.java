package khoop1day03exam;


public class ThisConstructor {
	private String bookName; // å�̸�
	private int bookPrice; // å����
	private String bookpublisher; // ���ǻ�
	private int bookId; // å���̵�
	
	public ThisConstructor() {
		System.out.println("�⺻ �������Դϴ�.");
	}
	
	public ThisConstructor(String bookpublisher) {
		this.bookpublisher = bookpublisher;
		System.out.println("�Ű����� �ϳ�");
	}
	
	public ThisConstructor(String bookName, int bookPrice, int bookId) {
		this("KH����������"); // �׻� �� ù �ٿ� �־�� ��
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

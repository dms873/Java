package test.poly;

public class TestPolyArgument {
	public static void main(String[] args) {
		Buyer b = new Buyer(); // 고객
		b.buy(new Chair()); // 고객이 의자하나 구매
		b.buy(new Desk()); // 고객이 책상하나 구매
	}
}

class Furniture {
	private int price; // 제품 가격

	public Furniture(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
}

class Chair extends Furniture {
	public Chair() {
		super(100); // 부모클래스의 생성자 호출
	}
	
	@Override
	public String toString() {
		return "Chair";
	}
}

class Desk extends Furniture {
	public Desk() {
		super(200);
	}

	@Override
	public String toString() {
		return "Desk";
	}
}

class Buyer {
	private int money = 500;

	// Chair 구매메소드
	void buy(Chair c) {
		if(money < c.getPrice()) {
			System.out.println("잔액부족!");
			return;
		}
		money -= c.getPrice();
		System.out.println(c + " 구매성공! 잔액 : " + money + " 만원");
	}

	// Desk 구매메소드
	void buy(Desk d) {
		if(money < d.getPrice()) {
			System.out.println("잔액부족!");
			return;
		}
		money -= d.getPrice();
		System.out.println(d + " 구매성공! 잔액 : " + money + " 만원");
	}

	public void buy(Furniture f) {
		if(money < f.getPrice()) {
			System.out.println("잔액 부족!");
			return;
		}

		money -= f.getPrice();
		System.out.println(f + " 구매성공! 잔액 : " + money + " 만원");
	}
}

package com.kh.p2.over.child.model.vo;

import com.kh.p2.over.parent.model.vo.Shop;

public class CoffeeShop extends Shop {
	private String coffeeName; // Ŀ�Ǹ�
	private int price;		   // ����
	private String shopName;   // ���Ը�
	public CoffeeShop() {
	}
	public CoffeeShop(String coffeeName, int price, String shopName) {
		this.coffeeName = coffeeName;
		this.price = price;
		this.shopName = shopName;
	}
	
	public CoffeeShop(String owner, String address, String coffeeName, int price, String shopName) {
		super(owner, address);
		this.coffeeName = coffeeName;
		this.price = price;
		this.shopName = shopName;
	}
	
	public String getCoffeeName() {
		return coffeeName;
	}
	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	@Override
	public String toString() {
		return "Ŀ�Ǹ� : " + coffeeName + ", ���� : " + price + ", ���Ը� : " + shopName;
 	}
	
	@Override
	public void order(String str) {
		System.out.println(str + " " + super.getOwner() + "�� " + shopName 
				+ " ���Կ���" + coffeeName + "�� " + price + "�� �ְ� �ֹ��Ѵ�.");
	}
	
	@Override
	public boolean equals(Object obj) {
		CoffeeShop cs = (CoffeeShop)obj;
		if(this.coffeeName == cs.coffeeName && this.price == cs.price && this.shopName == cs.shopName) {
			return true;
		}
		return false;
		// return this.coffeeName == cs.coffeeName && this.price == cs.price && this.shopName == cs.shopName
	}
	
	@Override
	public CoffeeShop clone() {
		return this;
//		return new CoffeeShop(coffeeName, price, shopName);
	}
}

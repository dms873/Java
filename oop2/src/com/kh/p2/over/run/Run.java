package com.kh.p2.over.run;

import com.kh.p2.over.child.model.vo.CoffeeShop;
import com.kh.p2.over.parent.model.vo.Shop;

public class Run {

	public static void main(String[] args) {
		Shop sp = new Shop("�̾���", "���� ���Ǳ�");
		System.out.println(sp);
		sp.order("�θ� �޼ҵ�>> ");
		
		CoffeeShop cs = new CoffeeShop("�达��", "���� ������", "������", 4000, "7�׷�");
		cs.order("�������̵��� ���� �ڽ� �޼ҵ�>> ");
		
		System.out.println();
		
		CoffeeShop cs1 = new CoffeeShop("�Ƹ޸�ī��", 3000, "7�׷�");
		CoffeeShop cs2 = new CoffeeShop("�Ƹ޸�ī��", 3000, "7�׷�");
		
		System.out.println(cs1);
		System.out.println(cs2);
		
		System.out.println();
		
		System.out.println(cs1.hashCode());
		System.out.println(cs2.hashCode());
		
		System.out.println();
		
		System.out.println("equals �� ��� : " + cs1.equals(cs2));
		
		System.out.println();
		
		CoffeeShop cs3 = null;
		// protected Object clone()
//		cs3 = (CoffeeShop)cs1.clone();
		cs3 = cs1.clone();
		
		System.out.println(cs3);
	}

}

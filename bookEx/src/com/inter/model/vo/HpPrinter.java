package com.inter.model.vo;

import com.inter.common.PrintDriver;

public class HpPrinter implements PrintDriver {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2821671434538341460L;

	public void printHp() {
		System.out.println("HP프린터 인쇄중!");
	}
	
	@Override
	public void print() {
		printHp();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		
	}
}

package com.inter.model.vo;

import com.inter.common.PrintDriver;

public class SamsungPrinter implements PrintDriver {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3572053846093501093L;

	public void print() {
		System.out.println("삼성프린트 인쇄중..");
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

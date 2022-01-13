package com.kh.practice.snack.exception;

public class EventException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1662727518194953220L;
	
	@Override
	public String getMessage() {
		return "1~999999 범위의 숫자가 아닙니다.";
	}
}

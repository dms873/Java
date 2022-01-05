package oop.method.test;

import oop.method.sample.OverloadingSample;

public class TestOverloading {
	public static void main(String[] args) {
		OverloadingSample osamp = new OverloadingSample();
		osamp.out();
		osamp.out(123);
	}
}

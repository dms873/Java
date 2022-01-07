package com.inter.run;

import com.inter.controller.PrinterController;
import com.inter.model.vo.HpPrinter;
import com.inter.model.vo.SamsungPrinter;

public class Main {
	public static void main(String[] args) {
		new PrinterController(new SamsungPrinter()).print();
		new PrinterController(new HpPrinter()).print();
	}
}

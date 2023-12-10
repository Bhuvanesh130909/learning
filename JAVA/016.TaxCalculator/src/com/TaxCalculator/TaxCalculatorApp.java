package com.TaxCalculator;

public class TaxCalculatorApp {

	public static double calculateTotalWithTax(double purchaseAmount ,double taxRate) {
		double taxamount=purchaseAmount*taxRate;
		double totalcost=purchaseAmount+taxamount;
		return(totalcost);
		
		

	}

}

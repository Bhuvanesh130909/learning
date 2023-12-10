package com.TaxCalculator;

import java.util.Scanner;

public class TaxCalculator {
	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("enter purchase amount");
		double purchaseAmount=scan.nextDouble();
		System.out.println("enter tax rate");
		double taxRate=scan.nextDouble();
		double total=TaxCalculatorApp.calculateTotalWithTax(purchaseAmount ,taxRate);
		System.out.println("Total cost including tax"+total);
		scan.close();
		
	}
}

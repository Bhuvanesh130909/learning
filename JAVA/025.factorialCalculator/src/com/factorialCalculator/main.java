package com.factorialCalculator;

import java.util.Scanner;

public class main {
	public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		calculatorFactorial(n);
		scan.close();
	}
	public static void calculatorFactorial(int n) { 
		int sum=1;
		for(int i=1;i<=n;i++) {
			sum=sum*i;
			
			
		}
		System.out.println(n);
		
	}

}

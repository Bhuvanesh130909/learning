
package com.kod;

import java.util.Scanner;

public class SumofDigitsCalculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value");
		int n=scan.nextInt();
		
		calculateSumOfDigits( n);

		
	}
	
public static void calculateSumOfDigits(int n)

{   int sum=0;
	while(n>0)
	{
		int ld=n%10;
		sum=sum+ld;
	    n=n/10;
		
		
	}
	System.out.println(sum);



}
}

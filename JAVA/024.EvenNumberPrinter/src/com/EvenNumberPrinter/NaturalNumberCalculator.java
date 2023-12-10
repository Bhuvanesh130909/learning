package com.EvenNumberPrinter;

import java.util.Scanner;

public class NaturalNumberCalculator {
	public static void calculateSum(int n)

	{
		for(int i=1;i<=n;i++)
		{
		
			int sum=0;
			sum=sum+i;
			System.out.println();
		}
		
 
	

	}

	public static void main(String[] args)

	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		calculateSum(n);
		scan.close();
	}

}

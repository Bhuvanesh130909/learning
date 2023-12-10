package com.fibbonociSeries;

import java.util.Scanner;

public class FibbonaciSeries {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		printFibonacciSeries(n);
		
		

	}
	public static void printFibonacciSeries(int n)

	{
	int first=0;
	int second=1;
	if(n==1)
	{
		System.out.println(first);
	}
	else if(n==2)
	{
		System.out.println(first +" "+second);
	}
	else {
		System.out.print(first+" "+second);
	for(int i=3;i<=n;i++)
	{
	  int next=first+second;
	  first=second;
	  second=next;	
	  System.out.print(" "+ next);
	}
	}

	}

}

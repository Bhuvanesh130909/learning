package com.NumberTablePrinter;

import java.util.Scanner;

public class NumberTablePrinter {
	public static void printTable(int num)

	{

	for(int i=1;i<=10;i++)
	{
		System.out.println(num+"x" +i+"="+(num*i));
	}
	

	}

	public static void main(String[] args)

	{

		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		printTable(num);
		scan.close();

	}

}

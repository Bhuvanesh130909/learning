package com.EvenNumberPrinter;

import java.util.Scanner;

public class EvenNumberPrinter {
	public static void printEvenNumbers(int n)

	{

    for(int i=1;i<=10;i++)
    {
    	if(i%2==0)
    	{
    		System.out.print(i );
    	}
    }

	}

	public static void main(String[] args)

	{

		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		printEvenNumbers(n);
		scan.close();

	}

	}



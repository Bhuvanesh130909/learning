package com.DoubleTrouble;

import java.util.Scanner;

public class DoubleTroubleApp
{
     public static void main(String[] args)
     {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a mumber");
	    int num1=scan.nextInt();
	    System.out.println(subtractNumbers(num1));
	    scan.close();
		}
		public static int subtractNumbers(int num1)
		{
		return num1*2;
		}

	}



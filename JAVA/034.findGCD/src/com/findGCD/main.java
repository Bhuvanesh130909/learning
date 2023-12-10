package com.findGCD;

import java.util.Scanner;

public class main {
	public static void findGCD(int a, int b)

	{
		while(b!=0) {
			int c=a%b;
			a=b;
			b=c;
		}
		int Gcd=a;
		System.out.println(Gcd);
		
		
	}
    
	

	public static void main(String[] args)

	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		findGCD(a,b);
		scan.close();
		
		

	

	}

	}



package com.PrimeNumberPrinter;

import java.util.Scanner;

public class PrimenumberPrinter {
	public static void main(String[] args)

	{

		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.close();
		

	}
	public static  void intPrimes(int n,boolean res)

	{
		for(int i=3;i<=n;i++)
		{
			if(res==true)
			{
				System.out.println(n+" "+"prime number");
			}
		}
	}
			
    public static boolean prime(int n) {
    	for(int i=2;i<=n;i++)
    	{
    		boolean res=prime(n);
    		if(n%i==0)
    		{
    			return false;
    		}
    	}
    	return true;
    
			
		}
		
			

		}

		



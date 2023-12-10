package com.kodnest.java.patterns.level2;

public class pattern22 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++)
			{
				System.out.print("-");		
			}
			for(int K=5;K>=i;K--)
			{
				System.out.print("*");		
			}
			System.out.println();
			
			
		}
		for(int i=2;i<=5;i++) {
			for(int j=2;j<=5;j++)
			{
				System.out.print("-");		
			}
			for(int K=1;K<=i;K++)
			{
				System.out.print("*");		
			}
			System.out.println();
			
		}
	}

}

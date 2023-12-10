package com.kodnest.java.patterns.level3;

public class pattern8 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				int n=10;
				if(i==1||i==10||j==1||j==10||j==n/2||i==n/2)
			{
				System.out.print("* ");
			}
			
				else {
				System.out.print("  ");
			}
			}	
			System.out.println();
		}
	}


}

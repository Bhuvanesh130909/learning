package com.kodnest.java.patterns.level3;

public class pattern4 {
	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++)
				if(i==6||j==6)
			{
				System.out.print("*");
			}
				else {
				System.out.print(" ");
			}
				
			System.out.println();
		}
	}
	}



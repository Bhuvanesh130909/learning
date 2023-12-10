package com.kodnest.java.patterns.level3;

public class pattern10 {
	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {	
			int n=6;
				if(i==1||j==1||i==n)
			{
				System.out.print("*");
			}
				else {
				System.out.print(" ");
			}
			}
			System.out.println();
		}
	}


}

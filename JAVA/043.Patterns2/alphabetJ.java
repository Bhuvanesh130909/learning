package com.kodnest.patterns.level.Letters;

public class alphabetJ {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			int n=10;
			for(int j=1;j<=n;j++) {
				if(i==1||j==n/2||i==n&&j<=5||j==1&&i>5)
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

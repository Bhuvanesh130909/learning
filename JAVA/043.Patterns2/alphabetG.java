package com.kodnest.patterns.level.Letters;

public class alphabetG {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			int n=10;
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==1||j==n&&i>=6||i==6&&j>=6)
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

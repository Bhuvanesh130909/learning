package com.kodnest.patterns.level.Letters;

public class alphabetM {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			int n=10;
			for(int j=1;j<=n;j++) {
				if(j==1||j==n||j==i&&i<=5||j==n-i&&j>=5)
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

package com.kodnest.patterns.level.Letters;

public class alphabetW {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			int n=11;
			for(int j=1;j<=n;j++) {
				if(j==1||j==n||j==n-i&&i>=n/2||i==j&&j>=n/2)
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

package com.kodnest.patterns.level.Letters;

public class alphabetO {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			int n=10;
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==n||j==1)
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

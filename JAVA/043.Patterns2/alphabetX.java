package com.kodnest.patterns.level.Letters;

public class alphabetX {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			int n=11;
			for(int j=1;j<=n;j++) {
				if(i==j||j==n-i)
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

package com.kodnest.patterns.level.Letters;

public class alpphabetZ {
	public static void main(String[] args) {
		int n=11;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==n-i)
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

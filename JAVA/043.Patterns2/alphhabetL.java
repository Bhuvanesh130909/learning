package com.kodnest.patterns.level.Letters;

public class alphhabetL {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			int n=10;
			for(int j=1;j<=n;j++) {
				if(j==1||i==n)
			{
				System.out.print("* ");
			}
				else {
				System.out.print(" ");
			}
			}
			System.out.println();
		}
	}

}
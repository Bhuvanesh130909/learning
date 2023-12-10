package com.kodnest.patterns.level.Letters;

public class alphabetQ {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			int n=10;
			for(int j=1;j<=n;j++) {
				if((i==1&&j<=5)||(j==1&&i<=5)||(i==n/2&&j<=n/2)||(j==n/2&&i<=n/2)||j==i&&i>=3&&i<=n*3/4)
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

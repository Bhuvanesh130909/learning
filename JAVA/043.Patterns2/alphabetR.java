package com.kodnest.patterns.level.Letters;

public class alphabetR {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			int n=10;
			for(int j=1;j<=n;j++) {
				if(i==1&&j<=n/2||j==1||j==n/2&&i<=5||i==n/2&&j<=5||j==2&&i==6||j==3&&i==7||j==4&&i==8||j==5&&i==9||j==6&&i==10)
					
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

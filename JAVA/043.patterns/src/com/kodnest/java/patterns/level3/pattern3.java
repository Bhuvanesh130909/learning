package com.kodnest.java.patterns.level3;

public class pattern3 {
	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++)
				if(j==1||i==1)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

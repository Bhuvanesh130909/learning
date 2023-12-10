package com.palindrome;

import java.util.Scanner;

public class palindrome {
	public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		PalindromeConverter p1=new PalindromeConverter();
		p1.convert(n);
		scan.close();
		}

}

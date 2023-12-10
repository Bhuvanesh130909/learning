package com.AnotherMethodInPalindrome;

import java.util.Scanner;

public class AnotherMethodInPalindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		createPalindrome c1=new createPalindrome();
		boolean res=c1.palindrome(n);
		scan.close();
        if(res==true) {
        	System.out.println("it is palindrome");
		
	}
        else
        {
        	System.out.println("nota palindrome");
        }
	}
}



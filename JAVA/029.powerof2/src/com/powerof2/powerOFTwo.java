package com.powerof2;

import java.util.Scanner;

public class powerOFTwo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=scan.nextInt();
		powerChecker c1=new powerChecker();
		int res=c1.check(a);
		System.out.println(res);

	}

}

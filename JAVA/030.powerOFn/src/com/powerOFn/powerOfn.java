package com.powerOFn;

import java.util.Scanner;

public class powerOfn {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		System.out.println("enter a power");
		int n=scan.nextInt();
		powerOfnChecker theCounting=new powerOfnChecker();
		int digi = theCounting.checker(num,n);
		System.out.println(digi);
		scan.close();

		}
	}



package com.amstrongNumber;

import java.util.Scanner;

public class amstrongNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		Ams a1=new Ams();
		int digi=a1.CheckDigit(num);
		int res1=a1.LastDigit(num, digi);
		System.out.println(digi);
		System.out.println(res1);
		if(res1==num) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
			}
			

		}

	

	}
	



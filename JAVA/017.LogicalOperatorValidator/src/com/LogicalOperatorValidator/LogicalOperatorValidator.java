package com.LogicalOperatorValidator;

import java.util.Scanner;

public class LogicalOperatorValidator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the two boolean value");
		boolean a=scan.nextBoolean();
		boolean b=scan.nextBoolean();
		boolean result=isValidInput(a , b);
		System.out.println("Is input valid (true/false):"+a);
		System.out.println("Does input meet a certain condition (true/false):"+b);
		
		
		if(result==true){
			System.out.println("input is valid");
			
		}
		else {
			System.out.println("input is not valid");
		}
		
		
	}

public static boolean isValidInput(boolean a,boolean b)
{
	return a&&b;
}
}




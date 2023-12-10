package com.ArithmeticOperation;
import java.util.Scanner;

public class ArithmeticOperation {
   public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.println("enter two number");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println(subtractNumber( num1,num2));
		System.out.println("enter two number");
	    num1=scan.nextInt();
	    num2=scan.nextInt();
		System.out.println(multiplyNumber( num1, num2));
		System.out.println("enter two number");
		num1=scan.nextInt();
		num2=scan.nextInt();
		System.out.println(divideNumber(num1,num2));
		System.out.println("enter two number");
		num1=scan.nextInt();
		num2=scan.nextInt();
		System.out.println(findRemainderNumber( num1, num2));
		scan.close();
		}
		    public static int subtractNumber(int num1,int num2) {
		    	return  num1- num2;
		    }
		    public static int multiplyNumber(int num1,int num2) {
		    	return  num1* num2;
		    }
		    public static double divideNumber(int num1,int num2) {
		    	return  num1/ num2;
		    }
		    public static int findRemainderNumber(int num1,int num2) {
		    	return  num1% num2;
		    }
		
}



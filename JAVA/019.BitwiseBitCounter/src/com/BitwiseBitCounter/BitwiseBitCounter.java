package com.BitwiseBitCounter;

import java.util.Scanner;

public class BitwiseBitCounter {

	public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int fn=scan.nextInt();
	  System.out.println(countSetBits(fn));
	  scan.close();
	}
	  public static int countSetBits(int a)
	{
	  int integer=a;
	  System.out.println(Integer.toBinaryString(integer));
	  return Integer.bitCount(integer);

	}


}

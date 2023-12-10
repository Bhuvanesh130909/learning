package com.kodnest.arrays.practice;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
	
		int arr[]=new int[3];
		scan.close();
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("enter an element");
			arr[i]=scan.nextInt();
		}
		System.out.println("Array contents are");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}

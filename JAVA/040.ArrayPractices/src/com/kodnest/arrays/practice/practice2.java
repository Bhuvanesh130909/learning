package com.kodnest.arrays.practice;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int arr[]=new int[5];
		scan.close();
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("enter a marks");
			arr[i]=scan.nextInt();
		}
		System.out.println("students mark are");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	

	

}

package com.kodnest.Arrays.Level2;

import java.util.Scanner;

public class rotateArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of arrray");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter how many time rotate");
		int count=scan.nextInt();
		System.out.println("enter the elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int j=0;j<=count;j++)
		{
			int lastElement = arr[arr.length - 1];
			 for (int i = arr.length-2; i>=0; i--)
			 {
	                arr[i+1] = arr[i];
		     }
			 arr[0]=lastElement;
		}
		System.out.println("after clockwise");
		for(int i=0;i<=arr.length-1;i++)
		{
		 System.out.print(arr[i]+" ");
		}
		}
		
		
	}



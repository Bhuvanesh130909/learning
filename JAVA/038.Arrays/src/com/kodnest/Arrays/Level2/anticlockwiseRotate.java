package com.kodnest.Arrays.Level2;

import java.util.Scanner;

public class anticlockwiseRotate {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter array elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("enter how many times rotate");
		int count=scan.nextInt();
		clockwise(arr,count);
	}
	public static void clockwise(int arr[],int count)
	{
		for(int j=1;j<=count;j++)
		{
		int temp=arr[0];
		for(int i=1;i<=arr.length-1;i++)
		{
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
		}
		System.out.println("After anti clock wise");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}

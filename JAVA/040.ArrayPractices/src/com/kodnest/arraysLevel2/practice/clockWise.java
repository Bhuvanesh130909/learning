package com.kodnest.arraysLevel2.practice;

import java.util.Scanner;

public class clockWise {

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
		ClockWiseRotate c1=new ClockWiseRotate ();
		int res=c1.Rotate(arr,count);
		
	}

}

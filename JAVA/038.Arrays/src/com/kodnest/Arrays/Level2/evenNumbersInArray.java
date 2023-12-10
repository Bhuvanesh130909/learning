package com.kodnest.Arrays.Level2;

import java.util.Scanner;

public class evenNumbersInArray {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		for(int i=1;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
	    }
		System.out.println("the even numbers are");
		for(int i=1;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]+" ");
			}
			
		}
		
		
	}

}

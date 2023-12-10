package com.kodnest.Arrays.Level2;

import java.util.Scanner;

public class dividedBy5 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
	    }
		System.out.println("the divided by 5 is");
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%5==0)
			{
				System.out.println(arr[i]+" ");
			}
			
		}

	}

}

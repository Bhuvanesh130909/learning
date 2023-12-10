package com.kodnest.Arrays.Level2;

import java.util.Scanner;

public class linearSearch {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the array length");
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter the elements");
			arr[i]=scan.nextInt();
			
		}
		System.out.println("Enter key to Search");
		int key=scan.nextInt();
		for(int i=0;i<=arr.length-1;i++)
		{
			if(key==arr[i])
			{
				System.out.println("the key present in "+i);
				return;
				
			}
		}
		System.out.println("the key is not present");
		scan.close();
		

	}

}

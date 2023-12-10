package com.kodnest.Arrays.Level2;

import java.util.Scanner;

public class sumOfTwoArrays {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		    System.out.println("enter the length the array 1 length");
		    int arr1[]=new int[scan.nextInt()];
		    System.out.println("enter the length the array 2 length");
		    int arr2[]=new int[scan.nextInt()];
		    for(int i=0;i<=arr1.length-1;i++)
		    {
		    	System.out.println("enter the array elements");
		    	arr1[i]=scan.nextInt();
		    }
		    for(int i=0;i<=arr2.length-1;i++)
		    {
		    	System.out.println("enter the array elements");
		    	arr2[i]=scan.nextInt();
		    }
		    int arr3[]=new int[arr1.length];
		    for(int i=0;i<=arr1.length-1;i++)
		    {
		    arr3[i]=arr1[i]+arr2[i];
		    }
		    for(int i=0;i<=arr1.length-1;i++)
		    {
		    	System.out.print(arr3[i]+" ");
		    }
		    
		    

	}

}

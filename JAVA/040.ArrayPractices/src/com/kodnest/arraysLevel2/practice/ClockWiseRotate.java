package com.kodnest.arraysLevel2.practice;

public class ClockWiseRotate {

	public static int Rotate(int arr[],int count) {
		for(int j=0;j<=count;j++)
		{
			int lastElement = arr[arr.length - 1];
			 for (int i = arr.length-2; i>=0; i--)
			 {
	                arr[i+1] = arr[i];
		     }
			 arr[0]=lastElement;
		}
		return 0;
		
	}

}

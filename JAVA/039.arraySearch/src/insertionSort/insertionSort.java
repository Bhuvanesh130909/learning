package insertionSort;

import java.util.Scanner;

public class insertionSort {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter the elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.print("before sorting"+" ");
		for(int i=0;i<=arr.length-1;i++)
		{
		 System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=1;i<=arr.length-1;i++)
		{
			int item=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>item)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}
		System.out.print("After sorting"+" ");
		for(int i=0;i<=arr.length-1;i++)
		{
		 System.out.print(arr[i]+" ");
		}
	}

}

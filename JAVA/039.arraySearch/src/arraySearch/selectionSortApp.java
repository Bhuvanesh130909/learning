package arraySearch;

import java.util.Scanner;

public class selectionSortApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Array Length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("before changes");
		for(int i=0;i<=arr.length-1;i++)
		{
			
			System.out.print(arr[i]+" ");
		}
		selectionSort2 s1=new selectionSort2();
		s1.selection(arr);
	}

}

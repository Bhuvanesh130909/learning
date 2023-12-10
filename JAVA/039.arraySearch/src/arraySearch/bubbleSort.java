package arraySearch;

import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {
	   Scanner scan=new Scanner (System.in);
	   System.out.println("Enter the array length");
	   int arr[]=new int[scan.nextInt()];
	   System.out.println("Enter the elements ");
	   for(int i=0;i<=arr.length-1;i++)
	   {
		   arr[i]=scan.nextInt();
	   }
	   System.out.println("Before Swap");
	   for(int i=0;i<=arr.length-1;i++)
	   {
	   System.out.print(arr[i]+" ");
	   }
	   System.out.println();
	   int n=arr.length;
	   for(int i=0;i<=n-2;i++)
	   {
		   for(int j=0;j<=n-2-i;j++)
		   {
			   if(arr[j]>arr[j+1])
			   {
			   int temp=arr[j];
			   arr[j]=arr[j+1];
			   arr[j+1]=temp;
			   }
		   }
	   }
	   System.out.println("After Swap");
		   for(int i=0;i<=arr.length-1;i++)
		   {
			  
			   System.out.print(arr[i]+" ");
		   }
	}

}

package arraySearch;

import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) {
	     Scanner scan=new Scanner(System.in);
	     System.out.println("Enter the array length");
	     int arr[]=new int[scan.nextInt()];
	     for(int i=0;i<=arr.length-1;i++)
	     {
	    	 System.out.println("enter the elements");
	    	 arr[i]=scan.nextInt();
	     }
	     System.out.println("enter the key value");
	    int key=scan.nextInt();
	    int low=0;
	    int high=arr.length-1;
	    while(low<=high)
	    {
	    	
	    	int mid=(low+high)/2;
	    	if(key==arr[mid])
	    	{
	    		System.out.println(key+"th key found at "+mid);
	    		return ;
	    	}
	    	else if(key>arr[mid])
	    	{
	    		low=mid+1;
	    	}
	    	else 
	    	{
	    		high=mid-1;
	    		
	    	}
	    }
	    System.out.println("key not Found");
	    

	}

}

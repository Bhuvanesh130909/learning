package com.kodnest.project;

import java.util.Scanner;

public class main {
	public static void main (String []args) {
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
	    while(true)
	    {
	    	System.out.println("ENTER YOUR CHOICE");
	    	System.out.println("PRESS 1----->SEARCHING");
	    	System.out.println("PRESS 2----->SORTING");
	    	System.out.println("PRESS 3----->FINDING MINIMUM OR MAXIMUM");
	    	System.out.println("PRESS ANY OTHER FOR------>TATA BYE BYE");
	    	int choice=scan.nextInt();
	    	kodnestSearchSort kss=new kodnestSearchSort();
	    	switch(choice)
	    	{
	    	case 1:
	    		System.out.println("LINEAR SEARCH--->1 OR BINARY SEARCH--->2");
	    		int choice1=scan.nextInt();
	    		if(choice1==1)
	    		{
	    			System.out.println("ENTER KEY TO SEARCH");
	    			int key=scan.nextInt();
	    			int res=kss.linearSearch(arr, key);
	    			if(res>=0)
	    			{
	    			System.out.println("KEY FOUND @"+" "+res);
	    			}
	    			else {
	    				System.out.println("KEY NOT FOUND");
	    			}
	    		}
	    		else if(choice1==2)
	    		{
	    			kodnestSearchSort k1=new kodnestSearchSort();
	    			k1.bubbleSortAssennding(arr);
	    			System.out.println("ENTER KEY TO SEARCH");
	    			int key=scan.nextInt();
	    			int res=kss.binarySearch(arr, key);
	    			if(res>=0)
	    			{
	    			System.out.println("KEY FOUND @"+" "+res);
	    			}
	    			else {
	    				System.out.println("KEY NOT FOUND");
	    			}
	    		}
	    		else
	    		{
	    			System.out.println("GO TO VASAN EYE CARE AND COMEBACK");
	    		}
	    		break;
	    	case 2:
	    		System.out.println("PRESS 1---->BUBBLE");
	    		System.out.println("PRESS 2---->SELECTION");
	    		System.out.println("PRESS 3---->INSERTION");
	    		int choice2=scan.nextInt();
	    		if(choice2==1)
	    		{
	    			System.out.println("PRESS 1---->FOR ASSENDING ORDER");
	    			System.out.println("PRESS 2---->FOR DECSENDING ORDER");
	    			int choice3=scan.nextInt();
	    			if(choice3==1)
	    				kss.bubbleSortAssennding(arr);
	    			else if(choice3==2)
	    				kss.bubbleSortDescending(arr);
	    			else
	    				System.out.println("GO TO VASAN EYE CARE AND COMR BACK");
	    			
	    		}
	    		else if(choice2==2)
	    		{
	    			System.out.println("PRESS 1---->FOR ASSENDING ORDER");
	    			System.out.println("PRESS 2---->FOR DECSENDING ORDER");
	    			int choice3=scan.nextInt();
	    			if(choice3==1)
	    				kss.selectionSortAscending(arr);
	    			else if(choice3==2)
	    				kss.selectionSortDescending(arr);
	    			else
	    				System.out.println("GO TO VASAN EYE CARE AND COMR BACK");
	    		}
	    		else if(choice2==3)
	    		{
	    			System.out.println("PRESS 1---->FOR ASSENDING ORDER");
	    			System.out.println("PRESS 2---->FOR DECSENDING ORDER");
	    			int choice3=scan.nextInt();
	    			if(choice3==1)
	    				kss.insertionSortAscending(arr);
	    			else if(choice3==2)
	    				kss.insertionSortDescending(arr);
	    			else
	    				System.out.println("GO TO VASAN EYE CARE AND COMR BACK");
	    		}
	    		else
	    		{
	    			System.out.println("GO TO VASAN EYE CARE AND COMEBACK");
	    		}
	    		break;
	    	case 3:
	    		System.out.println("PRESS 1----->FIND MINIMUM");
	    		System.out.println("PRESS 2----->FIND MAXIMUM");
	    		int choice4=scan.nextInt();
	    		if(choice4==1)
	    		{
	    			System.out.println("PRESS 1----->WITH SORTING FIND MINIMUM");
	    			System.out.println("PRESS 2----->WITH OUT SORTING FIND MINIMUM");
	    			int choice5=scan.nextInt();
	    			if(choice5==1)
	    			{
	    			int res=kss.findMinimum(arr);
	    			System.out.println("MINIMUM ELEMENT IS"+" "+res);
	    			}
	    			else if(choice5==2)
	    			{
	    				int res=kss.withoutSortMin(arr);
		    			System.out.println("MINIMUM ELEMENT IS"+" "+res);
	    			}
	    			else
	    			{
	    				System.out.println("GO TO VASAN EYE CARE AND COMR BACK");
	    			}
	    			
	    			
	    		}
	    		else if(choice4==2)
	    		{
	    			System.out.println("PRESS 1------>WITH SORTING FIND MAXIMUM");
	    			System.out.println("PRESS 2------>WITH OUT SORTING FIND MAXIMUM");
	    			int choice6=scan.nextInt();
	    			if(choice6==1) {
	    			int res=kss.findMax(arr);
	    			System.out.println("MAXIMUM ELEMENT IS"+" "+res);
	    			}
	    			else if(choice6==2)
	    			{
	    				int res=kss.withoutSortMax(arr);
		    			System.out.println("MAXIMUM ELEMENT IS"+" "+res);
		    			}
	    			}
	    		   else
	    		   {
	    			System.out.println("GO TO VASAN EYE CARE AND COME BACK");
	    			return;
	    		   }   
	    		   break;
	    	default:
	    		System.out.println("TATA BYE BYE");
	    		return;
	    	
	    	}
	    }
		
	}
}

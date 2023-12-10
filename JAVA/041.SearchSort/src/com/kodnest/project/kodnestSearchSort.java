package com.kodnest.project;

public class kodnestSearchSort {
	int linearSearch(int arr[],int key)
	{
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(key==arr[i])
			{
				 return i;     
			}
		}
		return -1;
	}
//BINARY SEARCH
	int binarySearch(int arr[],int key)
	{
		
		int low=0;
		int high=arr.length-1;	
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key==arr[mid])
			{
				return mid;
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

	return -1;

	}
//BUBBLE SORT ASSENDING
	void bubbleSortAssennding(int arr[])
	{
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-2-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
//BUBBLE SORT DECSENDING
	void bubbleSortDescending(int arr[])

	{
		
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-2-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();


	}
//SELECTION SORT ASCENDING
	void selectionSortAscending(int arr[])

	{
		for(int i=0;i<=arr.length-1;i++)
		{
			int min=arr[i];
			int pos=i;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[j]<min)
				{
					 min=arr[j];
					 pos=j;
					
				}
			}
			int temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
        System.out.println();
	}
//SELECTION SORT DESCENDING
	void selectionSortDescending(int arr[])

	{
    for(int i=0;i<=arr.length-1;i++)
    {
    	int min=arr[i];
    	int pos=i;
    	for(int j=i+1;j<=arr.length-1;j++)
    	{
    		if(arr[j]>min)
    		{
    			min=arr[j];
    			pos=j;
    		}
    	}
    	int temp=arr[i];
    	arr[i]=arr[pos];
    	arr[pos]=temp;
    }
    for(int i=0;i<=arr.length-1;i++)
    {
    	System.out.print(arr[i]+" ");
    }
    System.out.println();
	}
//INSERTION SORT ASCENDING
	void insertionSortAscending(int arr[])

	{
		for(int i=1;i<=arr.length-1;i++)
		{
			int item=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>item) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}	
       System.out.println();
	}
//INSERTION SORT DESCENDING
	void insertionSortDescending(int arr[])

	{
		for(int i=1;i<=arr.length-1;i++)
		{
			int item=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]<item) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}	
       System.out.println();
	}
	//FIND MINIMUM
	int findMinimum(int arr[])

	{
		kodnestSearchSort k1=new kodnestSearchSort();	
		k1.bubbleSortAssennding(arr);
		int min=arr[0];
        return min;
	}
	int withoutSortMin(int arr[])
	{
		int min=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
//FIND MAX
	int findMax(int arr[])

	{
		kodnestSearchSort k1=new kodnestSearchSort();	
		k1.bubbleSortAssennding(arr);
		int max=arr[arr.length-1];
        return max;
	}
	int withoutSortMax(int arr[])
	{
		int min=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>min)
			{
				min=arr[i];
			}
		}
		return min;

	}

}

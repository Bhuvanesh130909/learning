package arraySearch;

public class selectionSort2 {

	public static void selection(int arr[]) {
		for(int i=0;i<=arr.length-2;i++)
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
		System.out.println();
		System.out.println("after changes");
		for(int i=0;i<=arr.length-1;i++)
		{
			
			System.out.print(arr[i]+" ");
		} 

	}

}

package arraySearch;

import java.util.Scanner;

public class linearSearch {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the array length");
		int arr[]=new int[scan.nextInt()];
		boolean flag=false;
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter the elements");
			 arr[i]=scan.nextInt();
		}
		System.out.println("enter the key value");
		int key=scan.nextInt();
		for(int i=0;i<=arr.length-1;i++)
		{
			if(key==arr[i])
			{
				System.out.println("key found at"+i);
				flag=true;
			}
		}
		if(flag==false)
          System.out.println("key not found");
	}

}

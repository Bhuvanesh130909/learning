package StringsBasic;

import java.util.Scanner;

public class reverseStringSplitMethod {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a String");
		String str=scan.nextLine();
		String arr[]=str.split(str, ' ');
		String revsentence="" ;
		String res= new String();
		for(int i=0;i<=arr.length-1;i++)
		{
			
			char arr1[]=arr[i].toCharArray();
			char arr2[]=new char[arr1.length];
			String revword="";
			int k=arr1.length-1;
			for (int j=0;j<=arr.length-1;j++)
			{
				arr2[j]=arr1[k];
				j--;
			}
			
		}
		
		System.out.println(res);

	}

}

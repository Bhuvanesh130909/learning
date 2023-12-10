package StringsBasic;

import java.util.Scanner;

public class anagrams {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a Strings");
		String s1=scan.next();
		String s2=scan.next();
		
		char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
		char[]arr3=new char[s1.length()];
		for(int i=0;i<=arr1.length-1;i++)
		{   
			for(int j=0;j<=arr2.length-1;j++)
			{
				if(arr1[i]==arr2[j]) 
				{
	             arr3[i]=arr1[i];
				}
			}
		}
		String res=new String (arr3);
		
		if(s1.equals(res))
		{
		    System.out.println("its anagram");	
        }
		else 
		    {
			System.out.println("not anagam");
		    }
		}
	
}

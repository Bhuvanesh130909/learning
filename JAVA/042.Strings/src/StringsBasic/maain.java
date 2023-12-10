package StringsBasic;
import java.util.Scanner;

public class maain {
	public static void main(String []args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a String");
		String str=scan.nextLine();
		
		
		String arr[]=str.split(" ");
		String revArray="";
		for(int i=arr.length-1;i>=0;i--)
		{
			char arr1[]=arr[i].toCharArray();
			char arr2[]=new char[arr1.length];
			for(int j=0;j<=arr1.length-1;j++)
			{
				arr2[j]=arr1[j];
			}
			String res= new String(arr2);
			revArray=revArray+res+" ";
			}
		System.out.println(revArray);
	}

}

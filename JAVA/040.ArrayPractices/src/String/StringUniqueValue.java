package String;

import java.util.Scanner;

public class StringUniqueValue {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		findSubstring(str);
	}
	public static void findSubstring(String str)
	{
		String max="";
		for(int i=0;i<=str.length()-1;i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
	         String subString=str.substring(i, j);
	         boolean res =isUnique(subString);
	         if(res==true)
	         {
	        	 if(subString.length()>max.length())
	        	 {
	        		 max=subString;
	        	 }
	         }
			}
		}
		System.out.println(max);
	}
	public static boolean isUnique(String s)
	{
		for(int i=0;i<=s.length()-1;i++)
		{
			for (int j=i+1;j<=s.length()-1;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					return false;
				}
			}
		}
		return true;
	}
}
	



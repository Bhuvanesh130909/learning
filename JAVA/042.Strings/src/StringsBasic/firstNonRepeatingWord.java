package StringsBasic;

import java.util.Scanner;

public class firstNonRepeatingWord {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		String str=scan.nextLine();
		char res=findNonRepeating(str);
		System.out.println(res);
	}
     public static char findNonRepeating(String str)
     {
    	 boolean res;
		for(int i=0;i<=str.length()-1;i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				if(i!=j)
				{
					res=false;
					break;
				}
					
			}
			return str.charAt(i);
		}
		  return '0';
     }
   
}




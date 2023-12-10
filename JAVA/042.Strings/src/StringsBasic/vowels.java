package StringsBasic;

import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("enter the String");
		String str=Scan.nextLine();
		char arr[]=str.toCharArray();
	    int vowels=0;
	    int cc=0;  
	    int dc=0;
	    int sc=0;
	    for(int i=0;i<=arr.length-1;i++)
	    {
	    	if(arr[i]>='a'&&arr[i]<='z')
	    	{
	    	    if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='O'||arr[i]=='I'||arr[i]=='U')
	    	    {
	    	       vowels++;
	    	    }
	    	    else 
	    	    {
	    		  cc++;
	    	    }	
	       }
	    	else if(arr[i]>='0'&&arr[i]<='9')
	    	{
	    		dc++;
	    	}
	    	else
	    	{
	    		sc++;
	    	}
	    	
	    }
       System.out.println(vowels);
       System.out.println(cc);
       System.out.println(dc);
       System.out.println(sc);
	}

}

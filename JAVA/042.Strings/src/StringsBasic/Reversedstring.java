package StringsBasic;

import java.util.Scanner;

public class Reversedstring {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		String str2[]=str.split(" ");
		String temp="";
		for(int i=0;i<=str2.length-1;i++)
		{
			if (i == str2.length - 1) 
                temp = str2[i] + temp; 
            else
                temp = " "+ str2[i] + temp; 
        } 
		
		System.out.println(temp);

	}

}

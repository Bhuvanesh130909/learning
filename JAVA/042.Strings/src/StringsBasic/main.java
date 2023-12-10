package StringsBasic;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("enter one string");
	   String s1=scan.nextLine();
	  char arr[]= s1.toCharArray();
	  for(char x:arr)
	  {
		  System.out.println(x);
	  }
	   

	}

}

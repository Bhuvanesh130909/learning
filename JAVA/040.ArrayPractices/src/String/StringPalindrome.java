package String;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		StringBuffer s2=new StringBuffer(s);
		StringBuffer s3=s2.reverse();
		if(s2.equals(s3))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
	}

}

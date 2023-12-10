package com.palindrome;

public class PalindromeConverter {
	 void convert(int n) {
		 int org=n;
		int res=0;
		while(n>0) {
		int rem=n%10;
		res=res*10+rem;
		n=n/10;
		}
		if(org==res) {
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	
	}
	
    

}

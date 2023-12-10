package com.AnotherMethodInPalindrome;

public class createPalindrome {

	 boolean palindrome(int n)
	 {
		 int original=n;
		 int m=0;
		 while(n>0) {
			 int rem=n%10;
			 m=m*10+rem;
			 n=n/10;
		 }
		 if(original==m) {
			 return true;
		 }
		 else {
			 return false;
		 }
     

	}

}

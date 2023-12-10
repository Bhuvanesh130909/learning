package FibbonociSeriesForOneNumber;

import java.util.Scanner;

public class FibbonociSeriesForOneNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		forOneNumber(n);
	}
	public static void forOneNumber(int n)
	{   
		int num1=0;
		int num2=1;
		if(n==1)
		{
			System.out.println(num1);
		}
		else if(n==2)
		{
			System.out.println(num2);
		}
		else {
		for(int i=3;i<=n;i++)
		{
		
           int next= num1 + num2;
            num1=num2;
            num2= next;
			
		}
		System.out.println(num2);
	}
	}
}
		
	


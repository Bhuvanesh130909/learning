package com.BreakConitinue.icc.cc;

public class BreakContinue {
	public static void main(String[] args) {
		System.out.println("start");
	int i=1;
	bhuvi:while(i<=5)
	{
			int j=1;
			while(j<=5)
			
				{
					System.out.println("love");
					j++;
					break bhuvi ;
			        
				}
			
			System.out.println();
			i++;
		}
		
		
	}

}


package com.amstrongNumber;

public class Ams {
	int CheckDigit(int num) {
		int count=0;
		while(num!=0) {
		num=num/10;
		count++;
		}
		return count;
	}
	
	int LastDigit(int num,int digi) {
		int lastDigit1=0;
		while(num!=0) {
			int lastDigit=num%10;
			int ld=1;
			for(int i=1;i<=digi;i++) {
				ld=ld*lastDigit;	
			}
			lastDigit1=lastDigit1+ld;
			num=num/10;
		}
			return lastDigit1;
	}
}

	
	

		    



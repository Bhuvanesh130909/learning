package countDigitn;

public class countDigitCal {
	int Calculatemul(int num,int digi) {
		int lastvalue=1;
		for(int i=1;i<=digi;i++) 
		{
		lastvalue=lastvalue*num;	
	    }
	    return lastvalue;
	    
	
	}
	int Calculate(int num) {
		  int count=0;
		  while(num!=0) {
			  num=num/10;
			  count++;
			
		  }
		  return count;

	
	
	}

}

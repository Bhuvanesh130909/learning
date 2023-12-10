package countDigitn;

import java.util.Scanner;

public class countDigit {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=scan.nextInt();
		countDigitCal theCounting=new countDigitCal();
		int digi = theCounting.Calculate(num);
		int digi2 = theCounting.Calculatemul(num,digi);
		
		
		System.out.println(digi+digi2);

		}

	
	}



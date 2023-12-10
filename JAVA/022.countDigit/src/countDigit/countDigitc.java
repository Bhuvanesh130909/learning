package countDigit;

import java.util.Scanner;

public class countDigitc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=scan.nextInt();
		checker theCounting=new checker();
		int digi = theCounting.countdigits(num);
		System.out.println("number of digits in "+num+" is "+digi);
		scan.close();
		}
	

}

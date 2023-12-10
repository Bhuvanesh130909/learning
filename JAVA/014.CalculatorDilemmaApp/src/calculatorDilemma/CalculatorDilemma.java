package calculatorDilemma;

import java.util.Scanner;

public class CalculatorDilemma {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter two number");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("select one of the following operators(+,-,*,/)");
	    String res=scan.next() ;
		scan.close();
		operation( num1, num2, res);
	}
		public static void operation(int num1,int num2,String res) {
		switch(res) {
		case "+":
			System.out.println("addition result is"+(num1+num2));
			break;
			case "-":
				System.out.println("subraction result is"+(num1-num2));
				break;
			case "*":
				System.out.println("multiply result is"+(num1*num2));
				break;
			case "/":
				System.out.println("div res is"+(num1+num2));
				break;
			default:
				System.out.println("invalid operator");
			}

		}

}

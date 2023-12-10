package com.Switch;

import java.util.Scanner;

public class SwitchCondition {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the number between 1-7");
		int name=scan.nextInt();
		scan.close();
		
		switch (name)
		{
		
		case 1:
			System.out.println("SANDAY");
		    break;
		
		case 2:
			System.out.println("MONDAY");
		    break;
		case 3:
			System.out.println("TUESDAY");
		    break;
		case 4:
			System.out.println("WEDNESDAY");
			break;
		case 5:
			System.out.println("THURSDAY");
			break;
		case 6:
			System.out.println("FRIDAY");
			break;
		case 7:
			System.out.println("SATUERDAY");
			break;
		default:
			System.out.println("GO TO THE CHECK THE NUMBER AND GO TO CHECK THE EYE CARE");
		}

}
}
	
			
		 

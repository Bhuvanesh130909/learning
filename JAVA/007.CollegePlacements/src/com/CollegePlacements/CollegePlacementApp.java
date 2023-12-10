package com.CollegePlacements;

import java.util.Scanner;

public class CollegePlacementApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a mark");
		int mark=scan.nextInt();
		System.out.println("welcome to kodnest");
		calculateMark(mark);
		scan.close();

	}
	public static void calculateMark(int mark) {
		if(mark>=80)
		{
			System.out.println("You Are Selected");
		}
	}

}


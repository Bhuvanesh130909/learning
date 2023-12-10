package com.journeyCalculator;

import java.util.Scanner;

public class journeyCalculatorApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the speed and time");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		journeycalculator journeyCalculator = new journeycalculator();
		Double distance=journeyCalculator.calculateDistance(speed, time);
		System.out.println(distance);
		scan.close();
		
	}
}


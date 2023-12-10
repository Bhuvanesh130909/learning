package com.TemperatureConversion;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("1. Convert Celsius to Fahrenheit" );
		System.out.println("2. Convert Fahrenheit to Celsius");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your Choice 1 or 2 ");
		int num1=scan.nextInt();
		Scanner res=new Scanner(System.in);
		System.out.println("enter the temperature");
		double num2=res.nextDouble();
		double a=TemperatureConversionApp.celsiusToFahrenheit(num2);
		double b=TemperatureConversionApp.fahrenheitToCelsius(num2);
		scan.close();
		res.close();
		switch(num1) {
		case 1:
			
			System.out.println(a);
			break;
		case 2:
			
			
			System.out.println(b);
			break;
			
			
		}
		
		
		

	}

}


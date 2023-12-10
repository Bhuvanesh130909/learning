package com.TemperatureConverter;

import java.util.Scanner;
public class TemperatureConverter {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the Fahrenheit");
		double fahrenheit=scan.nextDouble();
		TemperatureConverterApp t1 = new TemperatureConverterApp();
	    double res=t1.convertFahrenheitToCelsius(fahrenheit);
		System.out.println(res);
		scan.close();
	}
		

}

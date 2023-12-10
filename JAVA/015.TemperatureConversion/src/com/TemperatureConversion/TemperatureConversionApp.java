package com.TemperatureConversion;

public class TemperatureConversionApp {

	public static double celsiusToFahrenheit(double celsius ){
		
	
		double x= (celsius * 9/5) + 32;
		return x;
		

	}
	public static double fahrenheitToCelsius(double fahrenheit) {
		double y= (fahrenheit-32)*5/9;
		return y;
	}

}

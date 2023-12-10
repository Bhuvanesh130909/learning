package com.TemperatureConverter;

public class TemperatureConverterApp {
	public double convertFahrenheitToCelsius(double fahrenheit){
		double c=(fahrenheit - 32) * 5/9;
		return c;
	}

}

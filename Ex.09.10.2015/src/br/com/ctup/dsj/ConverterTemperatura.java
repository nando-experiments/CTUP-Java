package br.com.ctup.dsj;

public class ConverterTemperatura extends Helpers
{
	private int celsius;

	public int getCelsius() {
		return celsius;
	}

	public void setCelsius(int celsius) {
		this.celsius = celsius;
	}
	
	public String getFahrenheit() {
		return "Fahrenheit = " + this.celsiusToFahrenheit(this.celsius);
	}
}

/*9. Convert Celsius to Fahrenheit
Create a class TemperatureConverter with a method convertToFahrenheit that converts a Celsius value to Fahrenheit.
Explanation: Demonstrates unit conversion logic.
*/

import java.util.*;
class TemperatureConverter
{
	public void convertToFahrenheit(double cel)
	{
		double fah = (cel * 1.8) + 32;
		System.out.print("Fahrenheit: "+fah);
	}
}

public class Q9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the temp in celsius: ");
		double cel = sc.nextInt();
		
		TemperatureConverter temp = new TemperatureConverter();
		temp.convertToFahrenheit(cel);
	}
}
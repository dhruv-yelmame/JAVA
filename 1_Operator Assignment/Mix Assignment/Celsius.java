/*Q7. Write a java program to enter temperature in Fahrenheit and convert to Celsius.
Formula :- cel = (fah - 32) * 5 / 9;
*/
import java.util.Scanner;
public class Celsius
{
 public static void main(String x[])
 {
    Scanner sc = new Scanner(System.in);
	
    System.out.println("enter the temperature in fahrenheit: ");
	double fah = sc.nextDouble();
	
	double cel =(fah-32) * 5/9;
	
	System.out.println("In Celsius: "+cel);
	
	
 }
}
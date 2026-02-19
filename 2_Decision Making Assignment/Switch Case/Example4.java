/* Q4. Write a Java program that takes a temperature value and a choice:
			1. for converting Celsius to Fahrenheit
			2. for converting Fahrenheit to Celsius, Perform the respective conversion using switch-case.
*/

import java.util.*;
public class Example4
{
 public static void main(String x[])
 {
  double fah,cel;
  Scanner sc = new Scanner(System.in);
  System.out.println("enter your choice \n1.Celsius to Fahrenheit \n2.Fahrenheit to Celsius");
  int choice = sc.nextInt();
  
  switch(choice)
  {
   case 1:
    System.out.println("enter the temperature in celsius: ");
	cel = sc.nextDouble();
    fah = (cel * 9 / 5) + 32;
	System.out.println("Fahrenheit: "+fah);
	break;
	
   case 2:
    System.out.println("enter the temperature in fahrenheit: ");
	fah = sc.nextDouble();
	cel =(fah-32) * 5/9;
	System.out.println("Celsius: "+cel);
	break;
	
   default:
    System.out.println("Invalid Selection");
	
  }
 }
}
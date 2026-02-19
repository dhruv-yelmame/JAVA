//Q6. Write a java program to enter length in centimeter and convert into meter and kilometer

import java.util.Scanner;
public class Convert
{
 public static void main(String x[])
 {
    Scanner sc = new Scanner(System.in);
	
    System.out.println("enter the length in centimeter: ");
	float cm = sc.nextFloat();
	
	float meter = cm/100;
	float km = cm/100000;
	
	System.out.println("In meter: "+meter);
	System.out.println("In Kilometer: "+km);
 }
}
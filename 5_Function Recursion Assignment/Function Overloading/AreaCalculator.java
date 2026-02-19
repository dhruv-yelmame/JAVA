/*Q1. Write a Java program to create a class AreaCalculator that uses function overloading to calculate the area of:
a circle using radius,
a rectangle using length and breadth, and
a triangle using base and height.
Use methods:
void area(int r)
void area(int l, int b)
void area(double b, double h)
*/


import java.util.*;
public class AreaCalculator
{
	static void area(int rad)
	{
		double circle = 3.14*rad*rad;
		System.out.println("Circle: "+circle);
	}
	
	static void area(int len, int bred)
	{
		int rectangle = len * bred;
		System.out.println("Rectangle: "+rectangle);
	}
	
	static void area(double base, double height)
	{
		double triangle = 0.5*base*height;
		System.out.println("Triangle: "+triangle);
	}
	public static void main(String x[])
	{
		area(5);
		area(4, 5);
		area(8d, 6d);
	}
}
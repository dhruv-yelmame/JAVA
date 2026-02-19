/*Q5. Write a Java program with class DistanceCalculator that contains overloaded distance() methods to calculate:
distance = speed × time (integer type),
distance = initial velocity × time + 0.5 × acceleration × time² (double type).
*/

import java.util.*;
public class DistanceCalculator
{
	static void distance(int speed, int time)
	{
		int distance = speed * time;
		System.out.print("Distance(integer type): "+distance+"\t");
	}
	
	static void distance(double velocity, int time, double accer)
	{
		double distance = velocity * time + 0.5 * accer * (time*time);
		System.out.print("Distance(double type): "+distance+"\t");
	}
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the speed: ");
		int speed = sc.nextInt();
		System.out.print("enter the time: ");
		int time = sc.nextInt();
		
		System.out.print("enter the initial velocity: ");
		double velocity = sc.nextDouble();
		System.out.print("enter the acceleration: ");
		double accer = sc.nextDouble();
		
		distance(speed, time);
		distance((double)velocity, time, (double)accer);
	}
}
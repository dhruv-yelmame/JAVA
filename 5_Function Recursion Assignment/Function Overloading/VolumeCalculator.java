/*Q4. Write a Java class VolumeCalculator with overloaded methods named volume() to calculate:
volume of a cube (using side),
volume of a cuboid (using length, breadth, height),
volume of a cylinder (using radius, height).
Hint: Apply formulas :
Cube → side³
Cuboid → l×b×h
Cylinder → 3.14×r×r×h

*/


import java.util.*;
public class VolumeCalculator
{
	static void volume(int side)
	{
		int cube = side*side*side;
		System.out.print("volume of a cube: "+cube+"\t");
	}
	
	static void volume(int length, int breadth, int height)
	{
		int cuboid = length * breadth * height;
		System.out.print("volume of a cuboid: "+cuboid+"\t");
	}
	
	static void volume(double radius, double cylHegh)
	{
		double cylinder = 3.14 * radius * radius * cylHegh;
		System.out.print("volume of a cylinder: "+cylinder+"\t");
	}
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the side: ");
		int side = sc.nextInt();
		
		System.out.print("enter the length: ");
		int length = sc.nextInt();
		System.out.print("enter the breadth: ");
		int breadth = sc.nextInt();
		System.out.print("enter the height: ");
		int height = sc.nextInt();
		
		System.out.print("enter the radius: ");
		double radius = sc.nextDouble();
		System.out.print("enter the height of cylinder: ");
		double cylHegh = sc.nextDouble();
		
		
		volume(side);
		volume(length, breadth, height);
		volume(radius, cylHegh);
	}
}
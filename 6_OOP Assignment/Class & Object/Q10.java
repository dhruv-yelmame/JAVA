/*10. Find the Area of a Circle
Create a class CircleArea with a method findArea that calculates the area given the radius.
*/

import java.util.*;
class CircleArea
{
	public void findArea(int rad)
	{
		double area = 3.14*rad*rad;
		System.out.print("Area: "+area);
	}
}

public class Q10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the radius: ");
		int rad = sc.nextInt();
		
		CircleArea a = new CircleArea();
		a.findArea(rad);		
	}
}
/*Q2. Scenario:
A geometry tool calculates the area of either Circle or Rectangle.
 You must use one parent class 'Shape' so that the main code can switch shapes easily (loose coupling).
Requirement:
Parent: Shape
Child classes: Circle, Rectangle
Using parent reference, calculate area based on user input.
Input : Shape: Circle 
Radius : 5
Output : Area of Circle: 78.5

Explanation:
Write code where:
Shape s = new Circle();
Changing between shapes should not require changing the main logic, achieving loose coupling.
*/

class Shape
{
	double radius, width, length;
	
	void setRad(double radius)
	{this.radius=radius;
	}
	void setWidth(double width)
	{this.width=width;
	}
	void setLength(double length)
	{this.length=length;
	}
	
	double getResult()
	{
		return 0;
	}
}

class Circle extends Shape
{
	double getResult()
	{
		double area = (double)radius*radius*3.14;
		return area;
	}
}

class Rectangle extends Shape
{
	double getResult()
	{
		double area = (double)length*width;
		return area;
	}
}

public class Q17
{
	public static void main(String x[])
	{
		Shape s = new Circle();
		s.setRad(5);
		double res = s.getResult();
		System.out.println("Area of Circle: "+res);
		
		s = new Rectangle();
		s.setLength(4.5);
		s.setWidth(5.4);
		res = s.getResult();
		System.out.println("Area of Rectangle: "+res);
	}
}
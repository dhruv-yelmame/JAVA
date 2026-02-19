/*Q3. Shape Area & Perimeter Calculator
Concepts: Abstract class, method overriding
Operations:
1. Abstract class Shape
2. Abstract methods:
	calculateArea()
	calculatePerimeter()
3. Classes:
	Rectangle
	Circle
4. Perform calculations and display results
*/

abstract class Shape
{
	protected int radius;
	protected float pi;
	protected int length;
	protected int width;
	
	
	abstract double calculateArea();
	
	abstract double calculatePerimeter();
	
}

class Rectangle extends Shape
{
	void setRectangle(int length, int width)
	{
		this.length=length;
		this.width=width;
	}
	
	double calculateArea()
	{
		return length*width;
	}
	
	double calculatePerimeter()
	{
		return 2*(length+width);
	}
}

class Circle extends Shape
{
	void setCircle(int radius, float pi)
	{
		this.radius=radius;
		this.pi=pi;
	}
	
	double calculateArea()
	{
		return pi*radius*radius;
	}
	
	double calculatePerimeter()
	{
		return 2*pi*radius;
	}
}

public class ShapeAreaPerimeter
{
	public static void main(String x[])
	{
		Shape s = null;
		s = new Rectangle();
		((Rectangle)s).setRectangle(12,4);
		System.out.println("Rectangle Area: "+s.calculateArea()+"\t"+"Rectangle Perimeter: "+s.calculatePerimeter());
		
		s = new Circle();
		((Circle)s).setCircle(4,3.14f);
		System.out.println("Circle Area: "+s.calculateArea()+"\t"+"Circle Perimeter: "+s.calculatePerimeter());

	}
}
/*2. Implement a Calculator
Create a class Calculator with methods add, subtract, multiply, and divide for two numbers. Call them from the main method and print results.
Explanation: Teaches basic arithmetic operations using methods.
*/


class Calculator
{
	public void add(int a, int b)
	{
		int c = a+b;
		System.out.println("Addition: "+c);
	}
	
	public void subtract(int a, int b)
	{
		int c = a-b;
		System.out.println("Substraction: "+c);
	}
	
	public void multiply(int a, int b)
	{
		int c = a*b;
		System.out.println("Multiplication: "+c);
	}
	
	public void divide(int a, int b)
	{
		int c = a/b;
		System.out.println("Division: "+c);
	}
}

public class Q2
{
	public static void main(String x[])
	{
		Calculator c = new Calculator();
		c.add(1,5);
		c.subtract(5,4);
		c.multiply(4,8);
		c.divide(2,6);
	}
}
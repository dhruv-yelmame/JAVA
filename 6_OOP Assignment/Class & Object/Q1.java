/*1. Create a Class and Print a Message
Create a class HelloWorld with a method printMessage that prints "Hello, World!" when called.
Explanation: Helps understand class and method creation.
*/


class HelloWorld
{
	public void printMessage()
	{
		System.out.print("Hello, World!");
	}
}

public class Q1
{
	public static void main(String x[])
	{
		HelloWorld h = new HelloWorld();
		h.printMessage();
	}
}
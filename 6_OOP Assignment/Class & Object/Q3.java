/*3. Compare Two Numbers
Create a class NumberComparison with a method compare that checks if two numbers are equal, greater, or less.
Explanation: Introduces conditional statements in a method.
*/

import java.util.*;
class NumberComparison
{
	public void compare(int a, int b)
	{
		if(a==b)
			System.out.print("Equal");
		else if(a>b)
			System.out.print("Greater");
		else
			System.out.print("Less");
	}
}

public class Q3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first number: ");
		int a = sc.nextInt();
		System.out.print("enter the second number: ");
		int b = sc.nextInt();
		
		NumberComparison n = new NumberComparison();
		n.compare(a, b);
	}
}
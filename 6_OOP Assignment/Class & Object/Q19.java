/*19. Find GCD of Two Numbers
Create a class GCDCalculator with a method findGCD to compute the greatest common divisor of two numbers.
Explanation: Introduces loops and mathematical relationships.
*/

import java.util.*;
class GCDCalculator
{
	public void findGCD(int a, int b)
	{
		while(b!=0)
		{
			int rem = a%b;
			a=b;
			b=rem;
		}
		System.out.println("GCD = "+a);
	}
}

public class Q19
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first number: ");
		int a = sc.nextInt();
		System.out.print("enter the second number: ");
		int b = sc.nextInt();
		
		GCDCalculator gcd = new GCDCalculator();
		gcd.findGCD(a, b);
	}
}
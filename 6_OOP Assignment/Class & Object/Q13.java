/*13. Find Power of a Number
Create a class PowerCalculator with a method power that calculates base raised to an exponent.
Explanation: Demonstrates looping or recursion.
*/

import java.util.*;
class PowerCalculator
{
	public int power(int n, int p)
	{
		int power=1;
		for(int i=1; i<=p; i++)
		{
			power = power*n;
		}
		return power;
		
	}
}

public class Q13
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		System.out.print("enter the power: ");
		int p = sc.nextInt();
		
		PowerCalculator pow = new PowerCalculator();
		int res = pow.power(n,p);
		System.out.print("Power of Number: "+res);
	}
}
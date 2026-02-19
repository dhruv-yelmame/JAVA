/*20. Calculate Sum of 1 to Nth Natural Numbers
Create a class NaturalNumberSum with a method calculateSum that computes the sum of the 1 to Nth natural numbers.
Explanation: Reinforces loops and arithmetic series formula.
*/


import java.util.*;
class NaturalNumberSum
{
	public int calculateSum(int n)
	{
		int sum=0;
		for(int i=1; i<=n; i++)
		{	
			sum+=i;
		}
		return sum;
	}
}

public class Q20
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		NaturalNumberSum ns = new NaturalNumberSum();
		int res = ns.calculateSum(n);
		System.out.print("Sum: "+res);
	}
}

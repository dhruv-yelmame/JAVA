/*12. Find Factorial of a Number
Create a class FactorialCalculator with a method findFactorial to compute the factorial of a number.
Explanation: Focuses on iterative or recursive logic.
*/

import java.util.*;
class FactorialCalculator
{
	public int findFactorial(int n)
	{
		int fact=1;
		for(int i=1; i<=n; i++)
		{	
			fact = fact*i;
		}
		return fact;
	}
}

public class Q12
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		FactorialCalculator f = new FactorialCalculator();
		int res =f.findFactorial(n);
		System.out.print("Factorial Number: "+res);
	}
}
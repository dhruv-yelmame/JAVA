/*17. Calculate Sum of Digits
Create a class DigitSumCalculator with a method calculateSum that computes the sum of digits of a number.
Explanation: Practices loops for digit extraction.
*/


import java.util.*;
class DigitSumCalculator
{
	public int calculateSum(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int rem = n%10;
			sum+=rem;
			n = n/10;
		}
		return sum;
	}
}

public class Q17
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		DigitSumCalculator d = new DigitSumCalculator();
		int res = d.calculateSum(n);
		System.out.print("Sum of Digits: "+res);
	}
}
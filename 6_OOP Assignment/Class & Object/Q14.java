/*14. Check for Prime Numbers
Create a class PrimeChecker with a method isPrime to check if a number is prime.
Explanation: Introduces number theory logic.
*/

import java.util.*;
class PrimeChecker
{
	public void isPrime(int n)
	{
		int count=0;
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==2)
			System.out.print("Prime Number");
		else
			System.out.print("Not Prime Number");
	}
}

public class Q14
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		PrimeChecker p = new PrimeChecker();
		p.isPrime(n);
	}
}
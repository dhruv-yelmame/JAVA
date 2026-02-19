/*11. Reverse a Number
Create a class NumberReverser with a method reverse that reverses a given integer number.
Explanation: Covers basic loops for number manipulation.
*/

import java.util.*;
class NumberReverser
{
	public int reverse(int n)
	{
		int rev=0;
		while(n!=0)
		{
			int rem=n%10; 
			rev = rev*10+rem;
			n=n/10;
		}	
		return rev;
	}
}

public class Q11
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		NumberReverser r = new NumberReverser();
		int res = r.reverse(n);
		System.out.print("Reverse Number: "+res);
	}
}
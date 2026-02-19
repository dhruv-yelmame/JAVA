/*4. Check Even or Odd
Create a class NumberChecker with a method isEven that checks if a number is even or odd.
Explanation: Focuses on using modulus operator in logic.
*/


import java.util.*;
class NumberChecker
{
	public void isEven(int n)
	{
		String msg = (n%2==0)?"Even":"Odd";
		System.out.print(msg);
	}
}

public class Q4
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		NumberChecker c = new NumberChecker();
		c.isEven(n);
	}
}
/*15. Swap Two Numbers
Create a class Swapper with a method swap that swaps the values of two numbers without using a third variable.
Explanation: Covers mathematical operations for swapping.
*/

import java.util.*;
class Swapper
{
	public void swap(int a, int b)
	{
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swap: "+a+","+b);
	}
}

public class Q15
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first number: ");
		int a = sc.nextInt();
		System.out.print("enter the second number: ");
		int b = sc.nextInt();
		System.out.println("Before Swap: "+a+","+b);
		Swapper s = new Swapper();
		s.swap(a,b);
	}
}
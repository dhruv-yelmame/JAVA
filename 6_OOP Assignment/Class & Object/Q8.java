/*8. Find Square of a Number
Create a class SquareFinder with a method square that calculates the square of a number.
Explanation: Covers single-parameter logic in methods.
*/

import java.util.*;
class SquareFinder
{
	public void square(int n)
	{
		int square = n*n;
		System.out.print("Square is "+square);
	}
}

public class Q8
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		SquareFinder sq = new SquareFinder();
		sq.square(n);
	}
}
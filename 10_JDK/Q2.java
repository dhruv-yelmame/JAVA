/*Q2. Write a Java program to store integers in an array and 
calculate the sum of all elements using Lambda Expression.
Input:
 Array Elements: 5 10 15 20
*/

import java.util.*;
interface S
{
	int show(int a[]);
}

public class Q2
{
	public static void main(String x[])
	{
		int a[] = {5, 10, 15, 20};
		S s = (arr) ->
			{
				int sum=0;
				for(int i=0; i<a.length; i++)
				{
					sum += arr[i];
				}
				return sum;
		};
		int res = s.show(a);
		System.out.println("Sum :"+res);
		
	}
}
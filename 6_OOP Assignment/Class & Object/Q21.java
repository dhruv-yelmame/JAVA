/*1.Find the Maximum Value in an Array
 Write a class with a method to find and return the maximum value in an integer array.
 Explanation: Learn how to traverse an array and find the largest element using methods.
*/

import java.util.*;
class MaximumElement
{
	public int show(int a[])
	{
		int max=Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
	}
}

public class Q21
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		MaximumElement m = new MaximumElement();
		System.out.print("enter the element in arr: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		int res = m.show(a);
		System.out.print("Largest Element: "+res);
	}
}
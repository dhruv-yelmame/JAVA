/*9.Check if an Array is Sorted
 Write a class to implement a method to check whether an integer array is sorted in ascending order.
 Explanation: Understand conditions and comparisons in loops.
*/

import java.util.*;
class ArraySort
{
	public void show(int a[])
	{
		boolean flag = true;
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i]>a[i+1])
			{
				flag=false;
				break;
			}
		}
		
		if(flag)
			System.out.print("Array is sorted");
		else
			System.out.print("Array is not sorted");
	}
}

public class Q29
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.print("enter the elements in array: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		ArraySort as = new ArraySort();
		
		as.show(a);
		
	}
}
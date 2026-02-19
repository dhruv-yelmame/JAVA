/*7.Find the Second Largest Element in an Array
 Write a class to write a method to find the second largest element in an integer array.
 Explanation: Practice logic building and conditional checks.
*/


import java.util.*;
class SecondLargest
{
	public int show(int a[])
	{
		int max=Integer.MIN_VALUE, smax=Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				smax=max;
				max=a[i];
			}
			else
			{
				if(a[i]!=max && a[i]>smax)
				{
					smax=a[i];
				}
			}
		}
		return smax;
	}
}

public class Q27
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.print("enter the element in array: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		SecondLargest sl = new SecondLargest();
		int res = sl.show(a);
		System.out.print("Second Largest: "+res);
	}
} 
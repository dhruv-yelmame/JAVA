/*1. Average of Elements
Concept: First compute the sum, then divide by the number of elements.
 arr = [10, 20, 30, 40, 50]
Average of array elements: 30.0
*/

import java.util.*;
public class Q1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.print("enter the values of array: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum+=a[i];
		}
		float avg = sum/size;
		System.out.print("Average of array elements: "+avg);
	}
}
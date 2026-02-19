/*2.Calculate the Average of an Array
 Write a class to create a method to calculate the average of elements in an integer array.
 Explanation: Practice basic arithmetic operations and array traversal.
*/

import java.util.*;
class AverageArray
{
	public int show(int a[])
	{
		int sum = 0;
		for(int i=0; i<a.length; i++)
		{
			sum+=a[i];
		}
		int avg = sum/a.length;
		return avg;
	}
}

public class Q22
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.print("enter the elements: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		AverageArray avg = new AverageArray();
		
		int res = avg.show(a);
		System.out.print("Average of Array: "+res);
		
	}
}
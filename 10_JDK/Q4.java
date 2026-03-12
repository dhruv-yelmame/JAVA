/*Q4.Write a Java program that stores integer values in an array and finds the maximum element using Lambda Expression.
Input:
Array Elements: 12 45 23 67 34
Output:
Maximum Element = 67
*/

import java.util.*;
interface M
{
	int show(int a[]);
}
public class Q4
{
	public static void main(String x[])
	{
		int a[] = {12, 45, 23, 67, 34};
		M m = (int[] arr) -> 
			{
				int max=arr[0];
				for(int i=0; i<arr.length; i++)
				{
					if(a[i] > max)
						max=a[i];
				}
				return max;
		};
		
		System.out.print("Max Element: "+m.show(a));
	}
}
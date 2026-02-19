/*Q1. Write a Java program to find the second largest number in an array using a function.
 Example Input:
 arr = {12, 45, 23, 51, 19, 8}
 Output:
 Second Largest: 45
*/

import java.util.*;
public class Q1
{
	public static int show(int a[], int index, int fmax, int smax)
	{
		//base case
		if(index==a.length)
			return smax;
			
			if(a[index]>fmax)
			{
				smax=fmax;
				fmax=a[index];
			}
			else
			{
				if(a[index]!=fmax && a[index]>smax)
				{
					smax=a[index];
				}
			}
		
		return show(a, index+1, fmax, smax);//call
		
	}
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[6];
		System.out.print("enter the values in array: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		int res = show(a, 0, 0, 0);
		System.out.print("Second max: "+res);
	}
}
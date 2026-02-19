/*Q6. Write a java program to give an array, find the second largest element.
Input : Array = {12, 35, 1, 10, 34, 1}
Output : Second largest = 34
*/

import java.util.*;
public class Question11
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		int i;
		System.out.println("enter the values of array: ");
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		int max=a[0], smax=a[0];
		for(i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				smax = max;
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
		
		System.out.println("Second Max: "+smax);

	}
}
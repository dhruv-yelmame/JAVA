/*6.Sort an Array (Bubble Sort)
 Write a class to implement a method to sort an integer array using bubble sort.
 Explanation: Learn basic sorting algorithms and their implementation.
*/

import java.util.*;
class ArraySort
{
	public void show(int a[])
	{
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=0; j<(a.length-1)-i; j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

public class Q26
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
		
		ArraySort s = new ArraySort();
		s.show(a);
	}
}
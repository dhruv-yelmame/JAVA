/*10.Merge Two Integer Arrays
Write a class to write a method to merge two integer arrays into a single array.
 Explanation: Practice combining arrays and managing their sizes.
*/

import java.util.*;
class MergeArray
{
	public void show(int a[], int b[], int c[])
	{
		int k=0;
		for(int i=0; i<a.length; i++)
		{
			c[k++]=a[i];
		}
		for(int i=0; i<b.length; i++)
		{	
			c[k++]=b[i];
		}
		for(int i=0; i<c.length; i++)
		{
			System.out.print(c[i]+" ");
		}
		
	}
}

public class Q30
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		int b[] = new int[3];
		int c[] = new int[a.length+b.length];
		System.out.print("enter the elements in arr1: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("enter the elements in arr2: ");
		for(int i=0; i<b.length; i++)
		{
			b[i]=sc.nextInt();
		}
		
		MergeArray ma = new MergeArray();
		
		ma.show(a, b, c);
	}
}
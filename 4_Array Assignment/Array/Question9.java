/*Q4. Write a java program to copy one array to another array.
Input:
Array1 = {5, 10, 15, 20}
Output:
Array2 = {5, 10, 15, 20}
*/

import java.util.*;
public class Question9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		int i;
		System.out.println("enter the values of array: ");
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Array1: ");
		for(i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		int b[] = new int[a.length];
		for(i=0; i<a.length; i++)
		{
			b[i]=a[i];
		}
		
		System.out.print("Array2: ");
		for(i=0; i<b.length; i++)
		{
			System.out.print(b[i]+" ");
		}
		
	}
}
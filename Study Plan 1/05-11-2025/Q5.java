/*5.Remove Duplicate Elements
Concept: Compare each element with others and remove if already seen.
 Use Case: Eliminate duplicate entries in a list.
Input : arr = [2, 5, 3, 2, 8, 5, 6]
Array after removing duplicates: [2, 5, 3, 8, 6]
*/


import java.util.*;
public class Q5
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array1: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.print("enter the values of array: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; i<a.length; j++)
			{
				if(a[i]==a[j])
				{
					continue;
				}
			}
		}
		
		System.out.print("Array after removing duplicates: ");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
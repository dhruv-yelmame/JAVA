/*Q1. Write a java program to search an element in an array , its element found or not.
Input:
 Array = {10, 20, 30, 40, 50}
 Element to search = 30
Output:
 Element 30 found at index 2
*/

import java.util.*;
public class Question6
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		int i, index=-1;
		System.out.println("enter the values of array: ");
		
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter the key for search: ");
		int skey = sc.nextInt();
		
		for(i=0; i<a.length; i++)
		{
			if(a[i]==skey)
			{
				index=i;
			}
		}
		
		if(index!=-1)
		{
			System.out.println("Element "+skey+" found at index "+index);
		}
		else
		{
			System.out.println("Element "+skey+" not found");
		}
	}
}
/*Q20. Given two sorted arrays, the task is to merge them in a sorted manner.
Examples: 
Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8} 
Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}
Input: arr1[] = { 5, 8, 9}, arr2[] = {4, 7, 8} 
Output: arr3[] = {4, 5, 7, 8, 8, 9} 
Your Task: you have to create class name as MergeSort with constructor and methods 
MergeSort(int a[],int []): this function is used for accept two array as parameter 
int[] getMergedArray(): this function is used for return merged array
*/

import java.util.*;
class MergeSort
{
	private int []a;
	private int []b;
	public void setArray(int a[], int b[])
	{
		this.a=a;
		this.b=b;
	}
	
	public int[] getMergedArray()
	{
		int c[] = new int[a.length+b.length];
		int k=0;
		for(int i=0; i<a.length; i++)
			c[k++]=a[i];
		
		for(int i=0; i<b.length; i++)
			c[k++]=b[i];
			
		//sort logics
		for(int i=0; i<c.length; i++)
		{
			for(int j=i+1; j<c.length; j++)
			{
				if(c[i]>c[j])
				{
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		
		return c;
		
	}
}

public class Q20
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[4];
		int b[] = new int[4];
		System.out.print("enter the elements in array 1: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("enter the elements in array 2: ");
		for(int i=0; i<b.length; i++)
		{
			b[i]=sc.nextInt();
		}
		
		MergeSort ms = new MergeSort();
		ms.setArray(a,b);
		int res [] = ms.getMergedArray();
		
		System.out.print("Merge Array: ");
		for(int i=0; i<res.length; i++)
			System.out.print(res[i]+" ");
	}
}
/*4.Reverse an Array
 Write a class to write a method to reverse the elements of an integer array.
 Explanation: Work with array indexing and swapping.
*/

import java.util.*;
class ReverseArray
{
	public void show(int a[])
	{
		int start=0, end=a.length-1;
		for(int i=0; i<a.length/2; i++)
		{
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		
		System.out.print("Reverse Array: ");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

public class Q24
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
		ReverseArray r = new ReverseArray();
		r.show(a);
	}
}
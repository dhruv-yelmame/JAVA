/*Q2. Write a java program to display the reverse array.
Input : Array = {1, 2, 3, 4, 5}
Output : Reverse array = {5, 4, 3, 2, 1}
Explanation:
The last element becomes the first, and the first becomes the last by traversing from the end to the start.
*/

import java.util.*;
public class Question7
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int a[] = new int[size];
		int i;
		System.out.println("Enter the values of array: ");
		
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Original Array:");
		for(i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("Reverse Array:");
	
		int start=0, end = a.length-1;
		for(i=0; i<a.length/2; i++)
		{
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		
		for(i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
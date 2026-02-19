/*Q4.Write a Java program to check if two arrays are equal (same elements in same order) using a function.
Example Input:
a = {1, 2, 3, 4}
b = {1, 2, 3, 4}
Output:
Arrays are equal.
*/



import java.util.*;
public class Q4
{
	static int count=0;
	public static void show(int a[], int b[], int index)
	{		
		if(index==a.length)
			return;
			
		if(a[index]==b[index])
		{
			count++;
		}

		show(a, b, index+1);
	}
		
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		int b[] = new int[size];
		System.out.print("enter the values in array 1: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("enter the values in array 2: ");
		for(int i=0; i<a.length; i++)
		{
			b[i]=sc.nextInt();
		}
		
		show(a, b, 0);
		
		if(count == a.length)
			System.out.print("Arrays are equal");
		else
			System.out.print("Arrays are not equal");
		
	}
}
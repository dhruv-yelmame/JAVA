/*Q3. Write a Java program to reverse an array using a function.
Example Input:
arr = {5, 10, 15, 20, 25}
Output:
Reversed Array: 25 20 15 10 5
*/


import java.util.*;
public class Q3
{
	public static void show(int a[], int start, int end)
	{		
		if(start>=end)
			return;
		
		int temp = a[start];
		a[start] = a[end]; 
		a[end] = temp;
		
		show(a, start+1, end-1);
	}
		
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.print("enter the values in array: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		show(a, 0, a.length-1);
		
		System.out.print("Reversed Arrray: ");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
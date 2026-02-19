/*4. Merge Two Arrays
Concept: Append elements of the second array to the first or create a new array to store all.
 Use Case: Combine product lists, user logs, etc.
 Input Array
array1 = [1, 3, 5]
array2 = [2, 4, 6, 8]
Merged Array: [1, 3, 5, 2, 4, 6, 8]
*/


import java.util.*;
public class Q4
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array1: ");
		int size1 = sc.nextInt();
		System.out.print("enter the size of array2: ");
		int size2 = sc.nextInt();
		int a[] = new int[size1];
		int b[] = new int[size2];
		int c[] = new int[a.length+b.length];
		System.out.print("enter the values of array1: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("enter the values of array2: ");
		for(int i=0; i<b.length; i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i = 0; i < a.length; i++)
		{
			c[i] = a[i];
		}
		for(int i = 0, j = a.length; i < b.length; i++, j++)
		{
			c[j] = b[i];
		}
		
		System.out.print("Merge array: ");
		for(int i=0; i<c.length; i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}
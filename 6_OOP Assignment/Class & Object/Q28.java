/*8.Shift Array Elements to the Left
 Write a class to create a method to shift all elements in an array one position to the left.
 Explanation: Work with array indexes and element reassignment.
*/


import java.util.*;
class ShiftArray
{
	public void show(int a[], int index)
	{
		int c[] = new int[a.length];
		int k=0;
		for(int i=index; i<a.length; i++)
		{
			c[k++]=a[i];
		}
		
		for(int i=0; i<index; i++)
		{
			c[k++]=a[i];
		}
		
		System.out.print("Result Array: ");
		for(int i=0; i<c.length; i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}

public class Q28
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.print("enter the element in array: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.print("enter the element to shift: ");
		int index = sc.nextInt();
		ShiftArray sa = new ShiftArray();
		sa.show(a, index);
	}
}
/*Q7. Create an overloaded function analyze() —
Version 1: accepts one array and displays all unique (non-repeating) elements.
Version 2: accepts two arrays and prints all common elements between them.
Input 1: [2, 3, 2, 4, 5] → Output: Unique: 3, 4, 5  
Input 2: [1, 2, 3], [3, 4, 5] → Output: Common: 3
*/


import java.util.*;
public class ArrayCommon
{
	static void analyze(int a[])
	{
		for(int i = 0; i < a.length; i++)
		{
			int count = 0;
			for(int j = 0; j < a.length; j++)
			{
				if(a[i]==a[j])
					count++;
			}
			
			if(count==1)
				System.out.print(a[i] + " ");
		}
	}
	
	static void analyze(int b[], int c[])
	{
		for(int i = 0; i < b.length; i++)
		{
			for(int j = 0; j < c.length; j++)
			{
				if(b[i]==c[j])
				{
					System.out.print(b[i]+" ");
					break;
				}
			}
			
		}
	}


	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array version 1: ");
		int size1 = sc.nextInt();
		int a[] = new int[size1];
		System.out.print("enter the element arr 1: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		System.out.println("enter the two size of array version 2: ");
		int size2 = sc.nextInt();
		int size3 = sc.nextInt();
		int b[] = new int[size2];
		int c[] = new int[size3];
		System.out.print("enter the element arr 1: ");
		for(int i=0; i<b.length; i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.print("enter the element arr 2: ");
		for(int i=0; i<c.length; i++)
		{
			c[i]=sc.nextInt();
		}
		
		analyze(a);
		analyze(b, c);
	}
}
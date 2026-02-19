/*Q10. Overload operation() —
Version 1: accepts one array and prints all distinct elements (self-union).
Version 2: accepts two arrays and prints:
All elements in the intersection, and
All elements in the union.
Input 1: [1,2,2,3,4] → Output: Distinct Elements = [1,2,3,4]
Input 2: [1,2,3], [2,3,4] → Output: Intersection = [2,3], Union = [1,2,3,4]
*/



import java.util.*;
public class ArrayDistinct
{
	static void operation(int a[])
	{
		boolean visit[] = new boolean[a.length];
		for(int i=0; i<a.length; i++)
		{
			if(visit[i])
				continue;
			
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				visit[j]=true;
			}
		System.out.print(a[i]+" ");
		}
	}
	

	static void operation(int b[], int c[])
	{
		
		//intersection logics
		System.out.print("Intersection: ");
		for(int i=0; i<b.length; i++)
		{
			for(int j=0; j<c.length; j++)
			{
				if(b[i]==c[j])
				{
					System.out.print(b[i]+" ");
				}
			}
		}
		
		
		//union logic
		int d[] = new int[b.length + c.length];
		int k = 0;

		// copy both arrays
		for(int i=0; i<b.length; i++)
			d[k++] = b[i];
		for(int i=0; i<c.length; i++)
			d[k++] = c[i];

		System.out.print("\nUnion: ");
		boolean visit[] = new boolean[d.length];
		for(int i=0; i<d.length; i++)
		{
			if(visit[i])
				continue;
			
			for(int j=i+1; j<d.length; j++)
			{
				if(d[i]==d[j])
				{
					visit[j]=true;
				}
			}
			System.out.print(d[i]+" ");
		}
	}
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array version 1: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.print("enter the elements in arr: ");
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
		
		
		operation(a);
		operation(b, c);
	}
}
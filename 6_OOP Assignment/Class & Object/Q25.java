/*5. Find Duplicates in an Array
 Write a class to create a method to identify and display duplicate elements in an integer array.
 Explanation: Practice nested loops to compare elements.
*/

import java.util.*;
class DuplicatesArray
{
	public void show(int a[])
	{
		boolean visit[] = new boolean[a.length];
		for(int i=0; i<a.length; i++)
		{
			if(visit[i])
				continue;
			
			int count=1;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					count++;
					visit[j]=true;
				}
			}
			
			if(count>1)
				System.out.print(a[i]+" ");
			
			visit[i] = true;
		}
	}
}

public class Q25
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[6];
		System.out.print("enter the elements in array: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		DuplicatesArray d = new DuplicatesArray();
		d.show(a);
	}
}
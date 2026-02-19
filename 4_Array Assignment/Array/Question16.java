/*Q1. Write a java program to count the frequency of each element in a given array.
//for sorted array only && if you work on unsorted array use- Arrays.sort(a);
Input:
Array = {1, 2, 2, 3, 3, 3, 4}
Output:
 1 → 1 time
 2 → 2 times
 3 → 3 times
 4 → 1 time
*/

import java.util.*;
public class Question16
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of arr: ");
		int size1 = sc.nextInt();
		int a[] = new int[size1];
		   
		System.out.print("enter the elements in arr 1: ");
		for(int i=0; i<a.length; i++)
		{
		   a[i]=sc.nextInt();
		}
		  
		boolean visit[] = new boolean[a.length];
		for(int i=0; i<a.length; i++)
	    {
			if(visit[i])
			 continue;
				
			int count=0;
		   for(int j=0; j<a.length; j++)
		   {
			   if(a[i]==a[j])
			   {
					count++;
					visit[j]=true;
				}
			}   
		System.out.println(a[i]+"-->"+count);	   
       }
	}
}
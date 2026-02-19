/*Q3. Write a java program to find missing elements in an array.
Input : Array = {1, 2, 4, 5, 7} (numbers from 1 to 7 should be present)
Output : Missing elements = {3, 6}
*/

import java.util.*;
public class Question8
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);

		int a[] = new int[]{1, 2, 4, 5, 7};
		int i, j;
		System.out.print("Missing Elements = ");
		for(i=a[0]+1; i<a[a.length-1]; i++)
		{
			int flag=0;
			for(j=0; j<a.length; j++)
			{
				if(i==a[j])
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.print(i+" ");
			
		}
	
		
	}
}
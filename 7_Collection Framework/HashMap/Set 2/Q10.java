/*10. Find Common Elements in 3 Arrays using Set
Problem Statement:
Find common elements in three arrays.
Input:
A1 = 1 2 3 4
A2 = 2 3 5 6
A3 = 2 3 7 8
Output:
Common = 2 3
Explanation:
Use intersection logic with sets.
*/

import java.util.*;
public class Q10
{
	public static void main(String x[])
	{
		int a[] = {1, 2, 3, 4};
		int b[] = {2, 3, 5, 6};
		int c[] = {2, 3, 7, 8};
		
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		
		for(int i=0; i<b.length; i++)
			set1.add(b[i]);
		
		for(int i=0; i<c.length; i++)
			set2.add(c[i]);
			
		for(int i=0; i<a.length; i++)
		{
			if(set2.contains(a[i]))
				System.out.print(a[i]+" ");
		}
	}
}
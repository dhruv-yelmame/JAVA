/*8. Find Common Elements between Two Arrays using Set
Problem Statement:
Write a program to find common elements between two arrays using HashSet.
Input:
Array1 = 1 2 3 4 5
Array2 = 3 4 5 6 7
Output:
Common Elements = 3 4 5
Explanation:
Add first array to set → check second array elements.
*/

import java.util.*;
public class Q8
{
	public static void main(String x[])
	{
		int a[] = {1, 2, 3, 4, 5};
		int b[] = {3, 4, 5, 6, 7};
		TreeSet set = new TreeSet();
		for(int i=0; i<a.length; i++)
		{
			set.add(a[i]);
		}
		System.out.print("Common Elements = ");
		for(int i=0; i<b.length; i++)
		{
			if(set.contains(b[i]))
				System.out.print(b[i]+" ");
		}
	}
}
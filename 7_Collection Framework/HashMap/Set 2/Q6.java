/*6. Detect Duplicate Elements using Set
Problem Statement:
Print all duplicate elements from an array.
Input:
1 2 3 2 4 5 1 6
Output:
Duplicates = 1 2
Explanation:
Use one set for tracking, another for duplicates.
*/

import java.util.*;
public class Q6
{
	public static void main(String x[])
	{
		int a[] = {1, 2, 3, 2, 4, 5, 1, 6};
		
		HashSet<Integer> visit = new HashSet<>();
		
		HashSet<Integer> duplicate = new HashSet<>();
		
		for(int i : a)
		{
			if(!visit.add(i))
				duplicate.add(i);
		}
		
		for(int i : duplicate)
			System.out.print(i+" ");
	}
}
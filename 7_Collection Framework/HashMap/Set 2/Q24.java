/*24. Find All Elements Appearing Exactly Twice
Problem Statement:
Find elements that appear exactly twice.
Input:
1 2 3 2 4 1 5 6
Output:
1 2
Explanation:
Count frequency using map.
*/

import java.util.*;
public class Q24
{
	public static void main(String x[])
	{
		int a[] = {1, 2, 3, 2, 4, 1, 5, 6};
		
		TreeMap<Integer, Integer> map = new TreeMap<>();
		
		for(int num : a)
		{
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			if(entry.getValue() == 2)
			{
				System.out.print(entry.getKey()+" ");
			}
		}
	}
}
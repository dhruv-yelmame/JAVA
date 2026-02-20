/*3. Find First Non-Repeating Element using LinkedHashMap
Problem Statement:
Find first non-repeating element in an array using LinkedHashMap.
Input:
Array = 4 5 1 2 1 2 4
Output:
First Non-Repeating = 5
Explanation:
Store frequency in LinkedHashMap to maintain insertion order.
*/

import java.util.*;
public class Q3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = {4, 5, 1, 2, 1, 2, 4};
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		for(int i=0; i<a.length; i++)
		{
			map.put(a[i], map.getOrDefault(a[i], 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			if(entry.getValue() == 1)
			{
				System.out.print("First Non-Repeating = "+entry.getKey());
				return ;
			}		
		}
	}
}
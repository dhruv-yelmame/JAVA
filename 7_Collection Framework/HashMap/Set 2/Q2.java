/*2. Group Even and Odd Numbers using Map
Problem Statement:
Given an integer array, group even and odd numbers into a Map<String, List<Integer>>.
Input:
Array = 1 2 3 4 5 6
Output:
Even = [2,4,6]
Odd = [1,3,5]
Explanation:
Create Map with keys "Even" and "Odd" and store numbers accordingly.
*/

import java.util.*;
public class Q2
{
	public static void main(String x[])
	{
		int a[] = {1, 2, 3, 4, 5, 6};
		
		HashMap<String, List<Integer>> map = new HashMap<>();
		
		map.put("Even", new ArrayList<>());
		map.put("Odd", new ArrayList<>());
		
		for(int num : a)
		{
			if(num%2==0)
			{
				map.get("Even").add(num);
			}	
			else
			{
				map.get("Odd").add(num);
			}	
		}
		
		for(Map.Entry<String, List<Integer>> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
	}
}
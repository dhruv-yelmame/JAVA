/*25. Flatten List of Lists
Problem Statement:
Given List<List<Integer>>, flatten into single list.
Input:
[[1,2],[3,4],[5]]
Output:
[1,2,3,4,5]
Explanation:
Use nested loop or addAll().
*/

import java.util.*;
public class Q25
{
	public static void main(String x[])
	{
		List<List<Integer>> list = new ArrayList<>();
		list.add(Arrays.asList(1, 2));
		list.add(Arrays.asList(3, 4));
		list.add(Arrays.asList(5));
		
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(List<Integer> innerList : list) 
		{
            al.addAll(innerList);
        }
		
		System.out.println(al);
	}
}
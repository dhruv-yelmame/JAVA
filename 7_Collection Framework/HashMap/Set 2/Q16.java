/*16. Merge Two Maps with Summing Values
Problem Statement:
Merge two maps. If key exists in both, sum values.
Input:
Map1: A=10, B=20
Map2: A=5, C=15
Output:
A=15, B=20, C=15
Explanation:
Use map.merge().
*/

import java.util.*;
public class Q16
{
	public static void main(String x[])
	{
		HashMap<String, Integer> map1 = new HashMap<>();
		map1.put("A", 10);
		map1.put("B", 20);
		HashMap<String, Integer> map2 = new HashMap<>();
		map1.put("A", 5);
		map1.put("C", 15);
		
		for(Map.Entry<String, Integer> entry : map2.entrySet())
		{
            map1.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        System.out.println(map1);
	}
}
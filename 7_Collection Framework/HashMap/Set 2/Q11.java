/*11. Sort Map by Keys using TreeMap
Problem Statement:
Sort HashMap by keys using TreeMap.
Input:
3 → C
1 → A
2 → B
Output:
1 → A
2 → B
3 → C
Explanation:
Pass HashMap into TreeMap.
*/

import java.util.*;
public class Q11
{
	public static void main(String x[])
	{
		HashMap<Integer, String> map = new HashMap<>();
		map.put(3, "C");
		map.put(1, "A");
		map.put(2, "B");
		
		TreeMap<Integer, String> map2 = new TreeMap<>(map);
		
		for(Map.Entry<Integer, String> entry1 : map2.entrySet())
		{
			System.out.println(entry1.getKey()+" = "+entry1.getValue());
		}
	}
}
/*14. Count Character Frequency using TreeMap
Problem Statement:
Count character frequency in string using TreeMap.
Input:
"banana"
Output:
a = 3
b = 1
n = 2
Explanation:
TreeMap sorts keys automatically.
*/

import java.util.*;
public class Q14
{
	public static void main(String x[])
	{
		String s = "banana";
		
		TreeMap<Character, Integer> map = new TreeMap<>();
		
		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+"=="+entry.getValue());
		}
	}
}
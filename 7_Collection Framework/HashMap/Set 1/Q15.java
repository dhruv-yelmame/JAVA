/*15. Find Key with Highest Value in HashMap
Problem Statement:
Find the student with highest marks using HashMap.
Input:
A = 60
B = 90
C = 75
Output:
Topper = B
Explanation:
Iterate using entrySet() and compare values.
*/

import java.util.*;
public class Q15
{
	public static void main(String x[])
	{
		HashMap<String, Integer> map = new HashMap<>();
		map.put("A", 60);
		map.put("B", 90);
		map.put("C", 75);
		
		String topper = "";
		int max = Integer.MIN_VALUE;
		for(Map.Entry<String, Integer> m : map.entrySet())
		{
			if(m.getValue() > max)
			{
				max=m.getValue();	
				topper=m.getKey();
			}
		}
		
		System.out.println("Topper: "+topper);
	}
}
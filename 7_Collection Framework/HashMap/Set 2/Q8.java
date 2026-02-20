/*8. Find Longest Word using ArrayList
Problem Statement:
Store words in ArrayList and find longest word.
Input:
["java", "collection", "map", "framework"]
Output:
Longest Word = collection
Explanation:
Compare word lengths.
*/

import java.util.*;
public class Q8
{
	public static void main(String x[])
	{
		ArrayList<String> al = new ArrayList<>(Arrays.asList("java", "collection", "map", "framework"));
		
		String longest = "";
		int len = 0;
		for(String a : al)
		{
			if(a.length() > len)
            {
                len = a.length();
                longest = a;
            }
		}
		
		System.out.println("Longest Word = "+longest);
	}
}
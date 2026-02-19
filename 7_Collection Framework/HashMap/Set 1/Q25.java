/*25. Count Words Frequency in String using HashMap
Problem Statement:
Count frequency of words in a given string.
Input:
"java is easy java is powerful"
Output:
java = 2
is = 2
easy = 1
powerful = 1
Explanation:
Split string → store words in HashMap → count frequency.
*/

import java.util.*;
public class Q25
{
	public static void main(String x[])
	{
		String s = "java is easy java is powerful";
		String words[] = s.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i=0; i<words.length; i++)
		{
			 map.put(words[i], map.getOrDefault(words[i], 0) + 1);
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
	}
}


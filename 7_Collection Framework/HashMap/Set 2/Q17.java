/*17. Find All Anagrams using Map
Problem Statement:
Group anagrams from list of words.
Input:
["bat","tab","cat","act"]
Output:
[bat,tab]
[cat,act]
Explanation:
Use sorted string as key.
*/

import java.util.*;
public class Q17
{
	public static void main(String x[])
	{
		String words[] = {"bat","tab","cat","act"};
		
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		
		for (String word : words) 
		{
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            if (!map.containsKey(key)) 
			{
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);
		}
		
		for (ArrayList<String> group : map.values()) 
		{
            System.out.println(group);
        }
	}
}
